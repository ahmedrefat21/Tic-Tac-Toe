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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kimo Store
 */
public class PlayerNameController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    TextField playerTwoTextField;
      @FXML
    TextField playerOneTextField;
    @FXML
    AnchorPane playerAnchor;
    @FXML
    AnchorPane gameAnchore;
    @FXML
    AnchorPane mainPageAnchor;
    

    @FXML
    private void startGameButton(ActionEvent event) throws IOException {
        String player1 = playerTwoTextField.getText();
        String player2 = playerOneTextField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        root = loader.load();
        GameController sc2 = loader.getController();
        sc2.displayNames(player1,player2);
        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        gameAnchore = FXMLLoader.load(getClass().getResource("Game.fxml"));
        playerAnchor.getChildren().setAll(gameAnchore);
    
    }
    @FXML
    private void backButton(ActionEvent event) throws IOException {
    
        mainPageAnchor = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        playerAnchor.getChildren().setAll(mainPageAnchor);
    
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
