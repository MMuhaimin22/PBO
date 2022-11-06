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

public class Latihan7 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Siapakah presiden pertama indonesia ? ");
        System.out.println("a.Dr.Ir.H.Soekarno");
        System.out.println("b.B.J.Habibie");
        System.out.println("c.Megawati Soekarno Putri");
        System.out.println("d.Abdurrahman Wahid");
        char pilih = scan.next().charAt(0);
        
        switch(pilih){
            case 'a':
                System.out.println("Benar !");
                break;
            case 'b':
                System.out.println("Salah, Jawabannya adalah Dr.Ir.H.Soekarno");
                break;
            case 'c':
                System.out.println("Salah, Jawabannya adalah Dr.Ir.H.Soekarno");
                break;
            case 'd':
                System.out.println("Salah, Jawabannya adalah Dr.Ir.H.Soekarno");
                break;
            default:
                System.out.println("Sistem Error");
        }
    }
}
