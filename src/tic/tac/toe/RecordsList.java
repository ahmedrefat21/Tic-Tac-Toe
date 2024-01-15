package tic.tac.toe;

import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class RecordsList extends AnchorPane {

    protected final ScrollPane scrollPane;
    protected final AnchorPane anchorPane;
    protected final ImageView Record_Screen_Back_Button;
    protected final Text text;
    protected final Text Record_Label_3;
    protected final ImageView Play_Record_3;
    protected final Line line;
    protected final Text Record_Label_2;
    protected final Text Record_Label_1;
    protected final ImageView Play_Record_2;
    protected final Line line0;
    protected final ImageView Play_Record_1;

    public RecordsList() {

        scrollPane = new ScrollPane();
        anchorPane = new AnchorPane();
        Record_Screen_Back_Button = new ImageView();
        text = new Text();
        Record_Label_3 = new Text();
        Play_Record_3 = new ImageView();
        line = new Line();
        Record_Label_2 = new Text();
        Record_Label_1 = new Text();
        Play_Record_2 = new ImageView();
        line0 = new Line();
        Play_Record_1 = new ImageView();

        setId("AnchorPane");
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        getStyleClass().add("record-box");
        getStylesheets().add("/tic/tac/toe/css/RecordMenuScreen.css");

        scrollPane.setPrefHeight(480.0);
        scrollPane.setPrefWidth(740.0);

        anchorPane.setMinHeight(0.0);
        anchorPane.setMinWidth(0.0);
        anchorPane.setPrefHeight(480.0);
        anchorPane.setPrefWidth(743.0);
        anchorPane.getStyleClass().add("record-box");
        anchorPane.getStylesheets().add("/tic/tac/toe/css/RecordMenuScreen.css");

        Record_Screen_Back_Button.setFitHeight(95.0);
        Record_Screen_Back_Button.setFitWidth(85.0);
        Record_Screen_Back_Button.setLayoutX(25.0);
        Record_Screen_Back_Button.setLayoutY(28.0);
        Record_Screen_Back_Button.setPickOnBounds(true);
        Record_Screen_Back_Button.setPreserveRatio(true);
        Record_Screen_Back_Button.setImage(new Image(getClass().getResource("../../../assets/images/back.png").toExternalForm()));

        text.setLayoutX(151.0);
        text.setLayoutY(78.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.getStyleClass().add("head-text");
        text.setText("Offline Game Records");

        Record_Label_3.setLayoutX(32.0);
        Record_Label_3.setLayoutY(421.0);
        Record_Label_3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        Record_Label_3.setStrokeWidth(0.0);
        Record_Label_3.getStyleClass().add("players-name");
        Record_Label_3.setText("Ahmed-Sarah-28-12-2023");

        Play_Record_3.setFitHeight(68.0);
        Play_Record_3.setFitWidth(68.0);
        Play_Record_3.setLayoutX(598.0);
        Play_Record_3.setLayoutY(375.0);
        Play_Record_3.setPickOnBounds(true);
        Play_Record_3.setPreserveRatio(true);
        Play_Record_3.setImage(new Image(getClass().getResource("../../../assets/images/play-video.png").toExternalForm()));

        line.setEndX(446.0);
        line.setLayoutX(253.0);
        line.setLayoutY(349.0);
        line.setStartX(-226.0);
        line.getStyleClass().add("lines");

        Record_Label_2.setLayoutX(29.0);
        Record_Label_2.setLayoutY(314.0);
        Record_Label_2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        Record_Label_2.setStrokeWidth(0.0);
        Record_Label_2.getStyleClass().add("players-name");
        Record_Label_2.setText("Ahmed-Mariam-28-12-2023");

        Record_Label_1.setLayoutX(28.0);
        Record_Label_1.setLayoutY(211.0);
        Record_Label_1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        Record_Label_1.setStrokeWidth(0.0);
        Record_Label_1.getStyleClass().add("players-name");
        Record_Label_1.setText("Ahmed-Mahdy-28-12-2023");

        Play_Record_2.setFitHeight(77.0);
        Play_Record_2.setFitWidth(68.0);
        Play_Record_2.setLayoutX(598.0);
        Play_Record_2.setLayoutY(268.0);
        Play_Record_2.setPickOnBounds(true);
        Play_Record_2.setPreserveRatio(true);
        Play_Record_2.setImage(new Image(getClass().getResource("../../../assets/images/play-video.png").toExternalForm()));

        line0.setEndX(447.0);
        line0.setLayoutX(250.0);
        line0.setLayoutY(250.0);
        line0.setStartX(-221.0);
        line0.getStyleClass().add("lines");

        Play_Record_1.setFitHeight(68.0);
        Play_Record_1.setFitWidth(68.0);
        Play_Record_1.setLayoutX(598.0);
        Play_Record_1.setLayoutY(165.0);
        Play_Record_1.setPickOnBounds(true);
        Play_Record_1.setPreserveRatio(true);
        Play_Record_1.setImage(new Image(getClass().getResource("../../../assets/images/play-video.png").toExternalForm()));
        scrollPane.setContent(anchorPane);

        anchorPane.getChildren().add(Record_Screen_Back_Button);
        anchorPane.getChildren().add(text);
        anchorPane.getChildren().add(Record_Label_3);
        anchorPane.getChildren().add(Play_Record_3);
        anchorPane.getChildren().add(line);
        anchorPane.getChildren().add(Record_Label_2);
        anchorPane.getChildren().add(Record_Label_1);
        anchorPane.getChildren().add(Play_Record_2);
        anchorPane.getChildren().add(line0);
        anchorPane.getChildren().add(Play_Record_1);
        getChildren().add(scrollPane);

    }
}
