// Annisa Dwi Irvianda
// 11200930000009
// Pemograman Lanjut 

package inheritance.matematika;


public class MatematikaCanggih extends Matematika {
   void modulus (int a, int b){
        hasil = a % b;
        System.out.println("Jumlah Modulus ="+ getHasil());
    }
    void modulus (int a, int b, int c){
         hasil = a % b % c;
         System.out.println("Jumlah Modulus ="+ getHasil());
    }
    
    void modulus (double a, double b) {
        Total = a % b ;
        System.out.println("Jumlah Modulus =" + getTotal());
    }
    
    void modulus (double a, double b, double c){
        Total = a % b % c;
        System.out.println("Jumlah Modulus =" + getTotal());
    }  
} 

