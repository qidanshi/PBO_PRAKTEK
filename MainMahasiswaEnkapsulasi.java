package package09042026;
 
import java.util.Scanner;
public class MainMahasiswaEnkapsulasi {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    MahasiswaEnkapsulasi pp1 = new MahasiswaEnkapsulasi();
    pp1.setNama("Heru Zaki Ryanda");
    pp1.setNim("2501081002");
    pp1.setJurusan("Teknik Komputer");
    pp1.setUmur(17);
    pp1.setIpk(4.0);
    pp1.TampilkanInfo();
    
    String nama, nim, jurusan;
    int umur;
    double ipk;
    System.out.print("\n\nMasukan Nama =");
    nama = input.nextLine();
    System.out.print("Masukan NIM =");
    nim = input.nextLine();
    MahasiswaEnkapsulasi pp2 = new MahasiswaEnkapsulasi(nama, nim);
    System.out.print("Masukan Jurusan = ");
    pp2.setJurusan(input.nextLine());
    System.out.print("Masukan Umur =");
    pp2.setUmur(input.nextInt());
    System.out.print("Masukan IPK = ");
    pp2.setIpk(input.nextDouble());
    System.out.println();
    pp2.TampilkanInfo();
    System.out.println();
    input.nextLine();
    
    System.out.print("Masukan Nama = ");
    nama = input.nextLine();
    System.out.print("Masukan NIM = ");
    nim = input.nextLine();
    System.out.print("Masukan Jurusan = ");
    jurusan=input.nextLine();
    System.out.print("Masukan Umur = ");
    umur=input.nextInt();
    System.out.print("Masukan IPK = ");
    ipk=input.nextDouble();
    System.out.println("\n");
    MahasiswaEnkapsulasi pp3 = new MahasiswaEnkapsulasi(nama, nim, jurusan, umur, ipk);
    pp3.TampilkanInfo();
    
    }
}
