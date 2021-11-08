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
public class LevelModeSelectionScreen extends javax.swing.JFrame {
    
    Toolkit tk = Toolkit.getDefaultToolkit();

    public LevelModeSelectionScreen() {
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

        BackButton = new javax.swing.JButton();
        PlayButton = new javax.swing.JButton();
        LeaderBoardButton = new javax.swing.JButton();
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
        BackButton.setBounds(49, 45, 200, 70);

        PlayButton.setBorderPainted(false);
        PlayButton.setContentAreaFilled(false);
        getContentPane().add(PlayButton);
        PlayButton.setBounds(579, 355, 760, 190);

        LeaderBoardButton.setBorderPainted(false);
        LeaderBoardButton.setContentAreaFilled(false);
        LeaderBoardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaderBoardButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LeaderBoardButton);
        LeaderBoardButton.setBounds(580, 640, 760, 190);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Level Mode Selection Screen.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(1, -4, 1930, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        
        GUIs.ModeSelectionMenu ModeMenu = new GUIs.ModeSelectionMenu();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        ModeMenu.setSize(WidthSize, HeightSize);
        ModeMenu.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BackButtonActionPerformed

    private void LeaderBoardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaderBoardButtonActionPerformed
        
        GUIs.LeaderBoardScreen leaderBoard = new GUIs.LeaderBoardScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        leaderBoard.setSize(WidthSize, HeightSize);
        leaderBoard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LeaderBoardButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LevelModeSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelModeSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelModeSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelModeSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelModeSelectionScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JButton LeaderBoardButton;
    private javax.swing.JButton PlayButton;
    // End of variables declaration//GEN-END:variables
}
