/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_2d;

/**
 *
 * @author ACER
 */
public class Array_2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code ap  plication logic here
        String [][] biodata ={
        {"NAMA","  NIM"},                    //baris ke 0
        {"wahyudin", " (18330034)"},           //baris ke 1
        {"agus dwiyanto", " (18330031)"},       //baris ke 2
        {"muhammad donni", " (18330111)"},};        //baris ke 3   
    
        //mendeklarasikan baris dan kolom
        int i, j;  //input i=baris dan j=kolom 
        for (i=0;i<4;i++){   //menampilkan isi jumlah baris
        for (j=0;j<2;j++){  //menampilkan isi jumlah kolom
        
        //menampilkan isi baris dan kolom
            System.out.print(biodata[i][j]+"");
        } 
            System.out.println(""); //pindah baris
        }
        
    }
    
}
