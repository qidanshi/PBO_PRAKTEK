 
package package04062026;
 
public class Keyboard extends alatMusik implements bisaDInyalakan{
     private boolean dayaTersambung;

    public Keyboard(boolean dayaTersambung, String nama, String jenis) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void mainkan() {
        System.out.println(nama+" dimainkan dengan menekan tuts");
    }

    @Override
    public void stem() {
        System.out.println("Keyboard "+nama+" distem digital dengan aplikasi");
    }
    
    
     @Override
    public void nyalakan(){
        if(cekListrik()){
            System.out.println(nama+" bisa dinyalakan");
        }
        
        else{
            System.out.println(nama+" tidak bisa dinyalakan");
        }
    }
    
     @Override
    public void matikan(){
        System.out.println("Keyboard "+nama+" dimatikan");
    }

     @Override
    public boolean cekListrik(){
        return dayaTersambung;
    }
     
    
    
    
    
    
 
    
}
