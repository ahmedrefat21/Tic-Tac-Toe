package tic.tac.toe;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import java.util.prefs.Preferences;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public  class OnlineGameBoardBase extends AnchorPane {

    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final Button button11;
    protected final Button button13;
    protected final Button button12;
    protected final Button button31;
    protected final Button button23;
    protected final Button button22;
    protected final Button button21;
    protected final Button button33;
    protected final Button button32;
    protected final Text tacText;
    protected final Text toeText;
    protected final Text ticText;
    protected final Text firstPlayerNameText;
    protected final Text secondPlayerNameText;
    protected final Text firstPlayerScoreText;
    protected final Text secondPlayerScoreText;
    protected final Button exitButton;

    protected final ImageView exitimage;
    protected final Button exitButton1;
    protected final ImageView recordImage;
    private Thread thread;
    boolean myTurn,opponentTurn,gameState=false;
    private String myTic,oppTic;
    boolean enemyTurn ;
    private int Score;
    private HashMap<String, Button> btn;
    private Alert alert;

    private Boolean display = false;
    private Timeline timelinewinner;
    private Timeline timelinelose;
    private Timeline timelineldraw, timelinelWithdraw;
    private MediaPlayer mediaPlayer ;
    protected Player firstPlayer, secondPlayer;
    protected JFrame jFrame;

    private Preferences pref ;
//    private int currentScore;


    
    public OnlineGameBoardBase(Stage stage , String player2 , int score , boolean state , int currentScore) {

        imageView = new ImageView();
        imageView0 = new ImageView();
        button11 = new Button();
        button13 = new Button();
        button12 = new Button();
        button31 = new Button();
        button23 = new Button();
        button22 = new Button();
        button21 = new Button();
        button33 = new Button();
        button32 = new Button();
        tacText = new Text();
        toeText = new Text();
        ticText = new Text();
        firstPlayerNameText = new Text();
        secondPlayerNameText = new Text();
        firstPlayerScoreText = new Text();
        secondPlayerScoreText = new Text();
      
        exitButton = new Button();
        exitimage = new ImageView();
        exitButton1 = new Button();
        recordImage = new ImageView();
        
              
              timelinelWithdraw=new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            Parent pane = new WithdrawBase(stage);
            Scene scene = new Scene (pane);
            stage.setScene(scene);
            stage.show();
        }));
              
        timelinewinner= new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            Parent pane = new OnlineWinnerBase(stage);
            Scene scene = new Scene (pane);
            stage.setScene(scene);
            stage.show();
        }));
        
        timelinelose= new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            Parent pane = new OnlineLoseBase(stage);
            Scene scene = new Scene (pane);
            stage.setScene(scene);
            stage.show();
        }));
        timelineldraw=new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            Parent pane = new OnlinedrawBase(stage);
            Scene scene = new Scene (pane);
            stage.setScene(scene);
            stage.show();
        }));
        

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        setStyle("-fx-background-color: #FDE8ED;");
        getStylesheets().add("/tic/tac/toe/css/GameScreen.css");

        AnchorPane.setBottomAnchor(imageView, 358.0);
        AnchorPane.setLeftAnchor(imageView, 30.0);
        AnchorPane.setTopAnchor(imageView, 18.0);
        imageView.setFitHeight(111.0);
        imageView.setFitWidth(104.0);
        imageView.setLayoutX(37.0);
        imageView.setLayoutY(18.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/images/gamer1.png").toExternalForm()));

        AnchorPane.setBottomAnchor(imageView0, 358.0);
        AnchorPane.setRightAnchor(imageView0, 30.0);
        AnchorPane.setTopAnchor(imageView0, 18.0);
        imageView0.setFitHeight(104.0);
        imageView0.setFitWidth(131.0);
        imageView0.setLayoutX(604.0);
        imageView0.setLayoutY(18.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/assets/images/gamer2.png").toExternalForm()));

        button11.setLayoutX(189.0);
        button11.setLayoutY(118.0);
        button11.setMinHeight(96.0);
        button11.setMinWidth(113.0);
        button11.setMnemonicParsing(false);
        button11.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button11.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button11.setText("");
        button11.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button11.setFont(new Font("Comic Sans MS Bold", 48.0));
        button11.setId("btn1");
        button11.setOpaqueInsets(new Insets(5.0, 5.0, 0.0, 0.0));
        button11.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                setPlayerTurn(button11);
                
                
            }
            
        });

        button13.setLayoutX(455.0);
        button13.setLayoutY(119.0);
        button13.setMinHeight(96.0);
        button13.setMinWidth(113.0);
        button13.setMnemonicParsing(false);
        
        button13.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button13.setText("");
        button13.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button13.setFont(new Font("Comic Sans MS Bold", 48.0));
        button13.setId("btn3");
        button13.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                setPlayerTurn(button13);
                 
            }
            
        });

        button12.setLayoutX(327.0);
        button12.setLayoutY(119.0);
        button12.setMinHeight(96.0);
        button12.setMinWidth(113.0);
        button12.setMnemonicParsing(false);
        
        button12.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button12.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button12.setText("");
        button12.setId("btn2");
        button12.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        button12.setFont(new Font("Comic Sans MS Bold", 48.0));
        button12.setOpaqueInsets(new Insets(5.0, 5.0, 5.0, 0.0));
        button12.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                setPlayerTurn(button12);
            }
            
        });

        button31.setLayoutX(193.0);
        button31.setLayoutY(361.0);
        button31.setMinHeight(96.0);
        button31.setMinWidth(113.0);
        button31.setMnemonicParsing(false);
        
        button31.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button31.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button31.setText("");
        button31.setId("btn7");
        button31.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button31.setFont(new Font("Comic Sans MS Bold", 48.0));
        button31.setOpaqueInsets(new Insets(5.0, 5.0, 0.0, 0.0));
        button31.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                setPlayerTurn(button31);
            }
            
        });

        button23.setLayoutX(461.0);
        button23.setLayoutY(243.0);
        button23.setMinHeight(96.0);
        button23.setMinWidth(113.0);
        button23.setMnemonicParsing(false);
        
        button23.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button23.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button23.setText("");
        button23.setId("btn6");
        button23.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button23.setFont(new Font("Comic Sans MS Bold", 48.0));
        button23.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                setPlayerTurn(button23);
            }
            
        });

        button22.setLayoutX(327.0);
        button22.setLayoutY(244.0);
        button22.setMinHeight(96.0);
        button22.setMinWidth(113.0);
        button22.setMnemonicParsing(false);
        
        button22.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button22.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button22.setText("");
        button22.setId("btn5");
        button22.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button22.setFont(new Font("Comic Sans MS Bold", 48.0));
        button22.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                setPlayerTurn(button22);
            }
            
        });

        button21.setLayoutX(192.0);
        button21.setLayoutY(243.0);
        button21.setMinHeight(96.0);
        button21.setMinWidth(113.0);
        button21.setMnemonicParsing(false);
        
        button21.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button21.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button21.setText("");
        button21.setId("btn4");
        button21.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button21.setFont(new Font("Comic Sans MS Bold", 48.0));
        button21.setOpaqueInsets(new Insets(5.0, 5.0, 0.0, 0.0));
        button21.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                setPlayerTurn(button21);
            }
            
        });

        button33.setLayoutX(461.0);
        button33.setLayoutY(361.0);
        button33.setMinHeight(96.0);
        button33.setMinWidth(113.0);
        button33.setMnemonicParsing(false);
        
        button33.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button33.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button33.setText("");
        button33.setId("btn9");
        button33.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        button33.setFont(new Font("Comic Sans MS Bold", 48.0));
        button33.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               setPlayerTurn(button33);
            }
            
        });

        button32.setLayoutX(325.0);
        button32.setLayoutY(359.0);
        button32.setMinHeight(96.0);
        button32.setMinWidth(113.0);
        button32.setMnemonicParsing(false);
        
        button32.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button32.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button32.setText("");
        button32.setId("btn8");
        button32.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        button32.setFont(new Font("Comic Sans MS Bold", 48.0));
        button32.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                setPlayerTurn(button32);
            }
            
        });

        tacText.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        tacText.setId("tacText");
        tacText.setLayoutX(320.0);
        tacText.setLayoutY(89.0);
        tacText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        tacText.setStrokeWidth(0.0);
        tacText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        tacText.setText("Tac");
        tacText.setFont(new Font("Comic Sans MS Bold", 64.0));

        toeText.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        toeText.setId("toeText");
        toeText.setLayoutX(439.0);
        toeText.setLayoutY(86.0);
        toeText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toeText.setStrokeWidth(0.0);
        toeText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        toeText.setText("Toe");
        toeText.setFont(new Font("Comic Sans MS Bold", 64.0));

        AnchorPane.setBottomAnchor(ticText, 373.0);
        AnchorPane.setLeftAnchor(ticText, 208.0);
        AnchorPane.setRightAnchor(ticText, 436.65625);
        AnchorPane.setTopAnchor(ticText, 16.0);
        ticText.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        ticText.setId("ticText");
        ticText.setLayoutX(208.0);
        ticText.setLayoutY(87.0);
        ticText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticText.setStrokeWidth(0.0);
        ticText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        ticText.setText("Tic");
        ticText.setFont(new Font("Comic Sans MS Bold", 64.0));

        AnchorPane.setBottomAnchor(firstPlayerNameText, 291.0);
        AnchorPane.setTopAnchor(firstPlayerNameText, 122.0);
        firstPlayerNameText.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        firstPlayerNameText.setId("firstPlayerNameText");
        firstPlayerNameText.setLayoutX(16.0);
        firstPlayerNameText.setLayoutY(175.0);
        firstPlayerNameText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        firstPlayerNameText.setStrokeWidth(0.0);
        firstPlayerNameText.setText("Refat");
        firstPlayerNameText.setFont(new Font("Comic Sans MS Bold", 48.0));
        firstPlayerNameText.setText(OnlineAppManger.hash.get("username"));
        

        AnchorPane.setBottomAnchor(secondPlayerNameText, 291.0);
        AnchorPane.setTopAnchor(secondPlayerNameText, 122.0);
        secondPlayerNameText.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        secondPlayerNameText.setId("firstPlayerNameText");
        secondPlayerNameText.setLayoutX(592.0);
        secondPlayerNameText.setLayoutY(175.0);
        secondPlayerNameText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        secondPlayerNameText.setStrokeWidth(0.0);
        secondPlayerNameText.setText("Sara");
        secondPlayerNameText.setFont(new Font("Comic Sans MS Bold", 48.0));
        secondPlayerNameText.setText(player2);
//        try {
//             String OpponentUsername = App.dis.readLine();
//             secondPlayerNameText.setText(OpponentUsername);
//        } catch (IOException ex) {
//            Logger.getLogger(OnlineGameBoardBase.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        

        AnchorPane.setBottomAnchor(firstPlayerScoreText, 206.0);
        AnchorPane.setTopAnchor(firstPlayerScoreText, 207.0);
        firstPlayerScoreText.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        firstPlayerScoreText.setId("firstPlayerNameText");
        firstPlayerScoreText.setLayoutX(67.0);
        firstPlayerScoreText.setLayoutY(260.0);
        firstPlayerScoreText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        firstPlayerScoreText.setStrokeWidth(0.0);
        firstPlayerScoreText.setText("5");
        firstPlayerScoreText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        firstPlayerScoreText.setFont(new Font("Comic Sans MS Bold", 48.0));
         currentScore = Integer.parseInt(OnlineAppManger.hash.get("score"));
        firstPlayerScoreText.setText(""+currentScore);

        AnchorPane.setBottomAnchor(secondPlayerScoreText, 206.0);
        AnchorPane.setTopAnchor(secondPlayerScoreText, 207.0);
        secondPlayerScoreText.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        secondPlayerScoreText.setId("firstPlayerNameText");
        secondPlayerScoreText.setLayoutX(628.0);
        secondPlayerScoreText.setLayoutY(249.0);
        secondPlayerScoreText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        secondPlayerScoreText.setStrokeWidth(0.0);
        secondPlayerScoreText.setText("4");
        secondPlayerScoreText.setFont(new Font("Comic Sans MS Bold", 48.0));
        secondPlayerScoreText.setText(""+score);
//        try {
//            String sOpponentScore = App.dis.readLine();
//            int opponentScore = Integer.parseInt(sOpponentScore);
//            secondPlayerScoreText.setText(""+opponentScore);
//        } catch (IOException ex) {
//            Logger.getLogger(OnlineGameBoardBase.class.getName()).log(Level.SEVERE, null, ex);
//        }

        AnchorPane.setBottomAnchor(exitButton, 12.0);
        AnchorPane.setLeftAnchor(exitButton, 612.0);
        AnchorPane.setRightAnchor(exitButton, 14.0);
        AnchorPane.setTopAnchor(exitButton, 379.0);
        exitButton.setLayoutX(612.0);
        exitButton.setLayoutY(379.0);
        exitButton.setMnemonicParsing(false);
        exitButton.setPrefHeight(89.0);
        exitButton.setPrefWidth(114.0);
        exitButton.setStyle("-fx-background-color: #FDE8ED;");
        exitButton.getStylesheets().add("/tic/tac/toe/loginfxml.css");

        exitimage.setFitHeight(89.0);
        exitimage.setFitWidth(123.0);
        exitimage.setPickOnBounds(true);
        exitimage.setPreserveRatio(true);
        exitimage.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        exitimage.setImage(new Image(getClass().getResource("/assets/images/exit.png").toExternalForm()));
        exitButton.setGraphic(exitimage);

        exitButton1.setLayoutX(22.0);
        exitButton1.setLayoutY(379.0);
        exitButton1.setMnemonicParsing(false);
        exitButton1.setPrefHeight(89.0);
        exitButton1.setPrefWidth(114.0);
        exitButton1.setStyle("-fx-background-color: #FDE8ED;");
        exitButton1.getStylesheets().add("/tic/tac/toe/loginfxml.css");
        

        recordImage.setFitHeight(83.0);
        recordImage.setFitWidth(104.0);
        recordImage.setPickOnBounds(true);
        recordImage.setPreserveRatio(true);
        recordImage.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        recordImage.setImage(new Image(getClass().getResource("/assets/images/recording.png").toExternalForm()));
        exitButton1.setGraphic(recordImage);

        getChildren().add(imageView);
        getChildren().add(imageView0);
        getChildren().add(button11);
        getChildren().add(button13);
        getChildren().add(button12);
        getChildren().add(button31);
        getChildren().add(button23);
        getChildren().add(button22);
        getChildren().add(button21);
        getChildren().add(button33);
        getChildren().add(button32);
        getChildren().add(tacText);
        getChildren().add(toeText);
        getChildren().add(ticText);
        getChildren().add(firstPlayerNameText);
        getChildren().add(secondPlayerNameText);
        getChildren().add(firstPlayerScoreText);
        getChildren().add(secondPlayerScoreText);
        getChildren().add(exitButton);
        getChildren().add(exitButton1);
        

       exitButton1.setOnMousePressed(e -> {
           
                      mediaPlayer.stop();  

       });


        

        
        pref =Preferences.userNodeForPackage(OnlineGameBoardBase.class);

        //store all buttons in the hash map to see which button associated to the enemy
        btn = new HashMap();

        btn.put("btn1", button11);
        btn.put("btn2", button12);
        btn.put("btn3", button13);
        btn.put("btn4", button21);
        btn.put("btn5", button22);
        btn.put("btn6", button23);
        btn.put("btn7", button31);
        btn.put("btn8", button32);
        btn.put("btn9", button33);
        
        System.out.println("my state: "+state);
        myTurn = state;
        opponentTurn = !state;
        gameState = true;
        if(state){
            myTic = "X";               
            oppTic = "O";
        }else{
            myTic = "O";
            oppTic = "X";
        }
        System.out.println("my tic" +myTic);
        
        if(myTurn && myTic.equals("X")){
            firstPlayerNameText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
            imageView.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
            
        }else{
            secondPlayerNameText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
            imageView0.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        }
        
        
        
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    do{
                        try{
                            String data = OnlineAppManger.dis.readLine();
                            System.out.println("Reaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddddddddddddddddddd");
                            if(data.equals("null")){
                                System.out.println("nulllllllllllllllllllllllllllllllllllllllllllllllllllll");
                                break;
                            }
                            switch(data){
                                case "gameTic":
                                    System.out.println("gammmmmmmmmmmmmmmmmeeeeeeeetttttttttttttiiiiiiiiccccccccc");
                                    opponentTurn();
                                    break;
                                case "finalgameTic":
                                    opponentTurn();
                                    reset();
                                    break;

                                case "endGame":
                                    
                                    break;
                                case "withdraw":
                                    OnlineAppManger.ps.println("available###"+OnlineAppManger.hash.get("email"));
                                    Platform.runLater(() -> {
                                     timelinelWithdraw.play();
                                    // JOptionPane.showMessageDialog(jFrame, "WITHDRAW", "ERROR", JOptionPane.ERROR_MESSAGE);              
                                       updateScore();
                                       reset();

                                       thread.stop();
                                    });
                                    break;
                                default :
                                    System.out.println("default");      
                            }
                        } catch (IOException ex) {
                            
                        }
                    }while(true);
                    
                    try{
                            Thread.sleep(300);
                        }catch(InterruptedException ex){
                            thread.stop();
                        }
                    }
                }                   
        });
        thread.start();
        
        

    }
    
       
       
   /* private void enemyTurn() {
    try {
        String enemySymbol = App.dis.readLine();

        Button enemyBtn = btn.get(enemySymbol); //btn => hashMap of 9 buttons

        EventHandler<ActionEvent> opponentHandler = event -> {
            Button button = (Button) event.getSource();
            Platform.runLater(() -> {
                button.setText(enemySymbol);
                    //func to check if game is end or not (neeeeed)
            });
        };

        ActionEvent simulatedEvent = new ActionEvent();
        opponentHandler.handle(simulatedEvent);

        enemyBtn.setOnAction(opponentHandler);
        enemyTurn = false;
        myTurn = true;

    } catch (IOException ex) {
               System.out.println(ex);
    }
}*/
    
        private void updateScore(){ 
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try{
                    ScoreScreenBase.currentScore += 1; //currentscore of the player
                    OnlineAppManger.hash.put("score", ""+ScoreScreenBase.currentScore);
                    System.out.println("score "+ScoreScreenBase.currentScore);
                } catch(NumberFormatException ex){ 

                }
                firstPlayerScoreText.setText(""+ScoreScreenBase.currentScore); 
                System.out.println(ScoreScreenBase.currentScore);
                OnlineAppManger.ps.println("updateScore###"+OnlineAppManger.hash.get("email")+"###"+ScoreScreenBase.currentScore);
            }
        });
    }

    public void setPlayerTurn(Button button){
        if(gameState && myTurn){
            if(button.getText().equals("")){
                button.setText(myTic);
                button.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
                myTurn = false;
                opponentTurn = true;
                if(myTurn && myTic.equals("X")){
                    firstPlayerNameText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
                    //button.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
                }else{
                    secondPlayerNameText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);"); 
                    //button.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
                }
                 System.out.println("I pressed "+button.getId());
                 System.out.println(gameState);
                if(checkState()){
                    OnlineAppManger.ps.println("finishgameTic###"+OnlineAppManger.hash.get("email")+"###"+button.getId());
                }else{
                    OnlineAppManger.ps.println("gameTic###"+OnlineAppManger.hash.get("email")+"###"+button.getId());
                }
            }
            
        } 
    }
    
    private void opponentTurn(){
        try {
            String oppPressed = OnlineAppManger.dis.readLine();
            System.out.println("oppppppppppppppppressssssssssseeeeeeeeeedddd");
            System.out.println(oppPressed);
            Button btnOpp = btn.get(oppPressed);
            btnOpp.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Button button = (Button) event.getSource();
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            button.setText(oppTic);
                            button.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
                            System.out.println("myTic "+ oppTic);
                            
                            checkState();
                        }
                    });
                }
            });
            btnOpp.fire();
            myTurn= true;
            opponentTurn = false;
            

            
        } catch (IOException ex) {
            Logger.getLogger(OnlineGameBoardBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private boolean checkState(){
        System.out.println("checking state");
        checkColumns();
        checkRows();
        checkDiagonal();
        
        if(!gameState){
            
            OnlineAppManger.ps.println("updateGameState###"+OnlineAppManger.hash.get("email"));
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    if(display){
                        timelinewinner.play();
                    }else{
                        
                        timelinelose.play();
                    }
                }
            });
            reset();
            return true; 
            
        }else if(isFullGrid()){
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    System.out.println("It's adraw !!");
                    timelineldraw.play();        
                }                
            });
            reset();
            return true;
        }
        return false;
    }
    
    private void reset(){

        OnlineAppManger.ps.println("available###"+OnlineAppManger.hash.get("email"));
        thread.stop();
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
               
            }
        });
    }
    
    private void checkRows(){
        if(button11.getText().equals(button12.getText()) && button12.getText().equals(button13.getText()) && !button11.getText().equals("")){
            gameState = false;
            if(button11.getText().equals(myTic)){

                display = true; 
                highlightWinningButtons(button11, button12, button13);
                

                updateScore();
            }else{
                System.out.println("opp win");
            }
        }
        else if(button21.getText().equals(button22.getText()) && button22.getText().equals(button23.getText()) && !button21.getText().equals("")){
            gameState = false;
            if(button21.getText().equals(myTic)){
                display = true;

                highlightWinningButtons(button21, button22, button23);

                updateScore();
            }else{
                System.out.println("opp won!");
            }
        }
        else if(button31.getText().equals(button32.getText()) && button32.getText().equals(button33.getText()) && !button31.getText().equals("")){
            gameState = false;
            if(button31.getText().equals(myTic)){

                 display = true;
                highlightWinningButtons(button31, button32, button33);

                updateScore();
            }
        }
    }
    
    private void checkColumns(){
        if(button11.getText().equals(button21.getText()) && button21.getText().equals(button31.getText()) && !button11.getText().equals("")){
            if(button11.getText().equals(myTic)){

                display = true;

                highlightWinningButtons(button11, button21, button31);
                updateScore();
            }
            gameState = false;
        }
        else if(button12.getText().equals(button22.getText()) && button22.getText().equals(button32.getText()) && !button12.getText().equals("")){
            if(button12.getText().equals(myTic)){

               display = true;

                highlightWinningButtons(button12, button22, button32);

                updateScore();
            }
            gameState = false;
        }
        else if(button13.getText().equals(button23.getText()) && button23.getText().equals(button33.getText()) && !button13.getText().equals("")){
            if(button13.getText().equals(myTic)){

                 display = true;

                highlightWinningButtons(button13, button23, button33);
               updateScore();
            }
            gameState = false;
        }
    }
    
    private void checkDiagonal(){
        if(button11.getText().equals(button22.getText()) && button22.getText().equals(button33.getText()) && !button11.getText().equals("")){
            if(button11.getText().equals(myTic)){

               display = true;

                highlightWinningButtons(button11, button22, button33);

                updateScore();
            }
            gameState = false;
        }
        else if(button13.getText().equals(button22.getText()) && button22.getText().equals(button31.getText()) && !button13.getText().equals("")){
            if(button13.getText().equals(myTic)){

               display = true;

                highlightWinningButtons(button13, button22, button31);

                updateScore();
            }
            gameState = false;
        }
    }
    
    private boolean isFullGrid(){
        if(!button11.getText().equals("") && !button12.getText().equals("") && !button13.getText().equals("") && !button21.getText().equals("")
                && !button22.getText().equals("") && !button23.getText().equals("")&& !button31.getText().equals("")
                && !button32.getText().equals("") && !button33.getText().equals("")){
                return true;
        }else{
            return false;
        }
    }
    
    
    
    private void highlightWinningButtons(Button button1,Button button2,Button button3) {
        button1.setStyle("-fx-background-color:#69BA6C;-fx-background-radius: 25");
        button2.setStyle("-fx-background-color:#69BA6C;-fx-background-radius: 25");
        button3.setStyle("-fx-background-color:#69BA6C;-fx-background-radius: 25");
        
    }
    
    private void highlightLoserButtons(Button button1,Button button2,Button button3) {
        button1.setStyle("-fx-background-color:#69BA6C;-fx-background-radius: 25");
        button2.setStyle("-fx-background-color:#69BA6C;-fx-background-radius: 25");
        button3.setStyle("-fx-background-color:#69BA6C;-fx-background-radius: 25"); 
        
    }
    
    
    
    
    
    
}
