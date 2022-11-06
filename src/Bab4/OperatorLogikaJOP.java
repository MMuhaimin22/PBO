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

public class OperatorLogikaJOP {
    public static void main(String[]args){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai a!"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai b!"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai c!"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai d!"));
        boolean b1 = a < b;
        boolean b2 = c > d;
        boolean b3 = !b1;
        boolean b4 = !b2;
        // Tes Logika AND
        boolean TesAND1 = b1 & b2;
        boolean TesAND2 = b1 && b2;
        boolean TesAND3 = b1 && b3;
        boolean TesAND4 = b1 && b4;
        // Tes Logika OR
        boolean TesOR1 = b1 | b2;
        boolean TesOR2 = b1 || b2;
        boolean TesOR3 = b1 || b3;
        boolean TesOR4 = b1 || b4;
        // Tes Logika XOR
        boolean TesXOR1 = b1 ^ b2;
        boolean TesXOR2 = b1 ^ b3;
        boolean TesXOR3 = b1 ^ b4;
        // Print
        System.out.println("Tes AND 1 = " + TesAND1);
        System.out.println("Tes AND 2 = " + TesAND2);
        System.out.println("Tes AND 3 = " + TesAND3);
        System.out.println("Tes AND 4 = " + TesAND4);
        System.out.println("Tes OR 1 = " + TesOR1);
        System.out.println("Tes OR 2 = " + TesOR2);
        System.out.println("Tes OR 3 = " + TesOR3);
        System.out.println("Tes OR 4 = " + TesOR4);
        System.out.println("Tes XOR 1 = " + TesXOR1);
        System.out.println("Tes XOR 2 = " + TesXOR2);
        System.out.println("Tes XOR 3 = " + TesXOR3);
    }
}
