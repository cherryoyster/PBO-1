/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo.pkg1;

/**
 *
 * @author gakochannnn
 */
public class PrakPBO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Keramik A");
        biayaKeramik a = new biayaKeramik();
       a.Rumah = 1000000;
       a.harga = 54000;
       a.luas = 30*30;
       a.isi = 10;
       a.hitungBiaya();
       
       System.out.println("Keramik B");
       biayaKeramik b = new biayaKeramik();
       b.luas = 40*40;
       b.isi = 5;
       b.Rumah = 1000000;
       b.harga = 65000;
       b.hitungBiaya();
       
       System.out.println("Keramik C");
       biayaKeramik c = new biayaKeramik();
       c.luas = 30*40;
       c.isi = 8;
       c.Rumah = 1000000;
       c.harga = 60000;
       c.hitungBiaya();
    }
    
}
