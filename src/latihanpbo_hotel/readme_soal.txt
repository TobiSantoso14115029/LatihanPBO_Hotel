Deskripsi kelas
1. Kamar
   Method yg harus dilengkapi: Kamar(int id, int harga),print() 
   Hasil eksekusi main pada Kamar.java: 
   id kamar:231 harga:200; kosong? true

2. Tamu
   Method yg harus dilengkapi: Tamu(int id, String nama), print()
   Hasil eksekusi main pada Tamu.java:
   id tamu: 1; nama:Rudi

3. Fasilitas (abstract), FasilitasKamar, FasilitasSauna, FasilitasSpa
   FasilitasKamar bisa langsung digunakan
   Realisasi fasilitasSauna dan fasilitasSpa (constructor dan hitungTagihan()).

4. Tagihan
   Melengkapi addFasilitas(Fasilitas f), hitungSemuaTagihan().
   Edit main dengan menambahkan fasilitasSauna dan FasilitasSpa.

4. Hotel
   Method yg harus dilengkapi: 
   - printSemuaKamar(), 
   - tampilkanKamarKosongHarga (int hargaMaks), 
   - cariKamarBerdId(int idKamar),
   - checkin(Tamu t,Kamar k, int jumHari) 
   - printTagihanTamu() 

   Tambahkan method void addTagihan(Tamu t, Fasilitas).
   i.s: -
   f.s: Jika t.id sudah ada pada daftarTagihan, tambahkan fasilitas yang digunakan pada tagihan tamu tersebut.
        Jika t.id belum ada pada daftarTagihan, tambahkan tagihan baru ke daftarTagihan.

   Edit main hotel untuk menambahkan addTagihan tamu Rudi dengan FasilitasSauna, dan tamu Wati dengan FasilitasSpa      

Hasil eksekusi Hotel.java sebelum diedit:
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

