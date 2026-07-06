package package30042026;

public class Pesawat extends Udara{
    private int muatan;
    
    
    public Pesawat(){
        super();
    }
    
    public Pesawat(String nama, int tahunProduksi, boolean mesin, int muatan){
        super(nama, tahunProduksi, mesin);
        this.muatan=muatan;
    }
    
    public int getMuatan(){
        return muatan;
    }
 
    public void setMuatan(int muatan){
        this.muatan=muatan;
    }
    
    public void reset(String nama, int tahunProduksi, boolean mesin, int muatan){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
    
    public String kategori(int muatan){
        if(muatan <= 50)
            return "kecil";
        else if (muatan <= 150 )
                return "sedang";
        else
            return "besar";
        
    }
    
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Muatan = "+muatan+" penumpang");
        System.out.println("Kategori = "+kategori(muatan));
    }
    
    
    
    
    
}
