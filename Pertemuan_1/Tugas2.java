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
public class Tugas2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int bulan;
        int cas;
        int saldoAkhir = 1500000;
        double bunga = 0.02;
        double laba;
        int profit;
        System.out.println();
        System.out.print("Masukkan uang yang ingin disimpan : ");
        cas = sc.nextInt();
        laba = cas * bunga;
        profit = saldoAkhir - cas;
        bulan = profit/(int)laba;        
        for (int i = 0; i <bulan; i++) {
            cas = cas + (int) laba;
            System.out.println("jumlah tabungan pada bulan ke- " + (i+1) + " adalah " + cas);
    }
        System.out.println("Saldo mencapai 1,5 juta pada bulan ke- " + bulan);
}
}