
// label.setText(String.valueOf(variable));

package GUIs;

import java.awt.Toolkit;
import java.util.ArrayList;


public class SelectACharacterScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    int CharacterNumber = Other.SQLStatements.CountingCharacters(Other.NEAGame.CurrentUser.get(0).getUsername());
    
    
    public SelectACharacterScreen() {
        initComponents();
        
        FiveCharactersErrorMessage.setVisible(false);
        
        GreySquare1.setVisible(false);
        Label1.setVisible(false);
        GreySquare2.setVisible(false);
        Label2.setVisible(false);
        GreySquare3.setVisible(false);
        Label3.setVisible(false);
        GreySquare4.setVisible(false);
        Label4.setVisible(false);
        GreySquare5.setVisible(false);
        Label5.setVisible(false);
        
        
        ArrayList<Objects.Character> UserCharacters = Other.SQLStatements.GetAllUserCharacters(Other.NEAGame.CurrentUser.get(0).getUsername());
        
        switch (CharacterNumber){
                case 1:
                    GreySquare1.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    break;
                case 2:
                    GreySquare1.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    GreySquare2.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    break;
                case 3:
                    GreySquare1.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    GreySquare2.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    GreySquare3.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    break;
                case 4:
                    GreySquare1.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    GreySquare2.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    GreySquare3.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    GreySquare4.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    break;
                case 5:
                    GreySquare1.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    GreySquare2.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    GreySquare3.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    GreySquare4.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    GreySquare5.setVisible(true);
                    //MAKE LABEL VISIBLE WITH CHARACTER NAME
                    break;
                    
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        CreateANewCharacterButton = new javax.swing.JButton();
        FiveCharactersErrorMessage = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        GreySquare1 = new javax.swing.JButton();
        Label2 = new javax.swing.JLabel();
        GreySquare2 = new javax.swing.JButton();
        Label3 = new javax.swing.JLabel();
        GreySquare3 = new javax.swing.JButton();
        Label4 = new javax.swing.JLabel();
        GreySquare4 = new javax.swing.JButton();
        Label5 = new javax.swing.JLabel();
        GreySquare5 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(39, 45, 230, 100);

        CreateANewCharacterButton.setBorderPainted(false);
        CreateANewCharacterButton.setContentAreaFilled(false);
        CreateANewCharacterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateANewCharacterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateANewCharacterButton);
        CreateANewCharacterButton.setBounds(550, 950, 820, 110);

        FiveCharactersErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Five Characters Error Message.jpg"))); // NOI18N
        getContentPane().add(FiveCharactersErrorMessage);
        FiveCharactersErrorMessage.setBounds(720, 410, 500, 310);

        Label1.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        Label1.setText("1");
        getContentPane().add(Label1);
        Label1.setBounds(970, 250, 30, 70);

        GreySquare1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/SACS Grey Square.png"))); // NOI18N
        GreySquare1.setContentAreaFilled(false);
        getContentPane().add(GreySquare1);
        GreySquare1.setBounds(510, 230, 920, 110);

        Label2.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        Label2.setText("2");
        getContentPane().add(Label2);
        Label2.setBounds(970, 380, 30, 80);

        GreySquare2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/SACS Grey Square.png"))); // NOI18N
        GreySquare2.setContentAreaFilled(false);
        getContentPane().add(GreySquare2);
        GreySquare2.setBounds(510, 360, 920, 110);

        Label3.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        Label3.setText("3");
        getContentPane().add(Label3);
        Label3.setBounds(970, 520, 30, 60);

        GreySquare3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/SACS Grey Square.png"))); // NOI18N
        GreySquare3.setContentAreaFilled(false);
        getContentPane().add(GreySquare3);
        GreySquare3.setBounds(510, 490, 920, 110);

        Label4.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        Label4.setText("4");
        getContentPane().add(Label4);
        Label4.setBounds(970, 660, 30, 70);

        GreySquare4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/SACS Grey Square.png"))); // NOI18N
        GreySquare4.setContentAreaFilled(false);
        getContentPane().add(GreySquare4);
        GreySquare4.setBounds(510, 630, 920, 111);

        Label5.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        Label5.setText("5");
        getContentPane().add(Label5);
        Label5.setBounds(970, 780, 30, 60);

        GreySquare5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/SACS Grey Square.png"))); // NOI18N
        GreySquare5.setContentAreaFilled(false);
        getContentPane().add(GreySquare5);
        GreySquare5.setBounds(510, 760, 920, 110);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Select a Character Screen.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1920, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        
        GUIs.LoginScreen login = new GUIs.LoginScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        //(width, height)
        login.setSize(WidthSize, HeightSize);
        login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CreateANewCharacterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateANewCharacterButtonActionPerformed
         if(CharacterNumber >= 5){
            FiveCharactersErrorMessage.setVisible(true);
            Other.Utilities.wait(4000);
        }else{
            GUIs.NicknameChoosingScreen nicknameChoosing = new GUIs.NicknameChoosingScreen();
            
            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();
            
            nicknameChoosing.setSize(WidthSize, HeightSize);
            nicknameChoosing.setVisible(true);
            this.dispose();
        }
        
        
        
    }//GEN-LAST:event_CreateANewCharacterButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectACharacterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectACharacterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectACharacterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectACharacterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectACharacterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JButton CreateANewCharacterButton;
    private javax.swing.JLabel FiveCharactersErrorMessage;
    private javax.swing.JButton GreySquare1;
    private javax.swing.JButton GreySquare2;
    private javax.swing.JButton GreySquare3;
    private javax.swing.JButton GreySquare4;
    private javax.swing.JButton GreySquare5;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    // End of variables declaration//GEN-END:variables
}
