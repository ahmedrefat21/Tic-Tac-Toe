/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author Kimo Store
 */
public class ResultFXMLController implements Initializable {
    @FXML 
    private MediaView mideaview;
    @FXML
    private File vedioFile;
    private Media media;
    private MediaPlayer mediaPlayer;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        vedioFile = new File(".mp4");
        media = new Media(vedioFile.toURI().toString());



    }    
    
}
