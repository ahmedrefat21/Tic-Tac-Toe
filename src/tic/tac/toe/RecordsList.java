package tic.tac.toe;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RecordsList extends AnchorPane {

    protected final ScrollPane scrollPane;
    protected final AnchorPane anchorPane;
    protected final ImageView Record_Screen_Back_Button;
    protected final Text text;
    
    protected final List<Recording> recordsList = new ArrayList<>();
            
    protected static final double RECORD_LABEL_START_OFFSET = 50.0;

    public RecordsList(Stage stage) {
        scrollPane = new ScrollPane();
        anchorPane = new AnchorPane();
        Record_Screen_Back_Button = new ImageView();
        text = new Text();

        setId("AnchorPane");
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        getStyleClass().add("records-box");
        getStylesheets().add("/tic/tac/toe/css/recordslist.css");

        scrollPane.setPrefHeight(480.0);
        scrollPane.setPrefWidth(740.0);
        scrollPane.setStyle("-fx-background: FFDDE5; -fx-border-color:#FDE8ED;");
        //scrollPane.setFitToHeight(true);

        anchorPane.setMinHeight(0.0);
        anchorPane.setMinWidth(0.0);
        anchorPane.setPrefWidth(743.0);
        anchorPane.getStyleClass().add("records-box");
        anchorPane.getStylesheets().add("/tic/tac/toe/css/recordslist.css");

        Record_Screen_Back_Button.setFitHeight(95.0);
        Record_Screen_Back_Button.setFitWidth(85.0);
        Record_Screen_Back_Button.setLayoutX(25.0);
        Record_Screen_Back_Button.setLayoutY(28.0);
        Record_Screen_Back_Button.setPickOnBounds(true);
        Record_Screen_Back_Button.setPreserveRatio(true);
        Record_Screen_Back_Button.setImage(new Image(getClass().getResource("/assets/images/back.png").toExternalForm()));
        Record_Screen_Back_Button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                 Parent pane = new MainPageBase(stage);
                stage.getScene().setRoot(pane);
            }
        });
        text.setLayoutX(151.0);
        text.setLayoutY(78.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.getStyleClass().add("head-text");
        text.setText("Offline Game Records");
        scrollPane.setContent(anchorPane);

        anchorPane.getChildren().add(Record_Screen_Back_Button);
        anchorPane.getChildren().add(text);
        getChildren().add(scrollPane);

        init(stage);
    }
    
    private void init(Stage stage) {
        String recordsPath = Config.getRecordsPath();
        File directory = new File(recordsPath);

        if (directory.isDirectory()) {
           
            File[] files = directory.listFiles();

           
            if (files != null && files.length > 0) {
                System.out.println("Files in directory " + recordsPath + ":");
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName());
                        recordsList.add(new Recording(file));
                    }
                }
            } else {
                System.out.println("No files found in directory " + recordsPath);
            }
        } else {
            System.out.println(recordsPath + " is not a valid directory");
        }
        
        for (int i = 0, l = recordsList.size(); i < l; ++i) {
            Recording currentRecording = recordsList.get(i);
            System.out.println("Current file = " + currentRecording.getTitle());
            
            Text recordLabel = new Text();
            ImageView playButton = new ImageView();

            recordLabel.setLayoutX(32.0);
            recordLabel.setLayoutY(RECORD_LABEL_START_OFFSET + 150 * (i + 1));
            recordLabel.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
            recordLabel.setStrokeWidth(0.0);
            recordLabel.getStyleClass().add("record-name");
            recordLabel.setText(currentRecording.getTitle());

            playButton.setFitHeight(68.0);
            playButton.setFitWidth(68.0);
            playButton.setLayoutX(598.0);
            playButton.setLayoutY(recordLabel.getLayoutY() - 40);
            playButton.setPickOnBounds(true);
            playButton.setPreserveRatio(true);
            playButton.setImage(new Image(getClass().getResource("/assets/images/play-video (2) 1.png").toExternalForm()));
            playButton.setOnMouseClicked((MouseEvent event) -> {
                GameBase gameBase = new GameBase(stage, currentRecording);
                stage.getScene().setRoot(gameBase);
            });
            
            anchorPane.getChildren().add(recordLabel);
            anchorPane.getChildren().add(playButton);

            Line line = new Line();
            line.setEndX(446.0);
            line.setLayoutX(253.0);
            line.setLayoutY(recordLabel.getLayoutY() + 70);
            line.setStartX(-226.0);
            line.getStyleClass().add("lins");
            anchorPane.getChildren().add(line);
        }
    }
}
