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

public class OperatorIncreDecreJOP {
    public static void main(String[]args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai a!"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai b!"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai c!"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai d!"));
        // Print ke 1
        System.out.println("Print ke 1");
        System.out.println("A = " + a++);
        System.out.println("B = " + ++b);
        System.out.println("C = " + c--);
        System.out.println("D = " + --d);
        // Print ke 2
        System.out.println("Print ke 2");
        System.out.println("A = " + a++);
        System.out.println("B = " + ++b);
        System.out.println("C = " + c--);
        System.out.println("D = " + --d);
        // Print ke 3
        System.out.println("Print ke 3");
        System.out.println("A = " + a++);
        System.out.println("B = " + ++b);
        System.out.println("C = " + c--);
        System.out.println("D = " + --d);
        // Print ke 4
        System.out.println("Print ke 4");
        System.out.println("A = " + a++);
        System.out.println("B = " + ++b);
        System.out.println("C = " + c--);
        System.out.println("D = " + --d);
    }
}
