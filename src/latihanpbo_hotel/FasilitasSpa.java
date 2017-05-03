/**
 * Created by user on 26/04/2017.
 */

package latihanpbo_hotel;

public class FasilitasSpa extends Fasilitas{
    int jumjam;
    int harga;
    public FasilitasSpa(int jumjam, int harga){
        this.jumjam=jumjam;
        this.harga=harga;
    }
     public double hitungTagihan() {
        return this.jumjam*this.harga;
    }
}
