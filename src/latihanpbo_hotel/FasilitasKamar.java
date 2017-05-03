/**
 * Created by user on 26/04/2017.
 *
 */

package latihanpbo_hotel;

public class FasilitasKamar extends Fasilitas {
    Kamar kamar;
    int jumHari;

    public FasilitasKamar(Kamar k) {
        this.kamar = k;
        String satuan = "hari";
    }

    @Override
    public double hitungTagihan() {
        return  kamar.harga * jumHari;
    }

    public static void main(String[] args) {
        Kamar k = new Kamar(231,200);
        FasilitasKamar fk = new FasilitasKamar(k);
        fk.jumHari = 3; //menginap 3 hari
        System.out.println("Tagihan:"+fk.hitungTagihan()); //
    }
}
