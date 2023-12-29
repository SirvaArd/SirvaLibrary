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
public class Delete {
    koneksi konek = new koneksi();

    public void delete(int NIM) {

        try {
            konek.koneksi();
            Statement statement = (Statement) konek.con.createStatement();
             String sql = "delete from bdmhs where NIM = '" + NIM +"'";
             statement.executeUpdate(sql);
             statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil DiHapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
