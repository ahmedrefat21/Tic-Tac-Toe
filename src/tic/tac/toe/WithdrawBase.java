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

public class WithdrawBase extends AnchorPane {

    protected final AnchorPane anchorPane;
    protected final MediaView mediaView;
    protected final Button backToMainButn;
    

    public WithdrawBase(Stage stage) {

        anchorPane = new AnchorPane();
        mediaView = new MediaView();
        backToMainButn = new Button();
       

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        anchorPane.setId("AnchorPane");
        anchorPane.setLayoutX(10.0);
        anchorPane.setLayoutY(10.0);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(480.0);
        anchorPane.setPrefWidth(740.0);
        anchorPane.getStyleClass().add("mainFxmlClass");
        anchorPane.getStylesheets().add("/tic/tac/toe/resultfxml.css");

        AnchorPane.setBottomAnchor(mediaView, 127.0);
        AnchorPane.setLeftAnchor(mediaView, 165.0);
        AnchorPane.setRightAnchor(mediaView, 175.0);
        AnchorPane.setTopAnchor(mediaView, 33.0);
        String path="/assets/videos/withdraw.mp4";
        Media media = new Media(getClass().getResource(path).toExternalForm());  
        MediaPlayer mediaPlayer = new MediaPlayer(media); 
        mediaView.setMediaPlayer(mediaPlayer);
        mediaView.setFitHeight(320.0);
        mediaView.setFitWidth(400.0);
        mediaView.setLayoutX(165.0);
        mediaView.setLayoutY(33.0);

        backToMainButn.setLayoutX(265.0);
        backToMainButn.setLayoutY(374.0);
        backToMainButn.setMnemonicParsing(false);
        backToMainButn.setPrefHeight(63.0);
        backToMainButn.setPrefWidth(200.0);
        backToMainButn.setStyle("-fx-border-radius: 50px; -fx-background-radius: 50;");
        backToMainButn.getStylesheets().add("/tic/tac/toe/resultfxml.css");
        backToMainButn.setText("Main menu");
        backToMainButn.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        backToMainButn.setFont(new Font("Comic Sans MS Bold", 27.0));

       

        anchorPane.getChildren().add(mediaView);
        anchorPane.getChildren().add(backToMainButn);
        getChildren().add(anchorPane);
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
