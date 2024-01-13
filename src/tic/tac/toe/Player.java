
package tic.tac.toe;

public class Player {
    private String username;
    private String email;
    private String password;
    private boolean isplaying;
  
    int score;
        public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Player() {

    }

    boolean isIsplaying() {
        return isplaying;
    }

   String getEmail() {
        return email;
    }
    
}
