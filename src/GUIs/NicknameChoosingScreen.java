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
public class NicknameChoosingScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    public static String Nickname;
    
    
    public NicknameChoosingScreen() {
        initComponents();

        LongNicknameErrorMessage.setVisible(false);
        InappropriateNicknameErrorMessage.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NicknameField = new javax.swing.JTextField();
        ConfirmButton = new javax.swing.JButton();
        LongNicknameErrorMessage = new javax.swing.JLabel();
        InappropriateNicknameErrorMessage = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(NicknameField);
        NicknameField.setBounds(370, 500, 1180, 40);

        ConfirmButton.setBorderPainted(false);
        ConfirmButton.setContentAreaFilled(false);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmButton);
        ConfirmButton.setBounds(750, 830, 420, 180);

        LongNicknameErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Long Nickname Error Message.png"))); // NOI18N
        getContentPane().add(LongNicknameErrorMessage);
        LongNicknameErrorMessage.setBounds(710, 660, 480, 170);

        InappropriateNicknameErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Inappropriate Nickname Error Message.png"))); // NOI18N
        getContentPane().add(InappropriateNicknameErrorMessage);
        InappropriateNicknameErrorMessage.setBounds(700, 680, 450, 130);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Nickname Choosing Screen.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1920, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed

        Nickname = NicknameField.getText();
        boolean check = false;

        LongNicknameErrorMessage.setVisible(false);
        InappropriateNicknameErrorMessage.setVisible(false);
       

        while (true) {
            if (Nickname.length() > 25) {
                LongNicknameErrorMessage.setVisible(true);
                check = true;
                break;
            }
            
            String LoweredNickname = Nickname.toLowerCase();
            
            if (LoweredNickname.contains("dog") || LoweredNickname.contains("yellow") || LoweredNickname.contains("four")){
                InappropriateNicknameErrorMessage.setVisible(true);
                check = true;
                break;
            }
            
            break;
        }
        
        if (check == false){
            GUIs.ClassSelectionScreen ClassSelec = new GUIs.ClassSelectionScreen();
            
            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();
            
            ClassSelec.setSize(WidthSize, HeightSize);
            ClassSelec.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_ConfirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NicknameChoosingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NicknameChoosingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NicknameChoosingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NicknameChoosingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NicknameChoosingScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel InappropriateNicknameErrorMessage;
    private javax.swing.JLabel LongNicknameErrorMessage;
    private javax.swing.JTextField NicknameField;
    // End of variables declaration//GEN-END:variables
}
