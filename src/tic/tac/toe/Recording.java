/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import tic.tac.toe.BoardCell;

public class Recording implements Serializable {
    private Player player1;
    private Player player2;
    private Date date;
    private String path;
    private List<BoardCell> moves = new ArrayList<>();

    public Recording(Player player1, Player player2, Date date, String path, List<BoardCell> moves) {
        this.player1 = player1;
        this.player2 = player2;
        this.date = date;
        this.path = path;
        this.moves = moves;
    }
    
    public Recording(File file) {
        Recording recording = readRecordingFromFile(file);
        this.player1 = recording.player1;
        this.player2 = recording.player2;
        this.date = recording.date;
        this.path = file.getAbsolutePath();
        this.moves = recording.moves;
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public String getTitle() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return this.player1.getUsername() + "-" + this.player2.getUsername() + "-" + dateFormat.format(this.date);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public void addNewMove(BoardCell moveCell) {
        this.moves.add(moveCell);
    }
    
    public List<BoardCell> getMoves() {
        return this.moves;
    }
    
    public static Recording readRecordingFromFile(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Recording) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
