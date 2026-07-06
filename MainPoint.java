
package package23042026;
 
public class MainPoint {
    
    public static void main(String[] args){
        Point pon1 = new Point(2, 3);
        System.out.println("Point 1 = "+pon1);
  
        int[] xy = pon1.getXY();
        System.out.println("Kordinat Point 1 = ("+xy[0]+", "+xy[1]+")");
        
        pon1.setXY(5, 6);
        System.out.println("Setelah setXY = "+pon1);
        
        
        Point pon2 = new Point(1, 4);
        System.out.println("Point 2 = "+pon2);
        System.out.println("Jarak dari Point 1 ke Point 2 = "+pon1.distance(pon2));
        System.out.println("Jarak antara Point 1 ke (0,0) ="+pon1.distance());
    }   
    
}
