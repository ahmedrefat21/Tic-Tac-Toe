package tic.tac.toe;

import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public  class draw_videoBase extends AnchorPane {

    protected final Button palyagainbtn;
    protected final Button mainmenubtn;
    protected final Label RES;
    protected final ImageView imageView;
    protected final MediaView mediaView;
    GameBase gameBase;
    Player PlayerOne, PlayerTwo;
    private Boolean challengeComputer = false;
    private GameDifficulty difficulty;
  
     public draw_videoBase(Stage stage, Player firstPlayer, Player secondPlayer, Boolean challengeComputer, GameDifficulty difficulty) {
        this(stage, firstPlayer, secondPlayer);
        this.challengeComputer = challengeComputer;
        this.difficulty = difficulty;
    }
    public draw_videoBase(Stage stage,Player firstPlayer, Player secondPlayer) {

        palyagainbtn = new Button();
        mainmenubtn = new Button();
        RES = new Label();
        imageView = new ImageView();
        mediaView = new MediaView();
        PlayerOne = new Player();
        PlayerTwo= new Player();
        
  
        setId("AnchorPane");
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        getStyleClass().add("mainFxmlClass");
        getStylesheets().add("/tic/tac/toe/css/draw_video.css");

        AnchorPane.setBottomAnchor(palyagainbtn, 46.0);
        AnchorPane.setLeftAnchor(palyagainbtn, 125.0);
        AnchorPane.setRightAnchor(palyagainbtn, 413.0);
        AnchorPane.setTopAnchor(palyagainbtn, 378.0);
        palyagainbtn.setLayoutX(125.0);
        palyagainbtn.setLayoutY(378.0);
        palyagainbtn.setMnemonicParsing(false);
        palyagainbtn.setPrefHeight(54.0);
        palyagainbtn.setPrefWidth(202.0);
       // palyagainbtn.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        palyagainbtn.setStyle("-fx-border-radius: 50px; -fx-background-radius: 50;");
       
        palyagainbtn.getStylesheets().add("/tic/tac/toe/css/draw_video.css");
        palyagainbtn.setText("Play again");
        palyagainbtn.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        palyagainbtn.setFont(new Font("Comic Sans MS Bold", 27.0));
        
        String path="/assets/videos/draw.mp4";
        Media media = new Media(getClass().getResource(path).toExternalForm());  
        MediaPlayer mediaPlayer = new MediaPlayer(media); 
        mediaView.setMediaPlayer(mediaPlayer);
        mediaView.setFitHeight(320.0);
        mediaView.setFitWidth(400.0);
        mediaView.setLayoutX(185.0);
        mediaView.setLayoutY(100.0);
        mediaPlayer.setAutoPlay(true); 
        AnchorPane.setBottomAnchor(mainmenubtn, 46.0);
        AnchorPane.setLeftAnchor(mainmenubtn, 414.0);
        AnchorPane.setRightAnchor(mainmenubtn, 124.0);
        AnchorPane.setTopAnchor(mainmenubtn, 378.0);
        mainmenubtn.setLayoutX(414.0);
        mainmenubtn.setLayoutY(378.0);
        mainmenubtn.setMnemonicParsing(false);
        mainmenubtn.setPrefHeight(54.0);
        mainmenubtn.setPrefWidth(202.0);
        mainmenubtn.setStyle("-fx-border-radius: 50px; -fx-background-radius: 50;");
      //  mainmenubtn.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        mainmenubtn.getStylesheets().add("/tic/tac/toe/css/draw_video.css");
        mainmenubtn.setText("Main menu");
        mainmenubtn.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        mainmenubtn.setFont(new Font("Comic Sans MS Bold", 27.0));
        

        AnchorPane.setBottomAnchor(RES, 361.0);
        AnchorPane.setLeftAnchor(RES, 300.0);
        AnchorPane.setRightAnchor(RES, 291.0);
        AnchorPane.setTopAnchor(RES, 10.0);
        RES.setLayoutX(273.0);
        RES.setLayoutY(80.0);
        RES.setPrefHeight(150.0);
        RES.setPrefWidth(200.0);
        RES.setText("Draw");
        RES.setTextFill(javafx.scene.paint.Color.valueOf("#fbc04f"));
        RES.setFont(new Font("Comic Sans MS Bold", 38.0));

        

        getChildren().add(palyagainbtn);
        getChildren().add(mainmenubtn);
        getChildren().add(RES);
        getChildren().add(imageView);
        getChildren().add(mediaView);

        
          palyagainbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent pane;
                pane = new GameBase(stage,firstPlayer, secondPlayer,challengeComputer,difficulty);
                stage.getScene().setRoot(pane);
                mediaPlayer.stop();
            }
        });
        
        
         mainmenubtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {  
                Parent pane = new MainPageBase(stage);
                stage.getScene().setRoot(pane);
                GameBase.player1Score = 0 ;  
                GameBase.player2Score = 0 ;
                mediaPlayer.stop();

            }
        });        
        
    }
   
    
    
}
