/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAcessObject;

import datatransferobject.PlayerDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import org.apache.derby.jdbc.ClientDriver;
import sun.security.util.Password;

/**
 *
 * @author ahmed
 */
public class DataAcessLayer {
    
    public static ResultSet login(PlayerDTO player)throws SQLException{
    //1.load driver
    DriverManager.registerDriver(new ClientDriver());
    //2.connection
        Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/ticTacToe","root","root");
        //3.statement 
        PreparedStatement ps =con.prepareStatement("SELECT Password FROM PLAYER WHERE Username=?");
        ps.setString(1,player.getUsername());
        //4.process the result
        ResultSet rs=ps.executeQuery();
        if (!rs.isBeforeFirst()){
        System.out.println("User not found in the database!");
        Alert a=new Alert(Alert.AlertType.ERROR);
        a.setContentText("Information are incorrect");
        a.show();
        }else{
        while (rs.next()){
        
        String retrivepassword =rs.getString("Password");
        }
   //     if (retrivepassword.equals(Password)){
     //       Alert alert =new Alert(Alert.AlertType.CONFIRMATION);
       //      alert.setContentText("Your logged in");
       //      alert.show();   
      //  }else{
      //   System.out.println("Sorry Password did not match");
        //  Alert alert =new Alert(Alert.AlertType.ERROR);
          //   alert.setContentText("Information are incorrect");
         //    alert.show();  
      //  }
       // }
        //5.close connection
        con.close();
        return rs;
    
    }
    
    
    
    
    
}
