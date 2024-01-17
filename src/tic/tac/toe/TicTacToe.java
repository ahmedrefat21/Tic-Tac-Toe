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
import javafx.scene.image.Image;
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
        
        Parent root =new splash_screenBase(stage);        
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Tic Tac Toe");
        Image icon = new Image(getClass().getResourceAsStream("/assets/images/icon.png"));
        stage.getIcons().add(icon);
        
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
