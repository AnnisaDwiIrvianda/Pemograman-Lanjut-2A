// Annisa Dwi Irvianda
// 11200930000009
// 2A SI

package Bank;


public class Bank {
    int saldo,simpan,ambil;
   
    
public Bank(int saldo){
    this.saldo =saldo;
}


void simpanUang(int simpan){
    saldo = saldo+simpan;
    
}
void ambilUang(int ambil){
    saldo = saldo-ambil;
}
int getsaldo(){
    return saldo;
}
    
    
}
