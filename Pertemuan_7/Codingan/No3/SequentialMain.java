/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequential;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
import java.util.Scanner;
import java.util.Random;
public class SequentialMain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Sequential data = new Sequential();
        int bar = 3, col = 5;
        data.baris = bar;
        data.kolom = col;
        data.tambah();
        data.tampil();
        System.out.println(" ");
        System.out.println("Pencarian data sequential");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan nilai yang akan di cari : ");
        int s = sc.nextInt();        
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~ SEQUENTIAL SEARCH ~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int[] posisi = data.FindSeqSearch(s);
        //System.out.println(posisi[0] + " " + posisi[1]);
        data.TampilPosisi(s, posisi[0], posisi[1]);
        data.TampilData(s, posisi[0], posisi[1]);
    }
    static int randInt(int min, int max) {
        Random rand = null;
        int randomNum = rand.nextInt((min - max) + 1) + min;

        return randomNum;
    }
}
