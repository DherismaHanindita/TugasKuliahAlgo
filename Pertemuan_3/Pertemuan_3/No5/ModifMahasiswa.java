/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3.No5;

/**
 *
 * @author Dherisma
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class ModifMahasiswa {
    int nim;
    char jenisKelamin;
    String nama;
    double ipk;
    
    ModifMahasiswa(){
    }
    
    double rataIpk(double ipk1, double ipk2, double ipk3){
        return (ipk1 + ipk2 + ipk3)/3;
    }
}
