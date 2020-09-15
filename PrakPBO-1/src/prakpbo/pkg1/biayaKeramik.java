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
public class biayaKeramik {
    int Rumah;
    int isi;
    int luas;
    int harga;
            
    void hitungBiaya(){
        int biaya = (this.Rumah*this.harga) / (this.luas*this.isi) ;
        System.out.println("Biaya yang dibutuhkan adalah" + " " + biaya);
    
    }
       
}
