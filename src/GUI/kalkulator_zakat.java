/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import UAS_alpro.menu_mal;
import zakatjava.ZakatFitrah;

/**
 *
 * @author Acer
 */
public class kalkulator_zakat extends javax.swing.JFrame {

    /**
     * Creates new form tentang_aplikasi
     */
    public kalkulator_zakat() {
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

        jLabel2 = new javax.swing.JLabel();
        ZakatMal = new javax.swing.JLabel();
        ZakatFitrah = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back-removebg-preview.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, 70));

        ZakatMal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ZakatMal.setForeground(new java.awt.Color(0, 0, 0));
        ZakatMal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ZakatMal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/zakat_mal_fix-removebg-preview.png"))); // NOI18N
        ZakatMal.setText("ZAKAT MAL");
        ZakatMal.setToolTipText("");
        ZakatMal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ZakatMal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ZakatMal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ZakatMal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZakatMalMouseClicked(evt);
            }
        });
        getContentPane().add(ZakatMal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, 190));

        ZakatFitrah.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ZakatFitrah.setForeground(new java.awt.Color(0, 0, 0));
        ZakatFitrah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ZakatFitrah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-fitrah-removebg-preview.png"))); // NOI18N
        ZakatFitrah.setText("ZAKAT FITRAH");
        ZakatFitrah.setToolTipText("");
        ZakatFitrah.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ZakatFitrah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ZakatFitrah.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ZakatFitrah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZakatFitrahMouseClicked(evt);
            }
        });
        getContentPane().add(ZakatFitrah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, 190));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS_alpro/background.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
         new menu_utama().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ZakatFitrahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZakatFitrahMouseClicked
        // TODO add your handling code here:
        new ZakatFitrah().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ZakatFitrahMouseClicked

    private void ZakatMalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZakatMalMouseClicked
        // TODO add your handling code here:
        new menu_mal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ZakatMalMouseClicked

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
            java.util.logging.Logger.getLogger(kalkulator_zakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator_zakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator_zakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator_zakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator_zakat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ZakatFitrah;
    private javax.swing.JLabel ZakatMal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
