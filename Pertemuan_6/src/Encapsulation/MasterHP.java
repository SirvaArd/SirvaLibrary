
package Encapsulation;

public class MasterHP {
    private String NamaHP;
    private String Imei;
    
    public void SetNamaHP(String NamaHP){
        this.NamaHP = NamaHP;
    }
    public void SetImei(String Imei){
        this.Imei = Imei;
    }
    public String GetNamaHP(){
        return this.NamaHP;
    }
    public String GetImei(){
        return this.Imei;
    }
        
    
    
}
