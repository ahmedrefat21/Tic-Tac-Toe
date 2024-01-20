package tic.tac.toe;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public  class ScoreScreenBase extends AnchorPane {

    protected final Text text;
    protected final Text text0;
    protected final Text text1;
    protected final Button backBtn;
    protected final ImageView imageView;
    protected final Button watchRecordBtn;
    protected final ImageView imageView0;
    protected final AnchorPane anchorPane;
    protected final Label usernameText;
    protected final AnchorPane anchorPane0;
    protected final Label scoreText;
    protected final AnchorPane anchorPane1;
    protected final Label emailText;
    protected final AnchorPane anchorPane2;
    protected final Pane playerLabel;
    protected final Label plynamelabel3;
    protected final ScrollPane playersScrollPane;
    protected final VBox vBox;
    protected HBox hBox;
    protected final ImageView playerImage;
    protected Label playerName;
    protected Button inviteButton;
    private ArrayList<Player> onlinePlayers;
    private ImageView playerIMG;
    private Alert alert;
    private Thread thread;
    private Boolean loaded = false;
    private Player player;
    private StringTokenizer token;
    private String player2Username ;
    private int player2Score;
    private int opponentScore;
    Stage stage;
    
    
    
    
    

    public ScoreScreenBase(Stage stage) {
        this.stage=stage;
        loaded = true;
        App.ps.println("playerlist");

        text = new Text();
        text0 = new Text();
        text1 = new Text();
        backBtn = new Button();
        imageView = new ImageView();
        watchRecordBtn = new Button();
        imageView0 = new ImageView();
        anchorPane = new AnchorPane();
        usernameText = new Label();
        anchorPane0 = new AnchorPane();
        scoreText = new Label();
        anchorPane1 = new AnchorPane();
        emailText = new Label();
        anchorPane2 = new AnchorPane();
        playerLabel = new Pane();
        plynamelabel3 = new Label();
        playersScrollPane = new ScrollPane();
        vBox = new VBox();
        hBox = new HBox();
        playerImage = new ImageView();
        playerName = new Label();
        inviteButton = new Button();
                
        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        setStyle("-fx-background-color: #FDE8ED;");

        text.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        text.setLayoutX(203.0);
        text.setLayoutY(80.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        text.setText("Tic");
        text.setFont(new Font("Comic Sans MS Bold", 64.0));

        text0.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        text0.setLayoutX(314.0);
        text0.setLayoutY(80.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        text0.setText("Tac");
        text0.setFont(new Font("Comic Sans MS Bold", 64.0));

        text1.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        text1.setLayoutX(436.0);
        text1.setLayoutY(80.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        text1.setText("Toe");
        text1.setWrappingWidth(133.125);
        text1.setFont(new Font("Comic Sans MS Bold", 64.0));

        backBtn.setLayoutX(29.0);
        backBtn.setLayoutY(22.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(77.0);
        backBtn.setPrefWidth(85.0);
        backBtn.setStyle("-fx-background-color: #FDE8ED;");

        imageView.setFitHeight(54.0);
        imageView.setFitWidth(85.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/images/back.png").toExternalForm()));
        backBtn.setGraphic(imageView);

        watchRecordBtn.setLayoutX(626.0);
        watchRecordBtn.setLayoutY(21.0);
        watchRecordBtn.setMnemonicParsing(false);
        watchRecordBtn.setPrefHeight(77.0);
        watchRecordBtn.setPrefWidth(85.0);
        watchRecordBtn.setStyle("-fx-background-color: #FDE8ED;");

        imageView0.setFitHeight(54.0);
        imageView0.setFitWidth(67.0);
        imageView0.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        imageView0.setImage(new Image(getClass().getResource("/assets/images/recording.png").toExternalForm()));
        watchRecordBtn.setGraphic(imageView0);

        anchorPane.setLayoutX(21.0);
        anchorPane.setLayoutY(137.0);
        anchorPane.setPrefHeight(76.0);
        anchorPane.setPrefWidth(178.0);
        anchorPane.setStyle("-fx-background-radius: 25; -fx-background-color: FFDDE5; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");

        usernameText.setLayoutX(49.0);
        usernameText.setLayoutY(18.0);
        usernameText.setText("");
        usernameText.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        usernameText.setFont(new Font("Comic Sans MS Bold", 29.0));

        anchorPane0.setLayoutX(21.0);
        anchorPane0.setLayoutY(248.0);
        anchorPane0.setPrefHeight(76.0);
        anchorPane0.setPrefWidth(178.0);
        anchorPane0.setStyle("-fx-background-radius: 25; -fx-background-color: FFDDE5; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");

        scoreText.setLayoutX(71.0);
        scoreText.setLayoutY(18.0);
       scoreText.setText("");
        scoreText.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        scoreText.setFont(new Font("Comic Sans MS Bold", 29.0));

        anchorPane1.setLayoutX(9.0);
        anchorPane1.setLayoutY(354.0);
        anchorPane1.setPrefHeight(76.0);
        anchorPane1.setPrefWidth(178.0);
        anchorPane1.setStyle("-fx-background-radius: 25; -fx-background-color: FFDDE5; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");

        emailText.setLayoutX(7.0);
        emailText.setLayoutY(24.0);
        emailText.setPrefWidth(203.0);
        emailText.setText("");
        emailText.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        emailText.setFont(new Font("Comic Sans MS Bold", 20.0));

        anchorPane2.setLayoutX(251.0);
        anchorPane2.setLayoutY(140.0);
        anchorPane2.setPrefHeight(298.0);
        anchorPane2.setPrefWidth(474.0);
        anchorPane2.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 10;");

        playerLabel.setLayoutX(147.0);
        playerLabel.setPrefHeight(61.0);
        playerLabel.setPrefWidth(196.0);
        playerLabel.setStyle("-fx-background-radius: 5; -fx-background-color: f22853;");

        plynamelabel3.setLayoutX(19.0);
        plynamelabel3.setLayoutY(13.0);
        plynamelabel3.setText("online Players");
        plynamelabel3.setTextFill(javafx.scene.paint.Color.valueOf("#fde8ed"));
        plynamelabel3.setFont(new Font("Comic Sans MS Bold", 24.0));

        playersScrollPane.setLayoutY(74.0);
        playersScrollPane.setPrefHeight(233.0);
        playersScrollPane.setPrefWidth(474.0);
        playersScrollPane.setStyle("-fx-background: FFDDE5; -fx-border-color: FFDDE5;");

        vBox.setPrefHeight(219.0);
        vBox.setPrefWidth(461.0);

        hBox.setCache(true);
        hBox.setPrefHeight(17.0);
        hBox.setPrefWidth(461.0);

        playerImage.setFitHeight(42.0);
        playerImage.setFitWidth(70.0);
        playerImage.setPickOnBounds(true);
        playerImage.setPreserveRatio(true);
        playerImage.setImage(new Image(getClass().getResource("/assets/images/gamer1.png").toExternalForm()));

        playerName.setPrefHeight(35.0);
        playerName.setPrefWidth(282.0);
        playerName.setText("Refat");
        playerName.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        playerName.setFont(new Font("Comic Sans MS Bold", 24.0));
        HBox.setMargin(playerName, new Insets(3.0, 0.0, 3.0, 7.0));

        inviteButton.setMnemonicParsing(false);
        inviteButton.setPrefHeight(37.0);
        inviteButton.setPrefWidth(84.0);
        inviteButton.setStyle("-fx-background-color: f22853; -fx-background-radius: 10;");
        inviteButton.setText("Invite");
        inviteButton.setTextFill(javafx.scene.paint.Color.WHITE);
        inviteButton.setOpaqueInsets(new Insets(10.0, 0.0, 0.0, 0.0));
        inviteButton.setFont(new Font("Comic Sans MS Bold", 16.0));
        HBox.setMargin(inviteButton, new Insets(3.0, 0.0, 3.0, 0.0));
        hBox.setOpaqueInsets(new Insets(0.0, 0.0, 10.0, 0.0));
        VBox.setMargin(hBox, new Insets(5.0));
        playersScrollPane.setContent(vBox);

        
        emailText.setText(App.hash.get("email"));
        usernameText.setText(App.hash.get("username"));
        scoreText.setText(App.hash.get("score")); 
        System.out.println(App.hash.get("email"));
        System.out.println(App.hash.get("username"));
        System.out.println(App.hash.get("score"));
       
        
        
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(text1);
        getChildren().add(backBtn);
        getChildren().add(watchRecordBtn);
        anchorPane.getChildren().add(usernameText);
        getChildren().add(anchorPane);
        anchorPane0.getChildren().add(scoreText);
        getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(emailText);
        getChildren().add(anchorPane1);
        playerLabel.getChildren().add(plynamelabel3);
        anchorPane2.getChildren().add(playerLabel);
        hBox.getChildren().add(playerImage);
        hBox.getChildren().add(playerName);
        hBox.getChildren().add(inviteButton);
        vBox.getChildren().add(hBox);
        anchorPane2.getChildren().add(playersScrollPane);
        getChildren().add(anchorPane2);

        onlinePlayers = new ArrayList();  
        
        //listOnlinePlayers();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    if(loaded){
                        System.out.println("playyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
                        onlinePlayers.clear();
                    do{

                        try{
                            String data = App.dis.readLine();
                            if(data.equals("null")){
                                break;
                            }
                            switch(data){
                                case "requestPlaying":
                                    System.out.println("request received "+data);
                                    alertRequestPlayer();
                                    break;
                                case "decline":
                                    alertRefused();
                                    break;
                                case "gameOn":
                                    System.out.println("gammmmmmmmmmmmmmmmmmmmmeeeeeeeeeeeeeeeeeeeeee");
                                    startGame();
                                    System.out.println("onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
                                    
                                    break;
                                    
                                case "close":
                                    thread.stop();
                                    
                                default :
                                    System.out.println("default");
                                    readOnlineList(data);
                                   
                            }
                        } catch (IOException ex) {
                            thread.stop();
                        }
                    }while(true);
                        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                    listOnlinePlayers();
                    try{
                            Thread.sleep(300);
                        }catch(InterruptedException ex){
                            thread.stop();
                        }
                    }
                }                   
            }
            });
            thread.start();
    }
     
       
       
    
    private void alertRequestPlayer() throws IOException{
        String opponentData = App.dis.readLine();
        System.out.println("recieved request");
        token = new StringTokenizer(opponentData,"###");
        String opponentMail = token.nextToken();
    
        player2Username = token.nextToken();
        String sOpponentScore = token.nextToken();
        player2Score = Integer.parseInt(sOpponentScore);
        Platform.runLater(new Runnable(){
            @Override
            public void run() {
                System.out.println("recieved request run");
                ButtonType AcceptType = new ButtonType("Accept");
                ButtonType RejectType = new ButtonType("Reject", ButtonBar.ButtonData.CANCEL_CLOSE);             
                alert = new Alert(Alert.AlertType.NONE);
                alert.setTitle("Request Playing");
                alert.setHeaderText(player2Username+" Wants to Play with You ?");
                alert.getDialogPane().getButtonTypes().addAll(AcceptType,RejectType);
                DialogPane dialog = alert.getDialogPane();              
                //dialog.getStylesheets().add(
                //getClass().getResource("/alertPlayerScreen.css").toExternalForm());
                //dialog.getStyleClass().add("reqalert");
                PauseTransition delay = new PauseTransition(Duration.seconds(10));
                delay.setOnFinished(e -> alert.hide());
                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == AcceptType){
                    System.out.println("game on");
                    App.ps.println("accept###"+App.hash.get("email")+"###"+App.hash.get("username")+"###"+opponentMail);
                    System.out.println("staaaaaaaaaaaaaaaaaaaaaagggggggggggggggggeeeeeeeeeeeeeeeeeeee");
                    showGame(false,player2Username);
                    
                
                }else {
                    // to players online screen
                    System.out.println("no first request");
                    App.ps.println("decline###"+opponentMail);
                }
                delay.play();
            }

        });
    }
    private void listOnlinePlayers(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
//                try {
                    playersScrollPane.setContent(null);
                    vBox.getChildren().clear();
                    
                    for(Player x : onlinePlayers){
                        System.out.println("inside for loop");
                        playerIMG = new ImageView(new Image(getClass().getResource("/assets/images/gamer1.png").toExternalForm()));
                        playerIMG.setFitHeight(42.0);
                        playerIMG.setFitWidth(70.0);
                        playerIMG.setPreserveRatio(true);
                        
                        playerName = new Label(x.getUsername());
                        playerName.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
                        playerName.setFont(new Font("Comic Sans MS Bold", 24.0));
                        playerName.setPrefHeight(35.0);
                        playerName.setPrefWidth(282.0);
                        HBox.setMargin(playerName, new Insets(3.0, 0.0, 3.0, 7.0));
                        
                        inviteButton = new Button("Invite");
                        inviteButton.setMnemonicParsing(false);
                        inviteButton.setPrefHeight(37.0);
                        inviteButton.setPrefWidth(84.0);
                        inviteButton.setStyle("-fx-background-color: f22853; -fx-background-radius: 10;");
                        inviteButton.setTextFill(javafx.scene.paint.Color.WHITE);
                        inviteButton.setOpaqueInsets(new Insets(10.0, 0.0, 0.0, 0.0));
                        inviteButton.setFont(new Font("Comic Sans MS Bold", 16.0));
                        HBox.setMargin(inviteButton, new Insets(3.0, 0.0, 3.0, 0.0));
                        hBox.setOpaqueInsets(new Insets(0.0, 0.0, 10.0, 0.0));
                        VBox.setMargin(hBox, new Insets(5.0));
                        
                        hBox = new HBox(playerIMG,playerName,inviteButton);
                        hBox.setPrefHeight(17.0);
                        hBox.setPrefWidth(461.0);
                        
                    
                        
                        inviteButton.setId(""+x.getEmail());
                        if(x.isIsplaying()){
                            hBox.setDisable(true);
                            inviteButton.setDisable(true);
                        }
                        
                        inviteButton.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                App.ps.println("request###"+inviteButton.getId()+"###"+emailText.getText()+"###"+usernameText.getText()+"###"+scoreText.getText());
                                ButtonType Yes = new ButtonType("Ok"); 
                                alert = new Alert(Alert.AlertType.NONE);
                                alert.setTitle("Request Playing");
                                alert.setHeaderText("Pending Request Please Wait");
                                alert.getDialogPane().getButtonTypes().addAll(Yes);                     
                                DialogPane dialogPane = alert.getDialogPane();
                                //dialogPane.getStylesheets().add(
                                //getClass().getResource("/alertPlayerScreen.css").toExternalForm());
                                //dialogPane.getStyleClass().add("pendingalert");
                                PauseTransition delay = new PauseTransition(Duration.seconds(15));
                                delay.setOnFinished(e -> alert.hide());
                                alert.show();
                                delay.play();
                            }
                        });
                        vBox.getChildren().add(hBox);
                        playersScrollPane.setContent(vBox);
                    }
                    onlinePlayers.clear();
                
            }
        });
    }
    private void alertRefused(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                if(alert.isShowing())
                    alert.close();
                ButtonType Yes = new ButtonType("Ok"); 
                alert = new Alert(Alert.AlertType.NONE);
                alert.setTitle("");
                alert.setHeaderText("Your Request has been Refused");
                alert.getDialogPane().getButtonTypes().addAll(Yes);
                DialogPane dialogPane = alert.getDialogPane();
                //dialogPane.getStylesheets().add(
                //getClass().getResource("/alertPlayerScreen.css").toExternalForm());
                //dialogPane.getStyleClass().add("refalert");
                alert.showAndWait();
            }
        });
    }
    
    private void readOnlineList(String data){
        //System.out.println("data :"+data+"\n");
        token = new StringTokenizer(data, "###");
        player = new Player();
        player.setUsername(token.nextToken());
        player.setEmail(token.nextToken());
        player.setIsactive(Boolean.parseBoolean(token.nextToken()));
        player.setIsplaying(Boolean.parseBoolean(token.nextToken()));
        player.setScore(Integer.parseInt(token.nextToken()));
        
        System.out.println(App.hash.get("email"));
        System.out.println(player.getEmail());
        if(!App.hash.get("email").equals(player.getEmail())){
            System.out.println("Add list");
            onlinePlayers.add(player);
        }
    }
    
    private void startGame() throws IOException{
        Platform.runLater(new Runnable() {
            @Override
            public void run(){
                if(alert.isShowing())
                    alert.close();
            }
        });
        String OpponentUsername = App.dis.readLine();
        String sOpponentScore = App.dis.readLine();
        opponentScore = Integer.parseInt(sOpponentScore);
        System.out.println("player 2 accepted");
        showGame(true,OpponentUsername);    
    }
    
    private void showGame(boolean state, String name){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                
                Parent pane = new OnlineGameBoardBase(stage , name , opponentScore , state);
                stage.getScene().setRoot(pane);  
                System.out.println("my state: "+state);
                
                System.out.println("letttttttttttttttttttttttttttttttttttttttttssssssssssssss"); 
               
                
                                  
            }
        });
        
        
    }
    
    
     
}
