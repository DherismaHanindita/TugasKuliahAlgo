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
public class Barang {
    String nama;
    int hargaSatuan;
    int jumlah;
    
    Barang(){
        System.out.println("Parameter harus ada");
    }
    
    Barang(String na, int harga, int qty){
        nama = na;
        hargaSatuan = harga;
        jumlah = qty;
    }
    
    int hitungHargaTotal(){
        int total = hargaSatuan * jumlah;
        return total;
    }
    
    int hitungDiskon(){
        int total = hitungHargaTotal();
        int diskon = total;
        return diskon;
    }
    
    int hitungHargaBayar(){
        int total = hitungHargaTotal();
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int diskon;
        int hargaSatuan;
        int jumlah;
        int total;
        String nama;
        
        System.out.println("~~~~~ HASIL DISKON ~~~~~");
        System.out.print("Nama Barang   : ");
        nama = sc.nextLine();
        System.out.print("Harga Barang  : ");
        hargaSatuan = sc.nextInt();
        System.out.print("Jumlah Barang : ");
        jumlah = sc.nextInt();

        total = jumlah * hargaSatuan;
        if (total > 100000) {
            diskon = total *  10 / 100;
            total = total - diskon;
            System.out.println("Diskon = 10%\n" +total);
        }else if(total < 100000 ) {
            diskon = total * 5 / 100;
            total = total - diskon;
            System.out.println("Diskon = 5%\n");
            
        }else if(total < 50000){
            diskon = total * 0/100;
            total = total - diskon;
            System.out.println("Diskon = 0%\n");
        }else{
            System.out.print("Total Bayar = Rp " + total);
        }
    }
}
