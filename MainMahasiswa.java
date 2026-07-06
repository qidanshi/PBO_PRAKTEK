/*
    NAMA/NOBP: M. Rizki Ramadhan/2501082004
    DESKRIPSI:PROGRAM Main Mahasiswa
 */
package package02042026;
 
import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args){
    
    Mahasiswa pp1 = new Mahasiswa();
    pp1.nama = "Heru ZAKI Ryanda";
    pp1.nobp ="2501081002";
    System.out.println("Nama = "+pp1.nama);
    System.out.println("NoBP="+pp1.nobp);
     
    Scanner input = new Scanner(System.in);
    double Tugas, UAS, UTS;
    System.out.print("Masukan Tugas =");
    Tugas = input.nextInt();
    System.out.print("Masukan UTS =");
    UTS = input.nextInt();
    System.out.print("Masukan UAS = ");
    UAS = input.nextInt();
    Mahasiswa pp2 = new Mahasiswa(Tugas, UAS, UTS);
    pp2.Tampilkan();
    
    
 
    }
}
