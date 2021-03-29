// Annisa Dwi Irvianda
// 11200930000009
// Pemograman Lanjut 

package inheritance.matematika;


public class Matematika {
      int hasil;
     double Total;
    
    void pertambahan (int a, int b)
    {
        hasil = a + b;   
        System.out.println("Jumlah Pertambahan = "+ getHasil());
    }
    void pengurangan (int a,int b)
    {
        hasil = a - b;
        System.out.println("Jumlah Pengurangan ="+ getHasil());
    }
    void perkalian (int a, int b)
    {
        hasil = a * b;
        System.out.println("Jumlah Perkalian ="+ getHasil());
    }
    void pembagian (int a, int b)
    {
        hasil = a / b;
        System.out.println("Jumlah Pembagian ="+ getHasil());
    }
    
    int getHasil(){
        return hasil;
    }      
    
    // Method Double 2 parameter
    void pertambahan (double a, double b){
        Total = a + b;
        System.out.println("Jumlah Pertambahan = "+ getTotal());
    }
    void pengurangan (double a, double b){
        Total = a - b;
        System.out.println("Jumlah Pengurangan = "+ getTotal());
    }
    void perkalian (double a, double b){
        Total = a * b;
        System.out.println("Jumlah Perkalian = "+ getTotal());
    }
    void pembagian (double a, double b){
        Total = a / b;
        System.out.println("Jumlah Pembagian = "+ getTotal());
    }
 
    
    // Method Double 3 parameter
    void pertambahan (double a, double b, double c){
        Total = a + b + c;
        System.out.println("Jumlah Pertambahan = "+ getTotal());    
    }
    void pengurangan (double a, double b, double c){
        Total = a - b - c;
        System.out.println("Jumlah Pengurangan = "+ getTotal());
    }
    void perkalian (double a, double b, double c){
        Total = a * b * c;
        System.out.println("Jumlah Perkalian = "+ getTotal());
    }
    void pembagian (double a, double b, double c){
        Total = a / b / c;
        System.out.println("Jumlah Pembagian = "+ getTotal()); 
    }
    double getTotal(){
        return Total;
    }
    }
    


    




   
    
    

 

