/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo3;

/**
 *
 * @author gakochannnn
 */

import java.util.Random;
import java.util.Scanner;
public class TebakAngka {
      
      int angkaAcak;
      int batasAtas = 100;
      
    void Acak(){

        Random rand = new Random();
        angkaAcak = rand.nextInt(batasAtas)+1;       
          }
    
    void Output(){  
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukan Angka Tebakan Anda dari 1-100 : ");
            int userInput = scanner.nextInt();

            if(userInput==angkaAcak){
                System.out.println("Selamat Tebakan Anda Benar");
                break;
            }
            else if(userInput>batasAtas){
                System.out.println("Pilih Kurang dari 100!");              
            }
            else if(userInput> angkaAcak){
                System.out.println("Tebak Angka Lebih Rendah!");              
            }           
            else{
                System.out.println("Tebak Angka Lebih Tinggi!");
            }
        }
    }
}

