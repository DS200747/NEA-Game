
package Objects;


public class Item {
    
    private int ItemID;
    private String ItemName;
    private String ItemType;
    private String Buff;
    private int BuffAmount;
    private String Domain;

    public Item(int ItemID, String ItemName, String ItemType, String Buff, int BuffAmount, String Domain) {
        this.ItemID = ItemID;
        this.ItemName = ItemName;
        this.ItemType = ItemType;
        this.Buff = Buff;
        this.BuffAmount = BuffAmount;
        this.Domain = Domain;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters">

    public int getItemID() {
        return ItemID;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getItemType() {
        return ItemType;
    }

    public String getBuff() {
        return Buff;
    }

    public int getBuffAmount() {
        return BuffAmount;
    }

    public String getDomain() {
        return Domain;
    }
    
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters">

    public void setItemID(int ItemID) {
        this.ItemID = ItemID;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    public void setBuff(String Buff) {
        this.Buff = Buff;
    }

    public void setBuffAmount(int BuffAmount) {
        this.BuffAmount = BuffAmount;
    }

    public void setDomain(String Domain) {
        this.Domain = Domain;
    }
    
    //</editor-fold>
    
}
