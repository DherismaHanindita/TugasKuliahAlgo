/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class Stack {
 int size, top;
    int data[];
    
    Stack(int size){
        this.size = size;
        data = new int[size];
        top = -1;
    }
    
    boolean isEmpty(){
     return top == -1;
    }
    
    boolean isFull(){
     return top == size -1;
    }
    
    void push(int dt){
        if(!isFull()){
            top++;
            data[top] = dt;
        }else{
            System.out.println("Isi stack penuh!!");
        }
    }
    
     void pop(){
        if(!isEmpty()){
            int x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x);
        }else{
            System.out.println("Isi stack masih kosong");
        }
    }
    
    void peek(){
        System.out.println("Elemen teratas : " + data[top]);
    }
    
    void print(){
        System.out.println("Isi stack : ");
        for(int i=top;i>=0;i--){
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }
    
    void clear(){
        if(!isEmpty()){
            for(int i=top;i>=0;i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Gagal!, Stack masih kosong!");
        }
    }
}