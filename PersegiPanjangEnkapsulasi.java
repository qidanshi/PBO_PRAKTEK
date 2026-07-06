package package09042026;
 

public class PersegiPanjangEnkapsulasi {

   
    //Atribut Variable
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
    public PersegiPanjangEnkapsulasi(){
        jumlahObjek++;
    }
    
    public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
        jumlahObjek++;
    }
    //Method dengan nilai pengembalian
    public int getPanjang(){
        return(panjang);
    }
    
    public void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    
    public int getlebar(){
        return(lebar);
    }
    
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    public int getLuas(){
        return(panjang * lebar);
    }
    
    public int getKeliling(){
        return(2*(panjang+lebar));
    }
    
    public static int getjumlahObjek(){
        return jumlahObjek;
    }
    
    //Method tanpa pengembalian
    public void TampilData(){
        System.out.println("Panjang Persegi Panjang = "+panjang);
        System.out.println("Lebar Persegi Panjang ="+lebar);
        System.out.println("Luas Persegi Panjang = "+getLuas());
        System.out.println("Keliling = "+getKeliling());
        
        
    }
    
   
}
