/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No_2;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
import java.util.Scanner;
public class MainNilaiAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("MASUKKAN BANYAK MAHASISWA : ");
        int n = sc.nextInt();
        
        NilaiAlgoritma[] mhs = new NilaiAlgoritma[n];
        for(int i=0; i<mhs.length; i++){
            mhs[i] = new NilaiAlgoritma();
            System.out.println("~~~~~~~~~~~~~~~~~~~");
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("~~~~~~~~~~~~~~~~~~~");
            System.out.print("Nama        : ");
            sc.nextLine();
            mhs[i].namaMhs = sc.nextLine();
            System.out.print("Nilai TUGAS : ");
            mhs[i].nilaiTugas = sc.nextInt();
            System.out.print("Nilai KUIS  : ");
            mhs[i].nilaiKuis = sc.nextInt();
            System.out.print("Nilai UTS   : ");
            mhs[i].nilaiUTS = sc.nextInt();
            System.out.print("Nilai UAS   : ");
            mhs[i].nilaiUAS = sc.nextInt();
        }
        
        for(int i=0; i < mhs.length; i++){
            System.out.println(" ");
            System.out.println("~~~~~~~~ DATA MAHASISWA ~~~~~~~~");
            System.out.println("Nilai Mahasiswa ke-" + (i+1));
            System.out.println("Nama  : " + mhs[i].namaMhs);
            System.out.println("~~~~ NILAI ~~~~");
            System.out.println("TUGAS : " + mhs[i].nilaiTugas);
            System.out.println("KUIS  : " + mhs[i].nilaiKuis);
            System.out.println("UTS   : " + mhs[i].nilaiUTS);
            System.out.println("UAS   : " + mhs[i].nilaiUAS);
            System.out.println("Total Nilai : " + mhs[i].hitungTotalNilai());
        }
    }
}
