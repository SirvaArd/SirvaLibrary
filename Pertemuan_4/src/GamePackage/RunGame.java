
package GamePackage;

public class RunGame {
    public static void main(String[] args) {
    Enemy monster = new Enemy();
    Zombie zumbi = new Zombie();
    Pocong poccy = new Pocong();
    Burung kutilang = new Burung();
    
   //Monster
    monster.name="Blue";
    monster.attack();
    
    //Zombi
    zumbi.name = "Sirva";
    System.out.println(zumbi.name);
    zumbi.attack();
    zumbi.walk();
    
    //Pocong
    poccy.jump();
    poccy.attackPoin=100;
        System.out.println("Attack"+poccy.attackPoin);
    
    //garuda
    kutilang.fly();
    kutilang.jump();
    kutilang.walk();
    kutilang.name="KUTILANG";
        System.out.println("nama"+ kutilang.name);
        
    }
    
}
