
package package21052026;
 
import java.util.Scanner;
public class MainKaryawan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        karyawan Karyawan = null;
        
        System.out.println("Sistem Penggajian Karyawan");
        System.out.println("===========================");
        
        System.out.print("Masukan Nama Karyawan : ");
        String nama = input.nextLine();
        
        System.out.print("Masukan NIK Karyawan : ");
        String nik = input.nextLine();
        
        System.out.println("\nJenis Karyawan");
        System.out.println("====================");
        System.out.println("1.Karyawan Tetap");
        System.out.println("2.Karyawan Kontrak");
        System.out.println("Masukan Pilihan Anda : ");
        int pil = input.nextInt();
        
        switch(pil){
    case 1 -> {
        System.out.println("Karyawan Tetap");
        System.out.println("Masukan Golongan Anda (1-3)");
        int gol = input.nextInt();
        switch(gol){
            case 1 -> {
                double gajiPokok = 3000000;
                double tunjangan = gajiPokok * 0.12;
                Karyawan = new karyawanTetap(gol, gajiPokok, tunjangan, nik, nama);
            }
            case 2 -> {
                double gajiPokok = 4000000;
                double tunjangan = gajiPokok * 0.12;
                Karyawan = new karyawanTetap(gol, gajiPokok, tunjangan, nik, nama);
            }
            case 3 -> {
                double gajiPokok = 5000000;
                double tunjangan = gajiPokok * 0.12;
                Karyawan = new karyawanTetap(gol, gajiPokok, tunjangan, nik, nama);
            }

                     
            
        }
        }
                 case 2 ->{
                     System.out.println("Karyawan Kontrak");
                     double honor = 2500000;
                     Karyawan = new karyawanKontrak(honor, nik, nama);
                 }
        }
       
        System.out.println("Proses Penggajian: ");
            Karyawan.gajikaryawan();
    }
}
