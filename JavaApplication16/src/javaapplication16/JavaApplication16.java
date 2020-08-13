/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

       System.out.println("Program Aritmatika");
       System.out.println("masukan a");
       int a = scan.nextInt();
       System.out.println("masukan b");
       int b = scan.nextInt();
       int c = a+b;
       System.out.println(a + " + " + b +" = " +c);
    }
    
}
