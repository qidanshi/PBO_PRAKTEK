
package package23042026;
 
public class MainAuthor {
    public static void main(String[] args){
        Author Rin = new Author("Rinaldi Munir", "rinmunir#@gmail.com", 'm');
        System.out.println(Rin);
        
        Rin.setEmail("rinaldi@gmail.com");
        System.out.println(Rin);
        
        System.out.println("name is: "+Rin.getName());
        
        
        System.out.println("email is : "+Rin.getEmail());
        
        System.out.println("gender is:"+Rin.getGender());
        
        
    }
}
