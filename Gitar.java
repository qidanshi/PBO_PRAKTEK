 
package package04062026;
 
public class Gitar extends alatMusik{
    private int jumlahSenar;

    public Gitar(int jumlahSenar, String nama, String jenis) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }

    public void setJumlahSenar(int jumlahSenar) {
        this.jumlahSenar = jumlahSenar;
    }
    
    

    @Override
    public void mainkan() {
        System.out.println(nama+" dipetik dengan :" +jumlahSenar+" senar");
    }

    @Override
    public void stem() {
        System.out.println("Menyetem gitar "+nama+" secara manual");
    }
    
}
