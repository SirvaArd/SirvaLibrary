
package uts;

    import java.util.Scanner;
    public class Ngojek {

    public static void main(String[] args) {
        
       String user="gojek";
       int pass = 123;
       int pilih;
       
       // Deklarasi nama class baru
       ngofood a = new ngofood();
       ngoride b = new ngoride();
       ngosend c = new ngosend();
       Scanner input = new Scanner(System.in);
       
        System.out.println("===== PROGRAM GOJEK SEDERHANA DENGAN KONSEP OOP =====");
        System.out.println("\n ***** SILAHKAN LOGIN *****");
        System.out.println("\n * Masukkan username : ");
        String username=input.nextLine();
        System.out.println(" * Masukkan password : ");
        int password=input.nextInt();
        if(username.equals(user)&&password==pass){
        do{    
        System.out.println("\n * Silahkan pilih menu yang diinginkan");
        System.out.println("1.Ngoride");
        System.out.println("2.Ngofood");
        System.out.println("3.Ngosend");
            System.out.println("4.Log Out");
        System.out.println("\n Masukkan pilihan anda");
         input.nextLine();
         pilih = input.nextInt();
        
        switch(pilih){
            
            case 1:
                
            System.out.println("\n * Anda memilih menu ngoride silahkan pilih alamat tujuan yang diinginkan");
            System.out.println("1.Besuki - Udanawu");
            System.out.println("2.Jemekan - Kediri");
            System.out.println("3.Rejotangan - Tulungagung");
            System.out.println("\n Masukkan pilihan anda : ");    
            int pilih1=input.nextInt();
            switch(pilih1){
                case 1 -> {
                    b.system("Besuki", "Udanawu", 2);
                    b.tampilsystem();
                }
                    
                case 2 -> {
                    b.system("Jemekan", "Kediri", 4);
                    b.tampilsystem();
                }
                    
                case 3 -> {
                    b.system("Rejotangan", "Tulungagung", 3);
                    b.tampilsystem();
                }
                    
                    
            }
            break;

            
            case 2:
                System.out.println("\n * Anda memilih menu ngofood silahkan pilih");
                System.out.println("1.Bakso");
                System.out.println("2.Soto");
                System.out.println("3.Nasi Campur");
                System.out.println("4.Nasi Padang");
                System.out.println("5.Ayam Geprek");
                System.out.println("\n Masukkan pilihan anda : ");
                int pilih2=input.nextInt();
                
                switch(pilih2){
                    
                    case 1 -> {
                        a.system("Bakso", 1000);
                        a.tampilsystem();
                }
                        
                    case 2 -> {
                        a.system("Soto", 6000);
                        a.tampilsystem();
                }
                        
                    case 3 -> {
                        a.system("Nasi Campur", 8000);
                        a.tampilsystem();
                }
                        
                    case 4 -> {
                        a.system("Nasi Padang", 11000);
                        a.tampilsystem();
                }
                        
                    case 5 -> {
                        a.system("Ayam Geprek", 9000);
                        a.tampilsystem();
                }
                        
                }

                
            case 3 :
                System.out.println("\n * Anda memilih menu ngosend silahkan pilih");
                System.out.println("Silahkan Mengisi form Pengiriman :");
                System.out.print("Nama Barang \t: ");
                String nama = input.nextLine();
                input.nextLine();
                System.out.print("Berat Barang \t: ");
                double barang = input.nextDouble();
                System.out.print("Jarak Kirim \t: ");
                double jarak = input.nextDouble();
                c.system(nama, jarak, barang);
                c.tampilsystem();
                break;
            
            case 4:
                System.out.println("Terimakasih !!!");
                }
                
            
        }while(pilih != 4);
    }
    } 
    }
    