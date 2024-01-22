package tic.tac.toe;

import java.net.URL;
import javafx.animation.FadeTransition;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public  class splash_screenBase extends AnchorPane {

    protected final ImageView imageView;

    public splash_screenBase(Stage stage) {

        imageView = new ImageView();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        setStyle("-fx-background-color: #f22853;");
        getStyleClass().add("mainFxmlClass");
        getStylesheets().add("/tic/tac/toe/css/splash_screen.css");

        imageView.setFitHeight(488.0);
        imageView.setFitWidth(740.0);
        imageView.setLayoutY(-2.0);
        imageView.getStyleClass().add("mainFxmlClass");
        imageView.setImage(new Image(getClass().getResource("/assets/images/splashscreen.png").toExternalForm()));

        getChildren().add(imageView);
        
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2), this);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.setCycleCount(1);

        fadeTransition.play();

        try {
            fadeTransition.setOnFinished((e) -> {
                Parent pane = new MainPageBase(stage);
                stage.getScene().setRoot(pane);
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
