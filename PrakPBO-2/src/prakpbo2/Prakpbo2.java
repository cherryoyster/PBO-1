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
public class Prakpbo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass nc1 = new NewClass(1000*1000, 10, 30*30 ,54000 );
        System.out.println("Biaya Keseluruhan yang dibutuhkan keramik model 1 adalah " + nc1.operasihitung3());
        
        NewClass nc2 = new NewClass(1000*1000, 5, 30*30 ,65000 );
        System.out.println("Biaya Keseluruhan yang dibutuhkan keramik model 2 adalah " + nc2.operasihitung3());
        
        NewClass nc3 = new NewClass(1000*1000, 8, 30*30 ,60000 );
        System.out.println("Biaya Keseluruhan yang dibutuhkan keramik model 3 adalah " + nc3.operasihitung3());
    }
    
}
