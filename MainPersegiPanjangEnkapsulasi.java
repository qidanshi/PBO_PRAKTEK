package package09042026;
 
import java.util.Scanner;
public class MainPersegiPanjangEnkapsulasi {
   
    public static void main(String[] args){
        
        System.out.println("Banyak Objek ="+PersegiPanjangEnkapsulasi.getjumlahObjek());
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi(19, 10);
        pp1.setPanjang(10);
        pp1.setLebar(7);
        System.out.println("Akses Method Dalam Main Class");
        System.out.println("Luas Persegi Panjang = "+pp1.getLuas());
        System.out.println("Keliling = "+pp1.getKeliling());
        System.out.println();
        pp1.TampilData();
        System.out.println("Banyak Objek ="+PersegiPanjangEnkapsulasi.getjumlahObjek() );
        
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(19, 10);
        pp2.TampilData();
        
        
        Scanner input = new Scanner(System.in);
        int setPanjang;
        int setLebar;
        System.out.println("Panjang dan Lebar di input user =");
        System.out.print("Masukan Panjang = ");
        setPanjang = input.nextInt();
        System.out.print("Masukan Leebas = ");
        setLebar = input.nextInt();
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(setPanjang, setLebar);
        pp3.TampilData();
        System.out.println("Banyak Objek ="+PersegiPanjangEnkapsulasi.getjumlahObjek() );
    }
    
    
    
}
