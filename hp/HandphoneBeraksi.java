// Annisa Dwi Irvianda
// 11200930000009
// 2A SI

package hp;

public class HandphoneBeraksi {
    public static void main(String[] args){
        Handphone Android = new Handphone();
        
        Android.hidupkan="Handphone on Powered by Android" ;
        Android.lakukanPanggilan="Telolet...Telolet...Anda sedang melakukan panggilan" ;
        Android.kirimSMS="Jring...Jring...Pesan Berhasil Terkirim" ;
        Android.matikan="Matikan Perangkat" ;
        
        Android.sistem();
    }
    
}
