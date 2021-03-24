/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */

import java.util.Scanner;
public class MainTiket {
    static TiketService list = new TiketService();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Tiket t1 = new Tiket("Garuda Air   ", 3570000, "Jepang", "Korea");
        Tiket t2 = new Tiket("Citilynng Air", 1599999, "Indonesia", "Jepang");
        Tiket t3 = new Tiket("Okey Air     ", 1899999, "Indonesia", "Britania Raya");
        Tiket t4 = new Tiket("Dherisma Air ", 5609000, "Korea", "Eropa");
        Tiket t5 = new Tiket("Hanindita Air", 2700000, "Indonesia", "Hungaria");

        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
          
        System.out.println("DATA SEBELUM DI SORTING ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        list.tampilAll();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        
        features();
    }
    
    static void features(){
        System.out.println("~~~~~PILIHAN~~~~~");
        System.out.println("- FITUR MASKAPAI -");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.print("====== ");
        int option = sc.nextInt();
        
        switch(option){
            case 1:
                sortBy("BUBBLE SORT", option);
                break;
            case 2:
                sortBy("SELECTION SORT", option);
                break;
            default:
                System.out.println("Opsi Tidak ada!!");
                features();
        }
    }
    
    static void sortBy(String str, int option){
        System.out.println("- " + str + " SORT BY -");
        System.out.println("1. ASCENDING");
        System.out.println("2. DESCENDING");
        System.out.print("====== ");
        int x = sc.nextInt();
        
        if(option == 1){
            switch(x){
                case 1:
                    bubble(true);
                    break;
                case 2:
                    bubble(false);
                    break;
                default:
                    System.out.println("Opsi Tidak ada!!");
                    sortBy(str, option);
            }
        }else{
            switch(x){
                case 1:
                    selection(true);
                    break;
                case 2:
                    selection(false);
                    break;
                default:
                    System.out.println("Opsi Tidak ada!!");
                    sortBy(str, option);
            }
        }
    }
    
    static void bubble(boolean bool){
        System.out.println("------- BUBBLESORT --------");
        System.out.println("DATA SETELAH DI SORTING " + (bool == false ? "DESC" : "ASC"));
        System.out.println("----------------------------");
        list.bubbleSort(bool);
        list.tampilAll();
        System.out.println("----------------------------");
    }
    
    static void selection(boolean bool){
        System.out.println("------- SELECTIONSORT --------");
        System.out.println("DATA SETELAH DI SORTING " + (bool == false ? "DESC" : "ASC"));
        System.out.println("----------------------------");
        list.selectionSort(bool);
        list.tampilAll();
        System.out.println("----------------------------");
    }
}