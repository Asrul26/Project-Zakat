/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakatjava;

import GUI.kalkulator_zakat;
import UAS_alpro.menu_mal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class BarangDagang extends javax.swing.JFrame {

    /**
     * Creates new form BarangDagang
     */
    public BarangDagang() {
        initComponents();
    }
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    float Uprice,total,flag;
    String Zakatname;
    PreparedStatement  add = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        GajiTxt = new javax.swing.JTextField();
        HitungFtrh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        EmasTxt2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DagangTbl = new javax.swing.JTable();
        HitungFtrh1 = new javax.swing.JButton();
        HitungFtrh2 = new javax.swing.JButton();
        EmasTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ZAKAT BARANG DAGANG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("HITUNG");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Simpan Zakat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        GajiTxt.setBackground(new java.awt.Color(255, 255, 255));
        GajiTxt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        GajiTxt.setForeground(new java.awt.Color(0, 0, 0));
        GajiTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        GajiTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GajiTxtMouseClicked(evt);
            }
        });
        getContentPane().add(GajiTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 30));

        HitungFtrh.setBackground(new java.awt.Color(204, 255, 204));
        HitungFtrh.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HitungFtrh.setForeground(new java.awt.Color(0, 0, 0));
        HitungFtrh.setText("Simpan");
        HitungFtrh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HitungFtrhMouseClicked(evt);
            }
        });
        getContentPane().add(HitungFtrh, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Back");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Gaji atau Penghasilan / Tahun");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        EmasTxt2.setBackground(new java.awt.Color(255, 255, 255));
        EmasTxt2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        EmasTxt2.setForeground(new java.awt.Color(0, 0, 0));
        EmasTxt2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EmasTxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmasTxt2MouseClicked(evt);
            }
        });
        EmasTxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmasTxt2ActionPerformed(evt);
            }
        });
        getContentPane().add(EmasTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 180, 30));

        DagangTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Penghasilan", "Harga Emas", "Total"
            }
        ));
        DagangTbl.setIntercellSpacing(new java.awt.Dimension(0, 0));
        DagangTbl.setRowHeight(20);
        DagangTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DagangTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DagangTbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, 220));

        HitungFtrh1.setBackground(new java.awt.Color(204, 255, 204));
        HitungFtrh1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HitungFtrh1.setForeground(new java.awt.Color(0, 0, 0));
        HitungFtrh1.setText("Hitung");
        HitungFtrh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HitungFtrh1MouseClicked(evt);
            }
        });
        getContentPane().add(HitungFtrh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        HitungFtrh2.setBackground(new java.awt.Color(204, 255, 204));
        HitungFtrh2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HitungFtrh2.setForeground(new java.awt.Color(0, 0, 0));
        HitungFtrh2.setText("Bayar");
        HitungFtrh2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HitungFtrh2MouseClicked(evt);
            }
        });
        getContentPane().add(HitungFtrh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        EmasTxt.setBackground(new java.awt.Color(255, 255, 255));
        EmasTxt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        EmasTxt.setForeground(new java.awt.Color(0, 0, 0));
        EmasTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EmasTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmasTxtMouseClicked(evt);
            }
        });
        EmasTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmasTxtActionPerformed(evt);
            }
        });
        getContentPane().add(EmasTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Harga Emas (Gram)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UAS_alpro/background.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GajiTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GajiTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GajiTxtMouseClicked

    private void HitungFtrhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HitungFtrhMouseClicked
        // TODO add your handling code here:
        String a = "Zakat Penghasilan";
        int i = Integer.valueOf(EmasTxt2.getText());
        int o = i*1;
        if(EmasTxt2.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Masukkan Nilai");
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zakat","root","");
            add = con.prepareStatement("insert into zakatbl values(?,?)");
            add.setString(1, a);
            add.setInt(2, Integer.valueOf(EmasTxt2.getText()));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Zakat Penghasilan tersimpan sebesar Rp " + o);
            con.close();
            //SelectProd();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_HitungFtrhMouseClicked

    private void EmasTxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmasTxt2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EmasTxt2MouseClicked

    private void EmasTxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmasTxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmasTxt2ActionPerformed

    private void HitungFtrh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HitungFtrh1MouseClicked
        // TODO add your handling code here:
         if (GajiTxt.getText().isEmpty()||EmasTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Select Product and Enter Qty");
        }else{
             Integer Uprice1 = Integer.valueOf(EmasTxt.getText());
             long emas = Uprice1 * 78;
             Integer Uprice = Integer.valueOf(GajiTxt.getText());
             long tot2 = Uprice * 12;
             if(tot2 > emas){
                double tot = (long) (Uprice * 2.5 * 12 / 100);
                Vector v = new Vector();
                v.add(GajiTxt.getText());
                v.add(EmasTxt.getText());
                v.add(tot);
                DefaultTableModel dt = (DefaultTableModel)DagangTbl.getModel();
                dt.addRow(v);
                JOptionPane.showMessageDialog(this, "Wajib membayar zakat, karena hasil nishab yaitu Rp." + emas +" lebih kecil dari penghasilan anda");
             }else{
                JOptionPane.showMessageDialog(this, "Anda tidak wajib untuk membayar zakat");
             }
        }
    }//GEN-LAST:event_HitungFtrh1MouseClicked

    private void HitungFtrh2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HitungFtrh2MouseClicked
        try {
            // TODO add your handling code here:
            new Order().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(BarangDagang.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_HitungFtrh2MouseClicked

    private void EmasTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmasTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EmasTxtMouseClicked

    private void EmasTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmasTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmasTxtActionPerformed

    private void DagangTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DagangTblMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)DagangTbl.getModel();
        int Myindex = DagangTbl.getSelectedRow();
        EmasTxt2.setText(model.getValueAt(Myindex, 2).toString());
        
    }//GEN-LAST:event_DagangTblMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new kalkulator_zakat().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BarangDagang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarangDagang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarangDagang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarangDagang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarangDagang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DagangTbl;
    private javax.swing.JTextField EmasTxt;
    private javax.swing.JTextField EmasTxt2;
    private javax.swing.JTextField GajiTxt;
    private javax.swing.JButton HitungFtrh;
    private javax.swing.JButton HitungFtrh1;
    private javax.swing.JButton HitungFtrh2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
