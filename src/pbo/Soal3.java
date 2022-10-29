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

public class Soal3 {
    
    public static void main(String[]args){
        String nama,kelas,nim,semester;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Nama     : ");
        nama = inputan.nextLine();
        System.out.print("Masukkan NIM      : ");
        nim = inputan.nextLine();
        System.out.print("Masukkan Semester : ");
        semester = inputan.nextLine();
        System.out.print("Masukkan Kelas    : ");
        kelas = inputan.nextLine();
        System.out.println("-----Hasil-----");
        System.out.println("Nama        : "+nama);
        System.out.println("NIM         : "+nim);
        System.out.println("Semester    : "+semester);
        System.out.println("Kelas       : "+kelas);
        
    }
    
}
