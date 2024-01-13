
package tic.tac.toe;

public class Player {
    private String username;
    private String email;
    private String password;
    private boolean isplaying;
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


    
}
