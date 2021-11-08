
package GUIs;

import java.awt.Toolkit;

public class CharacterSettings extends javax.swing.JFrame {
    
    Toolkit tk = Toolkit.getDefaultToolkit();

    public CharacterSettings() {
        initComponents();
        
        NicknameSection.setVisible(false);
        NicknameField.setVisible(false);
        NicknameConfirmButton.setVisible(false);
        LongNicknameErrorMessage.setVisible(false);
        InappropriateNicknameErrorMessage.setVisible(false);
        NicknameChangedSuccessfullyMessage.setVisible(false);
        
        GenderSection.setVisible(false);
        MaleButton.setVisible(false);
        FemaleButton.setVisible(false);
        OtherButton.setVisible(false);
        GenderChangedSuccessfullyMessage.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderChangedSuccessfullyMessage = new javax.swing.JLabel();
        NicknameChangedSuccessfullyMessage = new javax.swing.JLabel();
        InappropriateNicknameErrorMessage = new javax.swing.JLabel();
        LongNicknameErrorMessage = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        GenderButton = new javax.swing.JButton();
        NicknameButton = new javax.swing.JButton();
        FemaleButton = new javax.swing.JButton();
        MaleButton = new javax.swing.JButton();
        OtherButton = new javax.swing.JButton();
        GenderSection = new javax.swing.JLabel();
        NicknameConfirmButton = new javax.swing.JButton();
        NicknameField = new javax.swing.JTextField();
        NicknameSection = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        GenderChangedSuccessfullyMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Gender Changed Successfully Message.png"))); // NOI18N
        getContentPane().add(GenderChangedSuccessfullyMessage);
        GenderChangedSuccessfullyMessage.setBounds(710, 580, 420, 130);

        NicknameChangedSuccessfullyMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Nickname Changed Successfully Message.png"))); // NOI18N
        getContentPane().add(NicknameChangedSuccessfullyMessage);
        NicknameChangedSuccessfullyMessage.setBounds(710, 760, 440, 140);

        InappropriateNicknameErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Inappropriate Nickname Error Message.png"))); // NOI18N
        InappropriateNicknameErrorMessage.setToolTipText("");
        getContentPane().add(InappropriateNicknameErrorMessage);
        InappropriateNicknameErrorMessage.setBounds(720, 790, 420, 110);

        LongNicknameErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Long Nickname Error Message.png"))); // NOI18N
        getContentPane().add(LongNicknameErrorMessage);
        LongNicknameErrorMessage.setBounds(700, 810, 470, 70);

        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(39, 55, 190, 70);

        GenderButton.setBorderPainted(false);
        GenderButton.setContentAreaFilled(false);
        GenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(GenderButton);
        GenderButton.setBounds(1199, 245, 310, 150);

        NicknameButton.setBorderPainted(false);
        NicknameButton.setContentAreaFilled(false);
        NicknameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NicknameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NicknameButton);
        NicknameButton.setBounds(429, 245, 320, 150);

        FemaleButton.setBorderPainted(false);
        FemaleButton.setContentAreaFilled(false);
        FemaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FemaleButton);
        FemaleButton.setBounds(770, 890, 380, 170);

        MaleButton.setBorderPainted(false);
        MaleButton.setContentAreaFilled(false);
        MaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MaleButton);
        MaleButton.setBounds(139, 895, 370, 170);

        OtherButton.setBorderPainted(false);
        OtherButton.setContentAreaFilled(false);
        OtherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OtherButton);
        OtherButton.setBounds(1399, 885, 380, 170);

        GenderSection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Change Gender Section.jpg"))); // NOI18N
        getContentPane().add(GenderSection);
        GenderSection.setBounds(0, 420, 1930, 680);

        NicknameConfirmButton.setBorderPainted(false);
        NicknameConfirmButton.setContentAreaFilled(false);
        NicknameConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NicknameConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NicknameConfirmButton);
        NicknameConfirmButton.setBounds(770, 890, 380, 170);
        getContentPane().add(NicknameField);
        NicknameField.setBounds(139, 552, 1640, 70);

        NicknameSection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Change Nickname Section.jpg"))); // NOI18N
        getContentPane().add(NicknameSection);
        NicknameSection.setBounds(0, 410, 1930, 690);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Change Character Details Base.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(1, -4, 1930, 1100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        GUIs.NormalSettings normalSettings = new GUIs.NormalSettings();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        normalSettings.setSize(WidthSize, HeightSize);
        normalSettings.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void NicknameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NicknameButtonActionPerformed
        NicknameSection.setVisible(true);
        NicknameField.setVisible(true);
        NicknameConfirmButton.setVisible(true);
        
        LongNicknameErrorMessage.setVisible(false);
        InappropriateNicknameErrorMessage.setVisible(false);
        NicknameChangedSuccessfullyMessage.setVisible(false);
        
        GenderSection.setVisible(false);
        MaleButton.setVisible(false);
        FemaleButton.setVisible(false);
        OtherButton.setVisible(false);
        GenderChangedSuccessfullyMessage.setVisible(false);
    }//GEN-LAST:event_NicknameButtonActionPerformed

    private void NicknameConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NicknameConfirmButtonActionPerformed
        LongNicknameErrorMessage.setVisible(false);
        InappropriateNicknameErrorMessage.setVisible(false);
        NicknameChangedSuccessfullyMessage.setVisible(false);
        
        String NewNickname = NicknameField.getText();
        boolean check = false;
        
        while (true) {
            if (NewNickname.length() > 25) {
                LongNicknameErrorMessage.setVisible(true);
                check = true;
                break;
            }
            
            String LoweredNickname = NewNickname.toLowerCase();
            
            if (LoweredNickname.contains("dog") || LoweredNickname.contains("yellow") || LoweredNickname.contains("four")){
                InappropriateNicknameErrorMessage.setVisible(true);
                check = true;
                break;
            }
            
            break;
        }
        
        if (check == false){
            Objects.Character ChangedNickname = new Objects.Character(Other.NEAGame.CurrentCharacter.get(0).getCharacterID(), Other.NEAGame.CurrentCharacter.get(0).getUsername(), NewNickname, Other.NEAGame.CurrentCharacter.get(0).getCharacterGender(), Other.NEAGame.CurrentCharacter.get(0).getClassID(), Other.NEAGame.CurrentCharacter.get(0).getDomainAmount(), Other.NEAGame.CurrentCharacter.get(0).getLastDomainDate());
            Other.SQLStatements.UpdateCharacter(ChangedNickname);
            Other.Utilities.UpdateCurrentCharacter(ChangedNickname);
            
            NicknameChangedSuccessfullyMessage.setVisible(true);
        }
        
        
    }//GEN-LAST:event_NicknameConfirmButtonActionPerformed

    private void GenderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderButtonActionPerformed
        GenderSection.setVisible(true);
        MaleButton.setVisible(true);
        FemaleButton.setVisible(true);
        OtherButton.setVisible(true);
        
        NicknameSection.setVisible(false);
        NicknameField.setVisible(false);
        NicknameConfirmButton.setVisible(false);
        LongNicknameErrorMessage.setVisible(false);
        InappropriateNicknameErrorMessage.setVisible(false);
        NicknameChangedSuccessfullyMessage.setVisible(false);
    }//GEN-LAST:event_GenderButtonActionPerformed

    private void MaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleButtonActionPerformed
        GenderChangedSuccessfullyMessage.setVisible(false);
        
        String NewGender = "male";
        
        Objects.Character ChangedGender = new Objects.Character(Other.NEAGame.CurrentCharacter.get(0).getCharacterID(), Other.NEAGame.CurrentCharacter.get(0).getUsername(), Other.NEAGame.CurrentCharacter.get(0).getNickname(), NewGender, Other.NEAGame.CurrentCharacter.get(0).getClassID(), Other.NEAGame.CurrentCharacter.get(0).getDomainAmount(), Other.NEAGame.CurrentCharacter.get(0).getLastDomainDate());
        Other.SQLStatements.UpdateCharacter(ChangedGender);
        Other.Utilities.UpdateCurrentCharacter(ChangedGender);
        GenderChangedSuccessfullyMessage.setVisible(true);
    }//GEN-LAST:event_MaleButtonActionPerformed

    private void FemaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleButtonActionPerformed
        GenderChangedSuccessfullyMessage.setVisible(false);
        
        String NewGender = "female";
        
        Objects.Character ChangedGender = new Objects.Character(Other.NEAGame.CurrentCharacter.get(0).getCharacterID(), Other.NEAGame.CurrentCharacter.get(0).getUsername(), Other.NEAGame.CurrentCharacter.get(0).getNickname(), NewGender, Other.NEAGame.CurrentCharacter.get(0).getClassID(), Other.NEAGame.CurrentCharacter.get(0).getDomainAmount(), Other.NEAGame.CurrentCharacter.get(0).getLastDomainDate());
        Other.SQLStatements.UpdateCharacter(ChangedGender);
        Other.Utilities.UpdateCurrentCharacter(ChangedGender);
        GenderChangedSuccessfullyMessage.setVisible(true);
    }//GEN-LAST:event_FemaleButtonActionPerformed

    private void OtherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherButtonActionPerformed
        GenderChangedSuccessfullyMessage.setVisible(false);
        
        String NewGender = "other";
        
        Objects.Character ChangedGender = new Objects.Character(Other.NEAGame.CurrentCharacter.get(0).getCharacterID(), Other.NEAGame.CurrentCharacter.get(0).getUsername(), Other.NEAGame.CurrentCharacter.get(0).getNickname(), NewGender, Other.NEAGame.CurrentCharacter.get(0).getClassID(), Other.NEAGame.CurrentCharacter.get(0).getDomainAmount(), Other.NEAGame.CurrentCharacter.get(0).getLastDomainDate());
        Other.SQLStatements.UpdateCharacter(ChangedGender);
        Other.Utilities.UpdateCurrentCharacter(ChangedGender);
        GenderChangedSuccessfullyMessage.setVisible(true);
    }//GEN-LAST:event_OtherButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CharacterSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacterSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacterSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacterSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharacterSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton FemaleButton;
    private javax.swing.JButton GenderButton;
    private javax.swing.JLabel GenderChangedSuccessfullyMessage;
    private javax.swing.JLabel GenderSection;
    private javax.swing.JLabel InappropriateNicknameErrorMessage;
    private javax.swing.JLabel LongNicknameErrorMessage;
    private javax.swing.JButton MaleButton;
    private javax.swing.JButton NicknameButton;
    private javax.swing.JLabel NicknameChangedSuccessfullyMessage;
    private javax.swing.JButton NicknameConfirmButton;
    private javax.swing.JTextField NicknameField;
    private javax.swing.JLabel NicknameSection;
    private javax.swing.JButton OtherButton;
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables
}
