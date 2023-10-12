
package pertemusn_3;

public class contohProsedur {
    int alas = 5;
    int tinggi = 6;
    
    void hitungluasSegitiga(){
        double Luas = 0.5 * alas * tinggi;
        System.out.println("Luas = " + Luas);
    }
    public static void main(String[] args) {
        contohProsedur P = new contohProsedur();
        P.hitungluasSegitiga();
        
    }
}
         

