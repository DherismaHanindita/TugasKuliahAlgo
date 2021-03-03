/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3.No2;

/**
 *
 * @author Dherisma
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
import java.util.Scanner;
public class MainClassTanah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah tanah : ");
       
        int n = sc.nextInt();
        Tanah[] tanahArray;
        tanahArray = new Tanah[n];
        
        for(int i=0;i<n;i++){
            tanahArray[i]= new Tanah();
            System.out.println("Urutan Tanah ke-" + i);
            System.out.print("Panjang = ");
            tanahArray[i].panjang =  sc.nextInt();
            System.out.print("Lebar   = ");
            tanahArray[i].lebar =  sc.nextInt();
            System.out.println("");
        }
        
        for(int i=0;i<n;i++){
            System.out.println("Luas = " + tanahArray[i].Luas());
        }
        
        Tanah besar = new Tanah();
        System.out.println("");
        System.out.println("Tanah terluas : Tanah " + besar.tanahTerluas(tanahArray[0].Luas(),tanahArray[1].Luas(),tanahArray[2].Luas()));
    
    }
}
