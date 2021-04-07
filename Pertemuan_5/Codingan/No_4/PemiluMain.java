/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No_4;

/**
 *
 * @author Holla
 */

import java.util.Scanner;
public class PemiluMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("BANYAK PEMILIHAN : ");
       int elemen = sc.nextInt();
        sc.nextLine();
        Pemilu voting = new
        Pemilu(elemen);
        voting.NamaKandidat();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        for(int i = 0; i < elemen; i++) {
            System.out.print("Nomor PILIHAN : ");
            voting.banyak[i] =
            sc.nextInt();
        }
        String terpilih = voting.pilihDC(voting.banyak, 0,elemen - 1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Kandidat yang Terpilih ");
        System.out.println("~~~~~~~~~ " + terpilih + "~~~~~~~~~");
    }    
}
