/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamhs;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author gakochannnn
 */
public class DataMahasiswa {
    String namaMhs[]=new String[100];
    String nim[]=new String[100];
    String date[]=new String[100];
    int gender[]=new int[100];
    String JenisKelamin[]= new String[100];
    
    int n;
    
    void DataMhs(){
         Scanner nama = new Scanner(System.in);
         System.out.println(" *************************************** ");
         System.out.println("               Menu Utama                ");
         System.out.println(" *************************************** ");
         System.out.println("1.Tambah Data ");
         System.out.println("2.Hapus Data ");
         System.out.println("3.Cari Data ");
         System.out.println("4.Tampil Data ");
         Scanner pilih = new Scanner(System.in);
         int pilihMenu = pilih.nextInt();
        
     
        while (true) {
            if(pilihMenu == 1) {
                System.out.println(" *************************************** ");
                System.out.println("Masukan Jumlah Data yang akan dimasukan : ");
                Scanner input = new Scanner(System.in);
                this.n= input.nextInt();
                
                   
                    for (int i=0;i<n;i++){
                        System.out.println("Mahasiswa Ke : "+(i+1));
                        System.out.print("Nama : ");
                        namaMhs[i]=input.next();

                        System.out.print("Nim : ");
                        nim[i]=input.next();
                       
                        System.out.print("Tanggal Lahir | DD/MM/YYYY : ");
                        date[i]=input.next();
                        
                        System.out.print("Jenis Kelamin | Male = 0 / Female = 1 : ");
                        gender[i]=input.nextInt();
                        if (gender[i]==0) {
                            JenisKelamin[i]="Laki-Laki ";
                        } 
                        else {
                        JenisKelamin[i]="Perempuan";
                        }
                    }
                DataMhs();
                }
            if(pilihMenu == 2) {
                System.out.println("*******************************************************");
                System.out.println("Masukan NIM Data Mahasiswa Yang ingin dihapus : ");
                Scanner input = new Scanner(System.in);
                int nimMhs= input.nextInt();
                   List<String> list  = Arrays.asList(nim);
                   
            }
            if(pilihMenu == 3) {
                System.out.println(" *************************************** ");
                System.out.println("               Cari Data                 ");
                System.out.println(" *************************************** ");
                System.out.println("1.Cari Berdasar NIM ");
                System.out.println("2.Cari Berdasar Gender ");
            }
            else if(pilihMenu == 4){
                System.out.println("*******************************************************");
                System.out.println("                DAFTAR  MAHASISWA                      ");
                System.out.println("*******************************************************");
                System.out.println("No      Nama        Nim         Date            Gender ");
    
                    for (int i=0;i<n;i++) {
                    System.out.println((i+1)+"      "+namaMhs[i]+"      "+nim[i]+"      "+date[i]+"     "+JenisKelamin[i]);
                    }
                }
             DataMhs();           
            }
        }
    }
    

