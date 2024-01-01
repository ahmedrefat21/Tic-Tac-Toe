package tic.tac.toe;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainPageBase extends AnchorPane {

    protected final ImageView imageView;
    protected final ImageView aboutImage;
    protected final Rectangle computerRectangle;
    protected final ImageView imageView0;
    protected final Text text;
    protected final Rectangle localRectangle;
    protected final Rectangle onlineRectangle;
    protected final Rectangle recordRectangle;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final Text text0;
    protected final Text text1;
    protected final Text text2;
    protected final ImageView imageView3;

    public MainPageBase(Stage stage) {

        imageView = new ImageView();
        aboutImage = new ImageView();
        computerRectangle = new Rectangle();
        imageView0 = new ImageView();
        text = new Text();
        localRectangle = new Rectangle();
        onlineRectangle = new Rectangle();
        recordRectangle = new Rectangle();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        text0 = new Text();
        text1 = new Text();
        text2 = new Text();
        imageView3 = new ImageView();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        setStyle("-fx-background-color: f22853;");

        AnchorPane.setBottomAnchor(imageView, 1.0);
        AnchorPane.setLeftAnchor(imageView, 0.0);
        AnchorPane.setRightAnchor(imageView, 0.0);
        AnchorPane.setTopAnchor(imageView, 0.0);
        imageView.setFitHeight(479.0);
        imageView.setFitWidth(751.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/images/mainBackground.png").toExternalForm()));

        aboutImage.setFitHeight(104.0);
        aboutImage.setFitWidth(115.0);
        aboutImage.setLayoutX(622.0);
        aboutImage.setLayoutY(14.0);
        aboutImage.setPickOnBounds(true);
        aboutImage.setPreserveRatio(true);
        aboutImage.setImage(new Image(getClass().getResource("/assets/images/about.png").toExternalForm()));

        AnchorPane.setBottomAnchor(computerRectangle, 141.0);
        AnchorPane.setLeftAnchor(computerRectangle, 60.0);
        AnchorPane.setRightAnchor(computerRectangle, 494.0);
        AnchorPane.setTopAnchor(computerRectangle, 163.0);
        computerRectangle.setArcHeight(50.0);
        computerRectangle.setArcWidth(50.0);
        computerRectangle.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        computerRectangle.setHeight(176.0);
        computerRectangle.setLayoutX(56.0);
        computerRectangle.setLayoutY(163.0);
        computerRectangle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        computerRectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        computerRectangle.setWidth(190.0);

        AnchorPane.setBottomAnchor(imageView0, 207.0);
        AnchorPane.setTopAnchor(imageView0, 183.0);
        imageView0.setFitHeight(90.0);
        imageView0.setFitWidth(138.0);
        imageView0.setLayoutX(110.0);
        imageView0.setLayoutY(183.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/assets/images/computer.png").toExternalForm()));

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

        AnchorPane.setBottomAnchor(localRectangle, 141.0);
        AnchorPane.setLeftAnchor(localRectangle, 275.0);
        AnchorPane.setTopAnchor(localRectangle, 163.0);
        localRectangle.setArcHeight(50.0);
        localRectangle.setArcWidth(50.0);
        localRectangle.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        localRectangle.setHeight(176.0);
        localRectangle.setLayoutX(275.0);
        localRectangle.setLayoutY(163.0);
        localRectangle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        localRectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        localRectangle.setWidth(190.0);

        AnchorPane.setBottomAnchor(onlineRectangle, 141.0);
        AnchorPane.setRightAnchor(onlineRectangle, 60.0);
        AnchorPane.setTopAnchor(onlineRectangle, 163.0);
        onlineRectangle.setArcHeight(50.0);
        onlineRectangle.setArcWidth(50.0);
        onlineRectangle.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        onlineRectangle.setHeight(176.0);
        onlineRectangle.setLayoutX(490.0);
        onlineRectangle.setLayoutY(163.0);
        onlineRectangle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        onlineRectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        onlineRectangle.setWidth(190.0);

        recordRectangle.setArcHeight(50.0);
        recordRectangle.setArcWidth(50.0);
        recordRectangle.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        recordRectangle.setHeight(96.0);
        recordRectangle.setLayoutX(223.0);
        recordRectangle.setLayoutY(354.0);
        recordRectangle.setStroke(javafx.scene.paint.Color.TRANSPARENT);
        recordRectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        recordRectangle.setWidth(286.0);

        AnchorPane.setBottomAnchor(imageView1, 207.0);
        AnchorPane.setTopAnchor(imageView1, 183.0);
        imageView1.setFitHeight(90.0);
        imageView1.setFitWidth(138.0);
        imageView1.setLayoutX(326.0);
        imageView1.setLayoutY(183.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/assets/images/local.png").toExternalForm()));

        AnchorPane.setBottomAnchor(imageView2, 207.0);
        AnchorPane.setTopAnchor(imageView2, 183.0);
        imageView2.setFitHeight(90.0);
        imageView2.setFitWidth(138.0);
        imageView2.setLayoutX(540.0);
        imageView2.setLayoutY(175.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("/assets/images/online-game.png").toExternalForm()));

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
        text1.setLayoutX(514.0);
        text1.setLayoutY(305.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Online");
        text1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1.setWrappingWidth(142.6666899010561);
        text1.setFont(new Font("Comic Sans MS Bold", 30.0));

        text2.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        text2.setLayoutX(240.0);
        text2.setLayoutY(413.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Records");
        text2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text2.setWrappingWidth(142.6666899010561);
        text2.setFont(new Font("Comic Sans MS Bold", 30.0));

        imageView3.setFitHeight(90.0);
        imageView3.setFitWidth(101.0);
        imageView3.setLayoutX(392.0);
        imageView3.setLayoutY(363.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("/assets/images/recording.png").toExternalForm()));

        getChildren().add(imageView);
        getChildren().add(aboutImage);
        getChildren().add(computerRectangle);
        getChildren().add(imageView0);
        getChildren().add(text);
        getChildren().add(localRectangle);
        getChildren().add(onlineRectangle);
        getChildren().add(recordRectangle);
        getChildren().add(imageView1);
        getChildren().add(imageView2);
        getChildren().add(text0);
        getChildren().add(text1);
        getChildren().add(text2);
        getChildren().add(imageView3);

    }
}
