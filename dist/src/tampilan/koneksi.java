/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

import java.sql.*;
import javax.swing.JOptionPane;

 
public class koneksi {
     private Connection koneksi;
    public Connection connect() {
            try {
                Class.forName ("com.mysql.jdbc.Driver");
                System.out.println ("Berhasil Koneksi");
            }catch (ClassNotFoundException ex) {
                System.out.println ("Gagal Koneksi" + ex);
            }
            String url = "jdbc:mysql://localhost/sistem_akademikyappa";
            try {
                koneksi = DriverManager.getConnection(url,"root","");
                System.out.println("Berhasil Koneksi Database");
            } catch (SQLException ex) {
                System.out.println ("Gagal Koneksi" + ex);
            }
            return koneksi;
    }
}