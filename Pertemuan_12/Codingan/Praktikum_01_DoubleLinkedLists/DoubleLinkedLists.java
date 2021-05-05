/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_01_DoubleLinkedLists;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class DoubleLinkedLists {
    Node head;
    int size;
    
    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }
    
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int item){
        if(isEmpty()){
            head = new Node(null, item, null);
        }else{
            Node newNode= new Node(null, item, head);
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }
    
    public void addlast(int item){
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current= head;
            while (current.next != null) {                
                current = current.next;
                
            }
            Node newNode = new Node(current, item, null);
            current.next=newNode;
            size++;
            
        }
        
    }
    
    public void add(int item, int index) throws Exception{
        if (isEmpty()) {
            addFirst(item);
       
    }else if (index < 0 || index > size){
        throw  new Exception ("nilai indexxs di luar batas");
    }else{
        Node current=head;
        int i=0;
            while (i < index) {                
                current = current.next;
                i++;
            }
            if (current.prev==null) {
                Node newNode = new Node(null, item, current);
                current.prev=newNode;
                head= newNode;
            } else {
                Node newNode=new Node(current.prev, item, current);
                newNode.prev=current.prev;
                newNode.next=current;
                current.prev.next= newNode;
                current.prev= newNode;
            }
    }
        size++;
}
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head= null;
        size=0;
    }
    
    void print(){
        if (!isEmpty()) {
            Node tmp=head;
            while (tmp !=null) {                
                System.out.println(tmp.data+ "\t");
                tmp= tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    }