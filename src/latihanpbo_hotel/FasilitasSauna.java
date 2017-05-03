/**
 * Created by user on 26/04/2017.
 */

package latihanpbo_hotel;

public class FasilitasSauna extends Fasilitas {
    int jumOrang;
    int harga;
    public FasilitasSauna(int jumOrang, int harga){
        this.jumOrang=jumOrang;
        this.harga=harga;
    }
     public double hitungTagihan() {
        return  this.jumOrang*this.harga;
    }
}
