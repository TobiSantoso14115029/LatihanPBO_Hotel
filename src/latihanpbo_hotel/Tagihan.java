
package latihanpbo_hotel;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *   Created by user on 26/04/2017.
 *   versi lebih generik daripada menginap
 *
 *   Melengkapi addFasilitas(Fasilitas f), hitungSemuaTagihan()
 *
 */

public class Tagihan {
    Tamu tamu;

    private ArrayList<Fasilitas> alFasilitas = new ArrayList<Fasilitas>();


    public void addFasilitas(Fasilitas f) {
        this.alFasilitas.add(f);
    }

    public double hitungSemuaTagihan() {
        double total=0;
        for (Iterator<Fasilitas> iterator = alFasilitas.iterator(); iterator.hasNext();) {
            Fasilitas next = iterator.next();
            total += next.hitungTagihan();
        }
        return total;
    }

    public Tagihan(Tamu t) {
        this.tamu = t;
    }

    public static void main(String[] args) {
        Tamu tamu = new Tamu(1,"Rudi");
        Tagihan  tagihan = new Tagihan(tamu);
        Kamar k = new Kamar(231,200);
        FasilitasKamar fk = new FasilitasKamar(k);
        fk.kamar = k;
        fk.jumHari = 3; //menginap 3 hari
        tagihan.addFasilitas(fk);
        FasilitasSpa fs = new FasilitasSpa(4,100);
        tagihan.addFasilitas(fs);
        FasilitasSauna fsa = new FasilitasSauna(1,200);
        tagihan.addFasilitas(fsa);
        //lengkapi fasilitas lainnya
        System.out.println("Tagihan:"+tagihan.hitungSemuaTagihan());
    }
}
