
package Objects;


public class User {
    
    String Username;
    String Email;
    String Password;
    String JoinDate;

    public User(String Username, String Email, String Password, String JoinDate) {
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
        this.JoinDate = JoinDate;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Getters">

    public String getUsername() {
        return Username;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getJoinDate() {
        return JoinDate;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters">

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setJoinDate(String JoinDate) {
        this.JoinDate = JoinDate;
    }
    // </editor-fold>
    
    
}
