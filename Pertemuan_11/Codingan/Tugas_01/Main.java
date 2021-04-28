/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_01;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class Main {
    public static void main(String[] args) {
        SingleLinkedList SLL = new SingleLinkedList(); 
        SLL.print();
        SLL.addFirst(890);
        SLL.print();
        SLL.addLast(760);
        SLL.print();
        SLL.addFirst(700);
        SLL.print();
        SLL.insertAfter(700,999);
        SLL.print();
        SLL.insertBefore(890,111);
        SLL.print();
        SLL.insertAt(3,833);
        SLL.print();
    }
}
