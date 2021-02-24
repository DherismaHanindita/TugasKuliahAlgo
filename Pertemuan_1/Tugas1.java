/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dherisma
// */

//Nama    : Dherisma Hanindita Utami
//NIM/ No : 2041720018
//Kelas   : TI 1H
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //TARIF UNTUK PERPAKAIAN
        int tarifBaju = 4500;
        double total;
        
        //JIKA MENCUCI LEBIH DARI 10Kg MAKA AKAN MENDAPAT DISKON 5%
        System.out.println("Ani 4Kg");
        double pencuci1 = perhitungan(4, 4*tarifBaju);
        System.out.println("Budi 15Kg");
        double pencuci2 = perhitungan(15, 15*tarifBaju);
        System.out.println("Bina 6Kg");
        double pencuci3 = perhitungan(6, 6*tarifBaju);
        System.out.println("Cita 11Kg");
        double pencuci4 = perhitungan(11, 11*tarifBaju);
        
        System.out.println("");
    }

    private static double perhitungan(int i, int j) {
        if (i>10) {
            double n = j - (j*5/100);
            System.out.println(n);
            return n;
        }else{
            System.out.println(j);
            return j;
        }
    }


}
