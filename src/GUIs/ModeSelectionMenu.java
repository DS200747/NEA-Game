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
public class ModeSelectionMenu extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    
    public ModeSelectionMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoutButton = new javax.swing.JButton();
        StoryModeButton = new javax.swing.JButton();
        LevelModeButton = new javax.swing.JButton();
        DailyModeButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LogoutButton.setBorderPainted(false);
        LogoutButton.setContentAreaFilled(false);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton);
        LogoutButton.setBounds(29, 45, 260, 80);

        StoryModeButton.setBorderPainted(false);
        StoryModeButton.setContentAreaFilled(false);
        getContentPane().add(StoryModeButton);
        StoryModeButton.setBounds(639, 145, 640, 180);

        LevelModeButton.setBorderPainted(false);
        LevelModeButton.setContentAreaFilled(false);
        LevelModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelModeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LevelModeButton);
        LevelModeButton.setBounds(630, 370, 660, 180);

        DailyModeButton.setBorderPainted(false);
        DailyModeButton.setContentAreaFilled(false);
        DailyModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DailyModeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DailyModeButton);
        DailyModeButton.setBounds(629, 595, 660, 180);

        SettingsButton.setBorderPainted(false);
        SettingsButton.setContentAreaFilled(false);
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SettingsButton);
        SettingsButton.setBounds(629, 815, 660, 170);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Mode Selection Menu.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(1, 6, 1930, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        
         GUIs.StartUpScreen startup = new GUIs.StartUpScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        startup.setSize(WidthSize, HeightSize);
        startup.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
        
        GUIs.NormalSettings normalSettings = new GUIs.NormalSettings();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        normalSettings.setSize(WidthSize, HeightSize);
        normalSettings.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_SettingsButtonActionPerformed

    private void DailyModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DailyModeButtonActionPerformed
        
       GUIs.DomainSelectionScreen domains = new GUIs.DomainSelectionScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        domains.setSize(WidthSize, HeightSize);
        domains.setVisible(true);
        this.dispose(); 
        
        
    }//GEN-LAST:event_DailyModeButtonActionPerformed

    private void LevelModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelModeButtonActionPerformed
        
        GUIs.LevelModeSelectionScreen LevelModeSelection = new GUIs.LevelModeSelectionScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        LevelModeSelection.setSize(WidthSize, HeightSize);
        LevelModeSelection.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_LevelModeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ModeSelectionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeSelectionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeSelectionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeSelectionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeSelectionMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DailyModeButton;
    private javax.swing.JButton LevelModeButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton StoryModeButton;
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables
}
