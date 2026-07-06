
package package21052026;
 
public class pembayaranTunai extends Pembayaran{
   
    private double jumlahDiBerikan;

    public pembayaranTunai(double jumlahDiBerikan, String idTransaksi, double jumlahBayar) {
        super(idTransaksi, jumlahBayar);
        this.jumlahDiBerikan = jumlahDiBerikan;
    }


    public double getJumlahDiBerikan() {
        return jumlahDiBerikan;
    }

    public void setJumlahDiBerikan(double jumlahDiBerikan) {
        this.jumlahDiBerikan = jumlahDiBerikan;
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Proses Pembayaran Secara Tunai :");
        System.out.println("ID Transaksi : "+idTransaksi);
        System.out.println("Jumlah Bayar : Rp."+jumlahBayar);
        System.out.println("Jumlah DiBerikan : Rp."+jumlahDiBerikan);
        if(jumlahDiBerikan >= jumlahBayar){
            double kembalian = jumlahDiBerikan - jumlahBayar;
            System.out.println("Proses Pembayaran Berhasil");
            System.out.println("Kembalian : Rp."+kembalian);
        }
        else {
            double kekurangan = jumlahBayar - jumlahDiBerikan;
            System.out.println("Proses Pembayaran Gagal");
            System.out.println("Uang yang diberikan kurang : Rp."+kekurangan);
        }
    }
    
    
    
}
