/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
import java.util.Scanner;
public class QueueMain {
    public static void Menu() {
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("MASUKKAN OPERASI YANG DIINGINKAN = ");
        System.out.println("1. ENQUEU");
        System.out.println("2. DEQUEUE");
        System.out.println("3. PRINT");
        System.out.println("4. PEEK");
        System.out.println("5. CLEAR");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("MASUKKAN KAPASITAS QUEUE = ");
        int n= sc.nextInt();
        Queue Q =new Queue(n);
        int pilih;
        
        do {            
            Menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan data baru = ");
                    int dataMasuk=sc.nextInt();
                    Q.Enqueue(n);
                    break;                    
                case 2:
                    int datakeluar= Q.Dequeue();
                    if (datakeluar != 0) {
                        System.out.println("Data yang dikeluarkan = "+datakeluar);
                    break;
                    }
                case 3 :
                    Q.print();
                    break;                    
                case 4 :
                    Q.peek();
                    break;                    
                case 5 :
                    Q.clear();
                    break; 
            }
        } while (pilih == 1 || pilih ==2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
