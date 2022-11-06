/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

/**
 *
 * @author imin
 */
import java.util.Scanner;

public class Soal3_if_else {
    public static void main(String[]args) {
        Scanner inp = new Scanner(System.in).useDelimiter("\n");
        int sisi;
        System.out.println("Pilih Metode");
        System.out.println("1. Menghitung luas persegi");
        System.out.println("2. Menghitung keliling persegi");
        System.out.print("Pilihan : ");
        int pilihan = inp.nextInt();
        
        if(pilihan == 1){
            System.out.print("Masukkan panjang sisi Persegi : ");
            sisi = inp.nextInt();
            int luas = sisi*sisi;
            System.out.println("Luas Persegi adalah "+luas+" cm");
        }else if(pilihan == 2){
            System.out.print("Masukkan panjang sisi persegi : ");
            sisi = inp.nextInt();
            int keliling = 4*sisi;
            System.out.println("Keliling persegi adalah "+keliling+" cm");
        }else{
            System.out.println("Sistem Error");
        }
    }
}
