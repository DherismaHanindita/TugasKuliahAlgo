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
public class SingleLinkedList {
    Node head;
    Node tail;
    
    public boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if(!isEmpty()) {
        Node tmp = head;
        System.out.print("Isi Linked List: \t");
        while (tmp != null) {
        System.out.print(tmp.data + "\t");
        tmp = tmp.next;
        }
        System.out.println("");
        } else {
        System.out.println("!!! LINKED LIST KOSONG !!!");
        }
    }
    
    public void addFirst(int input) {
        Node ndInput = new Node (input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    public void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next==null) tail=ndInput;
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }
    
    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("indeks salah");
        }else if (index == 0){
            addFirst(input);
        }else{
            Node temp = head;
            for (int i = 0; i < index - 1 ; i++) {
            temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next==null) tail = temp.next;
        }
    }

}
