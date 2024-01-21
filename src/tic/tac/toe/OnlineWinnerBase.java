package tic.tac.toe;

import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public  class OnlineWinnerBase extends AnchorPane {

    protected final AnchorPane anchorPane;
    protected final Button playAgainButton;
    protected final Button backToMainButn;
    protected final MediaView mediaView;
    protected final Button playAgainButton0;
    protected final Button backToMainButn0;
    protected final MediaView mediaView0;
    Player PlayerOne, PlayerTwo;
    OnlineGameBoardBase online;
     private int score;
     String player2 ;
     boolean state;

    public OnlineWinnerBase(Stage stage) {

        anchorPane = new AnchorPane();
        playAgainButton = new Button();
        backToMainButn = new Button();
        mediaView = new MediaView();
        playAgainButton0 = new Button();
        backToMainButn0 = new Button();
        mediaView0 = new MediaView();
        PlayerOne= new Player();
        PlayerTwo= new Player();
        //online.firstPlayerScoreText.getText("score");
        setId("AnchorPane");
        setPrefHeight(473.0);
        setPrefWidth(730.0);

        anchorPane.setId("AnchorPane");
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(490.0);
        anchorPane.setPrefWidth(750.0);
        anchorPane.getStyleClass().add("mainFxmlClass");
        anchorPane.getStylesheets().add("/tic/tac/toe/resultfxml.css");

        AnchorPane.setBottomAnchor(playAgainButton, 48.0);
        AnchorPane.setLeftAnchor(playAgainButton, 72.0);
        AnchorPane.setRightAnchor(playAgainButton, 461.0);
        AnchorPane.setTopAnchor(playAgainButton, 369.0);
        playAgainButton.setLayoutX(72.0);
        playAgainButton.setLayoutY(369.0);
        playAgainButton.setMnemonicParsing(false);
        playAgainButton.setPrefHeight(63.0);
        playAgainButton.setPrefWidth(207.0);
        playAgainButton.setStyle("-fx-border-radius: 50px; -fx-background-radius: 50;");
        playAgainButton.getStylesheets().add("/tic/tac/toe/resultfxml.css");
        playAgainButton.setText("Play again");
        playAgainButton.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        playAgainButton.setFont(new Font("Comic Sans MS Bold", 27.0));

        String path="/assets/videos/winnerr.mp4";
        Media media = new Media(getClass().getResource(path).toExternalForm());  
        MediaPlayer mediaPlayer = new MediaPlayer(media); 
        mediaView.setMediaPlayer(mediaPlayer);
        mediaView.setFitHeight(320.0);
        mediaView.setFitWidth(400.0);
        mediaView.setLayoutX(185.0);
        mediaView.setLayoutY(100.0);
        mediaPlayer.setAutoPlay(true); 
        AnchorPane.setBottomAnchor(backToMainButn, 48.0);
        AnchorPane.setLeftAnchor(backToMainButn, 465.0);
        AnchorPane.setRightAnchor(backToMainButn, 75.0);
        AnchorPane.setTopAnchor(backToMainButn, 369.0);
        backToMainButn.setLayoutX(465.0);
        backToMainButn.setLayoutY(369.0);
        backToMainButn.setMnemonicParsing(false);
        backToMainButn.setPrefHeight(63.0);
        backToMainButn.setPrefWidth(200.0);
        backToMainButn.setStyle("-fx-border-radius: 50px; -fx-background-radius: 50;");
        backToMainButn.getStylesheets().add("/tic/tac/toe/resultfxml.css");
        backToMainButn.setText("Main menu");
        backToMainButn.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        backToMainButn.setFont(new Font("Comic Sans MS Bold", 27.0));

        AnchorPane.setBottomAnchor(mediaView, 127.0);
        AnchorPane.setLeftAnchor(mediaView, 165.0);
        AnchorPane.setRightAnchor(mediaView, 175.0);
        AnchorPane.setTopAnchor(mediaView, 33.0);
        mediaView.setFitHeight(320.0);
        mediaView.setFitWidth(400.0);
        mediaView.setLayoutX(165.0);
        mediaView.setLayoutY(33.0);

        playAgainButton0.setLayoutX(82.0);
        playAgainButton0.setLayoutY(379.0);
        playAgainButton0.setMnemonicParsing(false);
        playAgainButton0.setPrefHeight(63.0);
        playAgainButton0.setPrefWidth(207.0);
        playAgainButton0.setStyle("-fx-border-radius: 50px; -fx-background-radius: 50;");
        playAgainButton0.getStylesheets().add("/tic/tac/toe/resultfxml.css");
        playAgainButton0.setText("Play again");
        playAgainButton0.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        playAgainButton0.setFont(new Font("Comic Sans MS Bold", 27.0));

        backToMainButn0.setLayoutX(475.0);
        backToMainButn0.setLayoutY(379.0);
        backToMainButn0.setMnemonicParsing(false);
        backToMainButn0.setPrefHeight(63.0);
        backToMainButn0.setPrefWidth(200.0);
        backToMainButn0.setStyle("-fx-border-radius: 50px; -fx-background-radius: 50;");
        backToMainButn0.getStylesheets().add("/tic/tac/toe/resultfxml.css");
        backToMainButn0.setText("Main menu");
        backToMainButn0.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        backToMainButn0.setFont(new Font("Comic Sans MS Bold", 27.0));

        mediaView0.setFitHeight(320.0);
        mediaView0.setFitWidth(400.0);
        mediaView0.setLayoutX(175.0);
        mediaView0.setLayoutY(43.0);

        anchorPane.getChildren().add(playAgainButton);
        anchorPane.getChildren().add(backToMainButn);
        anchorPane.getChildren().add(mediaView);
        getChildren().add(anchorPane);
        getChildren().add(playAgainButton0);
        getChildren().add(backToMainButn0);
        getChildren().add(mediaView0);
       
        
        playAgainButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
            }
        });
        
        
        backToMainButn.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent event) {  
                Parent pane = new ScoreScreenBase(stage);
                stage.getScene().setRoot(pane);
               
                mediaPlayer.stop();

            }
        });        
        
    }
}
