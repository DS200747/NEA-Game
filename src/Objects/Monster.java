
package Objects;

import java.util.Random;


public class Monster {  
    
public static Random rand = new Random();    

private int MonsterID;
private String MonsterName;
private int MonsterHealth;
private int MaxMonsterAttack;
private int MinMonsterAttack;
private String MonsterType;

    public Monster(int MonsterID, String MonsterName, int MonsterHealth, int MaxMonsterAttack, int MinMonsterAttack, String MonsterType) {
        this.MonsterID = MonsterID;
        this.MonsterName = MonsterName;
        this.MonsterHealth = MonsterHealth;
        this.MaxMonsterAttack = MaxMonsterAttack;
        this.MinMonsterAttack = MinMonsterAttack;
        this.MonsterType = MonsterType;
    }

// <editor-fold defaultstate="collapsed" desc="Getters">

    public int getMonsterID() {
        return MonsterID;
    }

    public String getMonsterName() {
        return MonsterName;
    }

    public int getMonsterHealth() {
        return MonsterHealth;
    }

    public int getMaxMonsterAttack() {
        return MaxMonsterAttack;
    }

    public int getMinMonsterAttack() {
        return MinMonsterAttack;
    }

    public String getMonsterType() {
        return MonsterType;
    }
    
    //</editor-fold>
    
// <editor-fold defaultstate="collapsed" desc="Setters">

    public void setMonsterID(int MonsterID) {
        this.MonsterID = MonsterID;
    }

    public void setMonsterName(String MonsterName) {
        this.MonsterName = MonsterName;
    }

    public void setMonsterHealth(int MonsterHealth) {
        this.MonsterHealth = MonsterHealth;
    }

    public void setMaxMonsterAttack(int MaxMonsterAttack) {
        this.MaxMonsterAttack = MaxMonsterAttack;
    }

    public void setMinMonsterAttack(int MinMonsterAttack) {
        this.MinMonsterAttack = MinMonsterAttack;
    }

    public void setMonsterType(String MonsterType) {
        this.MonsterType = MonsterType;
    }
    
    //</editor-fold>
    
// <editor-fold defaultstate="collapsed" desc="Other Monster Functions">
    
    public static int GenerateAttackPower(Objects.Monster CurrentMonster){
        int MaxAttack = CurrentMonster.getMaxMonsterAttack();
        int MinAttack = CurrentMonster.getMinMonsterAttack();
        
        int Attack = (rand.nextInt(MaxAttack-MinAttack)+MinAttack)+1;
        return Attack;
    }
    
//</editor-fold>
}
