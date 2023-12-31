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
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Kimo Store
 */
public class GameController implements Initializable {

    @FXML
    private AnchorPane gameAnchore;
    @FXML
    private AnchorPane mainPageAnchor;

    @FXML
    private Text firstPlayerNameText;
    @FXML
    private Text secondPlayerNameText;
    @FXML
    private Text firstPlayerScoreText;
    @FXML
    private Text secondPlayerScoreText;
    @FXML
    private ImageView recordImage;

  @FXML
  public void displayNames(String player1, String player2){
   firstPlayerNameText.setText(player1);
   secondPlayerNameText.setText(player2);
  
  }
  @FXML
    private void exitButton(ActionEvent event) throws IOException {
    
        mainPageAnchor = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        gameAnchore.getChildren().setAll(mainPageAnchor);
    
    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
