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
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
    BinaryTreeArray bta = new BinaryTreeArray();

    int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
    int idxLast = 6;
    bta.populateData(data, idxLast);
    bta.traverseInOrder(0);
    System.out.println("");
    }
}
