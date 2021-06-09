/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_No_01;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
import java.util.Scanner;
public class Graph_Main {
     public static void main (String[] args) throws Exception {
        int count = 1, to, from;
        Graph graph = new Graph(6);
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah  lintasan : ");
        int jumlah = input.nextInt();
        System.out.println("------------------------------------");
        System.out.print("Masukkan edges: ");
        while (count <= jumlah) {
            to = input.nextInt();
            from = input.nextInt();
            graph.addEdge(to, from);
            count++;
        }
        System.out.println("");
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();
    }
}
