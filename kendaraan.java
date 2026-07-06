
package package21052026;
 
public abstract class kendaraan {
    protected String nopolis;

    public kendaraan(String nopolis) {
        this.nopolis = nopolis;
    }

    public String getNopolis() {
        return nopolis;
    }

    public void setNopolis(String nopolis) {
        this.nopolis = nopolis;
    }
    
   public abstract void kendaraanRental();
}
