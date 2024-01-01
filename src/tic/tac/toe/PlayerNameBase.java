package tic.tac.toe;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class PlayerNameBase extends AnchorPane {

    protected final Text text;
    protected final Text text0;
    protected final TextField playerOneTextField;
    protected final Text text1;
    protected final TextField playerTwoTextField;
    protected final Button okButton;
    protected final Button backButton;
    protected final ImageView imageView;
    public static String player1Name;
    public static String player2Name;

    public PlayerNameBase() {

        text = new Text();
        text0 = new Text();
        playerOneTextField = new TextField();
        text1 = new Text();
        playerTwoTextField = new TextField();
        okButton = new Button();
        backButton = new Button();
        imageView = new ImageView();

        setId("AnchorPane");
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        getStyleClass().add("alert-box");
        getStylesheets().add("/tic/tac/toe/css/AlertPlayerName.css");

        text.setFill(javafx.scene.paint.Color.valueOf("#362900"));
        text.setLayoutX(72.0);
        text.setLayoutY(121.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.getStyleClass().add("head-text");
        text.setText("Enter Players Name");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(612.4375);

        text0.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        text0.setId("firstPlayerNameText");
        text0.setLayoutX(180.0);
        text0.setLayoutY(218.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("player 1");
        text0.setFont(new Font("Comic Sans MS Bold", 24.0));

        playerOneTextField.setLayoutX(312.0);
        playerOneTextField.setLayoutY(191.0);
        playerOneTextField.setPrefHeight(48.0);
        playerOneTextField.setPrefWidth(244.0);
        playerOneTextField.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5); -fx-background-radius: 15; -fx-border-color: f22853; -fx-border-radius: 15; -fx-background-color: #FDE8ED;");

        text1.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        text1.setId("firstPlayerNameText");
        text1.setLayoutX(182.0);
        text1.setLayoutY(303.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("player 2");
        text1.setFont(new Font("Comic Sans MS Bold", 24.0));

        playerTwoTextField.setLayoutX(314.0);
        playerTwoTextField.setLayoutY(272.0);
        playerTwoTextField.setPrefHeight(48.0);
        playerTwoTextField.setPrefWidth(244.0);
        playerTwoTextField.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5); -fx-background-radius: 15; -fx-border-color: f22853; -fx-border-radius: 15; -fx-background-color: #FDE8ED;");

        okButton.setId("styles");
        okButton.setLayoutX(283.0);
        okButton.setLayoutY(375.0);
        okButton.setMnemonicParsing(false);
        okButton.setPrefHeight(52.0);
        okButton.setPrefWidth(123.0);
        okButton.setStyle("-fx-background-color: FCD015; -fx-background-radius: 45; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 ); -fx-text-fill: #FDE8ED;");
        okButton.setText("Start");
        okButton.setTextFill(javafx.scene.paint.Color.valueOf("#fde8ed"));
        okButton.setWrapText(true);
        okButton.setPadding(new Insets(0.0, 10.0, 10.0, 10.0));
        okButton.setFont(new Font("Comic Sans MS Bold", 30.0));
        
        player1Name=playerOneTextField.getText();
        player2Name=playerTwoTextField.getText();
        okButton.setOnAction(e -> {
            if (player1Name.length() > 0 && player2Name.length() > 0) {
               
                //TicTacToe.scene().setRoot(new GameBase());
            } else {
                
            }
            
            
        });

        backButton.setId("styles");
        backButton.setLayoutX(438.0);
        backButton.setLayoutY(374.0);
        backButton.setMnemonicParsing(false);
        backButton.setPrefHeight(52.0);
        backButton.setPrefWidth(123.0);
        backButton.setStyle("-fx-background-color: #f22853; -fx-background-radius: 45; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 ); -fx-text-fill: #FDE8ED;");
        backButton.setText("Back");
        backButton.setTextFill(javafx.scene.paint.Color.valueOf("#fde8ed"));
        backButton.setWrapText(true);
        backButton.setPadding(new Insets(0.0, 10.0, 10.0, 10.0));
        backButton.setFont(new Font("Comic Sans MS Bold", 30.0));
        
        

        imageView.setFitHeight(163.0);
        imageView.setFitWidth(179.0);
        imageView.setLayoutY(315.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/images/background.png").toExternalForm()));

        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(playerOneTextField);
        getChildren().add(text1);
        getChildren().add(playerTwoTextField);
        getChildren().add(okButton);
        getChildren().add(backButton);
        getChildren().add(imageView);

    }
}
