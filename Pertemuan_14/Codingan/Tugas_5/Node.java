/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_5;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class Node {
    int data;
    Node left;
    Node right;

    public Node() {
        
    }

    public Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
