
package pertemuan_2;


public class hitungLuasBangunDatar {
    
   static RumusLuasBangunDatar rumus = new RumusLuasBangunDatar();
    
    public static void main(String[] args) {
        
        System.out.println("Luas lingkaran dengan phi 3,14 dan r 10 memiliki nilai= ");
        System.out.println(rumus.rumusLuasLingkaran(3.14,10 ));
        
        System.out.println("Luas Persegi Panjang 23 dan lebar 13 memiliki nilai= ");
        System.out.println(rumus.rumusLuasPersegiPanjang(23, 13));
        
    }
}
