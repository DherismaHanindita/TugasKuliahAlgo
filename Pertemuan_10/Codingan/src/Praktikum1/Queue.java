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
public class Queue {
    int max;
    int size;
    int front;
    int rear;
    int[] Q
            ;
    public Queue(int n){
        max = n;
        Create();
    }
    
    public void Create(){
        Q = new int[max];
        size = 0;
        front = rear = -1; 
    }
    
    public boolean IsEmpty(){
        return size == 0;
    }
    
    public boolean IsFull(){
        return size == max;
    }
    
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen Queue terdepan = " + Q[front]);
        }else{
            System.out.println("Queue MASIH KOSONG !");
        }
    }
    
    public void print(){
        if(IsEmpty()){
            System.out.println("QUEUE MASIH KOSONG");
        }else{
            int i = front;
            while(i != rear){
                System.out.println(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("JUMLAH ELEMEN = " + size);
        }
    }
    
    public void clear(){
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("QUEUE BERHASIL DIKOSONGKAN");
        }else{
            System.out.println("QUEUE MASIH KOSONG");
        }
    }
    
    public void Enqueue(int data){
        if (IsFull()) {
            System.out.println("QUEUE SUDAH PENUH");
        }else{
            if (IsEmpty()) {
                front = rear = 0;
            }else{
                if (rear == max - 1) {
                    rear = 0;
                }else{
                    rear++;
                }
            }
            Q[rear] =data;
            size++;
        }
    }
    
    public int Dequeue(){
        int data = 0;
        if (IsEmpty()) {
            System.out.println("QUEUE MASIH KOSONG!!");
        }else{
            data = Q[front];
            size--;
            if(IsEmpty()){
                front = 0;
            }else{
                if (front == max -1) {
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
}
