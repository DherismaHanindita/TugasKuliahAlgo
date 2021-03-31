/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
import java.util.Scanner;
public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Array2 data = new Array2();
        Array1 m1 = new Array1(12);
        Array1 m2 = new Array1(17);
        Array1 m3 = new Array1(2);
        Array1 m4 = new Array1(1);
        Array1 m5 = new Array1(70);
        Array1 m6 = new Array1(50);
        Array1 m7 = new Array1(90);
        Array1 m8 = new Array1(17);
        Array1 m9 = new Array1(2);
        Array1 m0 = new Array1(90);
        
        data.tambah(m1);
        data.tambah(m2);
        data.tambah(m3);
        data.tambah(m4);
        data.tambah(m5);
        data.tambah(m6);
        data.tambah(m7);
        data.tambah(m8);
        data.tambah(m9);
        data.tambah(m0);
        
        System.out.println("-------------------------");
        System.out.println("Data keseluruhan");
        data.tampil();
        System.out.println("-------------------------");
        System.out.println("Data yang telah diurutkan ASC");
        data.selectionSort();
        data.tampil();
        
        System.out.println("----------------------------");
        System.out.println("Pencarian data");
        System.out.print("Masukkan nilai yang di cari : ");
        int cari = sc.nextInt();        
        System.out.println("menggunakan binary search");
        int posisi = data.FindBinarySearch(cari, 0, 9);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        data.arrMax();
    }
}
