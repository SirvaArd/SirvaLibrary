
package uts;


public class ngofood {
    
    protected String nama;
    protected int harga,total;
    protected int ongkir = 5000;
    
   
    
    void system(String nama1,int harga1){
        this.nama = nama1;
        this.harga = harga1;
        total = harga + ongkir;
    }
    
    void tampilsystem(){
        
        System.out.println("Anda memilih \t: " + nama);
        System.out.println("Total order \t: " + total);
    }
    
}
