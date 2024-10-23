/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.retrofighters.arcade;

import com.retrofighters.arcade.controllers.EmulatorController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
/**
 *
 * @author Retro Fighters
 */
public class MainPage extends javax.swing.JFrame {

    private static int selectedGame = 0;
    private static ArrayList<Game> gameList = new ArrayList<>();
    /**
     * Creates new form Arcade
     */
    public MainPage() throws FontFormatException, IOException {
        initComponents();
        
        Game game = new Game();
        Emulator emu = new Emulator();
        
        emu.initializeData();
        game.initializeData();
        gameList = game.gameList();

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnIniciarJuego = new javax.swing.JButton();
        btnAdminPanel = new javax.swing.JButton();
        btnPreviousGame = new javax.swing.JButton();
        btnNextGame1 = new javax.swing.JButton();
        PanelNES = new javax.swing.JPanel();
        NESimg = new javax.swing.JLabel();
        lblNES = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciarJuego.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIniciarJuego.setText("Iniciar Sistema");
        btnIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarJuegoActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, 175, 71));

        btnAdminPanel.setText("Acceso Admin");
        btnAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminPanelActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, -1, -1));

        btnPreviousGame.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPreviousGame.setText("<-");
        btnPreviousGame.setToolTipText("");
        btnPreviousGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousGameActionPerformed(evt);
            }
        });
        jPanel1.add(btnPreviousGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, -1, -1));

        btnNextGame1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNextGame1.setText("->");
        btnNextGame1.setToolTipText("");
        btnNextGame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextGame1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNextGame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 620, -1, -1));

        NESimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/retrofighters/arcade/assets/gifs/NES 300 x 200.gif"))); // NOI18N

        lblNES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/retrofighters/arcade/assets/titles/NES Title.png"))); // NOI18N

        javax.swing.GroupLayout PanelNESLayout = new javax.swing.GroupLayout(PanelNES);
        PanelNES.setLayout(PanelNESLayout);
        PanelNESLayout.setHorizontalGroup(
            PanelNESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNESLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NESimg)
                .addGap(34, 34, 34)
                .addComponent(lblNES)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanelNESLayout.setVerticalGroup(
            PanelNESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNESLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NESimg)
                    .addGroup(PanelNESLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblNES)))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jPanel1.add(PanelNES, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 680, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/retrofighters/arcade/assets/RetroFighters/RetroFighters Desktop.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 940));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarJuegoActionPerformed
        EmulatorController emuController = new EmulatorController();
        try {
            Game game = new Game().searchGame(1);
            Emulator emu = new Emulator().searchEmulator(1);
            emuController.initiateEmulatorInstance(emu, game);
        } catch (InterruptedException | IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIniciarJuegoActionPerformed

    // change to the previous game in the carousel
    private void btnPreviousGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousGameActionPerformed
        selectedGame--;
    }//GEN-LAST:event_btnPreviousGameActionPerformed

    // change to the next game in the carousel
    private void btnNextGame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextGame1ActionPerformed
        selectedGame++;
    }//GEN-LAST:event_btnNextGame1ActionPerformed


        
    private void btnAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminPanelActionPerformed
        AdminPanel admPanel = new AdminPanel();
        admPanel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdminPanelActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainPage().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NESimg;
    private javax.swing.JPanel PanelNES;
    private javax.swing.JButton btnAdminPanel;
    private javax.swing.JButton btnIniciarJuego;
    private javax.swing.JButton btnNextGame1;
    private javax.swing.JButton btnPreviousGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNES;
    // End of variables declaration//GEN-END:variables
}
