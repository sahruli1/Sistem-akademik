/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;
import java.io.File;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author sahruli nur rizki
 */
public class FormPNilaiSiswa extends javax.swing.JPanel {
private Connection conn = new koneksi().connect();
private DefaultTableModel tabmode;
    /**
     * Creates new form FormPNilaiSiswa
     */
    public FormPNilaiSiswa() {
        initComponents();
        datatable();
         tampil_comboguru();
         tampil_combomapel();
         tbl();
         autonumber();
        
    }
       protected void aktif() {
       
        
        tu.setEnabled(true);
        ut.setEnabled(true);
        us.setEnabled(true);
        ni.setEnabled(true);
        gr.setEnabled(true);
        cbguru.getSelectedItem();
        txtnamasiswa.setEnabled(true);
        tcarisiswa.setEnabled(true);
        txtkelas.setEnabled(true);
        cbmapel.getSelectedItem();
      
        
    }

    protected void kosong() {
       
      
        tu.setText("");
        ut.setText("");
        us.setText("");
        ni.setText("");
        gr.setText("");
        cbguru.setSelectedItem("");
        txtnamasiswa.setText("");
        tcarisiswa.setText("");
        txtkelas.setText("");
        cbmapel.setSelectedItem("");
    }
    
    
    public void tbl(){
        
        ttabel.getColumnModel().getColumn(0).setPreferredWidth(15);
        ttabel.getColumnModel().getColumn(1).setPreferredWidth(60);
        ttabel.getColumnModel().getColumn(2).setPreferredWidth(100);
        ttabel.getColumnModel().getColumn(3).setPreferredWidth(25);
        ttabel.getColumnModel().getColumn(4).setPreferredWidth(100);
        ttabel.getColumnModel().getColumn(5).setPreferredWidth(100);
        ttabel.getColumnModel().getColumn(6).setPreferredWidth(50);
        ttabel.getColumnModel().getColumn(7).setPreferredWidth(25);
        ttabel.getColumnModel().getColumn(8).setPreferredWidth(25);
        ttabel.getColumnModel().getColumn(9).setPreferredWidth(25);
        ttabel.getColumnModel().getColumn(10).setPreferredWidth(25);
        ttabel.getColumnModel().getColumn(11).setPreferredWidth(25);
  }
    private void autonumber(){
          String ID = "000";
         int i = 0;
         try{
             
             Statement st = conn.createStatement();
             String sql = "select id_nilai_siswa from t_nilai_siswa";
             ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
             ID = rs.getString("id_nilai_siswa");
             
         }
             ID = ID.substring(0);
             i = Integer.parseInt(ID)+1;
             ID = "0000" + i;
             ID = "" + ID.substring(ID.length()-3);
             tidnilaisiswa.setText(ID);
         }catch (SQLException e){
             System.out.println(e.getMessage());
         }
     
     }
    
    protected void datatable () {
        
        Object[] Baris = {"ID","NIS","NAMA SISWA","KELAS","MATA PELAJARAN","GURU","SEMESTER","TUGAS","UTS","UAS","HASIL","GRADE"};
        tabmode = new DefaultTableModel(null, Baris);
        ttabel.setModel(tabmode);
        String sql = "select * from t_nilai_siswa";
        
        try {
                java.sql.Statement stat = conn.createStatement();
                ResultSet hasil = stat.executeQuery(sql);
                while (hasil.next()){
                  
                    String a = hasil.getString("id_nilai_siswa");
                    String b = hasil.getString("nis");
                    String c = hasil.getString("nama_siswa");
                    
                    String d = hasil.getString("nama_kelas");
                    String e = hasil.getString("nama_mapel");
                    
                    String f = hasil.getString("nama_guru");
                    String g = hasil.getString("semester");
                    String h = hasil.getString("nilai_tugas");
                    String i = hasil.getString("nilai_uts");
                    String j = hasil.getString("nilai_uas");
                    String k = hasil.getString("hasil");
                    String l = hasil.getString("grade");
                    
                    String[] data={a,b,c,d,e,f,g,h,i,j,k,l};
                    tabmode.addRow(data);
                }
            } catch (Exception e) {
        }
    }
    
    public void tampil_comboguru(){
    
   
   
    try{
        
       String sql= "select * From t_guru ";
        java.sql.Statement stat = conn.createStatement();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            cbguru.addItem(rs.getString("nama_guru"));
            
        }
        rs.last();
        int jumlahdata = rs.getRow();
        rs.first();
        
    }catch(Exception e){
        
    }
}

   
    
    
    
    public void tampil_combomapel(){
    
   
   
    try{
        
       String sql= "select * From t_mapel ";
        java.sql.Statement stat = conn.createStatement();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            cbmapel.addItem(rs.getString("mata_pelajaran"));
            
        }
        rs.last();
        int jumlahdata = rs.getRow();
        rs.first();
        
    }catch(Exception e){
        
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttabel = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbmapel = new javax.swing.JComboBox();
        tcarisiswa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtnamasiswa = new javax.swing.JTextField();
        txtkelas = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbguru = new javax.swing.JComboBox();
        binput = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        tu = new javax.swing.JTextField();
        ut = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        ni = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        gr = new javax.swing.JTextField();
        tidnilaisiswa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        csem = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        ctbl = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        setPreferredSize(new java.awt.Dimension(984, 547));
        setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        ttabel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        ttabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ttabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        ttabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ttabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ttabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ttabel);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("                INPUT NILAI SISWA/SISWI SMK YAPPA");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -1, 390, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CARI NIS SISWA");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 83, -1, 25));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MATA PELAJARAN");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 25));

        cbmapel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbmapel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT MAPEL" }));
        cbmapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmapelActionPerformed(evt);
            }
        });
        jPanel2.add(cbmapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 144, 25));

        tcarisiswa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(tcarisiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 101, 25));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CARI SISWA");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 105, 25));

        txtnamasiswa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtnamasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamasiswaActionPerformed(evt);
            }
        });
        jPanel2.add(txtnamasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 212, 25));

        txtkelas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkelasActionPerformed(evt);
            }
        });
        jPanel2.add(txtkelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 100, 25));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NAMA SISWA");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 119, 116, 25));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GURU");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 134, 25));

        cbguru.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbguru.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT GURU" }));
        cbguru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbguruActionPerformed(evt);
            }
        });
        jPanel2.add(cbguru, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 144, 25));

        binput.setBackground(new java.awt.Color(102, 102, 102));
        binput.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        binput.setForeground(new java.awt.Color(255, 255, 255));
        binput.setText("INPUT");
        binput.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        binput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binputActionPerformed(evt);
            }
        });
        jPanel2.add(binput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 108, 25));

        bhapus.setBackground(new java.awt.Color(102, 102, 102));
        bhapus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setText("HAPUS");
        bhapus.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });
        jPanel2.add(bhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 108, 25));

        tu.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(tu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 41, 25));

        ut.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 41, 25));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TUGAS");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 48, 30));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("UTS");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 46, 30));

        us.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 41, 25));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("UAS");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 46, 30));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HITUNG");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 91, 25));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("HASIL");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 48, 30));

        ni.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ni.setEnabled(false);
        jPanel2.add(ni, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 41, 25));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("GRADE");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 48, 30));

        gr.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        gr.setEnabled(false);
        jPanel2.add(gr, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 41, 25));

        tidnilaisiswa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(tidnilaisiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 101, 25));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID NILAI SISWA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 47, 97, 25));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("REFRESH");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 79, 25));

        csem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEMESTER", "GANJIL", "GENAP" }));
        jPanel2.add(csem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 100, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("KELAS");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 156, 44, 25));

        ctbl.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ctbl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cari Data Nilai Kelas", "10.A", "10.B", "10.C", "10.D", "10.E", "11.A", "11.B", "11.C", "11.D", "11.E", "12.A", "12.B", "12.C", "12.D", "12.E" }));
        ctbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctbl, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ctbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cbguruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbguruActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbguruActionPerformed

    private void cbmapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmapelActionPerformed
        // TODO add your handling code here:
        

        
    }//GEN-LAST:event_cbmapelActionPerformed

    private void binputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binputActionPerformed
        // TODO add your handling code here:
       
        String sql = "insert into t_nilai_siswa values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tidnilaisiswa.getText());
            stat.setString(2, tcarisiswa.getText());
            stat.setString(3, txtnamasiswa.getText());
            stat.setString(4, txtkelas.getText());
            
            stat.setString(5, cbmapel.getSelectedItem().toString());
            stat.setString(6, cbguru.getSelectedItem().toString());
            stat.setString(7, csem.getSelectedItem().toString());
            stat.setString(8, tu.getText());
            stat.setString(9, ut.getText());
            stat.setString(10, us.getText());
            stat.setString(11, ni.getText());
            stat.setString(12, gr.getText());
          
           
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            tcarisiswa.requestFocus();
            
            datatable();
            tampil_comboguru();
            autonumber();
            tbl();
            tampil_combomapel();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
       
    }//GEN-LAST:event_binputActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "Hapus","Konfirmasi Dialog",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0) {
            String sql = "delete from t_nilai_siswa where id_nilai_siswa = '"+tidnilaisiswa.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil Di Hapus");
                kosong();
                tidnilaisiswa.requestFocus();
                datatable();
                tbl();
                autonumber();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Data Gagal Di Hapus");
            }
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void ttabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ttabelMouseClicked
        // TODO add your handling code here:
         int bar = ttabel.getSelectedRow();
        String a = tabmode.getValueAt(bar,0).toString();
        String b = tabmode.getValueAt(bar,1).toString();
        String c = tabmode.getValueAt(bar,2).toString();
        String d = tabmode.getValueAt(bar,3).toString();
        String e = tabmode.getValueAt(bar,4).toString();
        String f = tabmode.getValueAt(bar,5).toString();
        String g = tabmode.getValueAt(bar,6).toString();
        String h = tabmode.getValueAt(bar,7).toString();
        String i = tabmode.getValueAt(bar,8).toString();
        String j = tabmode.getValueAt(bar,9).toString();
        String k = tabmode.getValueAt(bar,10).toString();
        String l = tabmode.getValueAt(bar,11).toString();
                
        
        
            tidnilaisiswa.setText(a);
            tcarisiswa.setText(b);
            txtnamasiswa.setText(c);
            txtkelas.setText(d);
            
            cbmapel.setSelectedItem(e);
            cbguru.setSelectedItem(f);
            csem.setSelectedItem(g);
            tu.setText(h);
            ut.setText(i);
            us.setText(j);
            ni.setText(k);
            gr.setText(l);
            
            
            
    }//GEN-LAST:event_ttabelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      String item = (String)tcarisiswa.getText();
        String sql= "select * From t_siswa where nis = ? ";
        try{

            java.sql.Statement stat = conn.createStatement();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, item);
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                String id = rs.getString("nama_siswa");
                String kel = rs.getString("nama_kelas");
               
                txtnamasiswa.setText(id);
                txtkelas.setText(kel);
                
            }

        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnamasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamasiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamasiswaActionPerformed

    private void txtkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkelasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        double tug;
        double tus;
        double uas;
        double nil;
        String gra;

        tug = Integer.valueOf(tu.getText());
        tus = Integer.valueOf(ut.getText());
        uas = Integer.valueOf(us.getText());

        nil = (uas*50/100)+(tus*30/100)+(tug*20/100);
        gra = String.valueOf(nil);
        ni.setText(gra);

        if (nil >= 90){
            gr.setText("A");
        }
        else if(( nil <89)&&(nil>=80)){
            gr.setText("B");
        }
        else if ((nil <79)&&(nil>=70)){
            gr.setText("C");
        }
        else if ((nil<=70)&&(nil>=00)){
            gr.setText("D");
        }
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ctblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctblActionPerformed
        // TODO add your handling code here:
       Object[] Baris = {"ID","NIS","NAMA SISWA","KELAS","MATA PELAJARAN","GURU","TUGAS","UTS","UAS","HASIL","GRADE"};
        tabmode = new DefaultTableModel(null, Baris);
        ttabel.setModel(tabmode);
        String sql = "select * from t_nilai_siswa where nama_kelas like '%"+ctbl.getSelectedItem()+"'";

        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                    String a = hasil.getString("id_nilai_siswa");
                    String b = hasil.getString("nis");
                    String c = hasil.getString("nama_siswa");
                    String d = hasil.getString("nama_kelas");
                    String e = hasil.getString("nama_mapel");
                    String f = hasil.getString("nama_guru");
                    String g = hasil.getString("nilai_tugas");
                    String h = hasil.getString("nilai_uts");
                    String i = hasil.getString("nilai_uas");
                    String j = hasil.getString("hasil");
                    String k = hasil.getString("grade");
                    
                    String[] data={a,b,c,d,e,f,g,h,i,j,k};
                tabmode.addRow(data);
                tbl();
            }
        } catch (Exception e) {
        }

        /*String item = (String)ctbl.getSelectedItem();
        String sql= "select * From kelas where nama_kelas = '10.A'  ";
        try{

            java.sql.Statement stat = conn.createStatement();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, item);
            ResultSet rs = pst.executeQuery();

            if(rs.next()){

                tabelSiswa.setModel(tabmode);
            }

        }catch(Exception e){

        }
        */
    }//GEN-LAST:event_ctblActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)ttabel.getModel();
        model.setRowCount(0);
        datatable ();
        tbl();
        kosong();
        
    }//GEN-LAST:event_jButton3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bhapus;
    private javax.swing.JButton binput;
    private javax.swing.JComboBox cbguru;
    private javax.swing.JComboBox cbmapel;
    private javax.swing.JComboBox<String> csem;
    private javax.swing.JComboBox<String> ctbl;
    private javax.swing.JTextField gr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ni;
    private javax.swing.JTextField tcarisiswa;
    private javax.swing.JTextField tidnilaisiswa;
    private javax.swing.JTable ttabel;
    private javax.swing.JTextField tu;
    private javax.swing.JTextField txtkelas;
    private javax.swing.JTextField txtnamasiswa;
    private javax.swing.JTextField us;
    private javax.swing.JTextField ut;
    // End of variables declaration//GEN-END:variables
}
