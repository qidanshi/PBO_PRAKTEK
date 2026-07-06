
package package21052026;
 
import java.util.Scanner;
public class MainPembayaran {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Pembayaran pembayaran =null;
        
        System.out.println("Sistem Pembayaran Toko Ahtong");
        System.out.println("==============================");
        
        System.out.println("Masukan ID Transaksi : ");
        String id = input.nextLine();
        
        System.out.println("Masukan Total Pembayaran : Rp.");
        double total = input.nextDouble();
        input.nextLine();
        
        System.out.println("Pilih Metode Pembayaran : ");
        System.out.println("1.Pembayaran Secara Tunai");
        System.out.println("2.Pembayaran Secara Transfer");
        System.out.println("3.Pembayaran Dengan Kartu Kredit");
        System.out.println("4.Pembayaran Dengan Ewallet");
        System.out.print("Masukan Pilihan Anda(1-4) : ");
        int pil = input.nextInt();
        input.nextLine();
        
        switch(pil){
            case 1 -> {
                System.out.print("Inputkan Jumlah Uang : Rp");
                double uang = input.nextDouble();
                pembayaran = new pembayaranTunai(uang,id,total);
            }
            case 2 -> {
                System.out.print("Masukan Nama Bank :");
                String namaBank = input.nextLine();
                pembayaran = new pembayaranTransfer(namaBank, id, total);
            }
            case 3 -> {
                System.out.println("Masukan Nama EWallet : ");
                String namaEWallet = input.nextLine();
                pembayaran = new  PembayaranEWallet(namaEWallet, id, total);
            }
            case 4 -> {
                System.out.println("Masukan No Kartu Kredit : ");
                String noKartu = input.nextLine();
                System.out.println("Masukan Nama Kartu : ");
                String namaKartu = input.nextLine();
                pembayaran = new PembayaranKartuKredit(noKartu, namaKartu, id, total);
            }
        }
            System.out.println("Konfirmasi Pembayaran ");
            pembayaran.prosesPembayaran();
            
                    
                       
                
}
    
        
        
        
        
        
    }

