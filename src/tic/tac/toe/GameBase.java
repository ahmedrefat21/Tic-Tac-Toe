package tic.tac.toe;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class GameBase extends AnchorPane {

    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView exitimage;
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
    protected final ImageView recordImage;
    boolean isfirstPlayerTurn = true;
   
		

    public GameBase() {

        imageView = new ImageView();
        imageView0 = new ImageView();
        exitimage = new ImageView();
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
        recordImage = new ImageView();

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
        imageView.setImage(new Image(getClass().getResource("../../../assets/images/game%201.png").toExternalForm()));

        AnchorPane.setBottomAnchor(imageView0, 358.0);
        AnchorPane.setRightAnchor(imageView0, 30.0);
        AnchorPane.setTopAnchor(imageView0, 18.0);
        imageView0.setFitHeight(104.0);
        imageView0.setFitWidth(131.0);
        imageView0.setLayoutX(604.0);
        imageView0.setLayoutY(18.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("../../../assets/images/gamer%202.png").toExternalForm()));

        AnchorPane.setBottomAnchor(exitimage, 14.0);
        AnchorPane.setRightAnchor(exitimage, 15.0);
        AnchorPane.setTopAnchor(exitimage, 382.0);
        exitimage.setFitHeight(89.0);
        exitimage.setFitWidth(123.0);
        exitimage.setLayoutX(637.0);
        exitimage.setLayoutY(377.0);
        exitimage.setPickOnBounds(true);
        exitimage.setPreserveRatio(true);
        exitimage.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        exitimage.setImage(new Image(getClass().getResource("../../../assets/images/exit.png").toExternalForm()));

        button11.setLayoutX(189.0);
        button11.setLayoutY(118.0);
        button11.setMinHeight(96.0);
        button11.setMinWidth(113.0);
        button11.setMnemonicParsing(false);
        button11.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button11.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button11.setText("X");
        button11.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button11.setFont(new Font("Comic Sans MS Bold", 48.0));
        button11.setOpaqueInsets(new Insets(5.0, 5.0, 0.0, 0.0));

        button13.setLayoutX(455.0);
        button13.setLayoutY(119.0);
        button13.setMinHeight(96.0);
        button13.setMinWidth(113.0);
        button13.setMnemonicParsing(false);
        button13.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button13.setText("X");
        button13.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button13.setFont(new Font("Comic Sans MS Bold", 48.0));

        button12.setLayoutX(327.0);
        button12.setLayoutY(119.0);
        button12.setMinHeight(96.0);
        button12.setMinWidth(113.0);
        button12.setMnemonicParsing(false);
        button12.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button12.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button12.setText("o");
        button12.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        button12.setFont(new Font("Comic Sans MS Bold", 48.0));
        button12.setOpaqueInsets(new Insets(5.0, 5.0, 5.0, 0.0));

        button31.setLayoutX(193.0);
        button31.setLayoutY(361.0);
        button31.setMinHeight(96.0);
        button31.setMinWidth(113.0);
        button31.setMnemonicParsing(false);
        button31.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button31.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button31.setText("X");
        button31.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button31.setFont(new Font("Comic Sans MS Bold", 48.0));
        button31.setOpaqueInsets(new Insets(5.0, 5.0, 0.0, 0.0));

        button23.setLayoutX(461.0);
        button23.setLayoutY(243.0);
        button23.setMinHeight(96.0);
        button23.setMinWidth(113.0);
        button23.setMnemonicParsing(false);
        button23.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button23.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button23.setText("X");
        button23.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button23.setFont(new Font("Comic Sans MS Bold", 48.0));

        button22.setLayoutX(327.0);
        button22.setLayoutY(244.0);
        button22.setMinHeight(96.0);
        button22.setMinWidth(113.0);
        button22.setMnemonicParsing(false);
        button22.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button22.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button22.setText("X");
        button22.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button22.setFont(new Font("Comic Sans MS Bold", 48.0));

        button21.setLayoutX(192.0);
        button21.setLayoutY(243.0);
        button21.setMinHeight(96.0);
        button21.setMinWidth(113.0);
        button21.setMnemonicParsing(false);
        button21.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button21.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button21.setText("X");
        button21.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button21.setFont(new Font("Comic Sans MS Bold", 48.0));
        button21.setOpaqueInsets(new Insets(5.0, 5.0, 0.0, 0.0));

        button33.setLayoutX(461.0);
        button33.setLayoutY(361.0);
        button33.setMinHeight(96.0);
        button33.setMinWidth(113.0);
        button33.setMnemonicParsing(false);
        button33.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button33.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button33.setText("o");
        button33.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        button33.setFont(new Font("Comic Sans MS Bold", 48.0));

        button32.setLayoutX(325.0);
        button32.setLayoutY(359.0);
        button32.setMinHeight(96.0);
        button32.setMinWidth(113.0);
        button32.setMnemonicParsing(false);
        button32.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button32.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button32.setText("o");
        button32.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        button32.setFont(new Font("Comic Sans MS Bold", 48.0));

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
        firstPlayerNameText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        firstPlayerNameText.setText("Refat");
        firstPlayerNameText.setFont(new Font("Comic Sans MS Bold", 48.0));

        AnchorPane.setBottomAnchor(secondPlayerNameText, 291.0);
        AnchorPane.setTopAnchor(secondPlayerNameText, 122.0);
        secondPlayerNameText.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        secondPlayerNameText.setId("firstPlayerNameText");
        secondPlayerNameText.setLayoutX(592.0);
        secondPlayerNameText.setLayoutY(175.0);
        secondPlayerNameText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        secondPlayerNameText.setStrokeWidth(0.0);
        secondPlayerNameText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        secondPlayerNameText.setText("Sara");
        secondPlayerNameText.setFont(new Font("Comic Sans MS Bold", 48.0));

        AnchorPane.setBottomAnchor(firstPlayerScoreText, 206.0);
        AnchorPane.setTopAnchor(firstPlayerScoreText, 207.0);
        firstPlayerScoreText.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        firstPlayerScoreText.setId("firstPlayerNameText");
        firstPlayerScoreText.setLayoutX(67.0);
        firstPlayerScoreText.setLayoutY(260.0);
        firstPlayerScoreText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        firstPlayerScoreText.setStrokeWidth(0.0);
        firstPlayerScoreText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        firstPlayerScoreText.setText("5");
        firstPlayerScoreText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        firstPlayerScoreText.setFont(new Font("Comic Sans MS Bold", 48.0));

        AnchorPane.setBottomAnchor(secondPlayerScoreText, 206.0);
        AnchorPane.setTopAnchor(secondPlayerScoreText, 207.0);
        secondPlayerScoreText.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        secondPlayerScoreText.setId("firstPlayerNameText");
        secondPlayerScoreText.setLayoutX(628.0);
        secondPlayerScoreText.setLayoutY(249.0);
        secondPlayerScoreText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        secondPlayerScoreText.setStrokeWidth(0.0);
        secondPlayerScoreText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        secondPlayerScoreText.setText("4");
        secondPlayerScoreText.setFont(new Font("Comic Sans MS Bold", 48.0));

        AnchorPane.setBottomAnchor(recordImage, 14.0);
        AnchorPane.setLeftAnchor(recordImage, 15.0);
        AnchorPane.setTopAnchor(recordImage, 382.0);
        recordImage.setFitHeight(83.0);
        recordImage.setFitWidth(104.0);
        recordImage.setLayoutX(15.0);
        recordImage.setLayoutY(382.0);
        recordImage.setPickOnBounds(true);
        recordImage.setPreserveRatio(true);
        recordImage.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        recordImage.setImage(new Image(getClass().getResource("../../../assets/images/recording.png").toExternalForm()));

        getChildren().add(imageView);
        getChildren().add(imageView0);
        getChildren().add(exitimage);
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
        getChildren().add(recordImage);

    }
     private void setCurrentPlayerShadow(){
         
           if (isfirstPlayerTurn==true){
                firstPlayerNameText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
           }else{
               secondPlayerNameText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
           } 
        
        }
}
