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

public  class OnlineLoseBase extends AnchorPane {

    protected final AnchorPane anchorPane;
    protected final Button backToMainBtn;
    protected final MediaView mediaView;
    protected final Label label;

    public OnlineLoseBase(Stage stage) {

        anchorPane = new AnchorPane();
        backToMainBtn = new Button();
        mediaView = new MediaView();
        label = new Label();

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

        AnchorPane.setBottomAnchor(backToMainBtn, 12.0);
        AnchorPane.setLeftAnchor(backToMainBtn, 279.0);
        AnchorPane.setRightAnchor(backToMainBtn, 261.0);
        AnchorPane.setTopAnchor(backToMainBtn, 413.0);
        backToMainBtn.setLayoutX(279.0);
        backToMainBtn.setLayoutY(413.0);
        backToMainBtn.setMnemonicParsing(false);
        backToMainBtn.setPrefHeight(65.0);
        backToMainBtn.setPrefWidth(210.0);
        backToMainBtn.setStyle("-fx-border-radius: 50px; -fx-background-radius: 50; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 ); -fx-background-color: FCD015; -fx-text-fill: #FDE8ED;");
        backToMainBtn.setText("Main Board");
        backToMainBtn.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        backToMainBtn.setFont(new Font("Comic Sans MS Bold", 27.0));

        
        AnchorPane.setBottomAnchor(mediaView, 85.0);
        AnchorPane.setLeftAnchor(mediaView, 193.0);
        AnchorPane.setRightAnchor(mediaView, 157.0);
        AnchorPane.setTopAnchor(mediaView, 85.0);
        String path="/assets/videos/lose.mp4";
        Media media = new Media(getClass().getResource(path).toExternalForm());  
        MediaPlayer mediaPlayer = new MediaPlayer(media); 
        mediaPlayer.setAutoPlay(true); 
        mediaView.setMediaPlayer(mediaPlayer);
        mediaView.setFitHeight(320.0);
        mediaView.setFitWidth(400.0);
        mediaView.setLayoutX(193.0);
        mediaView.setLayoutY(85.0);

        label.setLayoutX(244.0);
        label.setLayoutY(10.0);
        label.setPrefHeight(84.0);
        label.setPrefWidth(311.0);
        label.setStyle("-fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 );");
        label.setText("Hard Luck!");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        label.setFont(new Font("Comic Sans MS", 60.0));

        anchorPane.getChildren().add(backToMainBtn);
        anchorPane.getChildren().add(mediaView);
        anchorPane.getChildren().add(label);
        getChildren().add(anchorPane);
        
        
        
       

        backToMainBtn.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent event) {  
                Parent pane = new ScoreScreenBase(stage);
                stage.getScene().setRoot(pane);
               
                mediaPlayer.stop();

            }
        }); 
    }
    
}
