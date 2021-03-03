/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3.No3;

/**
 *
 * @author Dherisma
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
import java.util.Scanner;
public class MainTanahTerluas {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah tanah : ");
        int n = sc.nextInt();
        System.out.println();
        TanahTerluas[] tanahArray = new TanahTerluas[4];
        
        for (int i = 1; i < 4; i++) {
            tanahArray[i] = new TanahTerluas();
            System.out.println("Tanah Ke " + i);
            System.out.print("Masukkan Panjang : ");
            tanahArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar   : ");
            tanahArray[i].lebar = sc.nextInt();
            
        }
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Luas Tanah " + i + " adalah : " + tanahArray[i].luasTanah());
        }
        
        TanahTerluas besar = new TanahTerluas();
        System.out.println("");
        System.out.println("Tanah terluas : Tanah " + besar.tanahTerluas(tanahArray[1].luasTanah(),tanahArray[2].luasTanah(), tanahArray[3].luasTanah() ));
    }}
