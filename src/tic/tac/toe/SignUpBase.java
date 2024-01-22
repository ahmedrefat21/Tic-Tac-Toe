package tic.tac.toe;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public  class SignUpBase extends AnchorPane {
    
        

    protected final ImageView imageView;
    protected final ImageView backImage;
    protected final ImageView imageView0;
    protected final TextField emailTextField;
    protected final Text UsernamelLbel;
    protected final Text passLabel;
    protected final Button SignUpButton;
    protected final Text text;
    protected final Text emailLabel;
    protected final TextField usernameTextField;
    protected final PasswordField passTextField;
    protected final DropShadow dropShadow;
    protected final Button loginbtn;
    protected final Text loginText;
    StringTokenizer token;
    private Thread thread;
    protected JFrame jFrame;

    
    public SignUpBase(Stage stage) {

        imageView = new ImageView();
        backImage = new ImageView();
        imageView0 = new ImageView();
        emailTextField = new TextField();
        UsernamelLbel = new Text();
        passLabel = new Text();
        SignUpButton = new Button();
        text = new Text();
        emailLabel = new Text();
        usernameTextField = new TextField();
        passTextField = new PasswordField();
        dropShadow = new DropShadow();
        loginbtn = new Button();
        loginText = new Text();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(480.0);
        setPrefWidth(740.0);
        setStyle("-fx-background-color: #FDE8ED;");

        AnchorPane.setBottomAnchor(imageView, 2.0);
        AnchorPane.setLeftAnchor(imageView, 2.0);
        imageView.setFitHeight(150.0);
        imageView.setFitWidth(200.0);
        imageView.setLayoutX(12.0);
        imageView.setLayoutY(313.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/images/background.png").toExternalForm()));

        backImage.setFitHeight(64.0);
        backImage.setFitWidth(199.0);
        backImage.setLayoutX(24.0);
        backImage.setLayoutY(28.0);
        backImage.setPickOnBounds(true);
        backImage.setPreserveRatio(true);
        backImage.setImage(new Image(getClass().getResource("/assets/images/back.png").toExternalForm()));
        backImage.setOnMousePressed(e -> {
            Parent pane = new signup_login_designBase(stage);
            stage.getScene().setRoot(pane);
       });

        imageView0.setFitHeight(119.0);
        imageView0.setFitWidth(112.0);
        imageView0.setLayoutX(305.0);
        imageView0.setLayoutY(12.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/assets/images/SignUp.png").toExternalForm()));

        emailTextField.setLayoutX(342.0);
        emailTextField.setLayoutY(138.0);
        emailTextField.setPrefHeight(48.0);
        emailTextField.setPrefWidth(244.0);
        emailTextField.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5); -fx-background-radius: 15; -fx-border-color: f22853; -fx-border-radius: 15; -fx-background-color: #FDE8ED; -fx-text-fill: F22853;");
        emailTextField.setText("");
        emailTextField.setFont(new Font("Comic Sans MS Bold", 19.0));

        UsernamelLbel.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        UsernamelLbel.setId("firstPlayerNameText");
        UsernamelLbel.setLayoutX(163.0);
        UsernamelLbel.setLayoutY(249.0);
        UsernamelLbel.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        UsernamelLbel.setStrokeWidth(0.0);
        UsernamelLbel.setText("Username");
        UsernamelLbel.setFont(new Font("Comic Sans MS Bold", 24.0));

        passLabel.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        passLabel.setId("firstPlayerNameText");
        passLabel.setLayoutX(167.0);
        passLabel.setLayoutY(330.0);
        passLabel.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        passLabel.setStrokeWidth(0.0);
        passLabel.setText("Password");
        passLabel.setFont(new Font("Comic Sans MS Bold", 24.0));

        SignUpButton.setId("styles");
        SignUpButton.setLayoutX(294.0);
        SignUpButton.setLayoutY(377.0);
        SignUpButton.setMnemonicParsing(false);
        SignUpButton.setPrefHeight(42.0);
        SignUpButton.setPrefWidth(152.0);
        SignUpButton.setStyle("-fx-background-color: FCD015; -fx-background-radius: 45; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 );");
        SignUpButton.setText("SignUp");
        SignUpButton.setTextFill(javafx.scene.paint.Color.valueOf("#fde8ed"));
        SignUpButton.setWrapText(true);
        SignUpButton.setPadding(new Insets(0.0, 10.0, 10.0, 10.0));
        SignUpButton.setFont(new Font("Comic Sans MS Bold", 30.0));


        text.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        text.setId("firstPlayerNameText");
        text.setLayoutX(259.0);
        text.setLayoutY(466.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Have an account?");
        text.setFont(new Font("Comic Sans MS Bold", 24.0));

        emailLabel.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        emailLabel.setId("firstPlayerNameText");
        emailLabel.setLayoutX(163.0);
        emailLabel.setLayoutY(171.0);
        emailLabel.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        emailLabel.setStrokeWidth(0.0);
        emailLabel.setText("Email");
        emailLabel.setFont(new Font("Comic Sans MS Bold", 24.0));

        usernameTextField.setLayoutX(342.0);
        usernameTextField.setLayoutY(216.0);
        usernameTextField.setPrefHeight(48.0);
        usernameTextField.setPrefWidth(244.0);
        usernameTextField.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5); -fx-background-radius: 15; -fx-border-color: f22853; -fx-border-radius: 15; -fx-background-color: #FDE8ED; -fx-text-fill: F22853;");
        usernameTextField.setText("");
        usernameTextField.setFont(new Font("Comic Sans MS Bold", 19.0));

        passTextField.setLayoutX(342.0);
        passTextField.setLayoutY(297.0);
        passTextField.setPrefHeight(48.0);
        passTextField.setPrefWidth(244.0);
        passTextField.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5); -fx-background-radius: 15; -fx-border-color: f22853; -fx-border-radius: 15; -fx-background-color: #FDE8ED; -fx-text-fill: F22853;");
        passTextField.setText("");

        passTextField.setEffect(dropShadow);
        passTextField.setFont(new Font(19.0));

        loginbtn.setLayoutX(464.0);
        loginbtn.setLayoutY(429.0);
        loginbtn.setMnemonicParsing(false);
        loginbtn.setPrefHeight(48.0);
        loginbtn.setPrefWidth(77.0);
        loginbtn.setStyle("-fx-background-color: #FDE8ED;");
        loginbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent pane = new LoginBase(stage);
                stage.getScene().setRoot(pane);
            }
        }); 

        loginText.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        loginText.setId("firstPlayerNameText");
        loginText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        loginText.setStrokeWidth(0.0);
        loginText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        loginText.setText("Login");
        loginText.setFont(new Font("Comic Sans MS Bold", 24.0));
        loginbtn.setGraphic(loginText);

        getChildren().add(imageView);
        getChildren().add(backImage);
        getChildren().add(imageView0);
        getChildren().add(emailTextField);
        getChildren().add(UsernamelLbel);
        getChildren().add(passLabel);
        getChildren().add(SignUpButton);
        getChildren().add(text);
        getChildren().add(emailLabel);
        getChildren().add(usernameTextField);
        getChildren().add(passTextField);
        getChildren().add(loginbtn);
        
        SignUpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"); 
                Matcher matcher = pattern.matcher(emailTextField.getText());
                String userName = usernameTextField.getText().trim();
                String email = emailTextField.getText().trim();
                String password = passTextField.getText().trim();
                if(userName.isEmpty() || email.isEmpty() || password.isEmpty()   ){
                    JOptionPane.showMessageDialog(jFrame, "Please enter data the fields are required", "ERROR", JOptionPane.ERROR_MESSAGE);                                     
                }else if(!matcher.matches()){
                    JOptionPane.showMessageDialog(jFrame, "Email Format is False", "ERROR", JOptionPane.ERROR_MESSAGE);                                     
                }else if(!passTextField.getText().equals(passTextField.getText())){
                    JOptionPane.showMessageDialog(jFrame, "Wrong password", "ERROR", JOptionPane.ERROR_MESSAGE);                                     
                }  
                else{
                    OnlineAppManger.ps.println("SignUp###"+usernameTextField.getText()+"###"+emailTextField.getText()+"###"+passTextField.getText());
                    thread = new Thread(){
                        String state,playerData;
                        public void run(){
                            try {
                                try {
                                    state = OnlineAppManger.dis.readLine();
                                } catch (IOException ex) {
                                    Logger.getLogger(SignUpBase.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                token = new StringTokenizer(state,"###");
                                String receivedState = token.nextToken();
                                switch(receivedState){
                                    case "Registered Successfully":
                                        playerData = OnlineAppManger.dis.readLine();
                                        token = new StringTokenizer(playerData,"###");
                                        OnlineAppManger.hash.put("username", token.nextToken());
                                        OnlineAppManger.hash.put("email",token.nextToken());
                                        OnlineAppManger.hash.put("score", "0");
                                        Parent pane = new ScoreScreenBase(stage);
                                        stage.getScene().setRoot(pane);
                                        break;
                                    case "already signed-up":
                                        JOptionPane.showMessageDialog(jFrame, "This email is already signed in", "ERROR", JOptionPane.ERROR_MESSAGE);                                     
                                        break;
                                }
                            } catch (IOException ex) {
                                Logger.getLogger(SignUpBase.class.getName()).log(Level.SEVERE, null, ex);
                            }    
                        }
                    };
                    thread.start();
                }
            }    
        });      
    }
}








