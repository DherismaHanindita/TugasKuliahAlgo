/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_1;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class SLLMain {
    public static void main (String[] args) throws Exception {
    SingleLinkedList singLL = new SingleLinkedList(); 
    
    singLL.print();
    singLL.addFirst(890);
    singLL.print();
    singLL.addLast(760);
    singLL.print();
    singLL.addFirst(700);
    singLL.print();
    singLL.insertAfter(700,999);
    singLL.print();
    singLL.insertAt(3,833);
    singLL.print();
    }


}
