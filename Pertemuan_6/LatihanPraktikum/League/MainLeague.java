/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
import java.util.Scanner;
public class MainLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PremierLeagueService list = new PremierLeagueService();
        
        PremierLeague pts1 = new PremierLeague("LIVERPOOL                 ", 29, 45, 82);
        PremierLeague pts2 = new PremierLeague("MANCAHESTER CITY          ", 27, 39, 57);
        PremierLeague pts3 = new PremierLeague("LEICESTER                 ", 28, 26, 50);
        PremierLeague pts4 = new PremierLeague("CHELSEA                   ", 29, 9,  48);
        PremierLeague pts5 = new PremierLeague("MOLVERHAMPTON WANDERERS   ", 29, 7,  43);
        PremierLeague pts6 = new PremierLeague("SHEFFIELD UNITED          ", 28, 5,  43);
        PremierLeague pts7 = new PremierLeague("MANCAHESTER CITY          ", 28, 12, 42);
        PremierLeague pts8 = new PremierLeague("TOTTENHAM HOTSPUR         ", 29, 7,  41);
        PremierLeague pts9 = new PremierLeague("ARSENAL                   ", 28, 4,  40);
        PremierLeague pts10 = new PremierLeague("BURNLEY                   ", 29,  6,  39);
        PremierLeague pts11 = new PremierLeague("CRTSTAL PALACE            ", 29, -6,  39);
        PremierLeague pts12 = new PremierLeague("EVERTON                   ", 29, -6,  37);
        PremierLeague pts13 = new PremierLeague("NEWCASTLE UNITED          ", 29, -16, 35);
        PremierLeague pts14 = new PremierLeague("SOUTHAMPTON               ", 29, -17, 34);
        PremierLeague pts15 = new PremierLeague("BRIGHTON & HOVE ALBION    ", 29, -8,  29);
        PremierLeague pts16 = new PremierLeague("WEST HAM UNITED           ", 29, -15, 27);
        PremierLeague pts17 = new PremierLeague("WATFORD                   ", 29, -17, 27);
        PremierLeague pts18 = new PremierLeague("AFC BOURNEMOUTH           ", 29, -18, 27);
        PremierLeague pts19 = new PremierLeague("ASTON VILLA               ", 27, -18, 27);
        PremierLeague pts20 = new PremierLeague("NORWICH CITY              ", 29, -27, 21);
    
        list.tambah(pts1);
        list.tambah(pts2);
        list.tambah(pts3);
        list.tambah(pts4);
        list.tambah(pts5);
        list.tambah(pts6);
        list.tambah(pts7);
        list.tambah(pts8);
        list.tambah(pts9);
        list.tambah(pts10);
        list.tambah(pts11);
        list.tambah(pts12);
        list.tambah(pts13);
        list.tambah(pts14);
        list.tambah(pts15);
        list.tambah(pts16);
        list.tambah(pts17);
        list.tambah(pts18);
        list.tambah(pts19);
        list.tambah(pts20);
        
        
        System.out.println("DATA PREMIER LEAGUE SEBELUM DI SORTING");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        list.tampilAll();
        System.out.println("");
        
        System.out.println("");
        System.out.println("DATA PREMIER LEAGUE SETELAH DI SORTING ASC");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        list.insertionSort(true);
        list.tampilAll();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }   
}
