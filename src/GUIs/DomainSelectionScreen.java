package GUIs;

import java.awt.Toolkit;

public class DomainSelectionScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();

    private static int DomainAmount;
    private static String DomainDate;

    public static String DomainType;
    public static String MonsterName;

    public DomainSelectionScreen() {
        initComponents();

        ThreeDomainsErrorMessage.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ThreeDomainsErrorMessage = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        FearStart = new javax.swing.JButton();
        SunStart = new javax.swing.JButton();
        NightStart = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ThreeDomainsErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/3 Domains Played Message.jpg"))); // NOI18N
        getContentPane().add(ThreeDomainsErrorMessage);
        ThreeDomainsErrorMessage.setBounds(1520, 410, 300, 310);

        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(50, 50, 190, 70);

        FearStart.setBorderPainted(false);
        FearStart.setContentAreaFilled(false);
        FearStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FearStartActionPerformed(evt);
            }
        });
        getContentPane().add(FearStart);
        FearStart.setBounds(830, 210, 270, 130);

        SunStart.setBorderPainted(false);
        SunStart.setContentAreaFilled(false);
        SunStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SunStartActionPerformed(evt);
            }
        });
        getContentPane().add(SunStart);
        SunStart.setBounds(829, 555, 270, 120);

        NightStart.setBorderPainted(false);
        NightStart.setContentAreaFilled(false);
        NightStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NightStartActionPerformed(evt);
            }
        });
        getContentPane().add(NightStart);
        NightStart.setBounds(829, 885, 270, 120);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Domain Selection Screen.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(1, 6, 1930, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SunStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SunStartActionPerformed
        ThreeDomainsErrorMessage.setVisible(false);
        GetDomainVariables();
        boolean check = CheckDomainVariables(DomainAmount, DomainDate);

        if (check == true) {
            DomainType = "Sun";
            MonsterName = "Ghost";

            GUIs.ForestBattleScreen Battle = new GUIs.ForestBattleScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            Battle.setSize(WidthSize, HeightSize);
            Battle.setVisible(true);
            this.dispose();
        } else {
            ThreeDomainsErrorMessage.setVisible(true);
        }


    }//GEN-LAST:event_SunStartActionPerformed

    private void FearStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FearStartActionPerformed
        ThreeDomainsErrorMessage.setVisible(false);
        GetDomainVariables();
        boolean check = CheckDomainVariables(DomainAmount, DomainDate);

        if (check == true) {
            DomainType = "Fear";
            MonsterName = "Arachnid Queen";

            GUIs.ForestBattleScreen Battle = new GUIs.ForestBattleScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            Battle.setSize(WidthSize, HeightSize);
            Battle.setVisible(true);
            this.dispose();
        } else {
            ThreeDomainsErrorMessage.setVisible(true);
        }


    }//GEN-LAST:event_FearStartActionPerformed

    private void NightStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NightStartActionPerformed
        ThreeDomainsErrorMessage.setVisible(false);
        GetDomainVariables();
        boolean check = CheckDomainVariables(DomainAmount, DomainDate);

        if (check == true) {
            DomainType = "Night";
            MonsterName = "Vampire Overlord";

            GUIs.ForestBattleScreen Battle = new GUIs.ForestBattleScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            Battle.setSize(WidthSize, HeightSize);
            Battle.setVisible(true);
            this.dispose();
        } else {
            ThreeDomainsErrorMessage.setVisible(true);
        }


    }//GEN-LAST:event_NightStartActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        GUIs.ModeSelectionMenu ModeMenu = new GUIs.ModeSelectionMenu();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        ModeMenu.setSize(WidthSize, HeightSize);
        ModeMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DomainSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DomainSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DomainSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DomainSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DomainSelectionScreen().setVisible(true);
            }
        });
    }

    private void GetDomainVariables() {
        DomainAmount = Other.NEAGame.CurrentCharacter.get(0).getDomainAmount();
        DomainDate = Other.NEAGame.CurrentCharacter.get(0).getLastDomainDate();
    }

    private boolean CheckDomainVariables(int DomainAmount, String DomainDate) {
        String CurrentDate = Other.Utilities.GetCurrentDate();
        boolean DateCheck = CompareDomainDates(CurrentDate, DomainDate);
        boolean AmountCheck = CheckDomainAmount(DomainAmount);

        if (DateCheck == true && AmountCheck == true) {
            return false;
        } else {
            return true;
        }

    }

    private static boolean CheckDomainAmount(int DomainAmount) {
        if (DomainAmount == 3) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean CompareDomainDates(String CurrentDate, String PreviousDate) {
        if (CurrentDate.equals(PreviousDate)) {
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JButton FearStart;
    private javax.swing.JButton NightStart;
    private javax.swing.JButton SunStart;
    private javax.swing.JLabel ThreeDomainsErrorMessage;
    // End of variables declaration//GEN-END:variables
}
