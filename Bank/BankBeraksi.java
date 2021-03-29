// Annisa Dwi Irvianda
// 11200930000009
// 2A SI

package Bank;


public class BankBeraksi {
  
    public static void main(String[] args){
        Bank Bank_ABC = new Bank(100000);
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini Rp."+ Bank_ABC.getsaldo());
        System.out.println("");
System.out.println("------------------------------------------");
        
        System.out.println("Simpan Uang Rp.500000");
        Bank_ABC.simpanUang(500000);
        System.out.println("Saldo saat ini Rp."+ Bank_ABC.getsaldo());
        System.out.println("");
System.out.println("------------------------------------------");
        
        System.out.println("Ambil uang Rp.150000");
        Bank_ABC.ambilUang(150000);
        System.out.println("Saldo Saat ini Rp."+ Bank_ABC.getsaldo());  
        System.out.println("");
    }
    
}
