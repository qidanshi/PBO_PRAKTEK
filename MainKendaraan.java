
package package21052026;
 
import java.util.Scanner;
public class MainKendaraan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        kendaraan Kendaraan = null;
        System.out.println("Jenis Kendaraan");
        System.out.println("1.Mobil");
        System.out.println("2.Motor");
        System.out.println("3.Bus");
        System.out.print("Masukan Pilihan Anda :");
        int pil = input.nextInt();
        input.nextLine();
        switch(pil){
            case 1 : {
                System.out.print("Masukan Durasi Rental :");
                int durasi = input.nextInt();
                input.nextLine(); 
                System.out.print("Masukan Nomor Polisi : ");
                String nopolis = input.nextLine();
                double biayaRental = 350000;
                double total = durasi * biayaRental;
                Kendaraan = new Mobil(biayaRental, durasi, total, nopolis);
            }break;
            case 2 : {
                System.out.print("Masukan Durasi Rental :");
                int durasi = input.nextInt();
                input.nextLine(); 
                System.out.print("Masukan Nomor Polisi : ");
                String nopolis = input.nextLine();
                double biayaRental = 200000;
                
                double total = durasi * biayaRental;
                Kendaraan = new motor(biayaRental, durasi, total, nopolis);
            }break;
            case 3 : {
                System.out.print("Masukan Durasi Rental :");
                int durasi = input.nextInt();
                input.nextLine(); 
                System.out.print("Masukan Nomor Polisi : ");
                String nopolis = input.nextLine();
                double biayaRental = 350000;
                
                double total = durasi * biayaRental;
                Kendaraan = new bus(biayaRental, durasi, total, nopolis);
            }
        }
        System.out.println("Proses Rental");
        Kendaraan.kendaraanRental();
    }

   
}
