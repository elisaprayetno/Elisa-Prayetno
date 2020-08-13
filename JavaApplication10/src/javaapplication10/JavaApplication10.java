/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author ACER
 * codingan ke 10 bro
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama Anda :");
        String namaku = input.nextLine();
        System.out.print("Masukan Nilai Anda :");
        int nilaiku = input.nextInt();
        
        System.out.println("HALO, "+ namaku);
        
        if(nilaiku >= 90){
            System.out.println("WIIL YOU MARRY ME?");
        }
        else if (nilaiku >= 75){
            System.out.println("WILL YOU BE MY BOYFRIEND?");
        }
        else if(nilaiku >= 60){
            System.out.println("I LOVE YOU, MANIS");
        }
        else if (nilaiku >= 50){
            System.out.println("D");
        }
        else{
            System.out.println("NONTON YUK");
        }
    }
}
            
        // TODO code application logic here