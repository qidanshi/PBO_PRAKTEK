package package30042026;
public class MainHewan {
    public static void main(String[] args) {
        Hewan hewanUmum = new Hewan("Makhluk");
        Hewan h1 = new Kucing("Udin si Kucing");
        Hewan h2 = new Anjing("Stepen si Anjing");
            
        
        hewanUmum.tampilkanNama();
        hewanUmum.bersuara();
        
        System.out.println();
        System.out.println();
        h1.tampilkanNama();
        h1.bersuara();

        System.out.println();
        h2.tampilkanNama();
        h2.bersuara();
    }
}
