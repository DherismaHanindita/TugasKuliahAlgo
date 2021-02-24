/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacMan;

/**
 *
 * @author Dherisma
 */

//Nama    : Dherisma Hanindita Utami
//NIM/ No : 2041720018
//Kelas   : TI 1H

import java.util.Scanner;
public class PacMan2 {
    static PacMan pacMan = new PacMan();

    static void lapangan(){
        Scanner in = new Scanner(System.in); 
        
        System.out.println("~~~~MENJALANKAN PACMAN~~~~");
        System.out.print("Masukkan Tinggi : ");
        pacMan.height = in.nextInt();
        System.out.print("Masukkan Lebar  : ");
        pacMan.width = in.nextInt();
        pacMan.x = 0; // koordinat x
        pacMan.y = 0; // koordinat y
        pacMan.printPosition(); // koordinat(0,0)
        pilihan();
    }
    
    static void pilihan(){
        Scanner in = new Scanner(System.in); 
        System.out.println("Perjalanan PacMan");
        System.out.println("1. Move Left");
        System.out.println("2. Move Right");
        System.out.println("3. Move Up");
        System.out.println("4. Move Down");
        System.out.print("Pilih langkah(number) : ");
        int pilih = in.nextInt();
        if(pilih == 1){
            pacMan.moveLeft();
        }else if(pilih == 2){
            pacMan.moveRight();
        }else if(pilih == 3){
            pacMan.moveUp();
        }else if(pilih == 4){
            pacMan.moveDown();
        }else{
            System.out.println("MOHON MAAF NUMBER TIDAK TERSEDIA");
        }
    }
public static void main(String[] args) {
        lapangan();
    }

}
