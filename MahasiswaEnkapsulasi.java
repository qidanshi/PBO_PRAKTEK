
package package09042026;
 

public class MahasiswaEnkapsulasi {
    
    private String nama, nim, jurusan;
    private int umur; 
    private double ipk;
    private String statusKelulusan;
    
    public MahasiswaEnkapsulasi (){
        
    }
    
    public MahasiswaEnkapsulasi (String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    public MahasiswaEnkapsulasi(String nama, String nim, String jurusan, int umur, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.umur = umur;
        this.ipk = ipk;
    }
    
    public String getNama(){
        return(nama);
    }
    
    public String getNim(){
        return(nim);
    }
    
    public String getJurusan(){
        return(jurusan);
    }
    
    public int getUmur(){
        return(umur);
    }
    
    public double getIpk(){
        return(ipk);
    }
    
    
    public void setNama(String nama){
       this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public void setIpk(double ipk){
        this.ipk = ipk;
    }
    
    public String statusKelulusan(){
        if(ipk > 3.5){
            statusKelulusan = "Lulus";
        } else {
            statusKelulusan = "Tidak Lulus";
        }
        return statusKelulusan;
       
    }
            
    
    public void TampilkanInfo(){
       System.out.println("Nama = "+getNama());
       System.out.println("NIM = "+getNim());
       System.out.println("Jurusan = "+getJurusan());
       System.out.println("Umur = "+getUmur());
       System.out.println("IPK = "+getIpk());   
       System.out.println("Status Kelulusan =  "+statusKelulusan());
    }
    
    
}
