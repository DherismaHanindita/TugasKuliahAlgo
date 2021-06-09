/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_02;

/**
 *
 * @author Dherisma 
 * Nama    : Dherisma Hanindita Utami
 * NIM/ No : 2041720018/09
 * Kelas   : TI 1H
 */
public class GraphArray {
    private final int vertices;
    private final int[][] twoD_array;
    
    public GraphArray(int v){
        vertices = v;
        twoD_array = new int[vertices + 1][vertices + 1];
    }
    
    public void makeEdge(int to, int from, int edge){
        try
        {
            twoD_array[to][from] = edge;
        }
         catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        }
    }
    
    public int getEdge(int to, int from){
        try
        {
            return twoD_array[to][from];
        }
        catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }
}
