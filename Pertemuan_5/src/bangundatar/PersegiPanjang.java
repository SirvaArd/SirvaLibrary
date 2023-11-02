
package bangundatar;

public class PersegiPanjang extends MasterRumus{
    
    float panjang;
    float lebar;
    
    @Override
    float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float klg = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: " + klg);
        return klg;
    }
    
}
