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
public class TanahTerluas {
    public int panjang;
    public int lebar;
    public int total;

    
    int luasTanah(){
        return panjang * lebar;
    }
    
    int tanahTerluas(int ta1, int ta2, int ta3){
        if (ta1 > ta2 && ta1 > ta3) {
            return 1;
        } else if (ta2 > ta1 && ta2 > ta3){
            return 2;
        } else {
            return 3;
        }
    }
}