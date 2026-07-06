package package09042026;
 
public class RekeningNasabah {
    
    private String noRek;
    private String nmNasabah;
    private double saldo;
    
    public RekeningNasabah (){
        
    }
    
    public RekeningNasabah (String noRek, String nmNasabah, double saldo){
        this.noRek = noRek;
        this.nmNasabah = nmNasabah;
        this.saldo = 1000000;
    }
    
    public String getNoRek(){
        return(noRek);
    }
    
    public String getNmNasabah(){
        return(nmNasabah);
    }
    
    public double getSaldo(){
        return(saldo);
    }
    
    public void setNoRek(String noRek){
        this.noRek = noRek;
    }
    
    public void setNmNasabah(String nmNasabah){
        this.nmNasabah = nmNasabah;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void deposit(double jumlah){
        if(jumlah > 0){
        saldo = saldo + jumlah;
        System.out.println("Deposit Rp."+jumlah+" Berhasil");
        }
        else{
            System.out.println("Deposit Tidak Valid");
            
        }
    }
    
    public void withdraw(double jumlah){
        if(jumlah > saldo){
            System.out.println("Saldo Tidak Cukup");
         
        }
        else if(jumlah > 0){
            saldo = saldo - jumlah;
            System.out.println("Withdraw Sebesar Rp."+jumlah+" Berhasil");
            
        }
        else {
            System.out.println("Jumlah yang dimasukan tidak valid");
        }
    }
    public void TampilkanInfo(){
        System.out.println("No Rekenning = "+getNoRek());
        System.out.println("Nama Nasabah = "+getNmNasabah());
        System.out.println("Saldo = Rp."+getSaldo());
    }
}
