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

public class Latihan7 {
    public static void main(String[]args){
        float desimal;
        Scanner inputan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan Angka Desimal : ");
        desimal = inputan.nextFloat();
        System.out.println("Angka yang diinputkan adalah "+desimal);
    }
}
