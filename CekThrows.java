/*
NAMA: M. Rizki Ramadhan
DESKRIPSI: ExceptionHandler
 */
package package11062026;

import java.util.*;
public class CekThrows {
    public static void cekAngka(int a) throws Exception{
        if(a<0){
            throw new Exception("Nilai tidak boleh negatif");
            
        }
        else if(a>100){
            throw new Exception("Nilai tidak boleh melebihi 100");
        }
    }
    
    
    
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka = ");
        a = input.nextInt();
        try{
            cekAngka(a);
            System.out.println("Nilai berhasil disimpan");
        }
        catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        
    }
    
}
