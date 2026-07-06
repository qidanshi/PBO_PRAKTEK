package package09042026;
 
import java.util.Scanner;
public class MainRekeningNasabah {
    
    public static void main(String[] args){
        RekeningNasabah pp1 = new RekeningNasabah();
        pp1.setNmNasabah("Heru Zaki Ryanda");
        pp1.setNoRek("2324352534345334");
        pp1.setSaldo(1000000);
        pp1.TampilkanInfo();
        Scanner input = new Scanner(System.in);
        double deposit, withdraw;
        
        System.out.print("\nMasukan Jumlah Deposit = ");
        deposit = input.nextDouble();
        pp1.deposit(deposit);
        pp1.TampilkanInfo();
        
        System.out.print("\nMasukan Jumlah Withdraw =");
        withdraw = input.nextDouble();
        pp1.withdraw(withdraw);
        pp1.TampilkanInfo();
        System.out.println();
        
        RekeningNasabah pp2 = new RekeningNasabah("12312323423", "BAGAS", 1000000);
        pp2.TampilkanInfo();
        System.out.print("\nMasukan Jumlah Deposit = ");
        deposit = input.nextDouble();
        pp2.deposit(deposit);
        pp2.TampilkanInfo();
        
        System.out.print("\nMasukan Jumlah Withdraw =");
        withdraw = input.nextDouble();
        pp2.withdraw(withdraw);
        pp2.TampilkanInfo();
        
        
    }
    
}
