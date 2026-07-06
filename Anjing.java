
package package30042026;

public class Anjing extends Hewan{
    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        super.bersuara();
        System.out.println(nama + " bersuara : Guk Guk");
    }
}
