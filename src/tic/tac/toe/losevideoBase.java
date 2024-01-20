package tic.tac.toe;

import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public  class losevideoBase extends AnchorPane {

    protected final Button playAgainButton;
    protected final Button backToMainButn;
    protected final MediaView mediaView;
    GameBase gameBase;
    Player firstPlayer, secondPlayer;
    private Boolean challengeComputer = false;
    private GameDifficulty difficulty;

    public losevideoBase(Stage stage) {

        playAgainButton = new Button();
        backToMainButn = new Button();
        mediaView = new MediaView();
        Label RES = new Label();

        setId("AnchorPane");
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        getStyleClass().add("mainFxmlClass");
        getStylesheets().add("/tic/tac/toe/resultfxml.css");

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

        RES.setLayoutX(273.0);
        RES.setLayoutY(26.0);
        RES.setPrefHeight(107.0);
        RES.setPrefWidth(158.0);
        RES.setText("Loser!");
        RES.setTextFill(javafx.scene.paint.Color.valueOf("#fbc04f"));
        RES.setFont(new Font("Comic Sans MS Bold", 38.0));
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
        String path="/assets/videos/lose.mp4";
        Media media = new Media(getClass().getResource(path).toExternalForm());  
        MediaPlayer mediaPlayer = new MediaPlayer(media); 
        mediaView.setMediaPlayer(mediaPlayer);
        mediaView.setFitHeight(320.0);
        mediaView.setFitWidth(400.0);
        mediaView.setLayoutX(165.0);
        mediaView.setLayoutY(33.0);
        mediaPlayer.setAutoPlay(true); 
        getChildren().add(playAgainButton);
        getChildren().add(backToMainButn);
        getChildren().add(mediaView);
        //getChildren().add(RES);

        
        
          playAgainButton.setOnAction(new EventHandler<ActionEvent>() { //playAgain
            @Override
            public void handle(ActionEvent event) {
                Parent pane;
                pane = new GameBase(stage,firstPlayer, secondPlayer);
                stage.getScene().setRoot(pane);
                mediaPlayer.stop();
            }
        });
        
        
        backToMainButn.setOnAction(new EventHandler<ActionEvent>() { //back to main
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
