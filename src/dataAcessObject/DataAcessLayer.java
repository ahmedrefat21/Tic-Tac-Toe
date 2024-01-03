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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import org.apache.derby.jdbc.ClientDriver;


public class DataAcessLayer {
    
    private Connection con;
    private PreparedStatement statement;
        public int insertPlayer(PlayerDTO player) throws SQLException {
        int res=-1;
        try {
            if(con.isClosed()||con==null)
            {
                DriverManager.registerDriver(new ClientDriver());
                
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/ticTacToe", "root","root");//////////url or class??????
            }
            statement=con.prepareStatement("insert into ROOT.PLAYER (Username,Password,Points,Online,Available) values (?,?,?,?,?)");
            statement.setString(1,player.getUsername());
            statement.setString(2,player.getPassword());
            statement.setInt(3, player.getPoints());
            statement.setBoolean(4, true); //online
            statement.setBoolean(5, true); ///availabe : a3mlha eh???? defult true
            res=statement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DataAcessLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
}
