/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_11;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
    

/**
 *
 * @author ASUS
 */
public class Insert{

   koneksi Konek = new koneksi();
   

    public void insert(int NIM, String Nama, String Alamat, String Prodi) {

        try {
            Konek.koneksi();
            Statement statement = Konek.con.createStatement();
         //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
              String sql = "insert into bdmhs values('" + NIM + "','" + Nama + "','" + Prodi + "','" + Alamat + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }

}
    

