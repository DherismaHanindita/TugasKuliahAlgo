/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_01_DoubleLinkedLists;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll= new DoubleLinkedLists();
        dll.print();
        System.out.println("size : "+dll.size());
        System.out.println("================================================");
        dll.addFirst(3);
        dll.addlast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("size  :"+dll.size());
        System.out.println("================================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size  :"+dll.size());
        System.out.println("================================================");
        dll.clear();
        dll.print();
        System.out.println("Size  :"+dll.size());
    }
}
