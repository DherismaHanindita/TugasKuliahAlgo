/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class Queue {
   public int max, size, front, rear;
    public Penumpang[] Q;
    
    public Queue(int max){
        this.max = max;
        Create();
    }
    
    public void Create(){
        Q = new Penumpang[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){ // MENGECEK APAKAH QUEUE KOSONG ATAU TIDAK
        if(size == 0){ // queue ketika kosong
            return true;
        } else { // queue ketika ada isinya
            return false;
        }
    }
    
    public boolean IsFull(){ // MENGECEK APAKAH QUEUE SUDAH PENUH ATAU BELUM
        if (size == max) { // apakah size sudah mencapai nilai maksimal atau belum
            return true;
        } else {
            return false;
        }
    }
    
    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Elemen Queue Terdepan : " + Q[front].nama + " " 
                    + Q[front].kotaAsal + " " + Q[front].kotaTujuan + " " + " "
                    + Q[front].jumlahTiket + " " + Q[front].harga);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    
    public void print(){
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front;
            while(i != rear){
                System.out.println(Q[i].nama + " " 
                    + Q[i].kotaAsal + " " + Q[i].kotaTujuan + " " + " "
                    + Q[i].jumlahTiket + " " + Q[i].harga);
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah Elemen : " + size);
        }
    }
    
    public void clear(){ // UNTUK MENGKOSONGKAN SELURUH ELEMEN YANG ADA DI QUEUE
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void Enqueue(Penumpang data){
        if (IsFull()) {
            System.out.println("Queue Sudah Penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0; //data yang diisi adalah data pertama
            } else {
                if (rear == max-1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data; // proses insert data
            size++;
        }
    }
    
    public void peekRear(){
        if (!IsEmpty()) {
            System.out.println("Antrian Paling Terbelakang : " + Q[rear].nama 
                    + " " + Q[rear].kotaAsal + " " + " " + Q[rear].kotaTujuan 
                    + " " + Q[rear].jumlahTiket + " " + Q[rear].harga);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    
    public Penumpang Dequeue(){
        Penumpang data = new Penumpang("","","", 0,0);
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max-1) {
                    front = 0;
                }
            }
        }
        return data;
    }
}

