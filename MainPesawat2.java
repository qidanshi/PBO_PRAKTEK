package package30042026;

import java.util.Scanner;
public class MainPesawat2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukan jumlah Pesawat: ");
        int jumlah = input.nextInt();
        input.nextLine();
        Pesawat[] daftarPesawat = new Pesawat[jumlah];
    
        for(int i = 0; i < jumlah; i++){
            System.out.println("\n=== Input Data Pesawat Ke-"+(i+1)+"===");
            System.out.print("Nama Pesawat: ");
            String nama = input.nextLine();
            
            System.out.print("Tahun Produksi: ");
            int tahunProduksi = input.nextInt();
            
            System.out.print("Menggunakan Mesin? (True/False):");
            boolean mesin = input.nextBoolean();
            
            System.out.print("Muatan(jumlah penumpang):");
            int muatan = input.nextInt();
            input.nextLine();
            
            daftarPesawat[i] = new Pesawat(nama, tahunProduksi, mesin, muatan);
        }
        
        System.out.println("\n=== Daftar Pesawat ===");
        System.out.println(">> Pesawat ke-1");
            daftarPesawat[0].cetak();
            
            int max = daftarPesawat[0].getMuatan();
            String maxnama = daftarPesawat[0].getNama();
            for(int i = 1; i < daftarPesawat.length; i++){
                System.out.println(">>Pesawat ke-"+(i+1));
                daftarPesawat[i].cetak();
                if(daftarPesawat[i].getMuatan()>max)
                {
                    max=daftarPesawat[i].getMuatan();
                    maxnama=daftarPesawat[i].getNama();
                    
                }
                
                System.out.println();
                System.out.println();
            }
        
        
        
        
        
        
        
        
    
    
    }
    
}
