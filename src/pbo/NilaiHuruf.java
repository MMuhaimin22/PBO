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

public class NilaiHuruf {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Nilai anda = ");
        int nilai = inp.nextInt();
        if((nilai > 0) && (nilai < 55)) {
            System.out.println("Nilai anda adalah E");
        } else if(nilai < 0) {
            System.out.println("Error");
        } else if(nilai < 65) {
            System.out.println("Nilai anda adalah D");
        } else if(nilai < 75) {
            System.out.println("Nilai anda adalah C");
        } else if(nilai < 85) {
            System.out.println("Nilai anda adalah B");
        } else if(nilai < 100) {
            System.out.println("Nilai anda adalah A");
        } else {
            System.out.println("Error");
        }
    }
}
