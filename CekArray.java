/*
NAMA: M. Rizki Ramadhan
DESKRIPSI: ExceptionHandler
 */
package package11062026;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CekArray {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        int[] angka = {10,20,30,40,50};
        try{
        
        System.out.print("Mau ditampilkan array indeks keberapa?");
        int index = input.nextInt();
        System.out.print("Mau dibagi berapa?");
        int n=input.nextInt();
        int hasil = angka[index]/n;
        System.out.println("Hasil dari "+angka[index]+" di index ke-"+index+" = "+hasil);
        }
        catch(ArithmeticException e){
            System.out.println("Angka Pembagi Tidak Boleh 0 kits");
        }
        catch(InputMismatchException e){
            System.out.println("Masukan angka kits");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index diluar range array");
        }
        catch(Exception e){
            System.out.println("Error tidak terduga"+e.getMessage());
        }
        finally{
            System.out.println("-----Tampilkan Array-----");
            for(int i=0;i<angka.length;i++)
                System.out.print(" "+angka[i]);
            System.out.println();
            System.out.println("Array = "+Arrays.toString(angka));
        }
    }

}
