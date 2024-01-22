package tic.tac.toe;

import java.io.Serializable;

public class Player implements Serializable {
    private String username;
    private String email;
    private String password;
    private boolean isplaying;
    private boolean isactive;
   
     int score;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
        public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
     public Player(String username) {

        this.username = username;
       
    }
      public Player(String username, String email , int score) {

        this.username = username;
        this.email = email;
         this.score = score;
    }

    public Player() {

    }

    boolean isIsplaying() {
        return isplaying;
    }

    public String getEmail() {
        return email;
    }
    
   
    public void setIsplaying(boolean isplaying) {
        this.isplaying = isplaying;
    }

    public boolean isIsactive() {
        return isactive;
    }

    
    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    
}
