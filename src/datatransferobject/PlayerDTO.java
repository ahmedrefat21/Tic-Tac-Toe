package datatransferobject;
/**
 *
 * @author ahmed
 */
public class PlayerDTO {
    private String Username;
    private String Password;
    private int Points;
    private boolean Online;
    private boolean Available;

    public PlayerDTO(String Username, String Password, int Points, boolean Online, boolean Available) {
        this.Username = Username;
        this.Password = Password;
        this.Points = Points;
        this.Online = Online;
        this.Available = Available;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int Points) {
        this.Points = Points;
    }

    public boolean isOnline() {
        return Online;
    }

    public void setOnline(boolean Online) {
        this.Online = Online;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean Available) {
        this.Available = Available;
    }
        
}
