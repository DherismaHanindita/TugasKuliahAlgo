/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3.No5;

/**
 *
 * @author Dherisma
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
import java.util.Scanner;
public class MainModifMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ModifMahasiswa[] ma = new ModifMahasiswa[4];
        
        for (int i = 1; i < 4; i++) {
            ma[i] = new ModifMahasiswa();
            System.out.println("Mahasiswa Ke-" + i);
            System.out.print("Masukkan Nama            : ");
            ma[i].nama = sc.next();
            System.out.print("Masukkan NIM             : ");
            ma[i].nim = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin   : ");
            ma[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK             : ");
            ma[i].ipk = sc.nextDouble();
            System.out.println();
        }
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Data Mahasiswa ke- " + i);
            System.out.print("Nama          : " + ma[i].nama);
            System.out.println("NIM           : " + ma[i].nim);
            System.out.println("Jenis Kelamin : " + ma[i].jenisKelamin);
            System.out.println("Nilai IPK     : " + ma[1].ipk);
        }
        
        ModifMahasiswa ratarata = new ModifMahasiswa();
        System.out.println();
        double rata = ratarata.rataIpk(ma[1].ipk, ma[2].ipk, ma[3].ipk);
        System.out.println("IPK Rata-rata Seluruh Mahasiswa : " + rata) ;
    }
}
