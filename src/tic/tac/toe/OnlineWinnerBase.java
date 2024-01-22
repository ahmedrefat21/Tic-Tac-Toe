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

public class OnlineWinnerBase extends AnchorPane {

    protected final AnchorPane anchorPane;
    protected final MediaView mediaView;
    protected final Label label;
    protected final MediaView mediaView0;
    protected final Button backToMainBtn;

    public OnlineWinnerBase(Stage stage) {

        anchorPane = new AnchorPane();
        mediaView = new MediaView();
        label = new Label();
        mediaView0 = new MediaView();
        backToMainBtn = new Button();

        setId("AnchorPane");
        setPrefHeight(473.0);
        setPrefWidth(730.0);

        anchorPane.setId("AnchorPane");
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(490.0);
        anchorPane.setPrefWidth(750.0);
        anchorPane.getStyleClass().add("mainFxmlClass");
        anchorPane.getStylesheets().add("/tic/tac/toe/css/resultfxml.css");
        
        

        AnchorPane.setBottomAnchor(mediaView, 127.0);
        AnchorPane.setLeftAnchor(mediaView, 165.0);
        AnchorPane.setRightAnchor(mediaView, 175.0);
        AnchorPane.setTopAnchor(mediaView, 33.0);
        String path="/assets/videos/winnerr.mp4";
        Media media = new Media(getClass().getResource(path).toExternalForm());  
        MediaPlayer mediaPlayer = new MediaPlayer(media); 
        mediaPlayer.setAutoPlay(true); 
        mediaView.setMediaPlayer(mediaPlayer);
        mediaView.setFitHeight(320.0);
        mediaView.setFitWidth(400.0);
        mediaView.setLayoutX(165.0);
        mediaView.setLayoutY(33.0);

        label.setLayoutX(157.0);
        label.setLayoutY(6.0);
        label.setPrefHeight(53.0);
        label.setPrefWidth(481.0);
        label.setStyle("-fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 );");
        label.setText("Winner Winner Chicken Dinner");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        label.setFont(new Font("Comic Sans MS Bold", 30.0));

        mediaView0.setFitHeight(320.0);
        mediaView0.setFitWidth(400.0);
        mediaView0.setLayoutX(189.0);
        mediaView0.setLayoutY(65.0);

        backToMainBtn.setLayoutX(284.0);
        backToMainBtn.setLayoutY(397.0);
        backToMainBtn.setMnemonicParsing(false);
        backToMainBtn.setPrefHeight(65.0);
        backToMainBtn.setPrefWidth(210.0);
        backToMainBtn.setStyle("-fx-border-radius: 50px; -fx-background-radius: 50; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 ); -fx-background-color: FCD015; -fx-text-fill: #FDE8ED;");
        backToMainBtn.setText("Main Board");
        backToMainBtn.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        backToMainBtn.setFont(new Font("Comic Sans MS Bold", 27.0));

        anchorPane.getChildren().add(mediaView);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(mediaView0);
        anchorPane.getChildren().add(backToMainBtn);
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
