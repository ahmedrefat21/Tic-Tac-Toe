package tic.tac.toe;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public abstract class LevelScreenBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Button Hard_Button;
    protected final Button Medium_Button;
    protected final Button Easy_Button;
    protected final ImageView backimage;

    public LevelScreenBase(Stage stage) {

        imageView = new ImageView();
        Hard_Button = new Button();
        Medium_Button = new Button();
        Easy_Button = new Button();
        backimage = new ImageView();

        setId("AnchorPane");
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        setStyle("-fx-background-color: f22853;");
        getStyleClass().add("leve-screen");

        imageView.setFitHeight(460.0);
        imageView.setFitWidth(740.0);
        imageView.setLayoutY(-3.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/images/splashscreen.png").toExternalForm()));

        Hard_Button.setId("styles");
        Hard_Button.setLayoutX(168.0);
        Hard_Button.setLayoutY(366.0);
        Hard_Button.setMnemonicParsing(false);
        Hard_Button.setPrefHeight(60.0);
        Hard_Button.setPrefWidth(391.0);
        Hard_Button.setStyle("-fx-background-color: FCD015; -fx-background-radius: 45; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 );");
        Hard_Button.getStyleClass().add("Hard-button");
        Hard_Button.getStylesheets().add("/tic/tac/toe/css/levelScreen.css");
        Hard_Button.setText("Hard");
        Hard_Button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        Hard_Button.setTextFill(javafx.scene.paint.Color.valueOf("#fde8ed"));
        Hard_Button.setWrapText(true);
        Hard_Button.setPadding(new Insets(0.0, 10.0, 10.0, 10.0));
        Hard_Button.setFont(new Font("Comic Sans MS Bold", 30.0));

        Medium_Button.setId("styles");
        Medium_Button.setLayoutX(177.0);
        Medium_Button.setLayoutY(274.0);
        Medium_Button.setMnemonicParsing(false);
        Medium_Button.setPrefHeight(60.0);
        Medium_Button.setPrefWidth(391.0);
        Medium_Button.setStyle("-fx-background-color: FCD015; -fx-background-radius: 45; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 );");
        Medium_Button.getStyleClass().add("Medium-button");
        Medium_Button.getStylesheets().add("/tic/tac/toe/css/levelScreen.css");
        Medium_Button.setText("Medium");
        Medium_Button.setTextFill(javafx.scene.paint.Color.valueOf("#fde8ed"));
        Medium_Button.setWrapText(true);
        Medium_Button.setPadding(new Insets(0.0, 10.0, 10.0, 10.0));
        Medium_Button.setFont(new Font("Comic Sans MS Bold", 30.0));

        Easy_Button.setId("styles");
        Easy_Button.setLayoutX(168.0);
        Easy_Button.setLayoutY(181.0);
        Easy_Button.setMnemonicParsing(false);
        Easy_Button.setPrefHeight(60.0);
        Easy_Button.setPrefWidth(406.0);
        Easy_Button.setStyle("-fx-background-color: FCD015; -fx-background-radius: 45; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 );");
        Easy_Button.getStyleClass().add("Easy-button");
        Easy_Button.getStylesheets().add("/tic/tac/toe/css/levelScreen.css");
        Easy_Button.setText("Easy");
        Easy_Button.setTextFill(javafx.scene.paint.Color.valueOf("#fde8ed"));
        Easy_Button.setWrapText(true);
        Easy_Button.setPadding(new Insets(0.0, 10.0, 10.0, 10.0));
        Easy_Button.setFont(new Font("Comic Sans MS Bold", 30.0));

        backimage.setFitHeight(71.0);
        backimage.setFitWidth(73.0);
        backimage.setLayoutX(14.0);
        backimage.setLayoutY(21.0);
        backimage.setPickOnBounds(true);
        backimage.setPreserveRatio(true);
        backimage.setImage(new Image(getClass().getResource("/assets/images/back.png").toExternalForm()));

        getChildren().add(imageView);
        getChildren().add(Hard_Button);
        getChildren().add(Medium_Button);
        getChildren().add(Easy_Button);
        getChildren().add(backimage);
        
            backimage.setOnMousePressed(e -> {
            Parent pane = new MainPageBase(stage) {};
            stage.getScene().setRoot(pane);

        });

    }
}
