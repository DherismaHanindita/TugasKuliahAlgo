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
public class Node {
    Orang data;
    Node prev;
    Node next;
    
    Node(Node prev, Orang data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
