/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;
import java.io.File;
import tampilan.*;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
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
public class FormPPencarianNilaiSiswa2 extends javax.swing.JPanel {
private Connection conn = new koneksi().connect();
private DefaultTableModel tabmode;
    /**
     * Creates new form FormPPencarianNilaiSiswa
     */
    public FormPPencarianNilaiSiswa2() {
        initComponents();
        tbl();
      
    }

 public void tbl(){
     DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
     centerRenderer.setHorizontalAlignment( SwingConstants.CENTER);
        tabelNilaiSiswa.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tabelNilaiSiswa.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tabelNilaiSiswa.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tabelNilaiSiswa.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tabelNilaiSiswa.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        tabelNilaiSiswa.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        tabelNilaiSiswa.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        tabelNilaiSiswa.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        tabelNilaiSiswa.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
        tabelNilaiSiswa.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
        
        tabelNilaiSiswa.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelNilaiSiswa.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabelNilaiSiswa.getColumnModel().getColumn(2).setPreferredWidth(15);
        tabelNilaiSiswa.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabelNilaiSiswa.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabelNilaiSiswa.getColumnModel().getColumn(5).setPreferredWidth(25);
        tabelNilaiSiswa.getColumnModel().getColumn(6).setPreferredWidth(25);
        tabelNilaiSiswa.getColumnModel().getColumn(7).setPreferredWidth(25);
        tabelNilaiSiswa.getColumnModel().getColumn(8).setPreferredWidth(25);
        tabelNilaiSiswa.getColumnModel().getColumn(9).setPreferredWidth(25);
       
       
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
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        formCariNilai = new javax.swing.JTextField();
        tombolCariNilai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelNilaiSiswa = new javax.swing.JTable();
        tombolCariNilai1 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CARI NILAI ANDA");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIS/NAMA SISWA");

        formCariNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formCariNilaiActionPerformed(evt);
            }
        });

        tombolCariNilai.setBackground(new java.awt.Color(102, 102, 102));
        tombolCariNilai.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        tombolCariNilai.setText("CARI");
        tombolCariNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCariNilaiActionPerformed(evt);
            }
        });

        tabelNilaiSiswa.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        tabelNilaiSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NISN", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jScrollPane1.setViewportView(tabelNilaiSiswa);

        tombolCariNilai1.setBackground(new java.awt.Color(102, 102, 102));
        tombolCariNilai1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        tombolCariNilai1.setText("PRINT NILAI");
        tombolCariNilai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCariNilai1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(formCariNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(tombolCariNilai)
                        .addGap(18, 18, 18)
                        .addComponent(tombolCariNilai1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formCariNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolCariNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolCariNilai1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tombolCariNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCariNilaiActionPerformed
        // TODO add your handling code here:
        Object[] Baris = {"NIS","NAMA SISWA","KELAS","MATA PELAJARAN","GURU","TUGAS","UTS","UAS","HASIL","GRADE"};
       
        tabmode = new DefaultTableModel (null, Baris);
        tabelNilaiSiswa.setModel(tabmode);

        //String sql = "SELECT data_siswa.nisn, data_siswa.nama_siswa,mapel.nama_mapel, kelas.kelas, data_guru.nama_guru,nilai_siswa.nilai_mapel from nilai_siswa INNER JOIN data_siswa on data_siswa.id_siswa = nilai_siswa.id_siswa INNER JOIN kelas ON kelas.id = data_siswa.id_kelas INNER JOIN mapel ON kelas.id = mapel.id_kelas INNER JOIN data_guru ON data_guru.id_guru = mapel.id_guru WHERE data_siswa.nisn  = "+formCariNilai.getText()+"";
        String sql = "select*from t_nilai_siswa where nis like '%"+formCariNilai.getText()+ "%' or nama_siswa like '%"+formCariNilai.getText()+"%'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()) {
                    
                    String a = hasil.getString("nis");
                    String b = hasil.getString("nama_siswa");
                    String c = hasil.getString("nama_kelas");
                    String d = hasil.getString("nama_mapel");
                    String e = hasil.getString("nama_guru");
                    String f = hasil.getString("nilai_tugas");
                    String g = hasil.getString("nilai_uts");
                    String h = hasil.getString("nilai_uas");
                    String i = hasil.getString("hasil");
                    String j = hasil.getString("grade");
                
                String[] data = {a,b,c,d,e,f,g,h,i,j};
               
                if (sql == null) {
                    JOptionPane.showMessageDialog(null,"Data Tidak Ada");
                    
                } else { 
                    
                    
                    tabmode.addRow(data);
                    tbl();
                }
                
            }
        } catch (Exception e) {
           
        }
        
        
        
    }//GEN-LAST:event_tombolCariNilaiActionPerformed

    private void formCariNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formCariNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formCariNilaiActionPerformed

    private void tombolCariNilai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCariNilai1ActionPerformed
        // TODO add your handling code here:
        try{
            
        
        String namaFile = "src/LaporanSmkYappa/PrintNilaisiswa.jasper";
        Connection conn = new koneksi().connect();
        HashMap parameter = new HashMap();
        parameter.put("nama_siswa",formCariNilai.getText());
        parameter.put("nis",formCariNilai.getText());
        File report_file = new File(namaFile);
        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file.getPath());
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameter,conn);
       
        JasperViewer.viewReport(jasperPrint, false);
        JasperViewer.setDefaultLookAndFeelDecorated(true);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_tombolCariNilai1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField formCariNilai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelNilaiSiswa;
    private javax.swing.JButton tombolCariNilai;
    private javax.swing.JButton tombolCariNilai1;
    // End of variables declaration//GEN-END:variables
}
