
package package21052026;
 
public class pembayaranTransfer extends Pembayaran {
    private String namaBank;

    public pembayaranTransfer(String namaBank, String idTransaksi, double jumlahBayar) {
        super(idTransaksi, jumlahBayar);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Proses Pembayaran Secara Transfer : ");
        System.out.println("Bank :"+namaBank);
        System.out.println("Id Transaksi : "+idTransaksi);
        System.out.println("Jumlah Pembayaran : Rp."+jumlahBayar);
    }
    
    
    
    
}
