
package package21052026;
 
public class Mobil extends kendaraan{
    private double biayaRental;
    private int durasi;
    private double total;

    public Mobil(double biayaRental, int durasi, double total, String nopolis) {
        super(nopolis);
        this.biayaRental = biayaRental;
        this.durasi = durasi;
        this.total = total;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    

    public double getBiayaRental() {
        return biayaRental;
    }

    public void setBiayaRental(double biayaRental) {
        this.biayaRental = biayaRental;
    }
    
    public void kendaraanRental(){
        System.out.println("/nRental Mobil");
        System.out.println("Biaya Rental / hari : Rp."+biayaRental);
        System.out.println("Durasi Rental :"+durasi+" hari");
        System.out.println("Total: Rp."+total);
    }
}
