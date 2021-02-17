/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dherisma
 */

//Nama    : Dherisma Hanindita Utami
//NIM/ No : 2041720018
//Kelas   : TI 1H

import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        menu();
    }
    
    static void menu(){
        Scanner sc = new Scanner(System.in);
        int pemilihan;
            System.out.println("~~~~~~PILIHAN MENU~~~~~~: ");
	    System.out.println("1.Luas Segitiga ");
            System.out.println("2. Luas Persegi Panjang ");
            System.out.println("3. Luas Lingkaran ");
            System.out.print("MASUKKAN NOMOR PILIHAN : ");
            int pil = sc.nextInt();
            int pilihanMenu = 0;

            if (pil == 1) {
                luasSegitiga ();
            }else if (pil == 2) {
                luasPersegiPanjang();
            }else if(pil == 3) {
                luasLingkaran();
            }else{
                 System.out.println("!!! PILIHAN TIDAK TERSEDIA !!!");
                menu();
            }
        }

    private static void luasSegitiga() {
        int alas;
        int tinggi;
        double luas;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~SEGITIGA~~~~~");
        System.out.print("Masukkan nilai Alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan Nilai Tinggi: ");
        tinggi = sc.nextInt();
        luas=0.5*alas*tinggi;
        System.out.println("Maka LUAS SEGITIGA adalah: " + luas);
    }

    private static void luasPersegiPanjang() {
        int panjang;
        int lebar;
        double luas;
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~PERSEGI PANJANG~~~~~~~~~");
        System.out.print("Masukkan nilai panjang: ");
        panjang= sc.nextInt();
        System.out.print("Masukkan Nilai lebar: ");
        lebar = sc.nextInt();
        luas=panjang *lebar;
        System.out.println("Maka LUAS PERSEGI PANJANG adalah: " + luas);     
    }

    private static void luasLingkaran() {
        int jarijari;
        double phi = 3.14;
        double luas;
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~LINGKARAN~~~~~~~~");
        System.out.print("Masukkan nilai Jari Jari Lingkaran: ");
        jarijari= sc.nextInt();
        luas = phi*jarijari*jarijari;
        System.out.println("Maka LUAS LINGKARAN adalah: " + luas);     
   }
}