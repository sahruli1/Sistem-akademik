/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin;
import tampilan.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author sahruli nur rizki
 */
public class FormPAbsenSiswa2 extends javax.swing.JPanel {
private Connection conn = new koneksi().connect();
private DefaultTableModel tabmode;
String nis_siswa="";
String nama_siswa="";
String nama_kelas="";
String izin="";
String sakit="";
String tanpa_keterangan="";
String jumlah_kehadiran = "";
String tanggal = "";
    /** Creates new form FormPAbsenSiswa */
    public FormPAbsenSiswa2() {
        initComponents();
        initComponents();
        datatable ();
        tbl();
    }
    public void tbl(){
      
     DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
     centerRenderer.setHorizontalAlignment( SwingConstants.CENTER );
      
      
        tabsen.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tabsen.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tabsen.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tabsen.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tabsen.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tabsen.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        tabsen.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        tabsen.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        tabsen.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
      
        
        
        tabsen.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabsen.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabsen.getColumnModel().getColumn(2).setPreferredWidth(75);
        tabsen.getColumnModel().getColumn(3).setPreferredWidth(75);
        tabsen.getColumnModel().getColumn(4).setPreferredWidth(75);
        tabsen.getColumnModel().getColumn(5).setPreferredWidth(75);
        tabsen.getColumnModel().getColumn(6).setPreferredWidth(250);
        tabsen.getColumnModel().getColumn(7).setPreferredWidth(100);
        tabsen.getColumnModel().getColumn(8).setPreferredWidth(100);
  }
protected void datatable () {
        
        Object[] Baris = {"NIS","NAMA","KELAS","HADIR","IZIN","SAKIT","TANPA KETERANGAN","JUMLAH","TANGGAL"};
       
        tabmode = new DefaultTableModel(null, Baris);
        tabsen.setModel(tabmode);
        String sql = "select k.nis_siswa,s.nama_siswa,s.nama_kelas,k.hadir,k.izin,k.sakit,k.tanpa_keterangan,k.jumlah_kehadiran, DATE_FORMAT(k.tanggal,'%y-%m-%d') AS tgl from t_siswa s INNER JOIN t_absen k on k.nis_siswa=s.NIS";
        
        try {
                java.sql.Statement stat = conn.createStatement();
                ResultSet hasil = stat.executeQuery(sql);
                while (hasil.next()){
                    String a = hasil.getString("nis_siswa");
                    String b = hasil.getString("nama_siswa");
                    String c = hasil.getString("nama_kelas");
                    String d = hasil.getString("hadir");
                    String e = hasil.getString("izin");
                    String f = hasil.getString("sakit");
                    String g = hasil.getString("tanpa_keterangan");
                    String h = hasil.getString("jumlah_kehadiran");
                    
                    String i = hasil.getString("tgl");
                    
                   
                   
                    String[] data={a,b,c,d,e,f,g,h,i};
                    tabmode.addRow(data);
                }
            } catch (Exception e) {
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tkelas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tizin = new javax.swing.JTextField();
        tsakit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tket = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        ttnggl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ctbl = new javax.swing.JComboBox<>();
        thadir = new javax.swing.JTextField();
        HADIR = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tnis = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabsen = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KELAS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 25));

        tkelas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(tkelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 180, 25));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("IZIN");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 25));

        tizin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(tizin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 180, 25));

        tsakit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(tsakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 180, 25));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SAKIT");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 25));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TANPA KETERANGAN");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 25));

        tket.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(tket, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 180, 25));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TOTAL");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 25));

        total.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 180, 25));

        ttnggl.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(ttnggl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 180, 25));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TANGGAL");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 25));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("INPUT ABSEN");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 90, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("           INPUT DATA ABSEN SISWA/SISWI SMK YAPPA");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 33));

        ctbl.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ctbl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cari Data Kelas", "10.A", "10.B", "10.C", "10.D", "10.E", "11.A", "11.B", "11.C", "11.D", "11.E", "12.A", "12.B", "12.C", "12.D", "12.E" }));
        ctbl.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        ctbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctblActionPerformed(evt);
            }
        });
        jPanel2.add(ctbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 124, 25));

        thadir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(thadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 180, 25));

        HADIR.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        HADIR.setForeground(new java.awt.Color(255, 255, 255));
        HADIR.setText("HADIR");
        jPanel2.add(HADIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 25));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 25));

        tnis.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(tnis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 180, 25));

        tnama.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 180, 25));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA SISWA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 25));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cari Nis");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 90, 20));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("REFRESH");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 80, 30));

        tabsen.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        tabsen.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tabsen.setModel(new javax.swing.table.DefaultTableModel(
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
        tabsen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabsenMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabsen);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       /* String tampilan = "yyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(tnggl.getDate()));*/
        try {

            String sql = "update t_absen set nis_siswa=?,hadir=?, izin=?, sakit =?,tanpa_keterangan=?,jumlah_kehadiran=?,tanggal =? where nis_siswa='"+tnis.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1, tnis.getText());
            stat.setString(2, thadir.getText());
            stat.setString(3, tizin.getText());
            stat.setString(4, tsakit.getText());
            stat.setString(5, tket.getText());
            stat.setString(6, total.getText());
            stat.setString(7, ttnggl.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            tnis.requestFocus();;
            datatable();
            tbl();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabsenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabsenMouseClicked
        // TODO add your handling code here:
        int bar = tabsen.getSelectedRow();
        String a = tabmode.getValueAt(bar,0).toString();
        String b = tabmode.getValueAt(bar,1).toString();
        String c = tabmode.getValueAt(bar,2).toString();
        String d = tabmode.getValueAt(bar,3).toString();
        String e = tabmode.getValueAt(bar,4).toString();
        String f = tabmode.getValueAt(bar,5).toString();
        String g = tabmode.getValueAt(bar,6).toString();
        String h = tabmode.getValueAt(bar,7).toString();
        String i = tabmode.getValueAt(bar,8).toString();
        tnis.setText(a);
        tnama.setText(b);
        tkelas.setText(c);
        thadir.setText(d);
        tizin.setText(e);
        tsakit.setText(f);
        tket.setText(g);
        total.setText(h);
        ttnggl.setText(i);

    }//GEN-LAST:event_tabsenMouseClicked

    private void ctblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctblActionPerformed
        // TODO add your handling code here:
        Object[] Baris = {"NIS","NAMA","KELAS","HADIR","IZIN","SAKIT","TANPA KETERANGAN","JUMLAH","TANGGAL"};
       
        tabmode = new DefaultTableModel(null, Baris);
        tabsen.setModel(tabmode);
        String sql = "select k.nis_siswa,s.nama_siswa,s.nama_kelas,k.hadir,k.izin,k.sakit,k.tanpa_keterangan,k.jumlah_kehadiran, DATE_FORMAT(k.tanggal,'%d-%m-%y') AS tgl from t_siswa s INNER JOIN t_absen k on k.nis_siswa=s.NIS where nama_kelas like '%"+ctbl.getSelectedItem()+"'";
        
        try {
                java.sql.Statement stat = conn.createStatement();
                ResultSet hasil = stat.executeQuery(sql);
                while (hasil.next()){
                    String a = hasil.getString("nis_siswa");
                    String b = hasil.getString("nama_siswa");
                    String c = hasil.getString("nama_kelas");
                    String d = hasil.getString("hadir");
                    String e = hasil.getString("izin");
                    String f = hasil.getString("sakit");
                    String g = hasil.getString("tanpa_keterangan");
                    String h = hasil.getString("jumlah_kehadiran");
                    
                    String i = hasil.getString("tgl");
                    
                   tbl();
                   
                    String[] data={a,b,c,d,e,f,g,h,i};
                    tabmode.addRow(data);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String item = (String)tnis.getText();
        String sql= "select * From t_siswa where nis = ? ";
        try{

            java.sql.Statement stat = conn.createStatement();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, item);
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                String id = rs.getString("nama_siswa");
                String kel = rs.getString("nama_kelas");
               
                tnama.setText(id);
                tkelas.setText(kel);
                
            }

        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)tabsen.getModel();
        model.setRowCount(0);
        datatable ();
        tbl();
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HADIR;
    private javax.swing.JComboBox<String> ctbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabsen;
    private javax.swing.JTextField thadir;
    private javax.swing.JTextField tizin;
    private javax.swing.JTextField tkelas;
    private javax.swing.JTextField tket;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnis;
    private javax.swing.JTextField total;
    private javax.swing.JTextField tsakit;
    private javax.swing.JTextField ttnggl;
    // End of variables declaration//GEN-END:variables

}
