/*
    NAMA/NOBP: M. Rizki Ramadhan/2501082004
    DESKRIPSI: PROGRAM Main Persegi Panjang
 */
package package02042026;
 
public class Mahasiswa {
    
    String nama, nobp;
    double UTS, Tugas, UAS;
    
    Mahasiswa (){
        
    }
    
    Mahasiswa (double tgs,double uas,double uts){
        UTS = uts;
        Tugas = tgs;
        UAS = uas;
    }
    
    double NilaiAkhir(){
        return((0.25*Tugas)+(0.35*UTS)+(0.4*UAS));
    }
    
    void Tampilkan(){
        System.out.println("Nilai Akhir = "+NilaiAkhir());
    }
    
    
}
