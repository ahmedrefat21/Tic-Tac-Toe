package tic.tac.toe;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginBase extends AnchorPane {

    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final Button loginButton;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final TextField emailTextField;
    protected final PasswordField passwordTextField;
    protected final Label alertText;
    protected final ImageView backImage;
    protected final Button signupButton;
    protected final Label label2;
    private Thread thread;
    StringTokenizer token;
    int score;
    /*PrintStream ps;
    DataInputStream dis;
    HashMap<String, String>hash = new HashMap<>();*/

    public LoginBase(Stage stage) {

        imageView = new ImageView();
        imageView0 = new ImageView();
        loginButton = new Button();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        emailTextField = new TextField();
        passwordTextField = new PasswordField();
        alertText = new Label();
        backImage = new ImageView();
        signupButton = new Button();
        label2 = new Label();

        setPrefHeight(480.0);
        setPrefWidth(740.0);
        setStyle("-fx-background-color: #FDE8ED;");

        AnchorPane.setBottomAnchor(imageView, 352.0);
        AnchorPane.setLeftAnchor(imageView, 315.0);
        AnchorPane.setRightAnchor(imageView, 287.0585632324219);
        AnchorPane.setTopAnchor(imageView, 23.0);
        imageView.setFitHeight(113.0);
        imageView.setFitWidth(161.0);
        imageView.setLayoutX(315.0);
        imageView.setLayoutY(23.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/assets/images/user.png").toExternalForm()));

        AnchorPane.setBottomAnchor(imageView0, 0.0);
        AnchorPane.setLeftAnchor(imageView0, 0.0);
        AnchorPane.setRightAnchor(imageView0, 598.7890625);
        AnchorPane.setTopAnchor(imageView0, 330.0);
        imageView0.setFitHeight(150.0);
        imageView0.setFitWidth(200.0);
        imageView0.setLayoutY(330.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/assets/images/ticTacToe.png").toExternalForm()));

        AnchorPane.setBottomAnchor(loginButton, 69.0);
        AnchorPane.setLeftAnchor(loginButton, 281.0);
        AnchorPane.setRightAnchor(loginButton, 260.0);
        AnchorPane.setTopAnchor(loginButton, 350.0);
        loginButton.setLayoutX(281.0);
        loginButton.setLayoutY(350.0);
        loginButton.setMnemonicParsing(false);
        loginButton.setPrefHeight(61.0);
        loginButton.setPrefWidth(199.0);
        loginButton.setStyle("-fx-border-radius: 50px; -fx-background-radius: 50; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 );");
        loginButton.getStylesheets().add("/tic/tac/toe/loginfxml.css");
        loginButton.setText("Login");
        loginButton.setTextFill(javafx.scene.paint.Color.valueOf("#fde8ed"));
        loginButton.setFont(new Font("Comic Sans MS Bold", 30.0));
        /*loginButton.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                login();
            }
            
        });*/
        
        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             login();
            }
        });  

        AnchorPane.setBottomAnchor(label, 269.0);
        AnchorPane.setLeftAnchor(label, 140.0);
        AnchorPane.setRightAnchor(label, 517.0);
        AnchorPane.setTopAnchor(label, 173.0);
        label.setLayoutX(140.0);
        label.setLayoutY(173.0);
        label.setPrefHeight(39.0);
        label.setPrefWidth(83.0);
        label.setText("Email");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        label.setFont(new Font("Comic Sans MS Bold", 26.0));

        AnchorPane.setBottomAnchor(label0, 204.0);
        AnchorPane.setLeftAnchor(label0, 136.0);
        AnchorPane.setRightAnchor(label0, 489.0);
        AnchorPane.setTopAnchor(label0, 247.0);
        label0.setLayoutX(136.0);
        label0.setLayoutY(247.0);
        label0.setPrefHeight(39.0);
        label0.setPrefWidth(115.0);
        label0.setText("Password");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        label0.setFont(new Font("Comic Sans MS Bold", 26.0));

        AnchorPane.setBottomAnchor(label1, 22.0);
        AnchorPane.setLeftAnchor(label1, 203.0);
        AnchorPane.setRightAnchor(label1, 276.0);
        AnchorPane.setTopAnchor(label1, 420.0);
        label1.setLayoutX(203.0);
        label1.setLayoutY(420.0);
        label1.setPrefHeight(38.0);
        label1.setPrefWidth(261.0);
        label1.setText("Don't have an account? ");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#f22853"));
        label1.setFont(new Font("Comic Sans MS Bold", 22.0));

        AnchorPane.setBottomAnchor(emailTextField, 267.0);
        AnchorPane.setLeftAnchor(emailTextField, 281.0);
        AnchorPane.setRightAnchor(emailTextField, 221.0);
        AnchorPane.setTopAnchor(emailTextField, 175.0);
        emailTextField.setLayoutX(281.0);
        emailTextField.setLayoutY(175.0);
        emailTextField.setPrefHeight(46.0);
        emailTextField.setPrefWidth(238.0);
        emailTextField.setStyle("-fx-background-radius: 20px; -fx-background-color: FDE8ED; -fx-border-color: F22853; -fx-border-radius: 20px; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 8 ,0.4 , -7, 5); -fx-text-fill: F22853;");
        emailTextField.setText("");
        emailTextField.setFont(new Font("Comic Sans MS Bold", 18.0));

        passwordTextField.setLayoutX(281.0);
        passwordTextField.setLayoutY(249.0);
        passwordTextField.setPrefHeight(46.0);
        passwordTextField.setPrefWidth(238.0);
        passwordTextField.setStyle("-fx-background-radius: 20px; -fx-background-color: FDE8ED; -fx-border-color: F22853; -fx-border-radius: 20px; -fx-effect: dropshadow( one-pass-box  , #BFBFC3 , 10 ,0.4 , -7, 7 ); -fx-text-fill: F22853;");
        passwordTextField.setFont(new Font("Comic Sans MS Bold", 18.0));

        alertText.setLayoutX(241.0);
        alertText.setLayoutY(320.0);
        alertText.setPrefHeight(21.0);
        alertText.setPrefWidth(279.0);
        alertText.setTextFill(javafx.scene.paint.Color.RED);
        alertText.setFont(new Font("Comic Sans MS Bold", 14.0));

        AnchorPane.setBottomAnchor(backImage, 383.0);
        AnchorPane.setLeftAnchor(backImage, 35.0);
        AnchorPane.setRightAnchor(backImage, 632.359733581543);
        AnchorPane.setTopAnchor(backImage, 26.0);
        backImage.setFitHeight(71.0);
        backImage.setFitWidth(81.0);
        backImage.setLayoutX(35.0);
        backImage.setLayoutY(26.0);
        backImage.setPickOnBounds(true);
        backImage.setPreserveRatio(true);
        backImage.setImage(new Image(getClass().getResource("/assets/images/back.png").toExternalForm()));
        backImage.setOnMousePressed(e -> {
            Parent pane = new signup_login_designBase(stage);
            stage.getScene().setRoot(pane);
       });

        signupButton.setLayoutX(457.0);
        signupButton.setLayoutY(420.0);
        signupButton.setMnemonicParsing(false);
        signupButton.setPrefHeight(46.0);
        signupButton.setPrefWidth(99.0);
        signupButton.setStyle("-fx-background-color: #FDE8ED;");
        signupButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent pane = new SignUpBase(stage);
                stage.getScene().setRoot(pane);
            }
        }); 

        label2.setPrefHeight(32.0);
        label2.setPrefWidth(99.0);
        label2.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        label2.setText("SignUp ");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        label2.setFont(new Font("Comic Sans MS Bold", 22.0));
        signupButton.setGraphic(label2);

        getChildren().add(imageView);
        getChildren().add(imageView0);
        getChildren().add(loginButton);
        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(label1);
        getChildren().add(emailTextField);
        getChildren().add(passwordTextField);
        getChildren().add(alertText);
        getChildren().add(backImage);
        getChildren().add(signupButton);

    }
    
    
    public void login(){
            
            
            String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
            Pattern pattern = Pattern.compile(regex);     
            Matcher matcher = pattern.matcher(emailTextField.getText());
            String userName = emailTextField.getText().trim();
            String email = emailTextField.getText().trim();
            if(userName.isEmpty() || email.isEmpty() ){
                Platform.runLater(()->{
                  alertText.setText("Empty Fields is Required");
                 }); 
                
            }else if(!matcher.matches()){
                Platform.runLater(()->{
                  alertText.setText("Please enter a valid mail");
                 }); 
                
            }else{
             
            connectionHandler.ps.println("SignIn###"+emailTextField.getText()+"###"+passwordTextField.getText());

            if(emailTextField.getText().equals("")){
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        alertText.setText("Please enter your Email");
                    }
                });
                
            } else if(passwordTextField.getText().equals("")){
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        alertText.setText("Please enter your password");            
                    }
                });
                
            }else{
                
                //System.out.println("LOOOOOOOOOOOGIIIIIIIIINNNNNNNNNNN");

                //reciving response
              thread =  new Thread(){
                   // HashMap<String, String> hash = new HashMap<>(); 
                    String state,playerData;
                    @Override
                    public void run(){
                        try {
                            state = connectionHandler.dis.readLine();
                            token = new StringTokenizer(state,"###");
                            String receivedState = token.nextToken();
                            System.out.println("sign in page "+receivedState);
                            
                            
                            
                            switch(receivedState){
                                case "Logged in successfully":
//                                    score = Integer.parseInt(token.nextToken());
                                    playerData = connectionHandler.dis.readLine();
                                    System.out.println("player data "+playerData);
                            
                                    StringTokenizer token2 = new StringTokenizer(playerData,"###");
                                    connectionHandler.hash.put("username", token2.nextToken());
                                    connectionHandler.hash.put("email",token2.nextToken());
                                    connectionHandler.hash.put("score", token2.nextToken());
                                    //notification for successful logging in
                                    
                                     Platform.runLater(()->{
                                         thread.stop();
                                      });
                                    break;
                                case "This Email is alreay sign-in":
                                    System.out.println("already sign in before run later");
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            alertText.setText(receivedState);
                                        }
                                    });                             
                                    break;
                                case "Email is incorrect":
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            alertText.setText(receivedState);
                                        }
                                    });                              
                                    break;
                                case "Password is incorrect":
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            alertText.setText(receivedState);
                                        }
                                    });                                 
                                    break;
                                case "Connection issue, please try again later":
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            alertText.setText(receivedState);
                                        }
                                    }); 
                                    break;
                                default :
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            alertText.setText("Please Enter valid Credentials");
                                        }
                                    });
                            }

                        } catch (IOException ex) {
                            Platform.runLater(() -> {
                                /*try {
                                    AskDialog  serverIssueAlert  = new AskDialog();
                                    serverIssueAlert.serverIssueAlert("There is issue in connection game page will be closed");
                                    thread.stop();
                                    socket.close();
                                    dis.close();
                                    ps.close();
                                } catch (IOException ex1) {
                                    Logger.getLogger(LoginBase.class.getName()).log(Level.SEVERE, null, ex1);
                                }*/

                                });
                            
                        }
                    }
                };   
              thread.start();

            }
         }
            


    

    }

   
}
