/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CutiKaryawan.ui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author ajengnur
 */
public class FramePersetujuan extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = koneksi.Koneksi.Koneksi();
    /**
     * Creates new form NewJFrame
     */
    public FramePersetujuan() {
        initComponents();
        judul();
        tampilData("");
        setLocationRelativeTo(this);
        hapusBtn.setEnabled(false);
        btnUpdate.setEnabled(false);
    }
    
            public void judul() {
            Object[] judul = {
            "Kode Cuti", "Nama Karyawan", "NIS", "Diajukan", "Disetujui"
            };
                tabModel = new DefaultTableModel(null, judul);
                TbMenyetujui.setModel(tabModel);
}

        public void tampilData(String where) {
            try {
                st = cn.createStatement();
                tabModel.getDataVector().removeAllElements();
                tabModel.fireTableDataChanged();
                rs = st.executeQuery("SELECT * FROM persetujuan " + where);
    
            while (rs.next()) {
                Object[] data = {
                 rs.getString("kode_cuti"),
                 rs.getString("nama_karyawan"),
                 rs.getString("nis"),
                 rs.getString("diajukan"),
                 rs.getString("disetujui"),

      };
        
        tabModel.addRow(data);
    }
        } catch(Exception e) {
                e.printStackTrace();
  }
}
        public void reset() {
            txtkode.setText("");
            txtnama.setText("");
            txtnis.setText("");
            txtajukan.setText("");
            txtsetuju.setText("");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        simpanBtn = new javax.swing.JButton();
        keluarBtn = new javax.swing.JButton();
        hapusBtn = new javax.swing.JButton();
        txtnis = new javax.swing.JTextField();
        txtajukan = new javax.swing.JTextField();
        txtsetuju = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbMenyetujui = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCetak = new javax.swing.JTextField();
        btnCetak = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("NIS");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Diajukan");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Disetujui");

        simpanBtn.setText("Simpan");
        simpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnActionPerformed(evt);
            }
        });

        keluarBtn.setText("Keluar");
        keluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarBtnActionPerformed(evt);
            }
        });

        hapusBtn.setText("Hapus");
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });

        txtnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnisActionPerformed(evt);
            }
        });

        TbMenyetujui.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Cuti", "Nama Karyawan", "NIS", "Diajukan", "Disetujui"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TbMenyetujui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbMenyetujuiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbMenyetujui);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Input Data Persetujuan Cuti");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Nama Karyawan");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Kode Cuti");

        jLabel7.setText("Cari Kode");

        btnCetak.setText("Cetak");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(simpanBtn)
                        .addGap(18, 18, 18)
                        .addComponent(hapusBtn)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addComponent(keluarBtn))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(69, 69, 69)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnis, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtajukan, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsetuju, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rootPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCetak)))))
                .addContainerGap())
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtajukan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rootPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(87, 87, 87))
                            .addGroup(rootPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtsetuju, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(keluarBtn)
                            .addComponent(btnReset)
                            .addComponent(btnUpdate)
                            .addComponent(hapusBtn)
                            .addComponent(simpanBtn)))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCetak)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rootPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
         try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO persetujuan VALUES('" + txtkode.getText() + "','"
                + txtnama.getText() + "','" 
                + txtnis.getText() + "','" 
                + txtajukan.getText() + "','"                
                + txtsetuju.getText() + "')");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
            txtkode.setText("");
            txtnama.setText("");
            txtnis.setText("");
            txtajukan.setText("");
            txtsetuju.setText("");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_simpanBtnActionPerformed

    private void keluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarBtnActionPerformed
        Home a = new Home();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keluarBtnActionPerformed

    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        try {
            int jawab;

            if ((jawab = JOptionPane.showConfirmDialog(null, "Ingin menghapus data?", "konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
                st = cn.createStatement();
                st.executeUpdate("DELETE FROM persetujuan WHERE kode_cuti='"
                    + tabModel.getValueAt(TbMenyetujui.getSelectedRow(), 0) + "'");
                tampilData("");
                reset();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_hapusBtnActionPerformed

    private void txtnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnisActionPerformed

    private void TbMenyetujuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbMenyetujuiMouseClicked
        txtkode.setText(TbMenyetujui.getValueAt(TbMenyetujui.getSelectedRow(), 0).toString());
        txtnama.setText(TbMenyetujui.getValueAt(TbMenyetujui.getSelectedRow(), 1).toString());        
        txtnis.setText(TbMenyetujui.getValueAt(TbMenyetujui.getSelectedRow(), 2).toString());
        txtajukan.setText(TbMenyetujui.getValueAt(TbMenyetujui.getSelectedRow(), 3).toString());        
        txtsetuju.setText(TbMenyetujui.getValueAt(TbMenyetujui.getSelectedRow(), 4).toString());
        simpanBtn.setEnabled(false);
        simpanBtn.setEnabled(false);
        btnUpdate.setEnabled(true);
        hapusBtn.setEnabled(true);
    }//GEN-LAST:event_TbMenyetujuiMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        try {
            st.executeUpdate("UPDATE persetujuan set "    
                + "nama_karyawan='"      + txtnama.getText() + "', "
                + "nis='"      + txtnis.getText() + "', "
                + "diajukan='"      + txtajukan.getText() + "', "
                + "disetujui='"    + txtsetuju.getText() + "'"
                        + " WHERE kode_cuti =" + txtkode.getText());
            tampilData("");
            JOptionPane.showMessageDialog(null, "Update Berhasil");
            reset();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        try{
            String NamaFile = "./src/ireport4/laporanpersetujuan.jasper";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection Conek = DriverManager.getConnection("jdbc:mysql://localhost/cuti_karyawan","root","");
            HashMap param = new HashMap();
            //Mengambil parameter
            param.put("kode_cuti",txtCetak.getText());

            JasperPrint JPrint = JasperFillManager.fillReport(NamaFile, param, Conek);
            JasperViewer.viewReport(JPrint);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnCetakActionPerformed

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
            java.util.logging.Logger.getLogger(FramePersetujuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePersetujuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePersetujuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePersetujuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePersetujuan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbMenyetujui;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluarBtn;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JButton simpanBtn;
    private javax.swing.JTextField txtCetak;
    private javax.swing.JTextField txtajukan;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnis;
    private javax.swing.JTextField txtsetuju;
    // End of variables declaration//GEN-END:variables
}