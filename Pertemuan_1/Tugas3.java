
import java.util.Scanner;

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
public class Tugas3 {
    
//    Menampilkan Bialngan Genap
//    Dari 2 sampai n kecuali bilangan genap kelipatan 4
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        for (int i = 0; i < 20; i++) {
            if (i%2 == 0) {
                System.out.print(" ");
            }else{
                n = 2*i;
                System.out.println("Output: " + n);
            }
        }
    }
}

