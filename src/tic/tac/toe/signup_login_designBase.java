package tic.tac.toe;

import java.net.URL;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public abstract class signup_login_designBase extends AnchorPane {

    protected final ImageView arrowback;
    protected final ImageView welcomeregister;
    protected final ImageView logo;
    protected final Button btnLogin;
    protected final Button btnSignup;

    public signup_login_designBase() {

        arrowback = new ImageView();
        welcomeregister = new ImageView();
        logo = new ImageView();
        btnLogin = new Button();
        btnSignup = new Button();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        getStyleClass().add("root");
        getStylesheets().add("/tic/tac/toe/signup_login_design.css");

        arrowback.setFitHeight(108.0);
        arrowback.setFitWidth(112.0);
        arrowback.setLayoutX(6.0);
        arrowback.setLayoutY(8.0);
        arrowback.setImage(new Image(getClass().getResource("../../../assets/images/arrow_back.png").toExternalForm()));

        welcomeregister.setFitHeight(155.0);
        welcomeregister.setFitWidth(172.0);
        welcomeregister.setLayoutX(294.0);
        welcomeregister.setLayoutY(14.0);
        welcomeregister.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        welcomeregister.setImage(new Image(getClass().getResource("../../../assets/images/welcomeregister.png").toExternalForm()));

        logo.setFitHeight(200.0);
        logo.setFitWidth(198.0);
        logo.setLayoutY(273.0);
        logo.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        logo.setImage(new Image(getClass().getResource("../../../assets/images/logo.png").toExternalForm()));

        btnLogin.setLayoutX(233.0);
        btnLogin.setLayoutY(233.0);
        btnLogin.setMnemonicParsing(false);
        btnLogin.setPrefHeight(80.0);
        btnLogin.setPrefWidth(312.0);
        btnLogin.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5); -fx-background-color: FCD015; -fx-background-radius: 45;");
        btnLogin.setText("Login");
        btnLogin.setTextFill(javafx.scene.paint.Color.valueOf("#fde8ed"));
        btnLogin.setFont(new Font("Comic Sans MS Bold", 36.0));

        btnSignup.setLayoutX(233.0);
        btnSignup.setLayoutY(349.0);
        btnSignup.setMaxHeight(USE_PREF_SIZE);
        btnSignup.setMaxWidth(USE_PREF_SIZE);
        btnSignup.setMinHeight(USE_PREF_SIZE);
        btnSignup.setMinWidth(USE_PREF_SIZE);
        btnSignup.setMnemonicParsing(false);
        btnSignup.setPrefHeight(80.0);
        btnSignup.setPrefWidth(312.0);
        btnSignup.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5); -fx-background-color: FCD015; -fx-background-radius: 45;");
        btnSignup.setText("Sign Up");
        btnSignup.setTextFill(javafx.scene.paint.Color.valueOf("#fde8ed"));
        btnSignup.setFont(new Font("System Bold", 36.0));

        getChildren().add(arrowback);
        getChildren().add(welcomeregister);
        getChildren().add(logo);
        getChildren().add(btnLogin);
        getChildren().add(btnSignup);

    }
}
