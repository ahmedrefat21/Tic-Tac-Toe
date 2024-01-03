package tic.tac.toe;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

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

import javax.swing.JOptionPane;

import javafx.util.Duration;


public class resultFXMLBase extends AnchorPane {

    protected final Button button;
    protected final Label label;
    protected final ImageView imageView;
    protected final Button button0;
    protected final MediaView mideaview;
   Player playerOne, playerTwo;
    public resultFXMLBase(Stage stage, Player firstPlayer, Player secondPlayer) {

        button = new Button();
        label = new Label();
        imageView = new ImageView();
        button0 = new Button();
        mideaview = new MediaView();
         
        playerOne = new Player();
        playerTwo = new Player();
        PrepareWinnerScreen();
        

        setId("AnchorPane");
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        getStyleClass().add("mainFxmlClass");
        getStylesheets().add("/tic/tac/toe/resultfxml.css");

        AnchorPane.setBottomAnchor(button, 46.0);
        AnchorPane.setLeftAnchor(button, 125.0);
        AnchorPane.setRightAnchor(button, 413.0);
        AnchorPane.setTopAnchor(button, 378.0);
        button.setLayoutX(125.0);
        button.setLayoutY(378.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(54.0);
        button.setPrefWidth(202.0);
        button.setStyle("-fx-border-radius: 50px; -fx-background-radius: 50;-fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 );");
        button.getStylesheets().add("/tic/tac/toe/resultfxml.css");
        button.setText("Play again");
        button.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button.setFont(new Font("Comic Sans MS Bold", 27.0));

        AnchorPane.setBottomAnchor(label, 361.0);
        AnchorPane.setLeftAnchor(label, 291.0);
        AnchorPane.setRightAnchor(label, 291.0);
        AnchorPane.setTopAnchor(label, 12.0);
        label.setLayoutX(291.0);
        label.setLayoutY(12.0);
        label.setPrefHeight(107.0);
        label.setPrefWidth(158.0);
        label.getStylesheets().add("/tic/tac/toe/");
        label.setText("RESULT");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#fbc04f"));
        label.setFont(new Font("Comic Sans MS Bold", 38.0));

        AnchorPane.setBottomAnchor(imageView, 381.0);
        AnchorPane.setLeftAnchor(imageView, 7.0);
        AnchorPane.setRightAnchor(imageView, 653.8761901855469);
        AnchorPane.setTopAnchor(imageView, 32.0);
        imageView.setFitHeight(67.0);
        imageView.setFitWidth(83.0);
        imageView.setLayoutX(7.0);
        imageView.setLayoutY(32.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/images/back.png").toExternalForm()));

        AnchorPane.setBottomAnchor(button0, 46.0);
        AnchorPane.setLeftAnchor(button0, 414.0);
        AnchorPane.setRightAnchor(button0, 124.0);
        AnchorPane.setTopAnchor(button0, 378.0);
        button0.setLayoutX(414.0);
        button0.setLayoutY(378.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(54.0);
        button0.setPrefWidth(202.0);
        button0.setStyle("-fx-border-radius: 50px; -fx-background-radius: 50; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 );");
        button0.getStylesheets().add("/tic/tac/toe/resultfxml.css");
        button0.setText("Main menu");
        button0.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button0.setFont(new Font("Comic Sans MS Bold", 27.0));

        AnchorPane.setBottomAnchor(mideaview, 151.0);
        AnchorPane.setLeftAnchor(mideaview, 270.0);
        AnchorPane.setRightAnchor(mideaview, 270.0);
        AnchorPane.setTopAnchor(mideaview, 129.0);
        mideaview.setFitHeight(200.0);
        mideaview.setFitWidth(200.0);
        mideaview.setLayoutX(270.0);
        mideaview.setLayoutY(129.0);

        getChildren().add(button);
        getChildren().add(label);
        getChildren().add(imageView);
        getChildren().add(button0);
      
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent pane = new GameBase(stage,firstPlayer, secondPlayer);
                stage.getScene().setRoot(pane);
                
            }
        });
        
        
        button0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent pane = new MainPageBase(stage);
                stage.getScene().setRoot(pane);
                
            }
        });        
        
        

    }
    public void PrepareWinnerScreen()
     {
        String path="/assets/videos/winner.mp4";
        Media media = new Media(getClass().getResource(path).toExternalForm());  
        MediaPlayer mediaPlayer = new MediaPlayer(media); 
        mideaview.setMediaPlayer(mediaPlayer);
        mideaview.setFitHeight(300);
        mideaview.setFitWidth(300);
        mideaview.setLayoutX(120.0);
        mideaview.setLayoutY(120.0);
        getChildren().add(mideaview);
        mediaPlayer.setAutoPlay(true);  
      
       
    }
}