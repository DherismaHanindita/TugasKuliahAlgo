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
public class PremierLeague {
    String team;
    int play;
    int goal;
    int point;

    PremierLeague(String t, int p, int g, int pt){
        team = t;
        play = p; 
        goal = g;
        point = pt;
    }
    
    void tampil(){
        System.out.println("TEAM =" + team);
        System.out.println("PLAY  = " + play);
        System.out.println("GOAL = " + goal);
        System.out.println("OINT = " + point);
    }
   
        
}
