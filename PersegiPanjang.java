/*
    NAMA/NOBP: M. Rizki Ramadhan/2501082004
    DESKRIPSI:PROGRAM PersegiPanjang
 */
package package02042026;
 

public class PersegiPanjang {
    
    //Atribut Variable
    int panjang;
    int lebar;
    
    PersegiPanjang(){
        
    }
    
    PersegiPanjang(int p, int l){
        panjang=p;
        lebar=l;
    }
    //Method dengan nilai pengembalian
    int HitungLuas(){
        return(panjang*lebar);
    }
    
    int HitungKel(){
        return(2*(panjang+lebar));
    }
    //Method tanpa pengembalian
    void TampilData(){
        System.out.println("Panjang Persegi Panjang = "+panjang);
        System.out.println("Lebar Persegi Panjang ="+lebar);
        System.out.println("Luas Persegi Panjang = "+HitungLuas());
        System.out.println("Keliling = "+HitungKel());
        
        
    }
    
   
}
