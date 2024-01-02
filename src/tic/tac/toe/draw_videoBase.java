package tic.tac.toe;

import java.net.URL;
import javafx.geometry.Pos;
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
    protected final MediaView mideaview;
    
    public draw_videoBase(Stage stage) {

        palyagainbtn = new Button();
        mainmenubtn = new Button();
        RES = new Label();
        imageView = new ImageView();
        mideaview = new MediaView();
        PrepareDrawScreen();
  
        setId("AnchorPane");
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        getStyleClass().add("mainFxmlClass");
        getStylesheets().add("/tic/tac/toe/draw_video.css");

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
       
        palyagainbtn.getStylesheets().add("/tic/tac/toe/draw_video.css");
        palyagainbtn.setText("Play again");
        palyagainbtn.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        palyagainbtn.setFont(new Font("Comic Sans MS Bold", 27.0));
        

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
        mainmenubtn.getStylesheets().add("/tic/tac/toe/draw_video.css");
        mainmenubtn.setText("Main menu");
        mainmenubtn.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        mainmenubtn.setFont(new Font("Comic Sans MS Bold", 27.0));
        

        AnchorPane.setBottomAnchor(RES, 361.0);
        AnchorPane.setLeftAnchor(RES, 291.0);
        AnchorPane.setRightAnchor(RES, 291.0);
        AnchorPane.setTopAnchor(RES, 12.0);
        RES.setLayoutX(273.0);
        RES.setLayoutY(26.0);
        RES.setPrefHeight(107.0);
        RES.setPrefWidth(158.0);
        RES.setText("RESULT");
        RES.setTextFill(javafx.scene.paint.Color.valueOf("#fbc04f"));
        RES.setFont(new Font("Comic Sans MS Bold", 38.0));

        AnchorPane.setBottomAnchor(imageView, 381.0);
        AnchorPane.setLeftAnchor(imageView, 7.0);
        AnchorPane.setRightAnchor(imageView, 653.87);
        AnchorPane.setTopAnchor(imageView, 32.0);
        imageView.setFitHeight(67.0);
        imageView.setFitWidth(83.0);
        imageView.setLayoutX(7.0);
        imageView.setLayoutY(32.0);
        imageView.setImage(new Image(getClass().getResource("/assets/images/back.png").toExternalForm()));

        getChildren().add(palyagainbtn);
        getChildren().add(mainmenubtn);
        getChildren().add(RES);
        getChildren().add(imageView);

    }

    
    public void PrepareDrawScreen()
     {
        String path="file:/C:/Users/Administrator/Desktop/tic%20tac%20toe/Tic-Tac-Toe/src/assets/videos/draw.mp4";
        Media media = new Media(path);  
        MediaPlayer mediaPlayer = new MediaPlayer(media); 
        mideaview.setMediaPlayer(mediaPlayer);
        mideaview.setFitHeight(300);
        mideaview.setFitWidth(330);
        mideaview.setLayoutX(220.0);
        mideaview.setLayoutY(150.0);
       
        getChildren().add(mideaview);
        mediaPlayer.setAutoPlay(true);  
        
      
       
    }
}
