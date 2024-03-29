/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_02;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class Queue {
    public int max;
    int size;
    int front;
    int rear;
    Mahasiswa[] Q;
    
    public Queue(int max){
        this.max = max;
        Create();
    }
    
    public final void Create(){
        Q = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){
        if(size == 0){ 
            return true;
        } else { 
            return false;
        }
    }
    
    public boolean IsFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    
    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Elemen Queue Terdepan = " + Q[front].nim 
                    + " " + Q[front].nama + " " + " " 
                    + Q[front].absen + " " + Q[front].ipk);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    
    public void peekRear(){
        if (!IsEmpty()) {
            System.out.println("Elemen Queue Terbelakang = " + Q[rear].nim 
                    + " " + Q[rear].nama + " " + " " 
                    + Q[rear].absen + " " + Q[rear].ipk);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    
    public void peekPosition(String nim){
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front, idx = -1, count = 0;
            while(i < max){
                if(Q[i].nim.equals(nim)){
                    idx = i;
                    count++;
                    break;
                }
                i++;
            }
            
            if(count > 0){
                System.out.println(Q[idx].nim + " " + Q[idx].nama + " "
                    + Q[idx].absen + " " + Q[idx].ipk);
            }else{
                System.out.println(count + " " + nim);
                System.out.println("NIM tidak ada");
            }
        }
    }
    
    public void print(){
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front;
            System.out.println(front + "  " + rear);
            for(i=rear;i>front;i--){
                System.out.println(Q[i].nim + " " + Q[i].nama + " "
                    + Q[i].absen + " " + Q[i].ipk);
            }
            System.out.println("Jumlah Elemen : " + size);
        }
    }
    
    public void printMahasiswa(int position){
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            if(position >= max || position < 0){
                System.out.println("Nomor antrian(index) melebihi atau kurang dari size");
            }else{
                System.out.println(Q[position].nim + " " + Q[position].nama + " "
                    + Q[position].absen + " " + Q[position].ipk);
            }
        }
    }
    
    public void clear(){
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void Enqueue(Mahasiswa data){
        if (IsFull()) {
            System.out.println("Queue Sudah Penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0; 
            } else {
                if (rear == max-1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data; 
            size++;
        }
    }
    
    public Mahasiswa Dequeue(){
        Mahasiswa data = new Mahasiswa("","", 0,0);
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
