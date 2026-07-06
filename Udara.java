package package30042026;

public class Udara extends Kendaraan {
    private boolean mesin;
    
    
     public Udara(){
        super();
    }
    
public Udara(String nama, int tahunProduksi, boolean mesin){
       super(nama, tahunProduksi);
       this.mesin = mesin;
    } 
    
    public boolean getMesin(){
        return(mesin);
    }
    
    public void setMesin(boolean mesin){
        this.mesin = mesin;
    }
    
         
    
    
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Menggunakan Mesin = "+(mesin?"Ya":"Tidak"));
    }
    
    
}
