/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo1;

/**
 *
 * @author  Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class Kalimat {
    char[] stack;
    int top;
    int size;

    public Kalimat(int size) {
        this.size = size;
        stack = new char[this.size];
        top = -1;
    }

    public boolean isFull() {
        return top >= size - 1;
    }

    public boolean isEmpty() {
        return top <= -1;
    }

    public void push(char c) {
        if (!isFull()) {
            top++;
            stack[top] = c;
        } else {
            System.out.println("Data sudah full!");
        }
    }

    public void print() {
        for (int i = top; i >= 0 ; i--) {
            System.out.print(stack[i] + "");
        }
    }
}
