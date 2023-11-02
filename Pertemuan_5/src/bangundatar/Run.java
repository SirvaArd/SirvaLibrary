
package bangundatar;

public class Run {
     public static void main(String[] args) {
        System.out.println("\t\tMENGHITUNG BANGUN DATAR...\n\n");
        
        
        Lingkaran lkr = new Lingkaran();
        Persegi psg = new Persegi();
        PersegiPanjang psg_pj = new PersegiPanjang();
        Segitiga sgt = new Segitiga();
        
        System.out.println("Lingkaran : ");
        lkr.r=27;
        System.out.println("Lingkaran dengan jari jari "+ lkr.r);
        System.out.print("memiliki ");
        lkr.luas();
        System.out.print("memiliki ");
        lkr.keliling();
        System.out.println(" ");
       
        psg_pj.lebar=6;
        psg_pj.panjang=8;
        psg_pj.keliling();
        psg.sisi=5;
        psg.keliling();
        psg.luas();
        sgt.alas=3;
        sgt.tinggi=5;
        sgt.luas();
        
        
        
    }
    
}
