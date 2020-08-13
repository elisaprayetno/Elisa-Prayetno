/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.Scanner;

/**
 *
 * @author ACER ELISA FC PRAYETNO 
 * 19112474
 * TUGAS UAS ALPRO2 REKURSIF
 */
public class JavaApplication33 {
    
    static Scanner scan;
    static int total;
    /* bilangan prima */
    static void cetakAngka(int angka, int batas) {
        total = 0;
        if (angka <= batas) {
            // batas
            if (angka == batas) {

                System.out.print(angka + " = ");
            } else {
            // cetak
                System.out.print(angka + " + ");
                total += angka;
                cetakAngka(++angka, batas);
            }            
        }
    }
    /* bilangan genap dari 2 */
    static void cetakAngkaGenap(int angka, int batas) {
        total = 0;
        if (angka <= batas) {
            //batas
            if (angka == batas) {

                System.out.print(angka + " = ");
            } else {
            //cetak
                System.out.print(angka + " + ");
                total += angka;
                angka = angka + 2;
                cetakAngkaGenap(angka, batas);
            }
        }

    }

    /* faktorial */
    static int faktorial(int angka) {

        if (angka == 0){
            return 1;
        } else if (angka == 1){
            return 1;
        } else{
            return (angka * faktorial(angka-1));
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner
        scan = new Scanner(System.in);
        //pilihan soal
        System.out.println("PILIH SOAL : ");
        System.out.println("1. Rekursif Bilangan Prima\n2. Rekursif Bilangan Genap\n3. Kombinasi\n4. Permutasi");
        System.out.print("Pilihan : ");
        int pilihanSoal = scan.nextInt();
        switch(pilihanSoal) {

            case 1 : 
                System.out.println("\n====== REKURSIF BILANGAN PRIMA ======");
                System.out.print("Nilai awal = "); int nilaiAwalPrima = scan.nextInt();
                System.out.print("Nilai Batas = "); int nilaiBatasPrima = scan.nextInt();
                //rekursif prima
                cetakAngka(nilaiAwalPrima, nilaiBatasPrima);
                System.out.println(total); //total
                break;

            case 2 :
                System.out.println("\n====== REKURSIF BILANGAN GENAP ======");
                System.out.print("Nilai awal = "); int nilaiAwalGenap = scan.nextInt();
                System.out.print("Nilai Batas = "); int nilaiBatasGenap = scan.nextInt();
                //rekursif genap
                cetakAngkaGenap(nilaiAwalGenap, nilaiBatasGenap);
                System.out.println(total); //total
                break;
            
            case 3 :
                System.out.println("\n====== REKURSIF KOMBINASI ======");
                System.out.print("Nilai n (Keseluruhan Objek) = "); int nilaiN = scan.nextInt();
                System.out.print("Nilai r (Objek) = "); int nilaiR = scan.nextInt();
                //rekursif kombinasi
                int kombinasi = faktorial(nilaiN)/ (faktorial(nilaiN - nilaiR) * faktorial(nilaiR));
                System.out.println("           n!");
                System.out.println("nCr = -------------- = " + kombinasi);
                System.out.println("      (n-r)! x r!"); 
                break;

            case 4 :
                System.out.println("\n====== REKURSIF PERMUTASI ======");
                System.out.print("Nilai n (Keseluruhan Objek) = "); int nilaiN1 = scan.nextInt();
                System.out.print("Nilai r (Objek) = "); int nilaiR1 = scan.nextInt();
                //rekursif kombinasi
                int permutasi = faktorial(nilaiN1)/ faktorial(nilaiN1 - nilaiR1);
                System.out.println("         n!");
                System.out.println("nPr = --------- = " + permutasi);
                System.out.println("       (n-r)!");
                break;
            
            case 5 :
            int hasil = faktorial(13);
            System.out.println(hasil);
                break;
            default :
        }
    }
}
 
    
