/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_04;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class Node {
    Nasabah data;
    Node next; 

    public Node(Nasabah nilai, Node berikutnya) {
        this.data = nilai; 
        this.next=berikutnya; 
    }
}
