/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_03;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class Main {
    public static void main(String[] args) {
        SingleLinkedList lists = new SingleLinkedList(); 
        lists.print();
        lists.addFirst("Bahasa");
        lists.print();
        lists.addLast("Multimedia");
        lists.print();
        lists.insertAfter("Bahasa", "Android");
        lists.print();
        lists.insertAt(2,"Komputer");
        lists.print();
        lists.insertAfter("Komputer","Basis Data");
        lists.print();
        lists.insertBefore("Multimedia","Statistika");
        lists.print();
        lists.insertBefore("Statistika","Algoritma");
        lists.print();
        lists.insertAt(4,"Matematika");
        lists.print();
    }
}
