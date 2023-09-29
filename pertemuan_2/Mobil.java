
package pertemuan_2;

public class Mobil {
  static Master_Mobil mobil = new Master_Mobil();
  
    public static void main(String[] args) {
        System.out.println("ini adalah mobil avanza");
        System.out.println(mobil.warnamobil);
        System.out.println(mobil.merkmobil);
        System.out.println(mobil.tahun);
        mobil.berhenti();
        mobil.berjalan();
    }
}
