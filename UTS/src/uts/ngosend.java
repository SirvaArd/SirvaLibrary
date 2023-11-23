/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author user
 */
public class ngosend extends ngofood{
    
    
    double jarak,berat,biaya;
    
   
    void system (String nama1,double jarak1,double berat1){
    
        this.nama = nama1;
        this.jarak = jarak1;
        this.berat = berat1;
        biaya = (berat * 1000) + (jarak * 1000) + ongkir;
}
    @Override
    void tampilsystem(){
        System.out.println("Nama barang  \t:"+nama);
        System.out.println("Berat barang  \t:"+berat+"kg");
        System.out.println("Jarak kirim  \t:"+jarak+"km");
        System.out.println("Biaya order  \t:"+biaya);
    }
    
    
}
