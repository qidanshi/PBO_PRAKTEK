
package package21052026;
 
public abstract class Pembayaran {
    protected String idTransaksi;
    protected double jumlahBayar;

    public Pembayaran() {
    }

    public Pembayaran(String idTransaksi, double jumlahBayar) {
        this.idTransaksi = idTransaksi;
        this.jumlahBayar = jumlahBayar;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public abstract void prosesPembayaran();
    

    
    
    
   
    
    
    
    
}
