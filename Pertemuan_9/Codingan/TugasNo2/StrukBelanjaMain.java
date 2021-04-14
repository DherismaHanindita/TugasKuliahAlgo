/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
import java.util.Scanner;
public class StrukBelanjaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
      
        System.out.println("~~~~~ STRUK BELANJA ~~~~~");
        System.out.println("~~~~~ ATAS NAMA DEWI ~~~~");
        System.out.println("________________________________________________________");
        System.out.println("|  NO  |     DATE     |  JUMLAH BRNG  |   TOTAL HARGA   |");        
        System.out.println("________________________________________________________");
        StrukBelanja stk = new StrukBelanja(8);
        StrukBelanja[] st = new StrukBelanja[8];
        st[0] = new StrukBelanja(111, "| 23 Januari     2021 " ,    39 ,          500000);
        st[1] = new StrukBelanja(121, "| 10 Februari    2021 " ,    23 ,          350000);
        st[2] = new StrukBelanja(131, "| 01 Maret       2021 " ,    5 ,          160000);
        st[3] = new StrukBelanja(141, "| 02 April       2021 " ,    3 ,           10000);
        st[4] = new StrukBelanja(151, "| 11 Mei         2021 " ,    56 ,          1600000);
        st[5] = new StrukBelanja(161, "| 16 Juni        2021 " ,    2  ,           10000);
        st[6] = new StrukBelanja(171, "| 01 Juli        2021 " ,    41 ,           5600000);
        st[7] = new StrukBelanja(181, "| 23 Februari    2021 " ,    2  ,          25000);
        
        for (StrukBelanja st1 : st) {
            System.out.println(st1.noTransaksi + st1.tglBeli + st1.jumlahBarang + st1.totalBayar);
            stk.push(st1);
        }
        System.out.println();
        System.out.println("Data yang diambil");
        int i = 0;
        while(i < 5){
            stk.pop();
            i++;
        }
        
        System.out.println();
        System.out.println("Data yang tersisa");
        stk.print();
       
    }
}
