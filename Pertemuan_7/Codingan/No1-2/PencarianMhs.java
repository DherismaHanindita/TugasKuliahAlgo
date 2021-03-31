/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class PencarianMhs {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("~~~~~~~~DATA SUDAH PENUH~~~~~~~~");
        }
    }
    
    void tampil(){
        for (Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
      
    void selectionSort(){
        for(int i=0;i<listMhs.length-1;i++){
            int idx = i;
            for(int j=i+1;j<listMhs.length;j++){
                if(listMhs[j].nim < listMhs[idx].nim){
                    idx = j;
                }
            }
            Mahasiswa temp = listMhs[idx];
            listMhs[idx] = listMhs[i];
            listMhs[i] = temp;
        }
    }
    
    //Pencarian dilakukan berdasarkan Nama Mahasiswa// 
    //(gunakan Algoritma Sequential Search//
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left+ right) / 2;
            if(cari == listMhs[mid].nim){
                return mid;
            }else if(listMhs[mid].nim > cari){
                return FindBinarySearch(cari, left, mid - 1);
            }else{
                return FindBinarySearch(cari, mid + 1,right);
            }
        }
        return -1;
    }    
    public void TampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("Data NIM = " + x + " berada pada indexs " + pos);
        }else{
            System.out.println("Data NIM = " +x+ " tidak ditemukan");
        }
    }    
    public void TampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("NIM \t  = " + x);
            System.out.println("NAMA \t  = " +listMhs[pos].nama);
            System.out.println("UMUR \t  = " +listMhs[pos].umur);
            System.out.println("IPK \t  = " +listMhs[pos].ipk);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        }else{
            System.out.println("Data " + x+ " tidak ditemukan"); 
        }
    }

    int FindSeqSearch(String cari) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void TampilPosisi(String cari, int posisi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void TampilData(String cari, int posisi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
