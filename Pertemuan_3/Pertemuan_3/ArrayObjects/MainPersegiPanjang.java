/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3.ArrayObjects;
import java.util.Scanner;
/**
 *
 * @author Dherisma
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */

public class MainPersegiPanjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        
        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("~~~~Masukkan nilai panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("~~~~Masukkan nilai lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar " + ppArray[i].lebar);
        }
}
}
