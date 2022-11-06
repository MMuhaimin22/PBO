/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author imin
 */
import java.util.Scanner;

public class BobotNilaiHuruf {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan Huruf(A - E) : ");
        char huruf = inp.next().charAt(0);
        switch(huruf){
    case 'a':
        System.out.println("Huruf " +huruf + " Menjadi Angka 4");
        break;
    case 'b':
        System.out.println("Huruf " +huruf + " Menjadi Angka 3");
        break;
    case 'c':
        System.out.println("Huruf " +huruf + " Menjadi Angka 2");
        break;
    case 'd':
        System.out.println("Huruf " +huruf + " Menjadi Angka 1");
        break;
    case 'e':
        System.out.println("Huruf " +huruf + " Menjadi Angka 0");
        break;
    default:
        System.out.println("Huruf " +huruf + " Tidak bisa menjadi angka ");
}
    }
}

