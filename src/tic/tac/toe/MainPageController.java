/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author Kimo Store
 */
public class MainPageController implements Initializable {

    @FXML
    private AnchorPane mainPageAnchor;
   
    @FXML
    AnchorPane playerAnchor;
    @FXML
    AnchorPane levelAnchore;
    @FXML
    AnchorPane gameAnchore;
    @FXML
    AnchorPane signUpLogin;

    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
      playerAnchor = FXMLLoader.load(getClass().getResource("PlayerName.fxml"));
      mainPageAnchor.getChildren().setAll(playerAnchor);
    }
    
        
    @FXML
    private void compButtonAction(ActionEvent event) throws IOException {
     levelAnchore = FXMLLoader.load(getClass().getResource("LevelScreen.fxml"));      
    mainPageAnchor.getChildren().setAll(levelAnchore); 
      
    }
    @FXML
      private void OnlineButtonAction(ActionEvent event) throws IOException { //nedd to be editied, can't find siguploginFXML
     signUpLogin = FXMLLoader.load(getClass().getResource("signup_login_design.fxml"));      
        mainPageAnchor.getChildren().setAll(signUpLogin); 
      
    }  
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
