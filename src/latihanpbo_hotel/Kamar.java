/**
 * Created by yudiwbs&masayu on 11/04/2017.
 *
 * method yg harus dilengkapi: Kamar(int id, int harga),print()
 */

package latihanpbo_hotel;

public class Kamar {
    int id;
    int harga; //harga kamar permalam dalam ribu. Jadi kalau 400 artinya Rp400000
    boolean isKosong=true;   //apakah kamar ditempati

    //lengkapi
    //constructor
    public Kamar(int id, int harga) {
        this.id=id;
        this.harga=harga;
    }

    //lengkapi
    public void print() {
        
        System.out.print("id kamar:"+this.id+" harga:"+this.harga+"; kosong?");
        if(isKosong){
            System.out.println(" true");
        }
    }

    public static void main(String[] args) {
        Kamar k = new Kamar(231,200);
        k.print();
    }

    /**
     *Hasil eksekusi: 
     *id kamar:231 harga:200; kosong? true
     */
}
