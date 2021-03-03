/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3;

/**
 *
 * @author Dherisma
//Nama    : Dherisma Hanindita Utami
//NIM/ No : 2041720018/09
//Kelas   : TI 1H
 */
public class Kubus {
    int sisi;
    
    Kubus(){
        
    }
    Kubus(int sisi){
        this.sisi = sisi;
    }
    
    int luasPermukaanKubus(){
         return sisi * sisi * 6;
    }
    
    int volumeKubus(){
        return sisi * sisi * sisi;
    }
}
