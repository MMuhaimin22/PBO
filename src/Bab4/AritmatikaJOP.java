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

public class AritmatikaJOP {
    public static void main(String[]args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai A!"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai B!"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai C!"));
        // Hitung
        int hasil1 = a + b - c;
        int hasil2 = a * b / c;
        int hasil3 = a + b * c;
        int hasil4 = a + b / c;
        int hasil5 = (a + b) * c;
        int hasil6 = (a - b) * c;
        // Hasil1
        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);
        System.out.println(hasil4);
        System.out.println(hasil5);
        System.out.println(hasil6);
    }
}
