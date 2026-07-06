/*
NAMA: M. Rizki Ramadhan
DESKRIPSI: ExceptionHandler
 */
package package11062026;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CekAngka {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b;
        int hasil;
        try{
        System.out.print("Masukan bilangan pertama : ");
        a = input.nextInt();
        System.out.print("Masukan bilangan kedua : ");
        b = input.nextInt();
        hasil = a/b;
        System.out.println("Hasil : "+hasil);
        }
        catch(ArithmeticException e){
            System.out.println("Nilai kedua tidak boleh 0");
        }
        catch(InputMismatchException e){
            System.out.println("Masukan Angka Woi Lah");
        }
        catch(Exception e){
            System.out.println("Error tidak terduga"+e.getMessage());
        }
        finally{
            System.out.println("Pengecekan Nilai Selesai");
        }
    }
}
