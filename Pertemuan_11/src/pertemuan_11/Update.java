/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class Update {
    koneksi konek = new koneksi();

    public void update(String Nama,int NIM,String Prodi,String Alamat) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            //String sql = "update tbdatawarga set NoReg='" + NoReg + "', Nama ='" + Nama + "', NoNik'" + NoNik + "', Agama = '" + Agama +"', Telp = '" + Telp +"', Alamat = '" + Alamat + "', where NoReg='"+ NoReg +"'" ;            
            String sql_Nama = "update bdmhs set Nama='" + Nama + "'where NIM='" + NIM + "'";
            //String sql_NIM = "update bdmhs set NIM='" + NIM + "'where NIM='" + NIM + "'";
            String sql_Prodi = "update bdmhs set Prodi='" + Prodi + "'where NIM='" + NIM + "'";
            String sql_Alamat = "update bdmhs set Alamat='" + Alamat + "'where NIM='" + NIM + "'";
            
            
            statement.executeUpdate(sql_Nama);
            statement.executeUpdate(sql_Prodi);
            statement.executeUpdate(sql_Alamat);
            
            
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil DiUbah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
