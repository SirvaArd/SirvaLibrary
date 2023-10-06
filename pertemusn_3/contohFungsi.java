
package pertemusn_3;

public class contohFungsi {
    int alas = 5;
    int tinggi = 6;
    
    double HitungluasSegitiga(){
        double Luas = 0.5 * alas * tinggi;
        System.out.println("Luas = " + Luas);
        return Luas;
}
    public static void main(String[] args) {
        contohFungsi F = new contohFungsi();
        System.out.println("Luas Segitiga adalah = " + F.HitungluasSegitiga());
    }
}
