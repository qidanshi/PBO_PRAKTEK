
package package23042026;
 
public class MainBook {
    
    public static void main(String args[]){
        
        Author Rin = new Author("Rinaldi Munir", "rinmunir2gmail.com", 'm');
        System.out.println(Rin);
        
        Book dummyBook = new Book("Algoritma dan Pemrograman", Rin, 98000, 99);
        System.out.println(dummyBook);
        
        dummyBook.setPrice(120000);
        dummyBook.setQty(88);
        
        System.out.println("Book Name is :"+dummyBook.getName());
        System.out.println("Price is :"+dummyBook.getPrice());
        System.out.println("Qty is: "+dummyBook.getQty());
        
        System.out.println("Author is :"+dummyBook.getAuthor());
        
        System.out.println("Author name is :"+dummyBook.getAuthor().getName());
        System.out.println("Author email is:"+dummyBook.getAuthor().getEmail());
        System.out.println("Author gender is :"+dummyBook.getAuthor().getGender());
        
        
        Book moreDummyBook = new Book("Java for more dummies", new Author("Peter Lee", "peter@nowhere.com", 'm'), 19.99, 8);
        System.out.println(moreDummyBook);
    }
}
