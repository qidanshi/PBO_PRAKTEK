package package30042026;
public class Kucing extends Hewan{
    
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara(){
        
        System.out.println(nama + " bersuara : Meong");
    }
    
}
