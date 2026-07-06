
package package21052026;
 
public class PembayaranEWallet extends Pembayaran{
    private String namaEWallet;

    public PembayaranEWallet(String namaEWallet, String idTransaksi, double jumlahBayar) {
        super(idTransaksi, jumlahBayar);
        this.namaEWallet = namaEWallet;
    }

    public String getNamaEWallet() {
        return namaEWallet;
    }

    public void setNamaEWallet(String namaEWallet) {
        this.namaEWallet = namaEWallet;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Proses pembayaran dengan EWallet");
        System.out.println("Nama EWallet : "+namaEWallet);
        System.out.println("Id Transaksi :"+idTransaksi);
        System.out.println("Jumlah Bayar : Rp."+jumlahBayar);
    }
    
    
    
    
}
