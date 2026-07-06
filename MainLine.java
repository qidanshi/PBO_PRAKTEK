
package package23042026;
 
public class MainLine {
    public static void main(String[] args){
        
        Line line1 = new Line(1, 2, 3, 4);
        System.out.println("Line 1 = "+line1);
        System.out.println("Panjang Line 1 = "+line1.getLength());
        
        
        
        Point pon1 = new Point(2, 3);
        System.out.println("\nPoint 1 = "+pon1);
        Point pon2 = new Point(1, 4);
        System.out.println("Point 2 = "+pon2);
        
        Line line2 = new Line(pon1, pon2);
        System.out.println("\nLine 2 = "+line2);
        System.out.println("Panjang Line 2 = "+line2.getLength());
        
        
        line2.setBeginXY(3, 5);
        System.out.println("\nLine 2 setelah ubah begin = "+line2);
        System.out.println("Panjang Line 2 setelah ubah begin = "+line2.getLength());
        
        line2.setEndXY(2, 1);
        System.out.println("\nLine 2 setelah ubah end = "+line2);
        System.out.println("Panjang Line 2 setelah ubah end = "+line2.getLength());
        
        
        
        int[] begin = line2.getBeginXY();
        int[] end = line2.getEndXY();
        System.out.println("\nBegin = ("+begin[0]+", "+begin[1]+")");
        System.out.println("End = ("+end[0]+", "+end[1]+")");
        System.out.println("Panjang Line 2 = "+line2.getLength());
    }
}
