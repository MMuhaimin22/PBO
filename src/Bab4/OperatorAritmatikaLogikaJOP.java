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

public class OperatorAritmatikaLogikaJOP {
    public static void main(String[] args) {
        //penginputan nilai / value pertama dan kedua    
        //pengunaan jOptionPane yang mana inputan String dikonversi ke Double
        double input1 = Double.parseDouble(JOptionPane.showInputDialog("Masukan Value A"));
        double a = (input1);
        
        double input2 = Double.parseDouble(JOptionPane.showInputDialog("Masukan Value B"));
        double b = (input2);
        
        //operator aritmatika
        double pertambahan, pengurangan, perkalian, pembagian, modulo;
        pertambahan = a + b; pengurangan = a - b; perkalian = a * b; 
        pembagian = a /b; modulo = a % b;
        
        double incrementa, incrementb, decrementa, decrementb;
        incrementa = a += 2; incrementb = b +=2; 
        decrementa = a -= 2; decrementb = b -=2; 
        
        boolean logikaA, logikaB; logikaA = true; logikaB = false;
        
        boolean lessThan, greaterThan, lessOrEqual, greaterOrEqual, comparison;
        lessThan = a < b; greaterThan = a > b; lessOrEqual = a <= b; greaterOrEqual = a >= b; 
        comparison = a == b;
        
        //operator logika      
        boolean logikaAND, logikaOR, logikaXOR, logikaNOT;
        logikaAND = logikaA && logikaB; logikaOR = logikaA || logikaB; 
        logikaXOR = logikaA ^ logikaB; logikaNOT = logikaA != logikaB;
       
        JOptionPane.showMessageDialog(null, "Hasil pertambahan : " + pertambahan + ", Hasil Pengurangan : " + pengurangan + ", Hasil Perkalian : " + perkalian + ", Hasil Pembagian : " + pembagian + ", Hasil Modulo : " + modulo);
        JOptionPane.showMessageDialog(null,"increment A : " + incrementa + ", increment B : " + incrementb + ", decrement A : " + decrementb + ", decrement B : " + decrementb);
        JOptionPane.showMessageDialog(null, "True AND False : " + logikaAND + ", True OR False : " + logikaOR + ", True XOR False : " + logikaXOR + ", Logika 1 NOT Logika 2 : " + logikaXOR);
        JOptionPane.showMessageDialog(null, "a = " + input1 + ", b = " + input2 + ". a < b : " + lessThan + ", a > b : " + greaterThan + ", a <= b : " + lessOrEqual + ", a >= b : " + greaterOrEqual + ", a == b : " + comparison);
        
        System.exit(0);
    }

}

