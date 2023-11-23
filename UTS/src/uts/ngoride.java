/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;


public class ngoride extends ngofood {
    String lokasi;
    String tujuan;
    int biaya;
    int jarak;
    
    
    
    void system(String lokasi1,String tujuan1,int jarak1){
        this.lokasi = lokasi1;
        this.tujuan = tujuan1;
        this.jarak = jarak1;
        total = (biaya*jarak)+ongkir;
    }
    
    @Override
    void tampilsystem(){
        System.out.println("Lokasi anda    \t :"+lokasi);
        System.out.println("Lokasi tujuan  \t:"+tujuan);
        System.out.println("Biaya order  \t:"+total);
    }
    
    
    
}
