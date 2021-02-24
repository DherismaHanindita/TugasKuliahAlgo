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
public class VideoGame {
    String nama_member;
    String nama_game;
    int id;
    int lama_pinjam;
    double harga_sewa;
    
    public static void main(String[] args) {
        toko();
        pemilihan();
    }
    void hasil(){
        System.out.println("");
        System.out.println("~~~~DATA USER~~~~");
        System.out.println("Nama Penyewa    : " + nama_member);
        System.out.println("ID Game         : " + id);
        System.out.println("Nama Game       : " + nama_game);
        System.out.println("Lama Peminjaman : " + lama_pinjam + " hari");
        System.out.println("Harga Sewa      : " + harga_sewa + " /hari");
        System.out.println("Total Bayar     : " + bayarSewa());
    }
    
    
    static void toko(){
        System.out.println ("===================================================================");
        System.out.println ("========     -----------------------------------------        =====");
        System.out.println ("==========        !!!TOKO PENYEWAAN VIDEO GAME!!!        ==========");
        System.out.println ("==========        JL.LANGSEP GANG WISTA DMC NO 19        ==========");
        System.out.println ("========== email: dherVDGM.com ----- phone: 085223431xxx ==========");
        System.out.println ("========     -----------------------------------------         ====");
        System.out.println ("===================================================================");
    }
    
    static void pemilihan(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ___________________________");
        System.out.println("|     DAFTAR PEMILIHAN      |");
        System.out.println("|___________________________|");
        VideoGame game1 = new VideoGame(1, 1800, "Role Playing");
        VideoGame game2 = new VideoGame(2, 41000, "Adventure");
        VideoGame game3 = new VideoGame(3, 36000, "Real Time Strategi");
        
        game1.pilihan();
        game2.pilihan();
        game3.pilihan();
        
        System.out.println(" ");
        System.out.print("Pemilihan ID Game   : ");
        int opsi = sc.nextInt();
        switch(opsi){
            case 1:
                System.out.print("Lama Pinjam  : ");
                game1.lama_pinjam = sc.nextInt();
                sc.nextLine();
                System.out.print("Nama Member  : ");
                game1.nama_member = sc.nextLine();
                game1.hasil();
                break;
            case 2:
                System.out.print("Lama Pinjam  : ");
                game2.lama_pinjam = sc.nextInt();
                sc.nextLine();
                System.out.print("Nama Member  : ");
                game2.nama_member = sc.nextLine();
                game2.hasil();
                break;
            case 3:
                System.out.print("Lama Pinjam  : ");
                game3.lama_pinjam = sc.nextInt();
                sc.nextLine();
                System.out.print("Nama Member  : ");
                game3.nama_member = sc.nextLine();
                game3.hasil();
                break;
        }
    }
    
     VideoGame(int no, double harga, String nama){
        id = no;
        harga_sewa = harga;
        nama_game = nama;
    }
       
    void pilihan(){
        System.out.println(id + "   " + nama_game + "   " + harga_sewa + " /hari");
    }
    
    double bayarSewa(){
        double total = lama_pinjam * harga_sewa;
        return total;
    }    
}
