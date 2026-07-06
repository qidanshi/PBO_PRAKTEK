
package package21052026;
 
public abstract class karyawan {
    protected String nik;
    protected String nama;

    public karyawan() {
    }

    public karyawan(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public abstract void gajikaryawan();
}
