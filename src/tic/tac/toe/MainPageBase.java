package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class MainPageBase extends AnchorPane {

    protected final ImageView imageView;
    protected final ImageView aboutImage;
    protected final Rectangle computerRectangle;
    protected final ImageView imageView0;
    protected final Text text;
    protected final Rectangle localRectangle;
    protected final Rectangle onlineRectangle;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final Text text0;
    protected final Text text1;
    protected final Button localButton;
    protected final Button onlineButton;
    protected final Button compButton;

    public MainPageBase() {

        imageView = new ImageView();
        aboutImage = new ImageView();
        computerRectangle = new Rectangle();
        imageView0 = new ImageView();
        text = new Text();
        localRectangle = new Rectangle();
        onlineRectangle = new Rectangle();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        text0 = new Text();
        text1 = new Text();
        localButton = new Button();
        onlineButton = new Button();
        compButton = new Button();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        setStyle("-fx-background-color: F22853;");

        imageView.setFitHeight(480.0);
        imageView.setFitWidth(788.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../../../assets/images/Splash%20Screen.png").toExternalForm()));

        aboutImage.setFitHeight(104.0);
        aboutImage.setFitWidth(115.0);
        aboutImage.setLayoutX(622.0);
        aboutImage.setLayoutY(14.0);
        aboutImage.setPickOnBounds(true);
        aboutImage.setPreserveRatio(true);
        aboutImage.setImage(new Image(getClass().getResource("../../../assets/images/about.png").toExternalForm()));

        AnchorPane.setBottomAnchor(computerRectangle, 119.0);
        AnchorPane.setLeftAnchor(computerRectangle, 60.0);
        AnchorPane.setRightAnchor(computerRectangle, 490.0);
        AnchorPane.setTopAnchor(computerRectangle, 185.0);
        computerRectangle.setArcHeight(50.0);
        computerRectangle.setArcWidth(50.0);
        computerRectangle.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        computerRectangle.setHeight(176.0);
        computerRectangle.setLayoutX(60.0);
        computerRectangle.setLayoutY(185.0);
        computerRectangle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        computerRectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        computerRectangle.setWidth(190.0);

        AnchorPane.setBottomAnchor(imageView0, 185.0);
        AnchorPane.setTopAnchor(imageView0, 205.0);
        imageView0.setFitHeight(90.0);
        imageView0.setFitWidth(138.0);
        imageView0.setLayoutX(110.0);
        imageView0.setLayoutY(205.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("../../../assets/images/computer.png").toExternalForm()));

        AnchorPane.setBottomAnchor(text, 166.2548828125);
        AnchorPane.setTopAnchor(text, 271.9384765625);
        text.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        text.setLayoutX(84.0);
        text.setLayoutY(305.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Computer");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(142.6666899010561);
        text.setFont(new Font("Comic Sans MS Bold", 30.0));

        AnchorPane.setBottomAnchor(localRectangle, 119.0);
        AnchorPane.setLeftAnchor(localRectangle, 275.0);
        AnchorPane.setTopAnchor(localRectangle, 185.0);
        localRectangle.setArcHeight(50.0);
        localRectangle.setArcWidth(50.0);
        localRectangle.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        localRectangle.setHeight(176.0);
        localRectangle.setLayoutX(275.0);
        localRectangle.setLayoutY(185.0);
        localRectangle.setOnMouseClicked(this::handleButtonAction);
        localRectangle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        localRectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        localRectangle.setWidth(190.0);

        AnchorPane.setBottomAnchor(onlineRectangle, 119.0);
        AnchorPane.setLeftAnchor(onlineRectangle, 490.0);
        AnchorPane.setRightAnchor(onlineRectangle, 60.0);
        AnchorPane.setTopAnchor(onlineRectangle, 185.0);
        onlineRectangle.setArcHeight(50.0);
        onlineRectangle.setArcWidth(50.0);
        onlineRectangle.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        onlineRectangle.setHeight(176.0);
        onlineRectangle.setLayoutX(490.0);
        onlineRectangle.setLayoutY(185.0);
        onlineRectangle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        onlineRectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        onlineRectangle.setWidth(190.0);

        AnchorPane.setBottomAnchor(imageView1, 185.0);
        AnchorPane.setTopAnchor(imageView1, 205.0);
        imageView1.setFitHeight(90.0);
        imageView1.setFitWidth(138.0);
        imageView1.setLayoutX(326.0);
        imageView1.setLayoutY(205.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("../../../assets/images/local.png").toExternalForm()));

        AnchorPane.setBottomAnchor(imageView2, 185.0);
        AnchorPane.setLeftAnchor(imageView2, 537.0);
        AnchorPane.setRightAnchor(imageView2, 113.37267303466797);
        AnchorPane.setTopAnchor(imageView2, 205.0);
        imageView2.setFitHeight(90.0);
        imageView2.setFitWidth(101.0);
        imageView2.setLayoutX(537.0);
        imageView2.setLayoutY(205.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("../../../assets/images/online-game.png").toExternalForm()));

        AnchorPane.setBottomAnchor(text0, 165.2548828125);
        AnchorPane.setTopAnchor(text0, 272.9384765625);
        text0.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        text0.setLayoutX(300.0);
        text0.setLayoutY(317.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Local");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setWrappingWidth(142.6666899010561);
        text0.setFont(new Font("Comic Sans MS Bold", 30.0));

        AnchorPane.setBottomAnchor(text1, 165.2548828125);
        AnchorPane.setTopAnchor(text1, 272.9384765625);
        text1.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        text1.setLayoutX(513.0);
        text1.setLayoutY(306.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Online");
        text1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1.setWrappingWidth(142.6666899010561);
        text1.setFont(new Font("Comic Sans MS Bold", 30.0));

        AnchorPane.setBottomAnchor(localButton, 132.0);
        AnchorPane.setLeftAnchor(localButton, 286.0);
        AnchorPane.setRightAnchor(localButton, 297.0);
        AnchorPane.setTopAnchor(localButton, 293.0);
        localButton.setLayoutX(286.0);
        localButton.setLayoutY(293.0);
        localButton.setMnemonicParsing(false);
        localButton.setOnAction(this::handleButtonAction);
        localButton.setPrefHeight(55.0);
        localButton.setPrefWidth(157.0);
        localButton.setStyle("-fx-background-radius: 40px;");
        localButton.getStylesheets().add("/tic/tac/toe/loginfxml.css");
        localButton.setText("Local");
        localButton.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        localButton.setFont(new Font("Comic Sans MS Bold", 30.0));

        onlineButton.setLayoutX(513.0);
        onlineButton.setLayoutY(294.0);
        onlineButton.setMnemonicParsing(false);
        onlineButton.setOnAction(this::OnlineButtonAction);
        onlineButton.setPrefHeight(51.0);
        onlineButton.setPrefWidth(143.0);
        onlineButton.getStylesheets().add("/tic/tac/toe/loginfxml.css");
        onlineButton.setText("Online");
        onlineButton.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        onlineButton.setFont(new Font("Comic Sans MS Bold", 28.0));

        compButton.setLayoutX(77.0);
        compButton.setLayoutY(297.0);
        compButton.setMnemonicParsing(false);
        compButton.setOnAction(this::compButtonAction);
        compButton.setPrefHeight(55.0);
        compButton.setPrefWidth(157.0);
        compButton.getStylesheets().add("/tic/tac/toe/loginfxml.css");
        compButton.setText("Computer");
        compButton.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        compButton.setFont(new Font("Comic Sans MS Bold", 26.0));

        getChildren().add(imageView);
        getChildren().add(aboutImage);
        getChildren().add(computerRectangle);
        getChildren().add(imageView0);
        getChildren().add(text);
        getChildren().add(localRectangle);
        getChildren().add(onlineRectangle);
        getChildren().add(imageView1);
        getChildren().add(imageView2);
        getChildren().add(text0);
        getChildren().add(text1);
        getChildren().add(localButton);
        getChildren().add(onlineButton);
        getChildren().add(compButton);

    }

    protected abstract void handleButtonAction(javafx.scene.input.MouseEvent mouseEvent);

    protected abstract void handleButtonAction(javafx.event.ActionEvent actionEvent);

    protected abstract void OnlineButtonAction(javafx.event.ActionEvent actionEvent);

    protected abstract void compButtonAction(javafx.event.ActionEvent actionEvent);

}
