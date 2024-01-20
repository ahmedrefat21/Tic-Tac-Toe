package tic.tac.toe;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public  class GameBase extends AnchorPane {

    protected ImageView imageView;
    protected ImageView imageView0;
    protected ImageView exitimage;
    protected Button button11;
    protected Button button13;
    protected Button button12;
    protected Button button31;
    protected Button button23;
    protected Button button22;
    protected Button button21;
    protected Button button33;
    protected Button button32;
    protected Text tacText;
    protected Text toeText;
    protected Text ticText;
    protected Text firstPlayerNameText;
    protected Text secondPlayerNameText;
    protected Text firstPlayerScoreText;
    protected Text secondPlayerScoreText;
    protected ImageView recordImage;
    protected Player firstPlayer, secondPlayer;
    private Button[][] buttons = new Button[3][3];
    private boolean isGameEnds = false;
    private boolean challengeComputer = false;
    private GameDifficulty difficulty;
    private int playerTurn = 0;
    Stage stage;
    static int player1Score = 0;
    static int player2Score = 0;

    boolean isfirstPlayerTurn = true;
    int counter =0;
    Timeline timelinewinner;
    Timeline timelinelose;
    Timeline timelinedraw;
    boolean turn, fullBoardFlag;
    boolean isRecording = false;
    Recording currentRecording;
    boolean isPlayingRecord = false;
    
    public GameBase(Stage s, Recording recording) {
        this.currentRecording = recording;
        this.isPlayingRecord = true;
        init(s, recording.getPlayer1(), recording.getPlayer2());
        
    }
    
    public GameBase(Stage s, Player playerOne, Player playerTwo, Boolean challengeComputer, GameDifficulty difficulty) {
        this.challengeComputer = challengeComputer;
        this.difficulty = difficulty;
        init(s, playerOne, playerTwo);
    }

    public GameBase(Stage s, Player playerOne, Player playerTwo) {
        init(s, playerOne, playerTwo);
    }
    
    private void init(Stage s, Player playerOne, Player playerTwo) {
        imageView = new ImageView();
        imageView0 = new ImageView();
        exitimage = new ImageView();
        Button[][] buttons = {{new Button(),new Button(),new Button()},{new Button(),new Button(),new Button()},{new Button(),new Button(),new Button()}};
        button11 = new Button();
        button13 = new Button();
        button12 = new Button();
        button31 = new Button();
        button23 = new Button();
        button22 = new Button();
        button21 = new Button();
        button33 = new Button();
        button32 = new Button();
        tacText = new Text();
        toeText = new Text();
        ticText = new Text();
        firstPlayerNameText = new Text();
        secondPlayerNameText = new Text();
        firstPlayerScoreText = new Text();
        secondPlayerScoreText = new Text();
        recordImage = new ImageView();
        this.firstPlayer = playerOne;
        this.secondPlayer = playerTwo;

        stage= s;
        timelinewinner= new Timeline(new KeyFrame(Duration.seconds(2), event -> {
            Parent pane = new resultFXMLBase(stage,firstPlayer,secondPlayer,challengeComputer,difficulty);
            Scene scene = new Scene (pane);
            stage.setScene(scene);
            stage.show();
        }));
        timelinedraw= new Timeline(new KeyFrame(Duration.seconds(2), event -> {
            Parent pane = new draw_videoBase(stage,firstPlayer,secondPlayer,challengeComputer,difficulty);
            Scene scene = new Scene (pane);
            stage.setScene(scene);
            stage.show();
        }));
        timelinelose=new Timeline(new KeyFrame(Duration.seconds(2), event -> {
            Parent pane = new losevideoBase(stage,firstPlayer,secondPlayer,challengeComputer,difficulty);
            Scene scene = new Scene (pane);
            stage.setScene(scene);
            stage.show();
        }));
        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        setStyle("-fx-background-color: #FDE8ED;");
        getStylesheets().add("/tic/tac/toe/css/GameScreen.css");

        String path="/assets/videos/winnerr.mp4";
        Media media = new Media(getClass().getResource(path).toExternalForm());  
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        
        
        AnchorPane.setBottomAnchor(imageView, 358.0);
        AnchorPane.setLeftAnchor(imageView, 30.0);
        AnchorPane.setTopAnchor(imageView, 18.0);
        imageView.setFitHeight(111.0);
        imageView.setFitWidth(104.0);
        imageView.setLayoutX(37.0);
        imageView.setLayoutY(18.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/images/gamer1.png").toExternalForm()));

        AnchorPane.setBottomAnchor(imageView0, 358.0);
        AnchorPane.setRightAnchor(imageView0, 30.0);
        AnchorPane.setTopAnchor(imageView0, 18.0);
        imageView0.setFitHeight(104.0);
        imageView0.setFitWidth(131.0);
        imageView0.setLayoutX(604.0);
        imageView0.setLayoutY(18.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/assets/images/gamer2.png").toExternalForm()));

        AnchorPane.setBottomAnchor(exitimage, 14.0);
        AnchorPane.setRightAnchor(exitimage, 15.0);
        AnchorPane.setTopAnchor(exitimage, 382.0);
        exitimage.setFitHeight(89.0);
        exitimage.setFitWidth(123.0);
        exitimage.setLayoutX(637.0);
        exitimage.setLayoutY(377.0);
        exitimage.setPickOnBounds(true);
        exitimage.setPreserveRatio(true);
        exitimage.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        exitimage.setImage(new Image(getClass().getResource("/assets/images/exit.png").toExternalForm()));
        
       
        
        
        button11.setLayoutX(189.0);
        button11.setLayoutY(118.0);
        button11.setMinHeight(96.0);
        button11.setMinWidth(113.0);
        button11.setMnemonicParsing(false);
        button11.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button11.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button11.setText(" ");
        button11.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button11.setFont(new Font("Comic Sans MS Bold", 48.0));
        button11.setOpaqueInsets(new Insets(5.0, 5.0, 0.0, 0.0));
        

        button11.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            playMove(button11);
        });

        button13.setLayoutX(455.0);
        button13.setLayoutY(119.0);
        button13.setMinHeight(96.0);
        button13.setMinWidth(113.0);
        button13.setMnemonicParsing(false);
        button13.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button13.setText(" ");
        button13.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button13.setFont(new Font("Comic Sans MS Bold", 48.0));
        button13.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            playMove(button13);
        });

        button12.setLayoutX(327.0);
        button12.setLayoutY(119.0);
        button12.setMinHeight(96.0);
        button12.setMinWidth(113.0);
        button12.setMnemonicParsing(false);
        button12.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button12.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button12.setText(" ");
        button12.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        button12.setFont(new Font("Comic Sans MS Bold", 48.0));
        button12.setOpaqueInsets(new Insets(5.0, 5.0, 5.0, 0.0));
        button12.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            playMove(button12);
        });

        button31.setLayoutX(193.0);
        button31.setLayoutY(361.0);
        button31.setMinHeight(96.0);
        button31.setMinWidth(113.0);
        button31.setMnemonicParsing(false);
        button31.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button31.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button31.setText(" ");
        button31.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button31.setFont(new Font("Comic Sans MS Bold", 48.0));
        button31.setOpaqueInsets(new Insets(5.0, 5.0, 0.0, 0.0));
        button31.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            playMove(button31);
        });

        button23.setLayoutX(461.0);
        button23.setLayoutY(243.0);
        button23.setMinHeight(96.0);
        button23.setMinWidth(113.0);
        button23.setMnemonicParsing(false);
        button23.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button23.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button23.setText(" ");
        button23.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button23.setFont(new Font("Comic Sans MS Bold", 48.0));
        button23.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            playMove(button23);
        });

        button22.setLayoutX(327.0);
        button22.setLayoutY(244.0);
        button22.setMinHeight(96.0);
        button22.setMinWidth(113.0);
        button22.setMnemonicParsing(false);
        button22.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button22.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button22.setText(" ");
        button22.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button22.setFont(new Font("Comic Sans MS Bold", 48.0));
        button22.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            playMove(button22);
        });

        button21.setLayoutX(192.0);
        button21.setLayoutY(243.0);
        button21.setMinHeight(96.0);
        button21.setMinWidth(113.0);
        button21.setMnemonicParsing(false);
        button21.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button21.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button21.setText(" ");
        button21.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        button21.setFont(new Font("Comic Sans MS Bold", 48.0));
        button21.setOpaqueInsets(new Insets(5.0, 5.0, 0.0, 0.0));
        button21.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            playMove(button21);
        });

        button33.setLayoutX(461.0);
        button33.setLayoutY(361.0);
        button33.setMinHeight(96.0);
        button33.setMinWidth(113.0);
        button33.setMnemonicParsing(false);
        button33.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button33.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button33.setText(" ");
        button33.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        button33.setFont(new Font("Comic Sans MS Bold", 48.0));
        button33.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            playMove(button33);
        });

        button32.setLayoutX(325.0);
        button32.setLayoutY(359.0);
        button32.setMinHeight(96.0);
        button32.setMinWidth(113.0);
        button32.setMnemonicParsing(false);
        button32.setStyle("-fx-background-color: FFDDE5; -fx-background-radius: 25; -fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        button32.getStylesheets().add("/tic/tac/toe/css/GameScreen.css");
        button32.setText(" ");
        button32.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        button32.setFont(new Font("Comic Sans MS Bold", 48.0));
        button32.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            playMove(button32);
        });

        tacText.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        tacText.setId("tacText");
        tacText.setLayoutX(320.0);
        tacText.setLayoutY(89.0);
        tacText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        tacText.setStrokeWidth(0.0);
        tacText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        tacText.setText("Tac");
        tacText.setFont(new Font("Comic Sans MS Bold", 64.0));

        toeText.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        toeText.setId("toeText");
        toeText.setLayoutX(439.0);
        toeText.setLayoutY(86.0);
        toeText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toeText.setStrokeWidth(0.0);
        toeText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        toeText.setText("Toe");
        toeText.setFont(new Font("Comic Sans MS Bold", 64.0));

        AnchorPane.setBottomAnchor(ticText, 373.0);
        AnchorPane.setLeftAnchor(ticText, 208.0);
        AnchorPane.setRightAnchor(ticText, 436.65625);
        AnchorPane.setTopAnchor(ticText, 16.0);
        ticText.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        ticText.setId("ticText");
        ticText.setLayoutX(208.0);
        ticText.setLayoutY(87.0);
        ticText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticText.setStrokeWidth(0.0);
        ticText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        ticText.setText("Tic");
        ticText.setFont(new Font("Comic Sans MS Bold", 64.0));

        AnchorPane.setBottomAnchor(firstPlayerNameText, 291.0);
        AnchorPane.setTopAnchor(firstPlayerNameText, 122.0);
        firstPlayerNameText.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        firstPlayerNameText.setId("firstPlayerNameText");
        firstPlayerNameText.setLayoutX(16.0);
        firstPlayerNameText.setLayoutY(175.0);
        firstPlayerNameText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        firstPlayerNameText.setStrokeWidth(0.0);
        firstPlayerNameText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        firstPlayerNameText.setText("Refat");
        firstPlayerNameText.setFont(new Font("Comic Sans MS Bold", 24.0));

        AnchorPane.setBottomAnchor(secondPlayerNameText, 291.0);
        AnchorPane.setTopAnchor(secondPlayerNameText, 122.0);
        secondPlayerNameText.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        secondPlayerNameText.setId("firstPlayerNameText");
        secondPlayerNameText.setLayoutX(620.0);
        secondPlayerNameText.setLayoutY(175.0);
        secondPlayerNameText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        secondPlayerNameText.setStrokeWidth(0.0);
        secondPlayerNameText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        secondPlayerNameText.setText("Sara");
        secondPlayerNameText.setFont(new Font("Comic Sans MS Bold", 24.0));

        if (!isPlayingRecord) {
            AnchorPane.setBottomAnchor(firstPlayerScoreText, 206.0);
            AnchorPane.setTopAnchor(firstPlayerScoreText, 207.0);
            firstPlayerScoreText.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
            firstPlayerScoreText.setId("firstPlayerNameText");
            firstPlayerScoreText.setLayoutX(67.0);
            firstPlayerScoreText.setLayoutY(260.0);
            firstPlayerScoreText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
            firstPlayerScoreText.setStrokeWidth(0.0);
            firstPlayerScoreText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
            firstPlayerScoreText.setText(player1Score+"");
            firstPlayerScoreText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
            firstPlayerScoreText.setFont(new Font("Comic Sans MS Bold", 48.0));

            AnchorPane.setBottomAnchor(secondPlayerScoreText, 206.0);
            AnchorPane.setTopAnchor(secondPlayerScoreText, 207.0);
            secondPlayerScoreText.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
            secondPlayerScoreText.setId("firstPlayerNameText");
            secondPlayerScoreText.setLayoutX(655.0);
            secondPlayerScoreText.setLayoutY(249.0);
            secondPlayerScoreText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
            secondPlayerScoreText.setStrokeWidth(0.0);
            secondPlayerScoreText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
            secondPlayerScoreText.setText(player2Score+"");
            secondPlayerScoreText.setFont(new Font("Comic Sans MS Bold", 48.0));

            AnchorPane.setBottomAnchor(recordImage, 14.0);
            AnchorPane.setLeftAnchor(recordImage, 15.0);
            AnchorPane.setTopAnchor(recordImage, 382.0);
            recordImage.setFitHeight(83.0);
            recordImage.setFitWidth(104.0);
            recordImage.setLayoutX(15.0);
            recordImage.setLayoutY(382.0);
            recordImage.setPickOnBounds(true);
            recordImage.setPreserveRatio(true);
            recordImage.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
            recordImage.setImage(new Image(getClass().getResource("/assets/images/recording.png").toExternalForm()));
            recordImage.setOnMouseClicked((MouseEvent event) -> {
                isRecording = true;
                recordImage.setVisible(false);
            });
        }

        getChildren().add(imageView);
        getChildren().add(imageView0);
        getChildren().add(exitimage);
        getChildren().add(button11);
        getChildren().add(button13);
        getChildren().add(button12);
        getChildren().add(button31);
        getChildren().add(button23);
        getChildren().add(button22);
        getChildren().add(button21);
        getChildren().add(button33);
        getChildren().add(button32);
        getChildren().add(tacText);
        getChildren().add(toeText);
        getChildren().add(ticText);
        getChildren().add(firstPlayerNameText);
        getChildren().add(secondPlayerNameText);
        getChildren().add(firstPlayerScoreText);
        getChildren().add(secondPlayerScoreText);
        
        if (!isPlayingRecord) {
            getChildren().add(recordImage);
        }

        firstPlayerNameText.setText(playerOne.getUsername());
        secondPlayerNameText.setText(playerTwo.getUsername());

        exitimage.setOnMousePressed(e -> {
            Parent pane = new MainPageBase(stage);
            stage.getScene().setRoot(pane);
            GameBase.player1Score = 0 ;  
            GameBase.player2Score = 0 ;
           mediaPlayer.stop();  
       });
        
        if (isPlayingRecord) {
            System.out.println("WEEEEEEEEE ARE PLAYING A RECORD");
            disableButton();
            playRecording();
        }
    }
    
    class BoardCell {
        private int x;
        private int y;
        
        BoardCell(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    private void playMove(Button button) {
        if (!isRecording)
            recordImage.setVisible(false);
        else if (!isPlayingRecord)
            recordMove(button);

        setPlayerSymbol(button);
        button.setDisable(true);
        System.out.println(++counter);
       // checkIfGameIsOver();
        button.setFocusTraversable(false);
        if (shouldComputerPlay()) {
            BoardCell playComputer = getComputerMove();
            System.out.println("Computer will play = " + playComputer);
            playMove(getButton(playComputer.getX(), playComputer.getY()));
        }
    }
    

    private void recordMove(Button button) {
        if (this.currentRecording == null)
            this.currentRecording = new Recording(firstPlayer, secondPlayer, new Date(), "", new ArrayList<>());

        this.currentRecording.addNewMove(getCellFromButton(button));
    }
    
    private BoardCell getCellFromButton(Button button) {
        int x = -1, y = -1;
        if (button == button11) {
            x = 0;
            y = 0;
        } else if (button == button12) {
            x = 0;
            y = 1;
        } else if (button == button13) {
            x = 0;
            y = 2;
        } else if (button == button21) {
            x = 1;
            y = 0;
        } else if (button == button22) {
            x = 1;
            y = 1;
        } else if (button == button23) {
            x = 1;
            y = 2;
        } else if (button == button31) {
            x = 2;
            y = 0;
        } else if (button == button32) {
            x = 2;
            y = 1;
        } else if (button == button33) {
            x = 2;
            y = 2;
        }
        
        return new BoardCell(x, y);
    }
    
    private boolean shouldComputerPlay() {
        GameWinnerDetails gameWinner = getWinnerDetails();
        return counter < 9 &&
                !gameWinner.someoneWon &&
                challengeComputer &&
                playerTurn == 1;
    }
    
    public BoardCell getComputerMove() {
        switch (difficulty) {
            case EASY:
                return playRandom();
            case MEDIUM:
                return playMedium();
            case HARD:
                return playHard();
            default:
                return new BoardCell(-1, -1);
        }
    }
    
    private Button getButton(int x, int y) {
            if (x == 0 && y == 0) return button11;
        else if (x == 0 && y == 1) return button12;
        else if (x == 0 && y == 2) return button13;
        else if (x == 1 && y == 0) return button21;
        else if (x == 1 && y == 1) return button22;
        else if (x == 1 && y == 2) return button23;
        else if (x == 2 && y == 0) return button31;
        else if (x == 2 && y == 1) return button32;
        else if (x == 2 && y == 2) return button33;
        else return null;
    }
    
    /**
     * Returns the flat index of the next empty random cell on the board
     */
    private BoardCell playRandom() {
        Random rand = new Random();
        int x, y;

        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!isButtonEmpty(getButton(x, y)));

        return new BoardCell(x, y);
    }
    
    /**
     * Returns the flat index of a random move or a best move in turns
     * medium level (one time easy, one time hard)
     * Begins with a best move
     */
    private BoardCell playMedium() {
        if (counter % 2 == 0)
            return playHard();
        else
            return playRandom();
    }
    
    /**
     * Return the flat index of the best move that the computer can take
     * the best move is either a move that will help the computer win, or will prevent the player from winning
     * this means that the computer will always try to win or draw the game (hard level)
     */
    public BoardCell playHard() {
        int bestScore = Integer.MIN_VALUE;
        BoardCell bestCell = new BoardCell(-1, -1);

        // Loop through all cells
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                // Get the button by row and column coordinates
                Button button = getButton(row, column);

                // Check if the cell is empty
                if (isButtonEmpty(button)) {
                    /*
                    We make the computer simulate a hypothetical game, 
                    calculating all possible moves in both its direction and the player's direction
                    to achieve the best outcome or the best position to play.
                    */
                    button.setText("O");
                    /*
                    Here, the computer accumulates a sum to calculate the hypothetical steps it has taken,
                    whether in its favor or not, it increases its own total accordingly and
                    If the steps are in favor of the player, it subtracts the corresponding sum.
                    */         
                    int moveScore = minimax(false);
                    // After completing the simulation process, it returns all the cells it used to be empty.
                    button.setText(" ");
                    /*
                     Here, we choose the highest sum obtained during the simulation process to
                    ensure the best outcome for winning or drawing with the least estimation.
                    */
                    if (moveScore > bestScore) {
                        bestScore = moveScore;
                        bestCell = new BoardCell(row, column);
                    }
                }
            }
        }

        return bestCell;
    }
    
    /**
     * MiniMax algorithm is used when we have two players in a game
     * and we want to calculate the score of a simulation on the board.
     * The simulation maximizes possible score for a player and minimizes it for
     * the other, then returns this score representing either a win for the
     * maximized player or a win for the minimized player.
     * @param isMaximizing are we maximizing score for player 1 (the computer in case of our game)
     * or minimizing it for player 2 (the human player)
     * @return score of the winning player
     */
    private int minimax(boolean isMaximizing) {
        int score = getMoveScore();

        if (score == 10 || score == -10)
            return score;

        if (!shouldGameEnd())
            return 0;

        if (isMaximizing) {
            int best = Integer.MIN_VALUE;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Button button = getButton(i, j);
                    if (isButtonEmpty(button)) {
                        button.setText("O");
                        best = Math.max(best, minimax(false));
                        button.setText(" ");
                    }
                }
            }
            return best;
        } else {
            int best = Integer.MAX_VALUE;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Button button = getButton(i, j);
                    if (isButtonEmpty(button)) {
                        button.setText("X");
                        best = Math.min(best, minimax(true));
                        button.setText(" ");
                    }
                }
            }
            return best;
        }
    }
    
    /**
     * Return a score based on the game winner.
     */
    private int getMoveScore() {
        GameWinnerDetails winnerDetails = getWinnerDetails();

        if (winnerDetails != null && winnerDetails.someoneWon)
            if (winnerDetails.player1Won)
                return -10;
            else
                return +10;

        return 0;
    }
    
    /**
     * Checks if there is at least one more move in the game.
     */
    private boolean shouldGameEnd() {
        boolean oneEmpty = false;
        for (int i = 0; i < 9; ++i)
            if (isButtonEmpty(getButton(i / 3, i % 3)))
                oneEmpty = true;
        return oneEmpty;
    }
    
    private boolean isButtonEmpty(Button button) {
        return button.getText().equals(" ");
    }
    
    public void setPlayerSymbol(Button button){
        if (playerTurn % 2 == 0) {
            secondPlayerNameText.setStyle("-fx-effect: none;");
            firstPlayerNameText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
            button.setText("X");
            button.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
            playerTurn = 1;
        } else {
            firstPlayerNameText.setStyle("-fx-effect: none;");
            secondPlayerNameText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
            button.setText("O");
            button.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
            playerTurn = 0;
        }
    }

    /**
     * Checks if there is a game winner.
     * @return details for the winner player, including which side and which cells won them the game.
     */
    private GameWinnerDetails getWinnerDetails() {
        String line = "";
        Button[] buttons = new Button[3];
        for (int i = 0; i < 8; ++i) {
            switch (i) {
                case 0:
                    // 11 12 13
                    
                    
                    line = button11.getText() + button12.getText() + button13.getText();
                    buttons = new Button[]{button11, button12, button13};
                    break;
                case 1:
                    
                    // 21 22 23
                    
                    line = button21.getText() + button22.getText() + button23.getText();
                    buttons = new Button[]{button21, button22, button23};
                    break;
                case 2:
                     
                    
                    // 31 32 33
                    line = button31.getText() + button32.getText() + button33.getText();
                    buttons = new Button[]{button31, button32, button33};
                    break;
                case 3:
                    // 11       
                    //    22   
                    //       33
                    line = button11.getText() + button22.getText() + button33.getText();
                    buttons = new Button[]{button11, button22, button33};
                    break;
                case 4:
                    //       13 
                    //    22   
                    // 31      
                    line = button13.getText() + button22.getText() + button31.getText();
                    buttons = new Button[]{button13, button22, button31};
                    break;
                case 5:
                    // 11  
                    // 21 
                    // 31 
                    line = button11.getText() + button21.getText() + button31.getText();
                    buttons = new Button[]{button11, button21, button31};
                    break;
                case 6:
                    //    12 
                    //    22
                    //    32 
                    line = button12.getText() + button22.getText() + button32.getText();
                    buttons = new Button[]{button12, button22, button32};
                    break;
                case 7:
                    //       13 
                    //       23
                    //       33
                    line = button13.getText() + button23.getText() + button33.getText();
                    buttons = new Button[]{button13, button23, button33};
                    break;
                default:
                     disableButton();
                    return new GameWinnerDetails(false, false, null);
            }

            if ("XXX".equals(line)) { 
                player1Score++;
                 timelinewinner.play();
                  
                return new GameWinnerDetails(true, true, buttons);
            } else if ("OOO".equals(line)) {
               
                 player2Score++;
                 timelinelose.play();
               
                return new GameWinnerDetails(true, false, buttons);
            }
           
            
        }

        if (counter == 9) {

            timelinedraw.play();
            System.out.println(counter);
            if (isRecording)
                saveRecording();
            if (!isPlayingRecord)
                timeline.play();
            return new GameWinnerDetails(false, false, null);
        }

        return new GameWinnerDetails(false, false, null);
    }
    
    


    public void checkIfGameIsOver() {
        GameWinnerDetails winnerDetails = getWinnerDetails();
        System.out.println("Winner details = " + winnerDetails);
        if (winnerDetails != null) {
            if (winnerDetails.someoneWon) {
                if (winnerDetails.player1Won) {
                    firstPlayerScoreText.setText(String.valueOf(player1Score));
                    player1Score++;
                    System.out.println("Player 1 score = " + player1Score);
                } else {
                    secondPlayerScoreText.setText(String.valueOf(player2Score));
                    player2Score++;
                    System.out.println("Player 2 score = " + player2Score);
                }

                highlightWinningButtons(winnerDetails.winningButtons);
                disableButton();
                fullBoardFlag = false;
                if (isRecording)
                    saveRecording();
                if (!isPlayingRecord)
                    timeline.play();
            }
        }
    }


    private void highlightWinningButtons(Button[] buttons) {
        for (int i = 0; i < 3; i++) {
            buttons[i].setStyle("-fx-background-color:#69BA6C;-fx-background-radius: 25");
        }
    }

    public void disableButton() {
        button11.setDisable(true);
        button12.setDisable(true);
        button13.setDisable(true);
        button21.setDisable(true);
        button22.setDisable(true);
        button23.setDisable(true);
        button31.setDisable(true);
        button32.setDisable(true);
        button33.setDisable(true);
    }
    
    private void playRecording() {
        List<BoardCell> moves = currentRecording.getMoves();
        for (int i = 0, l = moves.size(); i < l; ++i) {
            BoardCell currentMove = moves.get(i);
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(i + 1), event -> {
                Platform.runLater(() -> playMove(getButton(currentMove.getX(), currentMove.getY())));
            }));
            timeline.play();
        }
    }
    
    public static List<File> searchFiles(String directoryPath, String substring) {
        List<File> matchingFiles = new ArrayList<>();

        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    System.out.println("=======================================");
                    System.out.println("Checking " + file.getName() + " against " + substring);
                    if (file.isFile() && file.getName().contains(substring)) {
                        matchingFiles.add(file);
                    }
                }
            }
        }

        return matchingFiles;
    }
    
    private void saveRecording() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        File recordsDirectory = new File(Config.getRecordsPath());
        recordsDirectory.mkdirs();
        String fileName = firstPlayer.getUsername() + "-" +
                secondPlayer.getUsername() + "-" +
                dateFormat.format(new Date());
        List<File> previousFiles = searchFiles(Config.getRecordsPath(), fileName);
        if (previousFiles.size() > 0) {
            fileName = fileName + "(" + (previousFiles.size() + 1) + ")";
        }
        fileName = Config.getRecordsPath() + System.getProperty("file.separator") + fileName + ".txt";
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName))) {
            output.writeObject(currentRecording);
            System.out.println("Object written to file: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    /**
     * Describes if someone won, and some details about them.
     * Includes which side won, and which buttons won them the game.
     */
    class GameWinnerDetails {
        public boolean someoneWon;
        public boolean player1Won;
        public Button[] winningButtons;
        
        public GameWinnerDetails(boolean someoneWon, boolean isPlayer1, Button[] winningButtons) {
            this.someoneWon = someoneWon;
            this.player1Won = isPlayer1;
            this.winningButtons = winningButtons;
        }

        @Override
        public String toString() {
            return "WinnerDetails{" + this.someoneWon + ", " + this.player1Won + ", " + this.winningButtons + "}";
        }
    }
}
