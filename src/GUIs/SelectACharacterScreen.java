
// label.setText(String.valueOf(variable));

package GUIs;

import GUIs.*;
import java.awt.Toolkit;
import java.util.ArrayList;


public class SelectACharacterScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    int CharacterNumber = Other.SQLStatements.CountingCharacters(Other.NEAGame.CurrentUser.get(0).getUsername());
    ArrayList<Objects.Character> UserCharacters = Other.SQLStatements.GetAllUserCharacters(Other.NEAGame.CurrentUser.get(0).getUsername());
    
    public SelectACharacterScreen() {
        initComponents();
        
        FiveCharactersErrorMessage.setVisible(false);
        
        GreySquare1.setVisible(false);
        GreySquare2.setVisible(false);
        GreySquare3.setVisible(false);
        GreySquare4.setVisible(false);
        GreySquare5.setVisible(false);
        
        
        
        
        switch (CharacterNumber){
                case 1:
                    GreySquare1.setVisible(true);
                    GreySquare1.setText(UserCharacters.get(0).getNickname());
                    break;
                case 2:
                    GreySquare1.setVisible(true);
                    GreySquare1.setText(UserCharacters.get(0).getNickname());
                    GreySquare2.setVisible(true);
                    GreySquare2.setText(UserCharacters.get(1).getNickname());
                    break;
                case 3:
                    GreySquare1.setVisible(true);
                    GreySquare1.setText(UserCharacters.get(0).getNickname());
                    GreySquare2.setVisible(true);
                    GreySquare2.setText(UserCharacters.get(1).getNickname());
                    GreySquare3.setVisible(true);
                    GreySquare3.setText(UserCharacters.get(2).getNickname());
                    break;
                case 4:
                    GreySquare1.setVisible(true);
                    GreySquare1.setText(UserCharacters.get(0).getNickname());
                    GreySquare2.setVisible(true);
                    GreySquare2.setText(UserCharacters.get(1).getNickname());
                    GreySquare3.setVisible(true);
                    GreySquare3.setText(UserCharacters.get(2).getNickname());
                    GreySquare4.setVisible(true);
                    GreySquare4.setText(UserCharacters.get(3).getNickname());
                    break;
                case 5:
                    GreySquare1.setVisible(true);
                    GreySquare1.setText(UserCharacters.get(0).getNickname());
                    GreySquare2.setVisible(true);
                    GreySquare2.setText(UserCharacters.get(1).getNickname());
                    GreySquare3.setVisible(true);
                    GreySquare3.setText(UserCharacters.get(2).getNickname());
                    GreySquare4.setVisible(true);
                    GreySquare4.setText(UserCharacters.get(3).getNickname());
                    GreySquare5.setVisible(true);
                    GreySquare5.setText(UserCharacters.get(4).getNickname());
                    break;
                case -1:
                    System.out.println("Error with counting characters/ formatting grey squares.");
                    break;
                    
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        FiveCharactersErrorMessage = new javax.swing.JLabel();
        CreateANewCharacterButton = new javax.swing.JButton();
        GreySquare1 = new javax.swing.JButton();
        GreySquare2 = new javax.swing.JButton();
        GreySquare3 = new javax.swing.JButton();
        GreySquare4 = new javax.swing.JButton();
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

        FiveCharactersErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Five Characters Error Message.jpg"))); // NOI18N
        getContentPane().add(FiveCharactersErrorMessage);
        FiveCharactersErrorMessage.setBounds(1530, 400, 300, 310);

        CreateANewCharacterButton.setBorderPainted(false);
        CreateANewCharacterButton.setContentAreaFilled(false);
        CreateANewCharacterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateANewCharacterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateANewCharacterButton);
        CreateANewCharacterButton.setBounds(550, 950, 820, 110);

        GreySquare1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        GreySquare1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/SACS Grey Square.png"))); // NOI18N
        GreySquare1.setBorderPainted(false);
        GreySquare1.setContentAreaFilled(false);
        GreySquare1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GreySquare1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreySquare1ActionPerformed(evt);
            }
        });
        getContentPane().add(GreySquare1);
        GreySquare1.setBounds(510, 230, 920, 110);

        GreySquare2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        GreySquare2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/SACS Grey Square.png"))); // NOI18N
        GreySquare2.setBorderPainted(false);
        GreySquare2.setContentAreaFilled(false);
        GreySquare2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GreySquare2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreySquare2ActionPerformed(evt);
            }
        });
        getContentPane().add(GreySquare2);
        GreySquare2.setBounds(510, 360, 920, 110);

        GreySquare3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        GreySquare3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/SACS Grey Square.png"))); // NOI18N
        GreySquare3.setBorderPainted(false);
        GreySquare3.setContentAreaFilled(false);
        GreySquare3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GreySquare3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreySquare3ActionPerformed(evt);
            }
        });
        getContentPane().add(GreySquare3);
        GreySquare3.setBounds(510, 490, 920, 110);

        GreySquare4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        GreySquare4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/SACS Grey Square.png"))); // NOI18N
        GreySquare4.setBorderPainted(false);
        GreySquare4.setContentAreaFilled(false);
        GreySquare4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GreySquare4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreySquare4ActionPerformed(evt);
            }
        });
        getContentPane().add(GreySquare4);
        GreySquare4.setBounds(510, 630, 920, 111);

        GreySquare5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        GreySquare5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/SACS Grey Square.png"))); // NOI18N
        GreySquare5.setBorderPainted(false);
        GreySquare5.setContentAreaFilled(false);
        GreySquare5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GreySquare5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreySquare5ActionPerformed(evt);
            }
        });
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

        login.setSize(WidthSize, HeightSize);
        login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CreateANewCharacterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateANewCharacterButtonActionPerformed
         FiveCharactersErrorMessage.setVisible(false);
        
        if(CharacterNumber >= 5){
            FiveCharactersErrorMessage.setVisible(true);
        }else{
            GUIs.NicknameChoosingScreen nicknameChoosing = new GUIs.NicknameChoosingScreen();
            
            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();
            
            nicknameChoosing.setSize(WidthSize, HeightSize);
            nicknameChoosing.setVisible(true);
            this.dispose();
        }
        
        
        
    }//GEN-LAST:event_CreateANewCharacterButtonActionPerformed

    private void GreySquare1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreySquare1ActionPerformed
        Other.Utilities.UpdateCurrentCharacter(UserCharacters.get(0));
        
        GUIs.ModeSelectionMenu ModeMenu = new GUIs.ModeSelectionMenu();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        ModeMenu.setSize(WidthSize, HeightSize);
        ModeMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GreySquare1ActionPerformed

    private void GreySquare2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreySquare2ActionPerformed
        Other.Utilities.UpdateCurrentCharacter(UserCharacters.get(1));
        
        GUIs.ModeSelectionMenu ModeMenu = new GUIs.ModeSelectionMenu();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        ModeMenu.setSize(WidthSize, HeightSize);
        ModeMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GreySquare2ActionPerformed

    private void GreySquare3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreySquare3ActionPerformed
        Other.Utilities.UpdateCurrentCharacter(UserCharacters.get(2));
        
        GUIs.ModeSelectionMenu ModeMenu = new GUIs.ModeSelectionMenu();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        ModeMenu.setSize(WidthSize, HeightSize);
        ModeMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GreySquare3ActionPerformed

    private void GreySquare4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreySquare4ActionPerformed
        Other.Utilities.UpdateCurrentCharacter(UserCharacters.get(3));
        
        GUIs.ModeSelectionMenu ModeMenu = new GUIs.ModeSelectionMenu();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        ModeMenu.setSize(WidthSize, HeightSize);
        ModeMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GreySquare4ActionPerformed

    private void GreySquare5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreySquare5ActionPerformed
        Other.Utilities.UpdateCurrentCharacter(UserCharacters.get(4));
        
        GUIs.ModeSelectionMenu ModeMenu = new GUIs.ModeSelectionMenu();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        ModeMenu.setSize(WidthSize, HeightSize);
        ModeMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GreySquare5ActionPerformed

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
    // End of variables declaration//GEN-END:variables
}
