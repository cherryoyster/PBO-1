/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo2;

/**
 *
 * @author gakochannnn
 */
public class NewClass {
    int Rumah;
    int isi;
    int luas;
    int harga;
            
    NewClass(int w ,int x, int y,int z){
        this.Rumah = w;
        this.isi = x;
        this.luas = y;
        this.harga = z;  
    }
    int operasihitung1(){
        int operasi1;
        operasi1 = (this.luas*this.isi);
        return operasi1;
    }
    
    int operasihitung2(){
        int operasi2;
        operasi2 = this.Rumah / this.operasihitung1();
        return operasi2;
    }
    
    int operasihitung3(){
        int operasi3;
        operasi3 = this.harga * this.operasihitung2();
        return operasi3;
    }
}   
