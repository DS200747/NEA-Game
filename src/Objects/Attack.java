
package Objects;


public class Attack {
    
    int AttackID;
    String AttackName;
    String AttackType;
    int CLassID;
    int DamageMultiplier;

    public Attack(int AttackID, String AttackName, String AttackType, int CLassID, int DamageMultiplier) {
        this.AttackID = AttackID;
        this.AttackName = AttackName;
        this.AttackType = AttackType;
        this.CLassID = CLassID;
        this.DamageMultiplier = DamageMultiplier;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters">

    public int getAttackID() {
        return AttackID;
    }

    public String getAttackName() {
        return AttackName;
    }

    public String getAttackType() {
        return AttackType;
    }

    public int getCLassID() {
        return CLassID;
    }

    public int getDamageMultiplier() {
        return DamageMultiplier;
    }
    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setAttackID(int AttackID) {
        this.AttackID = AttackID;
    }

    public void setAttackName(String AttackName) {
        this.AttackName = AttackName;
    }

    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    public void setCLassID(int CLassID) {
        this.CLassID = CLassID;
    }

    public void setDamageMultiplier(int DamageMultiplier) {
        this.DamageMultiplier = DamageMultiplier;
    }
    //</editor-fold>
}
