/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import Admin.DashboardAdmin1;
import java.sql.Connection;
import koneksi.koneksi;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import static tampilan.DashboardAdmin.LReport;
import static tampilan.DashboardAdmin.LReport11;
import static tampilan.DashboardAdmin.Lguru;
import static tampilan.DashboardAdmin.Lhome;
import static tampilan.DashboardAdmin.Lmapel1;
import static tampilan.DashboardAdmin.Lnilai1;
import static tampilan.DashboardAdmin.Lsiswa;
import static tampilan.DashboardAdmin.babsen;
import static tampilan.DashboardAdmin.tcari;
import static tampilan.DashboardAdmin.tinputkelas;
import static tampilan.DashboardAdmin.tuser1;
import static Admin.DashboardAdmin1.LReport2;
import static Admin.DashboardAdmin1.LReport112;
import static Admin.DashboardAdmin1.Lguru2;
import static Admin.DashboardAdmin1.Lhome2;
import static Admin.DashboardAdmin1.Lmapel12;
import static Admin.DashboardAdmin1.Lnilai12;
import static Admin.DashboardAdmin1.Lsiswa2;
import static Admin.DashboardAdmin1.babsen2;
import static Admin.DashboardAdmin1.tcari2;
import static Admin.DashboardAdmin1.tinputkelas2;



/**
 *
 * @author sahruli nur rizki
 */
public class Loginc extends javax.swing.JFrame {
private Connection conn = new koneksi().connect();

DashboardAdmin a;
DashboardAdmin1 b;
    /**
     * Creates new form Loginc
     */
    public Loginc() {
      
        initComponents();
        setLocationRelativeTo(this);
        a= new DashboardAdmin();
        a.setVisible(false);
        b= new DashboardAdmin1();
        b.setVisible(false);
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
        cbuser = new javax.swing.JComboBox();
        tuser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tpas = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        regis = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/gambar/icon.png")).getImage());
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cbuser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbuser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "USERTYPE", "admin", "guru", "siswa" }));
        cbuser.setBorder(null);
        cbuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbuserKeyPressed(evt);
            }
        });

        tuser.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tuserKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        tpas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tpas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpasActionPerformed(evt);
            }
        });
        tpas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpasKeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("KELUAR");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logoyapa.png"))); // NOI18N

        regis.setBackground(new java.awt.Color(102, 102, 102));
        regis.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        regis.setForeground(new java.awt.Color(255, 255, 255));
        regis.setText("REGISTRASI");
        regis.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOGIN SISTEM AKADEMIK");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");

        pword.setBackground(new java.awt.Color(102, 102, 102));
        pword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pword.setText("Lihat Password");
        pword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regis, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(tpas, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tuser, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbuser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pword)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tuser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tpas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbuser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisActionPerformed
        // TODO add your handling code here:
        new Registrasi().show();
        this.dispose();
    }//GEN-LAST:event_regisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       
        try {
            Connection conn = new koneksi().connect();
            Statement stat = conn.createStatement();
            
            //sql utk login
                ResultSet rs = stat.executeQuery ("select * from t_user  where username ='"+tuser.getText()+"'"
                +"and password='"+tpas.getText()
                +"'and usertype ='"+cbuser.getSelectedItem()+"'");
            
            //untuk session
            if(rs.next()){

                tuser1.setText(rs.getString(2));
            }
            rs.last();
            
            
            if (rs.getRow()==1) {
               
                
                String ak = rs.getString("usertype");
                if(ak.equals("admin")) {
                    JOptionPane.showMessageDialog(null,"Login Berhasil Sebagai Admin||");
                    
                    b.setVisible(true);
                  
                    Lhome2.setVisible(true);
                    Lsiswa2.setVisible(true);
                    Lguru2.setVisible(true);
                    Lnilai12.setVisible(true);
                    LReport2.setVisible(true);
                    LReport112.setVisible(true);
                    Lmapel12.setVisible(true);
                    tcari2.setVisible(true);
                    tinputkelas2.setVisible(true);
                    babsen2.setVisible(true);

                    tpas.setText("");
                    tuser.setText("");
                    cbuser.setSelectedItem("admin");
                    this.dispose();
                }else  if(ak.equals("guru")){
                    JOptionPane.showMessageDialog(null,"Login Berhasil Sebagai Guru||"+tuser1.getText());
                 
                    a.setVisible(true);
                   
                    Lhome.setVisible(true);
                    Lhome.setVisible(true);
                    Lsiswa.setVisible(false);
                    Lguru.setVisible(false);
                    Lnilai1.setVisible(true);
                    LReport.setVisible(false);
                    LReport11.setVisible(false);
                    Lmapel1.setVisible(false);
                    tcari.setVisible(true);
                    tinputkelas.setVisible(false);
                    babsen.setVisible(true);
                    //

                    tpas.setText("");
                    tuser.setText("");
                    cbuser.setSelectedItem("guru");
                    this.dispose();
                    
                }else if(ak.equals("siswa")){
                    JOptionPane.showMessageDialog(null,"Login Berhasi Sebagai Siswa||"+tuser1.getText());
                    a.setVisible(true);
                   
                    Lhome.setVisible(true);
                    Lsiswa.setVisible(false);
                    Lguru.setVisible(false);
                    Lnilai1.setVisible(false);
                    LReport.setVisible(false);
                    LReport11.setVisible(false);
                    Lmapel1.setVisible(false);
                    tcari.setVisible(true);
                    tinputkelas.setVisible(false);
                    babsen.setVisible(false);
                    //

                    tpas.setText("");
                    tuser.setText("");
                    cbuser.setSelectedItem("siswa");
                    this.dispose();
                }
                
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(null,"Ada Kesalahan Pada Username/Password/Usertype");
                 tpas.setText("");
                 tuser.setText("");
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           
    }
    }//GEN-LAST:event_jButton1KeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        ImageIcon icon = new ImageIcon("src/gambar/icon.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
      
    }//GEN-LAST:event_formWindowOpened

    private void tuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tuserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        }
    }//GEN-LAST:event_tuserKeyPressed

    private void tpasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpasKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        }
    }//GEN-LAST:event_tpasKeyPressed

    private void cbuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbuserKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        }
    }//GEN-LAST:event_cbuserKeyPressed

    private void pwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwordActionPerformed
        // TODO add your handling code here:
        if(pword.isSelected()){
            tpas.setEchoChar((char)0);
        }
        else{
            tpas.setEchoChar('*');
        }
    }//GEN-LAST:event_pwordActionPerformed

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
            UIManager.setLookAndFeel(new BernsteinLookAndFeel());
        } catch (Exception e) {
        }
      new Loginc().setVisible(true);
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox pword;
    private javax.swing.JButton regis;
    private javax.swing.JPasswordField tpas;
    private javax.swing.JTextField tuser;
    // End of variables declaration//GEN-END:variables
}
