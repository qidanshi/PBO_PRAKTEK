
package package21052026;
 
public class karyawanKontrak extends karyawan{
    private double honor;
    private double uangMakan = 300000;

    public karyawanKontrak(double honor, String nik, String nama) {
        super(nik, nama);
        this.honor = honor;
    }

    public double getHonor() {
        return honor;
    }

    public void setHonor(double honor) {
        this.honor = honor;
    }

    public double getUangMakan() {
        return uangMakan;
    }

    public void setUangMakan(double uangMakan) {
        this.uangMakan = uangMakan;
    }
    
    public void gajikaryawan(){
        System.out.println("Penggajian Karyawan Kontrak :");
        System.out.println("Nama Karyawan : "+nama);
        System.out.println("Nik Karyawan : "+nik);
        System.out.println("Honor Karyawan : Rp."+honor);
        System.out.println("Uang Makan Karyawan : Rp."+uangMakan);
    }
}
