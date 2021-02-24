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
public class Lingkaran {
    double jarijari;
    double phi = 3.14;
    
    double hitungLuas(){
        double luas = phi * (jarijari * jarijari);
        return luas;
    }
    
    double hitungKeliling(){
        double keliling = 2*phi* jarijari;
        return keliling;
    }

    public static void main(String[] args) {
        double jarijari;
        Lingkaran lingkaran1 = new Lingkaran();
        Scanner sc = new Scanner (System.in);
        System.out.println("~~~~~~~MENGHITUNG LINGKARAN~~~~~~~");
        System.out.print("Masukkan nilai Jari Jari Lingkaran: ");
        lingkaran1.jarijari= sc.nextDouble();
        System.out.println("");
        
        System.out.println("Jari-jari          = " + lingkaran1.jarijari);
        System.out.println("Luas Lingkaran     = " + lingkaran1.hitungLuas());
        System.out.println("Keliling Lingkaran = " + lingkaran1.hitungKeliling());
    }
}
