/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_1sampai4;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree binary = new BinaryTree();

        binary.add(6);
        binary.add(4);
        binary.add(8);
        binary.add(3);
        binary.add(5);
        binary.add(7);
        binary.add(9);
        binary.add(10);
        binary.add(15);
        
        System.out.println("ITERATIF");
        binary.traversePreOrder(binary.root);
        System.out.println("");
        binary.traverseInOrder(binary.root);
        System.out.println("");
        binary.traversePostOrder(binary.root);
        System.out.println("");
        System.out.println("Pilihan " + binary.find(5));
        binary.delete(8);
        binary.traversePreOrder(binary.root);
        System.out.println("");
        System.out.println("Min    : " + binary.findMinValue());
        System.out.println("Max    : " + binary.findMaxValue());
        System.out.print("Print Leaf  : ");
        binary.printLeaf(binary.root);
        System.out.println("\nCount Leaf  : " + binary.countLeaf(binary.root));
        System.out.println("");
        System.out.println("");
        
        binary.addRec(6);
        binary.addRec(4);
        binary.addRec(8);
        binary.addRec(3);
        binary.addRec(5);
        binary.addRec(7);
        binary.addRec(9);
        binary.addRec(10);
        binary.addRec(15);
        
        System.out.println("REKURSIF");
        binary.traversePreOrder(binary.root);
        System.out.println("");
        binary.traverseInOrder(binary.root);
        System.out.println("");
        binary.traversePostOrder(binary.root);
        System.out.println("");
        System.out.println("Find " + binary.find(5));
        binary.delete(8);
        binary.traversePreOrder(binary.root);
        System.out.println("");
        System.out.println("Min    : " + binary.findMinValue());
        System.out.println("Max    : " + binary.findMaxValue());
        System.out.print("Print Leaf  : ");
        binary.printLeaf(binary.root);
        System.out.println("\nCount Leaf  : " + binary.countLeaf(binary.root));
        System.out.println("");
        System.out.println("");
    }
}
