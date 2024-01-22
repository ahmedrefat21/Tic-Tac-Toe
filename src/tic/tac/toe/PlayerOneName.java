package tic.tac.toe;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlayerOneName extends AnchorPane {

    protected final Text text;
    protected final Text text0;
    protected final TextField playerOneTextField;
    protected final Button startButton;
    protected final Button backButton;
    protected final ImageView imageView;

    public PlayerOneName(Stage stage, GameDifficulty difficulty) {
        text = new Text();
        text0 = new Text();
        playerOneTextField = new TextField();
        startButton = new Button();
        backButton = new Button();
        imageView = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        getStyleClass().add("alert-box");
        getStylesheets().add("/tic/tac/toe/css/AlertPlayerName.css");

        text.setFill(javafx.scene.paint.Color.valueOf("#362900"));
        text.setLayoutX(8.0);
        text.setLayoutY(105.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.getStyleClass().add("head-text");
        text.setText("Enter Player Name");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(584.4375);

        text0.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        text0.setId("firstPlayerNameText");
        text0.setLayoutX(115.0);
        text0.setLayoutY(209.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("player 1");
        text0.setFont(new Font("Comic Sans MS Bold", 24.0));

        playerOneTextField.setLayoutX(244.0);
        playerOneTextField.setLayoutY(176.0);
        playerOneTextField.setPrefHeight(48.0);
        playerOneTextField.setPrefWidth(244.0);
        playerOneTextField.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5); -fx-background-radius: 15; -fx-border-color: f22853; -fx-border-radius: 15; -fx-background-color: #FDE8ED; -fx-text-fill: F22853;");
        playerOneTextField.setFont(new Font("Comic Sans MS Bold", 19.0));

        startButton.setId("styles");
        startButton.setLayoutX(227.0);
        startButton.setLayoutY(291.0);
        startButton.setMnemonicParsing(false);
        startButton.setPrefHeight(52.0);
        startButton.setPrefWidth(123.0);
        startButton.setStyle("-fx-background-color: FCD015; -fx-background-radius: 45; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 ); -fx-text-fill: #FDE8ED;");
        startButton.setText("Start");
        startButton.setTextFill(javafx.scene.paint.Color.valueOf("#fde8ed"));
        startButton.setWrapText(true);
        startButton.setPadding(new Insets(0.0, 10.0, 10.0, 10.0));
        startButton.setFont(new Font("Comic Sans MS Bold", 30.0));
        startButton.setOnAction((ActionEvent event) -> {
            String playerOneName = playerOneTextField.getText().trim();
            if (playerOneName.isEmpty())
                return;
            Player playerOne = new Player(playerOneName);
            Player computerPlayer = new Player("Computer");
            Parent pane = new GameBase(stage, playerOne, computerPlayer, true, difficulty);
            stage.getScene().setRoot(pane);
        });

        backButton.setId("styles");
        backButton.setLayoutX(382.0);
        backButton.setLayoutY(290.0);
        backButton.setMnemonicParsing(false);
        backButton.setPrefHeight(52.0);
        backButton.setPrefWidth(123.0);
        backButton.setStyle("-fx-background-color: #f22853; -fx-background-radius: 45; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 ); -fx-text-fill: #FDE8ED;");
        backButton.setText("Back");
        backButton.setTextFill(javafx.scene.paint.Color.valueOf("#fde8ed"));
        backButton.setWrapText(true);
        backButton.setPadding(new Insets(0.0, 10.0, 10.0, 10.0));
        backButton.setFont(new Font("Comic Sans MS Bold", 30.0));
        backButton.setOnAction((ActionEvent event) -> {
            Parent pane = new LevelScreenBase(stage);
            stage.getScene().setRoot(pane); 
        });

        imageView.setFitHeight(163.0);
        imageView.setFitWidth(179.0);
        imageView.setLayoutY(225.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/images/background.png").toExternalForm()));

        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(playerOneTextField);
        getChildren().add(startButton);
        getChildren().add(backButton);
        getChildren().add(imageView);

    }
}
