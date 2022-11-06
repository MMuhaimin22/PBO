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

public class Zodiak {
    public static void main(String[]args) {
        Scanner inp = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan Nomor Zodiak = ");
        int zodiak = inp.nextInt();
        switch(zodiak){
    case 1:
        System.out.println("Nomor ke-" +zodiak + " adalah Capricorn");
        break;
    case 2:
        System.out.println("Nomor ke-" +zodiak + " adalah Aquarius");
        break;
    case 3:
        System.out.println("Nomor ke-" +zodiak + " adalah Pisces");
        break;
    case 4:
        System.out.println("Nomor ke-" +zodiak + " adalah Aries");
        break;
    case 5:
        System.out.println("Nomor ke-" +zodiak + " adalah Taurus");
        break;
    case 6:
        System.out.println("Nomor ke-" +zodiak + " adalah Gemini");
        break;
    case 7:
        System.out.println("Nomor ke-" +zodiak + " adalah Cancer");
        break;
    case 8:
        System.out.println("Nomor ke-" +zodiak + " adalah Leo");
        break;
    case 9:
        System.out.println("Nomor ke-" +zodiak + " adalah Virgo");
        break;
    case 10:
        System.out.println("Nomor ke-" +zodiak + " adalah Libra");
        break;
    case 11:
        System.out.println("Nomor ke-" +zodiak + " adalah Scorpio");
        break;
    case 12:
        System.out.println("Nomor ke-" +zodiak + " adalah Sagittarius");
        break;
    default:
        System.out.println("tidak ada zodiak ke-" + zodiak);
        }
    }
}
