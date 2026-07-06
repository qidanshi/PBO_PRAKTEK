 
package package04062026;
 
public abstract class alatMusik {
    protected String nama;
    protected String jenis;

    public alatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void info(){
        System.out.println("Nama alat musik :"+nama+" Jenis :"+jenis);
    }
    
    //contoh method polymorphism
    public abstract void mainkan();
    public abstract void stem();
    
    
}
