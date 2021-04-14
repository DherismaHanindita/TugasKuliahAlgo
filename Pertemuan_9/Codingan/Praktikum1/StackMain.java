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
import java.util.Scanner; 
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack stk = new Stack(5);
        
        stk.push(15);
        stk.push(27);
        stk.push(13);
        
        stk.print();
        
        stk.push(11);
        stk.push(34);
        stk.pop();
        stk.peek();
        stk.print();
        
        stk.push(18);
        stk.push(40);
        stk.print();
    }
}
