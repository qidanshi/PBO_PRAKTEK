package package30042026;
public class MainPesawat {
    public static void main(String[] aargs){
    Pesawat[] daftarPesawat = new Pesawat[3];
    
    daftarPesawat[0] = new Pesawat("Boeing 737", 2015, true, 180);
    daftarPesawat[1] = new Pesawat("Airbus A320", 2020, true, 140);
    daftarPesawat[2] = new Pesawat("Cessna 172", 2008, false, 4);
    
    for(int i = 0; i <daftarPesawat.length; i++){
        System.out.println("=== Data Pesawat Ke-"+(i+1)+"===");
        daftarPesawat[i].cetak();
        System.out.println();
    }
}}
