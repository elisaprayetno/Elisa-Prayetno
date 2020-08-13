/*
 * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("INPUT SEBUAH BILANGAN : ");
        int bilangan = scan.nextInt();
        if (bilangan % 2 == 1){
        System.out.println(bilangan+ " adalah bilangan GANJIL ");  
    }else{
     System.out.println(bilangan+ " adalah bilangan GENAP ");
    
}
    }
}

