/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formpegawai;

import java.sql.*;
import javax.swing.*;
import javax.xml.crypto.Data;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC05
 */
public class formpegawai extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement statPgw;
    Boolean ada = false;
    
    
private void koneksi(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost/transaksi_athallah";
        String user = "root";
        String pass = "";
        con = DriverManager.getConnection(url, user, pass);
        statPgw = con.createStatement(rs.TYPE_SCROLL_SENSITIVE, rs.CONCUR_UPDATABLE);
        rs = statPgw.executeQuery("select * from pegawai");
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        System.exit(0);
    }
}
private void display(){
    try {
        String sql = "select * from pegawai";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}

private void Clear() {
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
}
    
    
    public formpegawai() {
        initComponents();
        koneksi();
        display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tkeluar = new javax.swing.JButton();
        tsimpan = new javax.swing.JButton();
        tedit = new javax.swing.JButton();
        thapus = new javax.swing.JButton();
        tclear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextField3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 270, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("FORM INPUT PEGAWAI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("NIK");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 270, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        tkeluar.setText("Keluar");
        tkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(tkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        tsimpan.setText("Simpan");
        tsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(tsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 80, -1));

        tedit.setText("Edit");
        tedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teditActionPerformed(evt);
            }
        });
        getContentPane().add(tedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        thapus.setText("Hapus");
        thapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thapusMouseClicked(evt);
            }
        });
        thapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thapusActionPerformed(evt);
            }
        });
        getContentPane().add(thapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        tclear.setText("Clear");
        tclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tclearActionPerformed(evt);
            }
        });
        getContentPane().add(tclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 360, 210));

        jTextField3.setColumns(20);
        jTextField3.setRows(5);
        jScrollPane3.setViewportView(jTextField3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 270, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_tkeluarActionPerformed

    private void tsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsimpanActionPerformed
        try {
            koneksi();
            statPgw = con.createStatement();
            String SQL = "insert into pegawai values('"+ jTextField1.getText() + "','" + jTextField2.getText() + "','" + jTextField3.getText() + "')";
            statPgw.executeUpdate(SQL);
            display();
            statPgw.close();
            
            Clear();
            //autokode();
            con.close();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan!!");
        } catch (Exception exc){
            System.err.println(exc.getMessage());
        }
    }//GEN-LAST:event_tsimpanActionPerformed

    private void teditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teditActionPerformed
        try {
            koneksi();
            statPgw = con.createStatement();
            String SQL = "update pegawai SET nik = '"+ jTextField1.getText() + "', nama_pegawai = '" + jTextField2.getText() + "', alamat = '" + jTextField3.getText()  + "' WHERE nik = '" + jTextField1.getText() + "'";
            statPgw.executeUpdate(SQL);
            display();
            statPgw.close();
            
            Clear();
            //autokode();
            con.close();
            JOptionPane.showMessageDialog(null, "Data berhasil di edit!!");
        } catch (Exception exc){
            System.err.println(exc.getMessage());
        }        
    }//GEN-LAST:event_teditActionPerformed

    private void thapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thapusActionPerformed
        try {
            koneksi();
            statPgw = con.createStatement();
            String SQL = "DELETE FROM pegawai WHERE nik = '" + jTextField1.getText() + "'";
            statPgw.executeUpdate(SQL);
            display();
            statPgw.close();
            
            Clear();
            //autokode();
            con.close();
            JOptionPane.showMessageDialog(null, "Data berhasil di hapus!!");
        } catch (Exception exc){
            System.err.println(exc.getMessage());
        } 
    }//GEN-LAST:event_thapusActionPerformed

    private void tclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tclearActionPerformed
       Clear();
    }//GEN-LAST:event_tclearActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            koneksi();
            int row = jTable1.getSelectedRow();
            String tabel_klik = (jTable1.getModel().getValueAt(row, 0).toString());
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * From pegawai where nik ='" + tabel_klik + "'");
            if (sql.next()) {
                String nik = sql.getString("nik");
                jTextField1.setText(nik);
//                jTextField1.setEditable(false);
                String nama_pegawai = sql.getString("nama_pegawai");
                jTextField2.setText(nama_pegawai);
                String alamat = sql.getString("alamat");
                jTextField3.setText(alamat);
            }
            
        } catch (Exception e){
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void thapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thapusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_thapusMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(formpegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formpegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formpegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formpegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formpegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea jTextField3;
    private javax.swing.JButton tclear;
    private javax.swing.JButton tedit;
    private javax.swing.JButton thapus;
    private javax.swing.JButton tkeluar;
    private javax.swing.JButton tsimpan;
    // End of variables declaration//GEN-END:variables
}
