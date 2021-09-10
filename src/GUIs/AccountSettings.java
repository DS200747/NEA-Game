/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.awt.Toolkit;

/**
 *
 * @author daisy
 */
public class AccountSettings extends javax.swing.JFrame {
    
    Toolkit tk = Toolkit.getDefaultToolkit();

    /**
     * Creates new form AccountSettings
     */
    public AccountSettings() {
        initComponents();
        
        UsernameSection.setVisible(false);
        UsernameField.setVisible(false);
        UsernameConfirmButton.setVisible(false);
        
        PasswordSection.setVisible(false);
        CurrentPasswordField.setVisible(false);
        NewPasswordField.setVisible(false);
        PasswordConfirmButton.setVisible(false);
        
        EmailSection.setVisible(false);
        EmailField.setVisible(false);
        EmailConfirmButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmailConfirmButton = new javax.swing.JButton();
        EmailField = new javax.swing.JTextField();
        EmailSection = new javax.swing.JLabel();
        PasswordConfirmButton = new javax.swing.JButton();
        NewPasswordField = new javax.swing.JTextField();
        CurrentPasswordField = new javax.swing.JTextField();
        PasswordSection = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        UsernameButton = new javax.swing.JButton();
        PasswordButton = new javax.swing.JButton();
        EmailButton = new javax.swing.JButton();
        UsernameField = new javax.swing.JTextField();
        UsernameConfirmButton = new javax.swing.JButton();
        UsernameSection = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        EmailConfirmButton.setBorderPainted(false);
        EmailConfirmButton.setContentAreaFilled(false);
        EmailConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EmailConfirmButton);
        EmailConfirmButton.setBounds(790, 890, 370, 170);

        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailField);
        EmailField.setBounds(150, 550, 1640, 70);

        EmailSection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Change Email Section.jpg"))); // NOI18N
        getContentPane().add(EmailSection);
        EmailSection.setBounds(10, 420, 1910, 673);

        PasswordConfirmButton.setBorderPainted(false);
        PasswordConfirmButton.setContentAreaFilled(false);
        PasswordConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordConfirmButton);
        PasswordConfirmButton.setBounds(779, 885, 380, 180);
        getContentPane().add(NewPasswordField);
        NewPasswordField.setBounds(150, 700, 1640, 60);
        getContentPane().add(CurrentPasswordField);
        CurrentPasswordField.setBounds(150, 550, 1640, 70);

        PasswordSection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Change Password Section.jpg"))); // NOI18N
        getContentPane().add(PasswordSection);
        PasswordSection.setBounds(10, 430, 1910, 650);

        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(40, 60, 190, 70);

        UsernameButton.setBorderPainted(false);
        UsernameButton.setContentAreaFilled(false);
        UsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameButton);
        UsernameButton.setBounds(209, 245, 310, 140);

        PasswordButton.setBorderPainted(false);
        PasswordButton.setContentAreaFilled(false);
        PasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordButton);
        PasswordButton.setBounds(809, 245, 300, 150);

        EmailButton.setBorderPainted(false);
        EmailButton.setContentAreaFilled(false);
        EmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EmailButton);
        EmailButton.setBounds(1419, 255, 310, 140);
        getContentPane().add(UsernameField);
        UsernameField.setBounds(149, 552, 1640, 60);

        UsernameConfirmButton.setBorderPainted(false);
        UsernameConfirmButton.setContentAreaFilled(false);
        UsernameConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameConfirmButton);
        UsernameConfirmButton.setBounds(789, 885, 370, 170);

        UsernameSection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Change Username Section.jpg"))); // NOI18N
        getContentPane().add(UsernameSection);
        UsernameSection.setBounds(10, 400, 1880, 700);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Change Account Details Base.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(1, 6, 1930, 1090);

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

    private void UsernameConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameConfirmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameConfirmButtonActionPerformed

    private void UsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameButtonActionPerformed
        UsernameSection.setVisible(true);
        UsernameField.setVisible(true);
        UsernameConfirmButton.setVisible(true);
    }//GEN-LAST:event_UsernameButtonActionPerformed

    private void PasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordButtonActionPerformed
        PasswordSection.setVisible(true);
        CurrentPasswordField.setVisible(true);
        NewPasswordField.setVisible(true);
        PasswordConfirmButton.setVisible(true);
    }//GEN-LAST:event_PasswordButtonActionPerformed

    private void PasswordConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordConfirmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordConfirmButtonActionPerformed

    private void EmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailButtonActionPerformed
        EmailSection.setVisible(true);
        EmailField.setVisible(true);
        EmailConfirmButton.setVisible(true);
    }//GEN-LAST:event_EmailButtonActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void EmailConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailConfirmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailConfirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JTextField CurrentPasswordField;
    private javax.swing.JButton EmailButton;
    private javax.swing.JButton EmailConfirmButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailSection;
    private javax.swing.JTextField NewPasswordField;
    private javax.swing.JButton PasswordButton;
    private javax.swing.JButton PasswordConfirmButton;
    private javax.swing.JLabel PasswordSection;
    private javax.swing.JButton UsernameButton;
    private javax.swing.JButton UsernameConfirmButton;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameSection;
    // End of variables declaration//GEN-END:variables
}