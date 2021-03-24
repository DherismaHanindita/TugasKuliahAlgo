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
public class TiketService {
    public Tiket[] tiket = new Tiket[5];
    public int tkt;
    
    void tambah(Tiket m){
        if(tkt < tiket.length){
            tiket[tkt] = m;
            tkt++;
        }else{
            System.out.println("Data sudah penuh");
    }}
    void tampilAll(){
        for(Tiket m : tiket){
            System.out.println(m.maskapai + "  " + m.harga + "  " + m.asal + "  " + m.tujuan);
    }}
    void bubbleSort(boolean bool){
        for(int i=0;i<tiket.length-1;i++){
            for(int j=1;j<tiket.length-i;j++){
                if(bool == false){
                    if(tiket[j].harga > tiket[j-1].harga){
                        Tiket temp = tiket[j];
                        tiket[j] = tiket[j-1];
                        tiket[j-1] = temp;
                    }
                }else{
                    if(tiket[j].harga < tiket[j-1].harga){
                        Tiket temp = tiket[j];
                        tiket[j] = tiket[j-1];
                        tiket[j-1] = temp;
                    }
                }}
        }}
    void selectionSort(boolean bool){
        for(int i=0;i<tiket.length-1;i++){
            int idx = i;
            for(int j=i+1;j<tiket.length;j++){
                if(bool == false){
                    if(tiket[j].harga > tiket[idx].harga){
                        idx = j;
                    }
                }else{
                    if(tiket[j].harga < tiket[idx].harga){
                        idx = j;
    } } }
            Tiket temp = tiket[idx];
            tiket[idx] = tiket[i];
            tiket[i] = temp;
    }}}