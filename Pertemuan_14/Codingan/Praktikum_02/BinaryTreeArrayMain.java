/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_02;

/**
 *
 * @author Holla
 */
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinarryTreeArray bta = new BinarryTreeArray();
        int [] data = {6, 4, 8, 3, 5, 7, 9, 0, 0,0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
    }
}
