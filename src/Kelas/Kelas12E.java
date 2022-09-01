/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author sahruli nur rizki
 */
public class Kelas12E extends javax.swing.JFrame {
private DefaultTableModel tabmode;
private Connection conn = new koneksi().connect();
    /**
     * Creates new form Kelas12E
     */
    public Kelas12E() {
        initComponents();
        datatable();
    }
protected void datatable () {
        
        Object[] Baris = {"nis_siswa","izin","sakit","tanpa keterangan","jumlah","tanggal"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelSiswa.setModel(tabmode);
        String sql = "select * from t_absen ";
        
        try {
                java.sql.Statement stat = conn.createStatement();
                ResultSet hasil = stat.executeQuery(sql);
                while (hasil.next()){
                    String a = hasil.getString("nis_siswa");
                    String b = hasil.getString("izin");
                   
                    String c = hasil.getString("sakit");
                    String d = hasil.getString("tanpa_keterangan");
                    String e = hasil.getString("tanggal");
                  
                  
                    

                    String[] data={a,b,c,d,e};
                    tabmode.addRow(data);
                }
            } catch (Exception e) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSiswa = new javax.swing.JTable();
        excel = new javax.swing.JButton();
        tabl1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tidsiswa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        talamat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jk2 = new javax.swing.JRadioButton();
        jk1 = new javax.swing.JRadioButton();
        tkelas = new javax.swing.JComboBox<>();
        tidkelas = new javax.swing.JTextField();
        tombolSimpan = new javax.swing.JButton();
        tubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tu = new javax.swing.JTextField();
        ut = new javax.swing.JTextField();
        us = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ni = new javax.swing.JTextField();
        gr = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelSiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelSiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelSiswa);

        excel.setBackground(new java.awt.Color(51, 51, 0));
        excel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        excel.setText("IMPORT EXCEL");
        excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelActionPerformed(evt);
            }
        });

        tabl1.setBackground(new java.awt.Color(51, 51, 0));
        tabl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabl1.setText("SIMPAN TABEL");
        tabl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabl1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("INPUT DATA SISWA");

        tidsiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidsiswaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("NIS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NAMA LENGKAP");

        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });

        talamat.setColumns(20);
        talamat.setRows(5);
        jScrollPane2.setViewportView(talamat);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ALAMAT");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("JENIS KELAMIN");

        jk2.setBackground(new java.awt.Color(51, 51, 0));
        jk2.setText("P");
        jk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jk2ActionPerformed(evt);
            }
        });

        jk1.setBackground(new java.awt.Color(51, 51, 0));
        jk1.setText("L");
        jk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jk1ActionPerformed(evt);
            }
        });

        tkelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cari Kelas" }));
        tkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkelasActionPerformed(evt);
            }
        });

        tidkelas.setEnabled(false);
        tidkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidkelasActionPerformed(evt);
            }
        });

        tombolSimpan.setBackground(new java.awt.Color(51, 51, 0));
        tombolSimpan.setText("INPUT");
        tombolSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSimpanActionPerformed(evt);
            }
        });

        tubah.setBackground(new java.awt.Color(51, 51, 0));
        tubah.setText("UBAH");
        tubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tubahActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(51, 51, 0));
        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tombolSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tubah, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel6)
                            .addGap(89, 89, 89)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel5)
                            .addGap(45, 45, 45)
                            .addComponent(jk1)
                            .addGap(10, 10, 10)
                            .addComponent(jk2)
                            .addGap(6, 6, 6)
                            .addComponent(tkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tidkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tidsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42)
                                .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tidsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(jk1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jk2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tidkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tubah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ut)
                    .addComponent(us)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(ni)
                    .addComponent(gr))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ni, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(gr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(excel)
                        .addGap(1, 1, 1)
                        .addComponent(tabl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(222, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tabl1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(excel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelActionPerformed
        // TODO add your handling code here:
        File excelFile;
        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        XSSFWorkbook excelImportToJTable = null;
        String defaultCurrentDirectoryPath = "";
        JFileChooser excelFileChooser = new JFileChooser(defaultCurrentDirectoryPath);
        excelFileChooser.setDialogTitle("Select Excel File");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showOpenDialog(null);
        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            try {
                excelFile = excelFileChooser.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);
                excelImportToJTable = new XSSFWorkbook(excelBIS);
                XSSFSheet excelSheet = excelImportToJTable.getSheetAt(0);

                for (int row = 0; row < excelSheet.getLastRowNum(); row++) {
                    XSSFRow excelRow = excelSheet.getRow(row);

                    XSSFCell excelnis_siswa = excelRow.getCell(0);
                    XSSFCell excelizin = excelRow.getCell(1);
                    XSSFCell excelsakit = excelRow.getCell(2);
                    XSSFCell exceltanpa_keterangan = excelRow.getCell(3);
                    XSSFCell exceljumlah_kehadiran = excelRow.getCell(4);
                    XSSFCell exceltanggal = excelRow.getCell(5);
                    

                    tabmode.addRow(new Object[]{excelnis_siswa, excelizin, excelsakit, exceltanpa_keterangan, exceljumlah_kehadiran, exceltanggal});
                }

                JOptionPane.showMessageDialog(null, "Imported Successfully !!.....");
            } catch (IOException iOException) {
                JOptionPane.showMessageDialog(null, iOException.getMessage());
            } finally {
                try {
                    if (excelFIS != null) {
                        excelFIS.close();
                    }
                    if (excelBIS != null) {
                        excelBIS.close();
                    }
                    if (excelImportToJTable != null) {
                        excelImportToJTable.close();
                    }
                } catch (IOException iOException) {
                    JOptionPane.showMessageDialog(null, iOException.getMessage());
                }
            }
        }
    }//GEN-LAST:event_excelActionPerformed

    private void tabl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabl1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabmode = (DefaultTableModel) tabelSiswa.getModel();
        if(tabmode.getRowCount()==0){

            JOptionPane.showMessageDialog(this,"Tabel tidak boleh kosong");

        }else{
            String  nis_siswa,izin,sakit,tanpa_keterangan,jumlah_kehadiran,tanggal;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/smk_yappa","root","");
                for(int i = 0;i<tabmode.getRowCount();i++){
                    nis_siswa = tabmode.getValueAt(i,0).toString();
                    izin = tabmode.getValueAt(i,1).toString();
                    sakit = tabmode.getValueAt(i,2).toString();
                    tanpa_keterangan = tabmode.getValueAt(i,3).toString();
                    jumlah_kehadiran = tabmode.getValueAt(i,4).toString();
                    tanggal = tabmode.getValueAt(i,5).toString();

                    String query = "insert into t_absen (nis_siswa,izin,sakit,tanpa_keterangan,jumlah_kehadiran,tanggal) values(?,?,?,?,?,?)";
                    PreparedStatement prepstmt = con.prepareStatement(query);
                    prepstmt.setString(1,nis_siswa);
                    prepstmt.setString(2,izin);
                    prepstmt.setString(3,sakit);
                    prepstmt.setString(4,tanpa_keterangan);
                    prepstmt.setString(5,jumlah_kehadiran);
                    prepstmt.setString(6,tanggal);

                    prepstmt.execute();

                }

                JOptionPane.showMessageDialog(this, "Data berhasil dimasukan");

            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_tabl1ActionPerformed

    private void tabelSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSiswaMouseClicked
        // TODO add your handling code here:
        int bar = tabelSiswa.getSelectedRow();
        String a = tabmode.getValueAt(bar,0).toString();
        String b = tabmode.getValueAt(bar,1).toString();
        String c = tabmode.getValueAt(bar,2).toString();
        String d = tabmode.getValueAt(bar,3).toString();
        String e = tabmode.getValueAt(bar,4).toString();
        String f = tabmode.getValueAt(bar,5).toString();
        
       

        tidsiswa.setText(a);
        tnama.setText(b);
       
        talamat.setText(c);

        if(d.equals("L")) {
            jk1.setSelected(true);
            jk2.setSelected(false);
        } else {
            jk1.setSelected(false);
            jk2.setSelected(true);
        }

        tkelas.setSelectedItem(e);
        
        tidkelas.setText(f);
        
    }//GEN-LAST:event_tabelSiswaMouseClicked

    private void tidsiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidsiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidsiswaActionPerformed

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaActionPerformed

    private void jk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jk2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jk2ActionPerformed

    private void jk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jk1ActionPerformed

    private void tkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkelasActionPerformed
        // TODO add your handling code here:
        String item = (String)tkelas.getSelectedItem();
        String sql= "select * From kelas where kelas = ? ";
        try{

            java.sql.Statement stat = conn.createStatement();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, item);
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                String id = rs.getString("id");
                tidkelas.setText(id);
            }

        }catch(Exception e){

        }
    }//GEN-LAST:event_tkelasActionPerformed

    private void tidkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidkelasActionPerformed

    private void tombolSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSimpanActionPerformed
        // TODO add your handling code here:
        String sql = "insert into data_siswa values (?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tidsiswa.getText());
            stat.setString(2, tnama.getText());

            stat.setString(3, talamat.getText());
            String jkel="";
            if (jk1.isSelected()) jkel="L";
            else jkel = "P";
            stat.setString(4, jkel);
            stat.setString(5,tkelas.getSelectedItem().toString());

            stat.setString(6,tidkelas.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
         
            tidsiswa.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
    }//GEN-LAST:event_tombolSimpanActionPerformed

    private void tubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tubahActionPerformed
        // TODO add your handling code here
        try {

            String sql = "update data_siswa set NIS=?, nama_siswa =?, alamat=?,jk=?,nama_kelas=?, id_kelas=? where NIS='"+tidsiswa.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1,tidsiswa.getText());
            stat.setString(2,tnama.getText());

            stat.setString(3,talamat.getText());
            String jkel="";
            if (jk1.isSelected()) jkel="L";
            else jkel = "P";
            stat.setString(4, jkel);
            stat.setString(5,tkelas.getSelectedItem().toString());

            stat.setString(6,tidkelas.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
           
            tidsiswa.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }

    }//GEN-LAST:event_tubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "Hapus","Konfirmasi Dialog",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0) {
            String sql = "delete from data_siswa where nama_siswa = '"+tnama.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil Di Hapus");
               
                tnama.requestFocus();
                datatable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Data Gagal Di Hapus"+e);
            }
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double tug;
        double tus;
        double uas;
        double nil;
        String gra;
        
        tug = Integer.valueOf(tu.getText());
        tus = Integer.valueOf(ut.getText());
        uas = Integer.valueOf(us.getText());
        
        nil = (uas*50/100)+(tus*40/100)+(tug*10/100);
        gra = String.valueOf(nil);
        ni.setText(gra);
        
        if (nil >= 85){
            gr.setText("A");
        }
        else if(( nil <84)&&(nil>=70)){
            gr.setText("B");
        }
        else if ((nil <70)&&(nil>=55)){
            gr.setText("C");
        }
        else if ((nil<=55)&&(nil>=40)){
            gr.setText("D");
        }
        else if ((nil<=40)&&(nil>=00)){
            gr.setText("E");
        }
    }//GEN-LAST:event_jButton1ActionPerformed



private void persentase(String text, String text0, String text1, String text2, String text3) {
        int persen1=Integer.valueOf(text);
        int persen2=Integer.valueOf(text0);
        int persen3=Integer.valueOf(text1);
        int persen4=Integer.valueOf(text2);
        int persen5=Integer.valueOf(text3);
        if ((persen1+persen2+persen3+persen4+persen5) > 100)
        {
            JOptionPane.showMessageDialog(this,"Persentase Nilai yang Anda Masukan Tidak Valid");
        }
    }
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
            java.util.logging.Logger.getLogger(Kelas12E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kelas12E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kelas12E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kelas12E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kelas12E().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton excel;
    private javax.swing.JTextField gr;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton jk1;
    private javax.swing.JRadioButton jk2;
    private javax.swing.JTextField ni;
    private javax.swing.JTable tabelSiswa;
    private javax.swing.JButton tabl1;
    private javax.swing.JTextArea talamat;
    private javax.swing.JTextField tidkelas;
    private javax.swing.JTextField tidsiswa;
    private javax.swing.JComboBox<String> tkelas;
    private javax.swing.JTextField tnama;
    private javax.swing.JButton tombolSimpan;
    private javax.swing.JTextField tu;
    private javax.swing.JButton tubah;
    private javax.swing.JTextField us;
    private javax.swing.JTextField ut;
    // End of variables declaration//GEN-END:variables
}
