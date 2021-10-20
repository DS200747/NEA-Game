
package Objects;


public class CharacterClass {
    
   private int ClassID;
   private String ClassName;
   private int CharacterHealth;
   private int MaxCharacterAttack;
   private int MinCharacterAttack;

    public CharacterClass(int ClassID, String ClassName, int CharacterHealth, int MaxCharacterAttack, int MinCharacterAttack) {
        this.ClassID = ClassID;
        this.ClassName = ClassName;
        this.CharacterHealth = CharacterHealth;
        this.MaxCharacterAttack = MaxCharacterAttack;
        this.MinCharacterAttack = MinCharacterAttack;
    }
   
   // <editor-fold defaultstate="collapsed" desc="Getters"> 

    public int getClassID() {
        return ClassID;
    }

    public String getClassName() {
        return ClassName;
    }

    public int getCharacterHealth() {
        return CharacterHealth;
    }

    public int getMaxCharacterAttack() {
        return MaxCharacterAttack;
    }

    public int getMinCharacterAttack() {
        return MinCharacterAttack;
    }
    //</editor-fold>
    
   // <editor-fold defaultstate="collapsed" desc="Setters">

    public void setClassID(int ClassID) {
        this.ClassID = ClassID;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public void setCharacterHealth(int CharacterHealth) {
        this.CharacterHealth = CharacterHealth;
    }

    public void setMaxCharacterAttack(int MaxCharacterAttack) {
        this.MaxCharacterAttack = MaxCharacterAttack;
    }

    public void setMinCharacterAttack(int MinCharacterAttack) {
        this.MinCharacterAttack = MinCharacterAttack;
    }
    //</editor-fold>
    
    
}
