
package Other;

import java.awt.Toolkit;
import java.util.ArrayList;

public class NEAGame {
    
    public static ArrayList <Objects.User> CurrentUser = new ArrayList<>();
    public static ArrayList <Objects.Character> CurrentCharacter = new ArrayList<>();

    
    public static void main(String[] args) {
        
    GUIs.StartUpScreen startup = new GUIs.StartUpScreen();
        
    Toolkit tk = Toolkit.getDefaultToolkit();
    int WidthSize = (int)tk.getScreenSize().getWidth();
    int HeightSize = (int)tk.getScreenSize().getHeight();
    
    
    //(width, height)
     startup.setSize(WidthSize,HeightSize);
     startup.setVisible(true);
        
        
    }
    
}
