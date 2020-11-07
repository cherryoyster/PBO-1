/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo3.pkg1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gakochannnn
 */
public class TebakAngka {
     int angkaAcak;
     int batasAtas = 100;
     int Skor = 100;
     int Perulangan = 0;
     int TotalSkor;
     
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
                ++Perulangan;
                System.out.println("Selamat Tebakan Anda Benar");
                System.out.println("Skor = " + Skor );
                if(Perulangan<6){
                    System.out.println("Bonus Skor = 50 ");
                    TotalSkor=Skor+50;
                    System.out.println("Total Skor = " + TotalSkor);
                }
                break;
            }
            else if(userInput>batasAtas){
                System.out.println("Pilih Kurang dari 100!");              
            }
            else if(userInput> angkaAcak){
                System.out.println("Tebak Angka Lebih Rendah!"); 
                Skor=Skor-2;
                ++Perulangan;
            }           
            else{
                System.out.println("Tebak Angka Lebih Tinggi!");
                Skor=Skor-2;
                ++Perulangan;
            }
        }
    }


}
