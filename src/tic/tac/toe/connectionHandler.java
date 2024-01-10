
package tic.tac.toe;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class connectionHandler {
    static HashMap<String, String>hash = new HashMap<>();
    static Socket socket;
    static DataInputStream dis;
    static PrintStream ps;
    public void connection(String s){
    
        try {
            socket = new Socket(InetAddress.getLoopbackAddress(), 5005);
            dis = new DataInputStream(socket.getInputStream());
            ps = new PrintStream(socket.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(connectionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
