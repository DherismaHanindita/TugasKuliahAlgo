/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum;

/**
 *
 * @author Dherisma
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */

public class PremierLeagueService {
    PremierLeague leagues[] = new PremierLeague[20];
    int pts;
   
    void tambah(PremierLeague m){
        if (pts<leagues.length) {
            leagues[pts] = m;
            pts++; 
        }else{
            System.out.println("~~~~~~~~~TIKET SUDAH HABIS~~~~~~~~~");
       }
    }
   
    void tampilAll(){
        for (PremierLeague m : leagues) {
            System.out.println(m.team + "  " + m.play + "  " + m.goal + "  " + m.point);
        }
    }
     
    void insertionSort(boolean asc){
        for(int i=1;i<leagues.length;i++){
            PremierLeague temp = leagues[i];
            int j = i;
            if(asc == true){                   
                while(j > 0 && leagues[j].point > temp.point){
                    leagues[j] = leagues[j-1];
                    j--;
                } 
            }else{ 
                while(j > 0 && leagues[j-1].point < temp.point){
                    leagues[j] = leagues[j-1];
                    j--;
                } 
            }
            leagues[j] = temp;
    
    }
    }
    
}
