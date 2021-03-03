/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3.No4;

/**
 *
 * @author Dherisma
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] ma = new Mahasiswa[4];
        
        for (int i = 1; i < 4; i++) {
            ma[i] = new Mahasiswa();
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
            System.out.print("\nNama          : " + ma[i].nama);
            System.out.println("\nNIM           : " + ma[i].nim);
            System.out.println("Jenis Kelamin : " + ma[i].jenisKelamin);
            System.out.println("Nilai IPK     : " + ma[1].ipk);
        }
    }
}
