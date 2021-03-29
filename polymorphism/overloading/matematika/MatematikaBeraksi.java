// Annisa Dwi Irvianda
// 11200930000009
// Pemograman Lanjut

package polymorphism.overloading.matematika;


public class MatematikaBeraksi {
    public static void main(String[] args){
        Matematika panggil = new Matematika();
        
        //Pemanggilan Method dengan 2 Parameter
        panggil.pertambahan(10, 15);
        panggil.pengurangan(20, 5);
        panggil.perkalian(5, 20);
        panggil.pembagian(30, 5);
        panggil.modulus(5, 2);
        
        
        System.out.println("Pemanggilan Method Class Matematika dengan 3 Parameter");
        panggil.pertambahan(12.5, 28.7, 14.2);
        panggil.pengurangan(12.5, 28.7, 14.2);
        panggil.perkalian(12.5, 28.7, 14.2);
        panggil.pembagian(12.5, 28.7, 14.2);
        panggil.modulus(12.5, 28.7, 14.2);

        
        

    }  
}



