/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ahmed
 */
public class TicTacToe extends Application {
    
    public static Scene scene ;
    resultFXMLBase base;
    @Override
    public void start(Stage stage) throws Exception {

        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
      // Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));

        
        Parent root =new MainPageBase(stage) {};
        
        scene = new Scene(root,740,480);
        stage.setResizable(false);
        //stage.setScene(new Scene(root, , 470));
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
