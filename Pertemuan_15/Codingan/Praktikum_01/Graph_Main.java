/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_01;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class Graph_Main {
    public static void main(String[] args) throws Exception{
       Graph graph = new Graph(6);
       graph.addEdge(0, 1);
       graph.addEdge(0, 4);
       graph.addEdge(1, 2);
       graph.addEdge(1, 3);
       graph.addEdge(1, 4);
       graph.addEdge(2, 3);
       graph.addEdge(3, 4);
       graph.addEdge(3, 0);
       graph.printGraph();
       graph.degree(2);
       graph.removeEdge(1, 2);
       graph.printGraph();
    }
}
