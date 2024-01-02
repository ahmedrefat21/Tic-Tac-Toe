/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatransferobject;

public class GameDTO {
    
  private String Username;
  private String Player1;
  private String Player2;
  private String Date;
  private String Time;
  private String Record;

  public GameDTO(String Username, String Player1, String Player2, String Date, String Time, String Record) {
    this.Username = Username;
    this.Player1 = Player1;
    this.Player2 = Player2;
    this.Date = Date;
    this.Time = Time;
    this.Record = Record;
    }  

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPlayer1() {
        return Player1;
    }

    public void setPlayer1(String Player1) {
        this.Player1 = Player1;
    }

    public String getPlayer2() {
        return Player2;
    }

    public void setPlayer2(String Player2) {
        this.Player2 = Player2;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getRecord() {
        return Record;
    }

    public void setRecord(String Record) {
        this.Record = Record;
    }
  
  
  
  
    
}
