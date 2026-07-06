
package package21052026;
 
public class PembayaranKartuKredit extends Pembayaran{
    private String noKartu;
    private String namaKartu;

    public PembayaranKartuKredit(String noKartu, String namaKartu, String idTransaksi, double jumlahBayar) {
        super(idTransaksi, jumlahBayar);
        this.noKartu = noKartu;
        this.namaKartu = namaKartu;
    }

    public String getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(String noKartu) {
        this.noKartu = noKartu;
    }

    public String getNamaKartu() {
        return namaKartu;
    }

    public void setNamaKartu(String namaKartu) {
        this.namaKartu = namaKartu;
    }

    @Override
    public void prosesPembayaran() {
       System.out.println("Proses Pembayaran Dengan Kartu Kredit :");
       System.out.println("Nama Kartu :"+namaKartu);
       System.out.println("No Kartu :"+noKartu);
       System.out.println("ID Transaksi :"+idTransaksi);
       System.out.println("Jumlah Bayar : Rp."+jumlahBayar);
       
    }
    
    
}
