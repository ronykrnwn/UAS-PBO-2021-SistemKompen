/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import javax.swing.DefaultComboBoxModel;
import backend.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class FrmDosen extends javax.swing.JFrame {

    /**
     * Creates new form FrmDosen
     */
    public FrmDosen() {
        initComponents();
        tampilkanData();
        kosongkanForm();
        tampilkanCmbKategori();
    }
    
    public void kosongkanForm() {
        txtNip.setText("");
        txtNama.setText("");
        cmbTugas.setSelectedIndex(0);
    }
    
    public void tampilkanData() {
        String[] kolom = {"NIP", "NAMA", "PENUGASAN"};
        ArrayList<Dosen> list = new Dosen().getAll();
        Object rowData[] = new Object[3];

        tblDosen.setModel(new DefaultTableModel(new Object[][]{}, kolom));
        for (Dosen dsn : list) {
            rowData[0] = dsn.getNip();
            rowData[1] = dsn.getNamaDsn();
            rowData[2] = dsn.getPenugasan().getTugas();
            ((DefaultTableModel) tblDosen.getModel()).addRow(rowData);
        }
    }
    
    public void cari(String keyword) {
        String[] kolom = {"NIP", "NAMA", "ID PENUGASAN"};
        ArrayList<Dosen> list = new Dosen().search(keyword);
        Object rowData[] = new Object[3];

        tblDosen.setModel(new DefaultTableModel(new Object[][]{}, kolom));
        for (Dosen dsn : list) {
            rowData[0] = dsn.getNip();
            rowData[1] = dsn.getNamaDsn();
            rowData[2] = dsn.getPenugasan().getTugas();

            ((DefaultTableModel) tblDosen.getModel()).addRow(rowData);
        }
    }
    
    public void tampilkanCmbKategori() {
        cmbTugas.setModel(new DefaultComboBoxModel(new Penugasan().getAll().toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNip = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnTambahData = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDosen = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnDataDosen = new javax.swing.JButton();
        btnDataAbsensi = new javax.swing.JButton();
        btnDataPenugasan = new javax.swing.JButton();
        btnDataKompen = new javax.swing.JButton();
        btnDataMahasiswa = new javax.swing.JButton();
        cmbTugas = new javax.swing.JComboBox<>();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA DOSEN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NIP");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NAMA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PENUGASAN");

        txtNip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTambahData.setText("TAMBAH DATA");
        btnTambahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDataActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCari.setText("CARI");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        txtCari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblDosen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblDosen.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDosenMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDosen);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DASHBOARD");

        btnDataDosen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDataDosen.setText("DATA DOSEN");
        btnDataDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataDosenActionPerformed(evt);
            }
        });

        btnDataAbsensi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDataAbsensi.setText("DATA ABSENSI");
        btnDataAbsensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataAbsensiActionPerformed(evt);
            }
        });

        btnDataPenugasan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDataPenugasan.setText("DATA PENUGASAN");
        btnDataPenugasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataPenugasanActionPerformed(evt);
            }
        });

        btnDataKompen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDataKompen.setText("DATA KOMPEN");
        btnDataKompen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataKompenActionPerformed(evt);
            }
        });

        btnDataMahasiswa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDataMahasiswa.setText("DATA MAHASISWA");
        btnDataMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataMahasiswaActionPerformed(evt);
            }
        });

        cmbTugas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDataDosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDataMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDataAbsensi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDataPenugasan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDataKompen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(246, 246, 246))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtNip, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(cmbTugas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnSimpan)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambahData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCari)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataAbsensi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambahData)
                            .addComponent(btnHapus)
                            .addComponent(btnCari)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDataPenugasan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDataKompen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Dosen dsn = new Dosen();
        dsn.setNip(Integer.parseInt(txtNip.getText()));
        dsn.setNamaDsn(txtNama.getText());
        dsn.setPenugasan((Penugasan)cmbTugas.getSelectedItem());
        dsn.save();
        txtNip.setText(Integer.toString(dsn.getNip()));
        tampilkanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDataActionPerformed
        kosongkanForm();
    }//GEN-LAST:event_btnTambahDataActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblDosen.getModel();
        int row = tblDosen.getSelectedRow();

        Dosen dsn = new Dosen().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        dsn.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDosenMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblDosen.getModel();
        int row = tblDosen.getSelectedRow();
        Dosen dsn = new Dosen();
        
        dsn = dsn.getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        
        txtNip.setText(String.valueOf(dsn.getNip()));
        txtNama.setText(dsn.getNamaDsn());
        cmbTugas.getModel().setSelectedItem(dsn.getPenugasan().getTugas());
    }//GEN-LAST:event_tblDosenMouseClicked

    private void btnDataDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataDosenActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmDosen().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_btnDataDosenActionPerformed

    private void btnDataAbsensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataAbsensiActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmAbsen().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_btnDataAbsensiActionPerformed

    private void btnDataPenugasanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataPenugasanActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPenugasan().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_btnDataPenugasanActionPerformed

    private void btnDataKompenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataKompenActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmKonfirm().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_btnDataKompenActionPerformed

    private void btnDataMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataMahasiswaActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmMahasiswa().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_btnDataMahasiswaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnDataAbsensi;
    private javax.swing.JButton btnDataDosen;
    private javax.swing.JButton btnDataKompen;
    private javax.swing.JButton btnDataMahasiswa;
    private javax.swing.JButton btnDataPenugasan;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahData;
    private javax.swing.JComboBox<String> cmbTugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblDosen;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNip;
    // End of variables declaration//GEN-END:variables
}