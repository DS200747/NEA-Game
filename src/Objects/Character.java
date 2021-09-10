
package Objects;

import java.time.LocalDate;


public class Character {
    
   int CharacterID;
   String Username;
   String Nickname;
   String CharacterGender;
   int ClassID;
   int DomainAmount;
   String LastDomainDate;

    public Character(int CharacterID, String Username, String Nickname, String CharacterGender, int ClassID, int DomainAmount, String LastDomainDate) {
        this.CharacterID = CharacterID;
        this.Username = Username;
        this.Nickname = Nickname;
        this.CharacterGender = CharacterGender;
        this.ClassID = ClassID;
        this.DomainAmount = DomainAmount;
        this.LastDomainDate = LastDomainDate;
    }
   
   
   // <editor-fold defaultstate="collapsed" desc="Getters">

    public int getCharacterID() {
        return CharacterID;
    }

    public String getUsername() {
        return Username;
    }

    public String getNickname() {
        return Nickname;
    }

    public String getCharacterGender() {
        return CharacterGender;
    }

    public int getClassID() {
        return ClassID;
    }

    public int getDomainAmount() {
        return DomainAmount;
    }

    public String getLastDomainDate() {
        return LastDomainDate;
    }
    //</editor-fold>
    
   // <editor-fold defaultstate="collapsed" desc="Setters">

    public void setCharacterID(int CharacterID) {
        this.CharacterID = CharacterID;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public void setCharacterGender(String CharacterGender) {
        this.CharacterGender = CharacterGender;
    }

    public void setClassID(int ClassID) {
        this.ClassID = ClassID;
    }

    public void setDomainAmount(int DomainAmount) {
        this.DomainAmount = DomainAmount;
    }

    public void setLastDomainDate(String LastDomainDate) {
        this.LastDomainDate = LastDomainDate;
    }
    //</editor-fold>
    
}
