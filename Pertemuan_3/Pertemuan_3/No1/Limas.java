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
public class Limas {
    int alas, tinggi, luasAlas, tinggi2;
    
    Limas(){
        
    }
    Limas(int alas, int tinggi, int luasAlas, int tinggi2){
        this.alas = alas;
        this.tinggi = tinggi;
        this.luasAlas = luasAlas;
        this.tinggi2 = tinggi2;
    }
    
    int luasPermukaanLimas(){
        return (alas * tinggi)/2;
    }
    
    int volumeLimas(){
        return (alas * tinggi)/3;
    }
}
