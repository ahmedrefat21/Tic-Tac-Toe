package tic.tac.toe;

import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.geometry.Insets;
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

public abstract class SignUpBase extends AnchorPane {

    protected final ImageView imageView;
    protected final ImageView backImage;
    protected final ImageView imageView0;
    protected final TextField userNameTextField;
    protected final Text Usernamelabel;
    protected final Text passlabel;
    protected final Button SignUpButton;
    protected final Text text;
    protected final Text loginText;
    protected final Text emaillabel;
    protected final TextField emailTextField;
    protected final PasswordField passtextfield;
    protected final DropShadow dropShadow;
    StringTokenizer token;
    private Thread thread;
    public SignUpBase() {

        imageView = new ImageView();
        backImage = new ImageView();
        imageView0 = new ImageView();
        userNameTextField = new TextField();
        Usernamelabel = new Text();
        passlabel = new Text();
        SignUpButton = new Button();
        text = new Text();
        loginText = new Text();
        emaillabel = new Text();
        emailTextField = new TextField();
        passtextfield = new PasswordField();
        dropShadow = new DropShadow();

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
        imageView.setImage(new Image(getClass().getResource("../../../assets/images/background.png").toExternalForm()));

        backImage.setFitHeight(64.0);
        backImage.setFitWidth(199.0);
        backImage.setLayoutX(24.0);
        backImage.setLayoutY(28.0);
        backImage.setPickOnBounds(true);
        backImage.setPreserveRatio(true);
        backImage.setImage(new Image(getClass().getResource("../../../assets/images/back.png").toExternalForm()));

        imageView0.setFitHeight(97.0);
        imageView0.setFitWidth(104.0);
        imageView0.setLayoutX(322.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("../../../assets/images/SignUp.png").toExternalForm()));

        userNameTextField.setLayoutX(342.0);
        userNameTextField.setLayoutY(138.0);
        userNameTextField.setPrefHeight(48.0);
        userNameTextField.setPrefWidth(244.0);
        userNameTextField.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5); -fx-background-radius: 15; -fx-border-color: f22853; -fx-border-radius: 15; -fx-background-color: #FDE8ED;");

        Usernamelabel.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        Usernamelabel.setId("firstPlayerNameText");
        Usernamelabel.setLayoutX(163.0);
        Usernamelabel.setLayoutY(172.0);
        Usernamelabel.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        Usernamelabel.setStrokeWidth(0.0);
        Usernamelabel.setText("Username");
        Usernamelabel.setFont(new Font("Comic Sans MS Bold", 24.0));

        passlabel.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        passlabel.setId("firstPlayerNameText");
        passlabel.setLayoutX(167.0);
        passlabel.setLayoutY(330.0);
        passlabel.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        passlabel.setStrokeWidth(0.0);
        passlabel.setText("Password");
        passlabel.setFont(new Font("Comic Sans MS Bold", 24.0));

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

        loginText.setFill(javafx.scene.paint.Color.valueOf("#fcd015"));
        loginText.setId("firstPlayerNameText");
        loginText.setLayoutX(464.0);
        loginText.setLayoutY(466.0);
        loginText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        loginText.setStrokeWidth(0.0);
        loginText.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5);");
        loginText.setText("Login");
        loginText.setFont(new Font("Comic Sans MS Bold", 24.0));

        emaillabel.setFill(javafx.scene.paint.Color.valueOf("#f22853"));
        emaillabel.setId("firstPlayerNameText");
        emaillabel.setLayoutX(193.0);
        emaillabel.setLayoutY(250.0);
        emaillabel.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        emaillabel.setStrokeWidth(0.0);
        emaillabel.setText("Email");
        emaillabel.setFont(new Font("Comic Sans MS Bold", 24.0));

        emailTextField.setLayoutX(342.0);
        emailTextField.setLayoutY(216.0);
        emailTextField.setPrefHeight(48.0);
        emailTextField.setPrefWidth(244.0);
        emailTextField.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5); -fx-background-radius: 15; -fx-border-color: f22853; -fx-border-radius: 15; -fx-background-color: #FDE8ED;");

        passtextfield.setLayoutX(342.0);
        passtextfield.setLayoutY(297.0);
        passtextfield.setPrefHeight(48.0);
        passtextfield.setPrefWidth(244.0);
        passtextfield.setStyle("-fx-effect: dropshadow(one-pass-box ,#BFBFC3,10,0.3,-5,5); -fx-background-radius: 15; -fx-border-color: f22853; -fx-border-radius: 15; -fx-background-color: #FDE8ED;");

        passtextfield.setEffect(dropShadow);

        getChildren().add(imageView);
        getChildren().add(backImage);
        getChildren().add(imageView0);
        getChildren().add(userNameTextField);
        getChildren().add(Usernamelabel);
        getChildren().add(passlabel);
        getChildren().add(SignUpButton);
        getChildren().add(text);
        getChildren().add(loginText);
        getChildren().add(emaillabel);
        getChildren().add(emailTextField);
        getChildren().add(passtextfield);

    }
    
    
    public void signup(){
     
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(emailTextField.getText());
        String userName = userNameTextField.getText().trim();
        String email = emailTextField.getText().trim();
        String password = passtextfield.getText().trim();
        if(userName.isEmpty() || email.isEmpty() || password.isEmpty()   ){
                Alert alert =new Alert(AlertType.WARNING);
               alert.setContentText("inforamtion is false");
               alert.show();
                 }else if(!matcher.matches()){
                  Alert alert =new Alert(AlertType.WARNING);
               alert.setContentText("email format is false");
               alert.show();
                 }else if(!passtextfield.getText().equals(passtextfield.getText())){
                      Alert alert =new Alert(AlertType.WARNING);
               alert.setContentText("password is false");
               alert.show();
                 }  
                 else{
               connectionHandler.ps.println("SignUp###"+userNameTextField.getText()+"###"+emailTextField.getText()+"###"+passtextfield.getText());
                 
        
          thread =   new Thread(){
           String state,playerData;
           public void run(){
               try {
                   try {
                       state = connectionHandler.dis.readLine();
                   } catch (IOException ex) {
                       Logger.getLogger(SignUpBase.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   token = new StringTokenizer(state,"###");
                   String receivedState = token.nextToken();
                   System.out.println(receivedState);
                   System.out.println(receivedState);
                   
                   switch(receivedState){
                       case "Registered Successfully":
                           System.out.println("asdfasdfasdfasdfas");
                           playerData = connectionHandler.dis.readLine();
                           token = new StringTokenizer(playerData,"###");
                           connectionHandler.hash.put("username", token.nextToken());
                           connectionHandler.hash.put("email",token.nextToken());
                           connectionHandler.hash.put("score", "0");
                        break;
                        case "already signed-up":
                                     Alert alert =new Alert(AlertType.INFORMATION);
               
                                     alert.setContentText("This Email is " +receivedState);
               
                                     alert.show();                             
                                    break;
                   }
                   
                    connectionHandler.socket.close();
                    connectionHandler.dis.close();
                    connectionHandler.ps.close();
                   
               } catch (IOException ex) {
                   Logger.getLogger(SignUpBase.class.getName()).log(Level.SEVERE, null, ex);
               }
          }
    
    };
           thread.start();
                  }
    }
}
