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
    protected final Button easyButton;
    protected final Button hardButton;
    protected final Button meduimButton;
    protected final ImageView backimage;

    public LevelScreenBase(Stage stage) {

        imageView = new ImageView();
        easyButton = new Button();
        hardButton = new Button();
        meduimButton = new Button();
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
        imageView.setImage(new Image(getClass().getResource("/assets/images/mainBackground.png").toExternalForm()));

        easyButton.setLayoutX(178.0);
        easyButton.setLayoutY(181.0);
        easyButton.setMnemonicParsing(false);
        easyButton.setPrefHeight(60.0);
        easyButton.setPrefWidth(406.0);
        easyButton.setStyle("-fx-background-color: FCD015; -fx-background-radius: 45;");
        easyButton.setText("Easy");
        easyButton.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        easyButton.setWrapText(true);
        easyButton.setPadding(new Insets(0.0, 10.0, 10.0, 10.0));
        easyButton.setFont(new Font("Comic Sans MS Bold", 30.0));

        hardButton.setLayoutX(178.0);
        hardButton.setLayoutY(379.0);
        hardButton.setMnemonicParsing(false);
        hardButton.setPrefHeight(60.0);
        hardButton.setPrefWidth(406.0);
        hardButton.setStyle("-fx-background-color: FCD015; -fx-background-radius: 45;");
        hardButton.setText("Hard");
        hardButton.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        hardButton.setWrapText(true);
        hardButton.setPadding(new Insets(0.0, 10.0, 10.0, 10.0));
        hardButton.setFont(new Font("Comic Sans MS Bold", 30.0));

        meduimButton.setLayoutX(178.0);
        meduimButton.setLayoutY(280.0);
        meduimButton.setMnemonicParsing(false);
        meduimButton.setPrefHeight(60.0);
        meduimButton.setPrefWidth(406.0);
        meduimButton.setStyle("-fx-background-color: FCD015; -fx-background-radius: 45;");
        meduimButton.setText("Medium");
        meduimButton.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        meduimButton.setWrapText(true);
        meduimButton.setPadding(new Insets(0.0, 10.0, 10.0, 10.0));
        meduimButton.setFont(new Font("Comic Sans MS Bold", 30.0));

        backimage.setFitHeight(71.0);
        backimage.setFitWidth(73.0);
        backimage.setLayoutX(14.0);
        backimage.setLayoutY(23.0);
        backimage.setPickOnBounds(true);
        backimage.setPreserveRatio(true);
        backimage.setImage(new Image(getClass().getResource("/assets/images/back2.png").toExternalForm()));

        getChildren().add(imageView);
        getChildren().add(easyButton);
        getChildren().add(hardButton);
        getChildren().add(meduimButton);
        getChildren().add(backimage);
        
         backimage.setOnMousePressed(e -> {
            Parent pane = new MainPageBase(stage) {};
            stage.getScene().setRoot(pane);

        });

    }
}
