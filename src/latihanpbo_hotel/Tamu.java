/**
 * Created by yudiwbs&masayu on 11/04/2017.
 *
 *
 * method yg harus dilengkapi: Tamu(int id, String nama), print()
 *
 */
package latihanpbo_hotel;

public class Tamu {
      int id;
      String nama;

      //lengkapi
      //constructor
      public Tamu(int id, String nama) {
          this.id=id;
          this.nama=nama;
      }

      //lengkapi
      public void print() {
          
          System.out.println("id tamu: "+this.id+"; nama:"+this.nama);
      }

      //jangan edit
      public static void main(String[] args) {
          Tamu t = new Tamu(1,"Rudi");
          t.print();
      }
      
      /*
      Hasil eksekusi:
      id tamu: 1; nama:Rudi
      */
}
