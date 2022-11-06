/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4;

/**
 *
 * @author imin
 */
import javax.swing.JOptionPane;

public class OperatorPerbandinganJOP {
    public static void main(String[]args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai a!"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai b!"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai c!"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai d!"));
       // Bandingkan
        boolean tes1 = a > b;
        boolean tes2 = b < c;
        boolean tes3 = (a * 2) >= (b + c);
        boolean tes4 = (a / d) <= (c - a);
        boolean tes5 = (a - d) == d;
        boolean tes6 = (a - b) != (b - d);
        boolean tes7 = a > 12;
        boolean tes8 = b <= 7;
        boolean tes9 = c == 10;
        boolean tes10 = d != 5;
        // Print
        System.out.println("Tes ke 1 = " + tes1);
        System.out.println("Tes ke 2 = " + tes2);
        System.out.println("Tes ke 3 = " + tes3);
        System.out.println("Tes ke 4 = " + tes4);
        System.out.println("Tes ke 5 = " + tes5);
        System.out.println("Tes ke 6 = " + tes6);
        System.out.println("Tes ke 7 = " + tes7);
        System.out.println("Tes ke 8 = " + tes8);
        System.out.println("Tes ke 9 = " + tes9);
        System.out.println("Tes ke 10 = " + tes10);
    }
}
