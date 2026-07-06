/*
    NAMA/NOBP: M. Rizki Ramadhan/2501082004
    DESKRIPSI:PROGRAM Main Persegi Panjang
 */
package package02042026;
 
import java.util.Scanner;
public class MainPersegiPanjang {
    
    public static void main(String[] args){
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 10;
        pp1.lebar=7;
        System.out.println("Akses Method Dalam Main Class");
        System.out.println("Luas Persegi Panjang = "+pp1.HitungLuas());
        System.out.println("Keliling = "+pp1.HitungKel());
        System.out.println();
        pp1.TampilData();
        
        PersegiPanjang pp2 = new PersegiPanjang(19, 10);
        pp2.TampilData();
        
        
        Scanner input = new Scanner(System.in);
        int p;
        int l;
        System.out.println("Panjang dan Lebar di input user =");
        System.out.print("Masukan Panjang = ");
        p = input.nextInt();
        System.out.print("Masukan Leebas = ");
        l = input.nextInt();
        PersegiPanjang pp3 = new PersegiPanjang(p, l);
        pp3.TampilData();
    }
    
    
    
}
