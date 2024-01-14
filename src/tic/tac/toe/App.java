/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static tic.tac.toe.SignUpBase.socket;

/**
 *
 * @author ahmed
 */
public class App {
    static Socket socket;
    static DataInputStream dis;
    static PrintStream ps;
    static HashMap<String, String>hash = new HashMap<>();
    public static void start()
    {
        try {
            socket = new Socket(InetAddress.getLoopbackAddress(), 5005);
            dis = new DataInputStream(socket.getInputStream());
            ps = new PrintStream(socket.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
