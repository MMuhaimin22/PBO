/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4;

/**
 *
 * @author imin
 */
import java.util.Scanner;

public class PenjumlahanScan {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Nilai A : ");
        int nilaiA = inp.nextInt();
        System.out.print("Masukkan Nilai B : ");
        int nilaiB = inp.nextInt();
        int jumlah = nilaiA + nilaiB;
        // Jumlah
        System.out.println("Jumlah = "+jumlah);
    }
}
