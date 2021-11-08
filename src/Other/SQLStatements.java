package Other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SQLStatements {

    public static String DatabaseLocation = System.getProperty("user.dir") + "\\NEADatabase.accdb";
    public static Connection connection;
    public static Objects.User CurrentUser;

    // <editor-fold defaultstate="collapsed" desc="Basic Methods">
    public static Connection getConnection() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            connection = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            System.out.println("Connected Successfully");
            return connection;
        } catch (Exception e) {
            System.out.println("Error in connection: " + e);

        }
        return null;
    }

    public static ResultSet ExecuteQuery(String sql, Connection connection) {
        try {
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(sql);

            return resultSet;

        } catch (Exception e) {
            System.out.println("Error with the ExecuteQuery: " + e);
            return null;
        }

    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="SQL Statments To Do With The Users Table">
    public static ArrayList<String> GetExistingUsernames() {
        ArrayList<String> ExistingUsernames = new ArrayList<>();
        try {
            String sql = "SELECT Username FROM Users";
            ResultSet resultSet = ExecuteQuery(sql, getConnection());

            while (resultSet.next()) {
                String ExistingUsername = resultSet.getString("Username");
                ExistingUsernames.add(ExistingUsername);
            }
            connection.close();
            return ExistingUsernames;
        } catch (Exception e) {
            System.out.println("Error with finding the unique username: " + e);
            return null;

        }
    }

    public static ArrayList<String> GetExistingEmails() {
        ArrayList<String> ExistingEmails = new ArrayList<>();

        try {
            String sql = "SELECT Email FROM Users";
            ResultSet resultSet = ExecuteQuery(sql, getConnection());

            while (resultSet.next()) {
                String ExistingEmail = resultSet.getString("Email");
                ExistingEmails.add(ExistingEmail);
            }
            resultSet.close();
            connection.close();
            return ExistingEmails;

        } catch (Exception e) {
            System.out.println("Error with finding unique emails: " + e);
            return null;
        }
    }

    public static void AddNewUser(Objects.User user) {
        try {
            String sql = "SELECT * FROM Users";
            ResultSet resultSet = ExecuteQuery(sql, getConnection());

            if (resultSet.next()) {
                resultSet.moveToInsertRow();
                resultSet.updateString("Username", user.getUsername());
                resultSet.updateString("Email", user.getEmail());
                resultSet.updateString("Password", user.getPassword());
                resultSet.updateString("JoinDate", user.getJoinDate());
                resultSet.insertRow();
            }
            resultSet.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error with adding new user: "+e);
        }
    }

    public static boolean UserLogin(String username, String EnteredPassword, String EnteredEmail) {

        try {
            String sql = "SELECT * FROM Users WHERE Username = '" + username + "'";
            ResultSet resultSet = ExecuteQuery(sql, getConnection());

            if (resultSet.next()) {
                CurrentUser = new Objects.User(resultSet.getString("Username"), resultSet.getString("Email"), resultSet.getString("Password"), resultSet.getString("JoinDate"));
                String HashedEnteredPassword = Other.Utilities.GetHashedPassword(EnteredPassword);
                boolean check = Other.Utilities.ComparePasswords(HashedEnteredPassword, CurrentUser.getPassword());
                if (check == false) {
                    resultSet.close();
                    connection.close();
                    return false;
                }
                check = Other.Utilities.CompareEmails(CurrentUser.getEmail(), EnteredEmail);
                if (check == false) {
                    resultSet.close();
                    connection.close();
                    return false;
                }
                resultSet.close();
                connection.close();
                return true;

            }

            //exra resultSet.close(); connection.close(); should go here if need be
        } catch (Exception e) {
            System.out.println("Error with login SQL: " + e);
            return false;
        }
        return CurrentUser != null;

    }
    
    public static void UpdateUser (Objects.User user){
        try{
            String sql = "SELECT * FROM Users WHERE Username='"+user.getUsername()+"'";
            ResultSet resultSet = ExecuteQuery(sql, getConnection());
            
            if(resultSet.next()){
                resultSet.moveToInsertRow();
                resultSet.updateString("Username", user.getUsername());
                resultSet.updateString("Email", user.getEmail());
                resultSet.updateString("Password", user.getPassword());
                resultSet.updateString("JoinDate", user.getJoinDate());
                resultSet.updateRow();
            }
            connection.close();
        }
        catch (Exception e){
            System.out.println("Error with updating user: "+e);
        }
    }
    
    public static String GetJoinDate(String Username){
        String JoinDate = null;
        try{
           String sql = "SELECT JoinDate FROM Users WHERE Username='"+Username+"'";
           ResultSet resultSet = ExecuteQuery(sql, getConnection());
           
           if (resultSet.next()){
               JoinDate = resultSet.getString("JoinDate");
               return JoinDate;
           }
           resultSet.close();
           connection.close();
           
        }
        catch(Exception e){
            System.out.println("Error with gettng join date: "+e);
        }
        return JoinDate;
    }
    

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="SQL Statements To Do With Characters Table">
    
    public static void AddNewCharacter(Objects.Character character){
        try{
            String sql = "SELECT * FROM Characters";
            ResultSet resultSet = ExecuteQuery(sql, getConnection());
            
            if(resultSet.next()){
                resultSet.moveToInsertRow();
                //Primary Key - auto number
                resultSet.updateString("Username", character.getUsername());
                resultSet.updateString("Nickname", character.getNickname());
                resultSet.updateString("CharacterGender", character.getCharacterGender());
                resultSet.updateInt("ClassID", character.getClassID());
                resultSet.updateInt("DomainAmount", character.getDomainAmount());
                resultSet.updateString("LastDomainDate", character.getLastDomainDate());
                resultSet.insertRow();
            }
            
            System.out.println("Added successfully"); // for testing 
            
            resultSet.close();
            connection.close();
        }
        catch (Exception e){
            System.out.println("Error with adding new character: "+e);
        }
    }
    
    public static int CountingCharacters (String Username){
        int CharacterNumber = -1;
        
        try{
            String sql = "SELECT COUNT (*) AS myInt FROM Characters WHERE Username='"+Username+"'";
            ResultSet resultSet = ExecuteQuery(sql, getConnection());
            
            if(resultSet.next()){
                CharacterNumber = resultSet.getInt("myInt");
            }
            
            resultSet.close();
            connection.close();
            
        }
        catch (Exception e){
            System.out.println("Error with counting characters: "+e);
        }
        
        return CharacterNumber;
    }
    
    public static ArrayList<Objects.Character> GetAllUserCharacters(String Username){
        ArrayList<Objects.Character> UserCharacters = new ArrayList<>();
        try{
            String sql = "SELECT * FROM Characters WHERE Username='"+Username+"'";
            ResultSet resultSet = ExecuteQuery(sql, getConnection());
            
            while (resultSet.next()) {
                Objects.Character UserCharacter = new Objects.Character(resultSet.getInt("CharacterID"), resultSet.getString("Username"), resultSet.getString("Nickname"), resultSet.getString("CharacterGender"), resultSet.getInt("ClassID"), resultSet.getInt("DomainAmount"), resultSet.getString("LastDomainDate"));
                UserCharacters.add(UserCharacter);
            }
            connection.close();
            return UserCharacters;
        }
        catch (Exception e){
            System.out.println("Error with getting all user characters: "+e);
            return null;
        }
    }
    
    public static void UpdateCharacter (Objects.Character character){
        try{
            String sql = "SELECT * FROM Characters WHERE CharacterID='"+character.getCharacterID()+"'";
            ResultSet resultSet = ExecuteQuery(sql, getConnection());
            
            if(resultSet.next()){
                resultSet.moveToInsertRow();
                //CharacterID - autonumber?
                resultSet.updateInt("CharacterID", character.getCharacterID());
                resultSet.updateString("Username", character.getUsername());
                resultSet.updateString("Nickname", character.getNickname());
                resultSet.updateString("CharacterGender", character.getCharacterGender());
                resultSet.updateInt("ClassID", character.getClassID());
                resultSet.updateInt("DomainAmount", character.getDomainAmount());
                resultSet.updateString("LastDomainDate", character.getLastDomainDate());
                resultSet.updateRow();
            }
            connection.close();
        }
        catch (Exception e){
            System.out.println("Error with updating character: "+e);
        }
    }
    
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="SQL Statements To Do With Monsters Table">
    
    public static ArrayList<Objects.Monster> GetNormalMonsters(){
        ArrayList<Objects.Monster> NormalMonsters = new ArrayList<>();
        try{
        String sql = "SELECT * FROM Monsters WHERE MonsterType = 'Normal'";
        ResultSet resultSet = ExecuteQuery(sql, getConnection());
        
        while(resultSet.next()){
            Objects.Monster NextMonster = new Objects.Monster(resultSet.getInt("MonsterID"), resultSet.getString("MonsterName"), resultSet.getInt("MonsterHealth"), resultSet.getInt("MaxMonsterAttack"), resultSet.getInt("MinMonsterAttack"), resultSet.getString("MonsterType"));
            NormalMonsters.add(NextMonster);
        }
        
        connection.close();
        
        }catch(Exception e){
            System.out.println("Error with getting normal monsters: "+e);
        }
        
        return NormalMonsters;
        
    }
    
    public static ArrayList<Objects.Monster> GetCertainMonster(String Name){
        ArrayList<Objects.Monster> CertainMonster = new ArrayList<>();
        try{
            String sql = "SELECT * FROM Monsters WHERE MonsterName='"+Name+"'";
            ResultSet resultSet = ExecuteQuery(sql, getConnection());
            
            while(resultSet.next()){
                Objects.Monster NextMonster = new Objects.Monster(resultSet.getInt("MonsterID"), resultSet.getString("MonsterName"), resultSet.getInt("MonsterHealth"), resultSet.getInt("MaxMonsterAttack"), resultSet.getInt("MinMonsterAttack"), resultSet.getString("MonsterType"));
                CertainMonster.add(NextMonster);
            }
            
            connection.close();
        }
        catch (Exception e){
            System.out.println("Error with getting certain monsters: "+e);
        }
        return CertainMonster;
    }
    
    
    //</editor-fold>
}
