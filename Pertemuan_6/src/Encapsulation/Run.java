
package Encapsulation;

public class Run {
     public static void main(String[] args) {
        MasterHP setting = new MasterHP();
        setting.SetNamaHP("Iphone");
        setting.SetImei("2304");
        System.out.println("Merek HP : " + setting.GetNamaHP());
        System.out.println("Nomor Imei : " + setting.GetImei());
        
        
    }
    
}
