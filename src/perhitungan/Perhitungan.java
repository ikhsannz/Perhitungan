
package perhitungan;

import java.util.Scanner;

public class Perhitungan {

    public static void main(String[] args) {
        //scanner ( agar bisa membaca inputan dari keyboard)
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        //tampilan 
        System.out.println("Aplikasi perhitungan");  
        System.out.println("1. menghitung kecepatan (km/jam)");
        System.out.println("2. menghitung jarak (km)");     
        System.out.println("3. menghitung waktu (jam)"); 
        
        
        for(String x = "y"; x.equals("y") || x.equals("Y");){ //perulangan
        
        //input pilihan awal
        System.out.print("silakan pilih perhitungan mana yang mau dihitung (1/2/3):");
        int input = sc1.nextInt(); 
        double hasil, nilai1, nilai2;
        
        
        //input data dan rumus
        if(input == 1){
            System.out.println("menghitung kecepatan");
            System.out.print("masukan jarak(km)     :");
                nilai1=sc2.nextDouble();
            System.out.print("masukan waktu (jam)   :");
                nilai2 = sc3.nextDouble();
            hasil=nilai1/nilai2;
            System.out.println("kecepatan anda adalah :"+hasil+" km/jam");
        }
        else if(input == 2){
            System.out.println("menghitung Jarak");
            System.out.print("masukan Kecepatan(km/jam) :");
                nilai1=sc2.nextDouble();
            System.out.print("masukan waktu (jam)       :");
                nilai2 = sc3.nextDouble();
            hasil=nilai1*nilai2;
            System.out.println("Jarak anda adalah :"+hasil+" km");
        }
        else if(input == 3){
            System.out.println("menghitung Waktu");
            System.out.print("masukan jarak(km)     :");
                nilai1=sc2.nextDouble();
            System.out.print("masukan waktu (jam)   :");
                nilai2 = sc3.nextDouble();
            hasil=nilai1/nilai2;
            System.out.println("waktu anda adalah :"+hasil+" jam");
        }
        else{
            System.out.println("Maaf, Pilihan kami hanya sampai 3 !!!");
        }
        
        //inputan untuk melakukan perulangan
        System.out.print("Mau menghitung lagi? lagi? (Y/T) : "); 
        x = sc1.next();
    }
        
   }
    
}
