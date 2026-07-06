 
package package04062026;
 
public class MainMusik {
    public static void main(String[] args){
      Gitar gitar = new Gitar(6,"Gitar Classic", "Petik");
      Keyboard keyboard = new Keyboard(true, "Yamaha PSR", "Elektronik");
    
      System.out.println("==========Info Gitar==========");
      gitar.info();
      gitar.mainkan();
      gitar.stem();
      
      System.out.println("==========Info Keyboard==========");
      keyboard.info();
      keyboard.nyalakan();
      keyboard.mainkan();
      keyboard.stem();
      keyboard.matikan();
    
    
    }
    
    
    
}
