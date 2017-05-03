package latihanpbo_hotel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yudiwbs&masayu on 11/04/2017.
 *
 * method yg harus dilengkapi: 
 * printSemuaKamar(), 
 * tampilkanKamarKosongHarga (int hargaMaks), 
 * cariKamarBerdId(int idKamar),
 * checkin(Tamu t,Kamar k, int jumHari) 
 * printTagihanTamu()
 *
 */

public class Hotel {

    //id kamar dan kamar
    HashMap <Integer,Kamar> daftarKamar = new HashMap<>();
    
    //daftar tagihan <tamu.id, tagihan>
   
    
    
    FasilitasKamar fk;
    HashMap <Integer,Tagihan> daftarTagihan = new HashMap<>();
    HashMap <Tamu, Fasilitas> daftarmenginap = new HashMap<>();
   
    //jangan diedit
    public void isiKamar() {
        Kamar k = new Kamar(231,200);
        daftarKamar.put(k.id,k);
        k = new Kamar(232,300);
        daftarKamar.put(k.id,k);
        k = new Kamar(233,400);
        daftarKamar.put(k.id,k);
        k = new Kamar(333,500);
        daftarKamar.put(k.id,k);
        k = new Kamar(533,800);
        daftarKamar.put(k.id,k);
    }

    //lengkapi
    public void printSemuaKamar() {
            for (Map.Entry<Integer, Kamar> entry : daftarKamar.entrySet()) {
            Integer key = entry.getKey();
            Kamar value = entry.getValue();
                value.print();
            
        }
    }

    //lengkapi
    //tampilkan kamar yang kosong berdasarkan harga
    //tampilkan yang isKosong=true dan harganya <= hargaMaks
    public void tampilkanKamarKosongHarga (int hargaMaks) {
            for (Map.Entry<Integer, Kamar> entry : daftarKamar.entrySet()) {
            Integer key = entry.getKey();
            Kamar value = entry.getValue();
            if(value.isKosong==true&&value.harga<=hargaMaks){
                value.print();
            }
        }
    }

    //lengkapi
    //cari kamar berdasarkan id
    public Kamar cariKamarBerdId(int idKamar) {
        Kamar tmp=null;
        for (Map.Entry<Integer, Kamar> entry : daftarKamar.entrySet()) {
            Integer key = entry.getKey();
            Kamar value = entry.getValue();
            if(idKamar==key){
               return value; 
            }
            else{}
            
        }
        return tmp;
    }

    //lengkapi
    //tamu t masuk ke kamar k selama jumHari
    //buat obj menginap, lalu add ke daftarMenginap
    //set isKosong kamar dengan false
    public void checkin(Tamu t,Kamar k, int jumHari) {
        Tagihan tagihan = new Tagihan(t);
        tagihan.tamu=t;
        daftarTagihan.put(t.id, tagihan);
        FasilitasKamar fk=new FasilitasKamar(k);
        
        fk.jumHari = jumHari;
        tagihan.addFasilitas(fk);
        k.isKosong=false;
        
    }

    //lengkapi
    //loop daftarMenginap, print dan hitung taghian
    public void printTagihanTamu() {
        
        for (Map.Entry<Integer, Tagihan> entry : daftarTagihan.entrySet()) {
            Integer key = entry.getKey();
            Tagihan value = entry.getValue();
            System.out.println("Tamu :"+value.tamu.nama);
            System.out.println("Tagihan : "+value.hitungSemuaTagihan());
            
            
        }
    }
    public void addTagihan(Tamu t, Fasilitas f){
       Tagihan tagihan = new Tagihan(t);
      
        for (Map.Entry<Integer, Tagihan> entry : daftarTagihan.entrySet()) {
            Integer key = entry.getKey();
            Tagihan value = entry.getValue();
            if(t.id==key){
                value.addFasilitas(f);
                this.daftarTagihan.containsValue(value);
            }
            else{
               
            }
            
        }
    }

    //jangan edit
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.isiKamar();
        h.printSemuaKamar();
        
        Tamu rudi = new Tamu(1,"Rudi");
        Tamu wati = new Tamu(2,"Wati");

        System.out.println();
        System.out.println("Kamar kosong dengan harga maks 300:");
        h.tampilkanKamarKosongHarga(300);

        //misal user pilih kamar 232
        Kamar kamarPilih = h.cariKamarBerdId(232);
//        h.checkin(rudi,kamarPilih,3); //menginap 3 hari
  //      kamarPilih = h.cariKamarBerdId(333);
        h.checkin(rudi,kamarPilih,3); //menginap 3 hari

        //wati memilih kamar termahal
        Kamar kamarPIlih = h.cariKamarBerdId(533);
        h.checkin(wati,kamarPIlih,2);

        System.out.println();
        System.out.println("Tagihan tamu:");
        h.printTagihanTamu();
       
        //print lagi seluurh kamar, kamar 232 dan 533 harusnya isKosong false
        System.out.println();
        System.out.println("Kamar 232 dan 533 terisi");
        h.printSemuaKamar();
        FasilitasSpa fsp = new FasilitasSpa(2,100);
         h.addTagihan(rudi, fsp);
         FasilitasSauna fsa= new FasilitasSauna(3,200);
         h.addTagihan(wati, fsa);
         h.printTagihanTamu();

        System.out.println();
        System.out.println("Kamar kosong dengan harga maks 300, kamar 232 harusnya sudah tidak muncul karena terisi:");
        h.tampilkanKamarKosongHarga(300);


    }

/*
Hasil eksekusi:    
    
id kamar:533 harga:800; kosong? true
id kamar:231 harga:200; kosong? true
id kamar:232 harga:300; kosong? true
id kamar:233 harga:400; kosong? true
id kamar:333 harga:500; kosong? true

Kamar kosong dengan harga maks 300:
id kamar:231 harga:200; kosong? true
id kamar:232 harga:300; kosong? true

Tagihan tamu:
Tamu:Rudi
Tagihan:900.0
Tamu:Wati
Tagihan:1600.0

Kamar 232 dan 533 terisi
id kamar:533 harga:800; kosong? false
id kamar:231 harga:200; kosong? true
id kamar:232 harga:300; kosong? false
id kamar:233 harga:400; kosong? true
id kamar:333 harga:500; kosong? true

Kamar kosong dengan harga maks 300, kamar 232 harusnya sudah tidak muncul karena terisi:
id kamar:231 harga:200; kosong? true

    */    
}
