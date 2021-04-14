/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo1;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */

import java.util.Scanner;
public class KalimatMain {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Masukan kalimat : ");
        String kalimat = sc.nextLine();

        Kalimat reserveStack = new Kalimat(kalimat.length());

        for (int i = 0; i < kalimat.length(); i++) {
            reserveStack.push(kalimat.charAt(i));
        }

        reserveStack.print();
        System.out.println("");
}
}
