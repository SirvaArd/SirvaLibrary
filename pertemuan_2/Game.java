
package pertemuan_2;

public class Game {
    public static void main(String[] args) {
        Player_game petani = new Player_game();
        
        petani.name = "Sirva Ardiyanti";
        petani.speed = 100;
        petani.healtpoin = 0;
        
        petani.run();
        
        if(petani.isdead()){
            System.out.println("Game Over");
        }
    }
 
}
