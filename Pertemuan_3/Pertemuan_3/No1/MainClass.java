/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3;

/**
 *
 * @author Dherisma
 */
//Nama    : Dherisma Hanindita Utami
//NIM/ No : 2041720018/09
//Kelas   : TI 1H

import java.util.Scanner;
public class MainClass {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tabung[] tabungArray = new Tabung[2];
        tabungArray[0] = new Tabung(10, 20, 5, 10);
        tabungArray[1] = new Tabung(20, 40, 10, 20);
          for (int i = 1; i <= 1; i++) {
                System.out.print("Luas Alas Tabung ke-" + i + "    : ");
                tabungArray[i].luasAlas = sc.nextInt();
                System.out.print("Luas Selimut Tabung ke-" + i + " : ");
                tabungArray[i].luasSelimut = sc.nextInt();
                System.out.println("Luas Permukaan           = " + tabungArray[i].luasPermukaanTabung());
                System.out.println();
                System.out.print("Jari-jari  Tabung ke-" + i + "    : ");
                tabungArray[i].jariTabung = sc.nextInt();
                System.out.print("Tinggi Tabung ke-" + i + "        : ");
                tabungArray[i].tinggiTabung = sc.nextInt();
                System.out.print("Phi Tabung ke-" + i + "           : " + tabungArray[i].phi);
                System.out.println("");
                System.out.println("Volume                    = " + tabungArray[i].volumeTabung());
        }
        
        Limas[] limasArray = new Limas[2];
        limasArray[0] = new Limas(10, 20, 5, 10);
        limasArray[1] = new Limas(20, 40, 10, 20);
        
         for (int i = 1; i <= 1; i++) {
                System.out.println("");
                System.out.print("Luas Alas Limas ke-" + i + "    : ");
                limasArray[i].luasAlas = sc.nextInt();
                System.out.print("Tinggi Limas ke-" + i + "       : ");
                limasArray[i].tinggi = sc.nextInt();
                System.out.println("Luas Permukaan          = " + limasArray[i].luasPermukaanLimas());
                System.out.println();
                System.out.print("Luas Alas Limas ke-" + i + "    : ");
                limasArray[i].luasAlas = sc.nextInt();
                System.out.print("Tinggi Limas ke-" + i + "       : ");
                limasArray[i].tinggi = sc.nextInt();
                System.out.print("Volume                  = " + limasArray[i].volumeLimas());
        }
         
        Kubus[] kubusArray = new Kubus[2];
        kubusArray[0] = new Kubus(10);
        kubusArray[1] = new Kubus(20);

       
         for (int i = 1; i <= 1; i++) {
             System.out.println("");
                System.out.print("Sisi Kubus ke-" + i + "         : ");
                kubusArray[i].sisi = sc.nextInt();
                System.out.println("Luas Permukaan          = " + kubusArray[i].luasPermukaanKubus());
                System.out.println("");
                System.out.print("Sisi Kubus ke-" + i + "         : ");
                kubusArray[i].sisi = sc.nextInt();
                System.out.println("Volume                  = " + kubusArray[i].volumeKubus());
        }

          
    }
  }