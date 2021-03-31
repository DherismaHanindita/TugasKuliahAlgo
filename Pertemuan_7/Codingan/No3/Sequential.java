/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequential;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class Sequential {
    int baris, kolom;
    int[][] data = new int[3][5];
    
    void tambah(){
        data[0][0] = 45;
        data[0][1] = 78;
        data[0][2] = 7;
        data[0][3] = 200;
        data[0][4] = 80;
        data[1][0] = 90;
        data[1][1] = 1;
        data[1][2] = 17;
        data[1][3] = 100;
        data[1][4] = 50;
        data[2][0] = 21;
        data[2][1] = 2;
        data[2][2] = 40;
        data[2][3] = 18;
        data[2][4] = 65;
    }
    
    void tampil(){
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    int[] FindSeqSearch(int s){
        int arr[] = new int[2];
        int bar = -1, col = -1;
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                if(data[i][j] == s){
                    baris = i;
                    col = j;
                    break;
                }
            }
        }
        arr[0] = baris;
        arr[1] = col;
        return arr;
    }
    
    void TampilPosisi(int x, int bar, int col){
        if(bar != -1 && col != -1){
            System.out.println("Data " + x + " ditemukan pada baris ke " + bar + " dan kolom ke " + col);
        }else{
            System.out.println("Data " + x + " TIDAK DITEMUKAN");
        }
    }
    
    void TampilData(int x, int bar, int col){
        if(bar != -1 && col != -1){
            System.out.println("Nilai  = " + x);
            System.out.println("Data   = " + data[bar][col]);
            System.out.println("Status = DITEMUKAN");
        }else{
            System.out.println("Data " + x + " TIDAK DITEMUKAN");
        }
    }

}
