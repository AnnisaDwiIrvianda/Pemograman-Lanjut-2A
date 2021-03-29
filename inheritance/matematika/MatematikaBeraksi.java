// Annisa Dwi Irvianda
// 11200930000009
// Pemograman Lanjut 


package inheritance.matematika;



public class MatematikaBeraksi {
     public static void main(String[] args){
        MatematikaCanggih panggil = new MatematikaCanggih();
        
        System.out.println("Pemanggilan Method Pertambahan");
        panggil.pertambahan(12.5, 28.7, 14.2);
        panggil.pertambahan(12, 28, 14);
        panggil.pertambahan(23, 34);
        panggil.pertambahan(3.4, 4.9);
        
        System.out.println("Pemanggilan Method Pengurangan");
        panggil.pengurangan(12.5, 28.7, 14.2);
        panggil.pengurangan(12, 28, 14);
        panggil.pengurangan(23, 34);
        panggil.pengurangan(3.4, 4.9);
        
        System.out.println("Pemanggilan Method Perkalian");
        panggil.perkalian(12.5, 28.7, 14.2);
        panggil.perkalian(12, 28, 14);
        panggil.perkalian(23, 34);
        panggil.perkalian(3.4, 4.9);
        
        System.out.println("Pemanggilan Method Pembagian");
        panggil.pembagian(12.5, 28.7, 14.2);
        panggil.pembagian(12, 28, 14);
        panggil.pembagian(23, 34);
        panggil.pembagian(3.4, 4.9);
        
        System.out.println("Pemanggilan Method Modulus");
        panggil.modulus(12.5, 28.7, 14.2);
        panggil.modulus(12, 28, 14);
        panggil.modulus(23, 34);
        panggil.modulus(3.4, 4.9);
        

    }
    
}


