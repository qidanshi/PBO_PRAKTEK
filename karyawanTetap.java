
package package21052026;
 
public class karyawanTetap extends karyawan{
    private int golongan;
    private double gajiPokok;
    private double tunjangan;

    public karyawanTetap(int golongan, double gajiPokok, double tunjangan, String nik, String nama) {
        super(nik, nama);
        this.golongan = golongan;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    @Override
   public void gajikaryawan(){
       System.out.println("Penggajian Karyawan Tetap :");
       System.out.println("Nama Karayawan :"+nama);
       System.out.println("Nik Karayawan :"+nik);
       System.out.println("Golongan : "+golongan);
       System.out.println("Gaji Pokok : Rp."+gajiPokok);
       System.out.println("Tunjangan : Rp."+tunjangan);
       
       
   }
    
    
    
}
