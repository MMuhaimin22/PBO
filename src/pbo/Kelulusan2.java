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

public class Kelulusan2 {
    public static void main(String[]args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Jenis Kelamin = ");
        String jenis_kelamin = inp.nextLine();
        System.out.print("Masukkan Tinggi Badan = ");
        int tinggi = inp.nextInt();
        
        if("laki-laki".equals(jenis_kelamin)) {
        }if((tinggi <= 170) && (tinggi > 0)){
                System.out.println("Anda Gagal");
            }else if((tinggi >= 171) && (tinggi <=230)){
                System.out.println("Selamat Anda Lulus");}
        else if("perempuan".equals(jenis_kelamin)) {
        if((tinggi <= 160) && (tinggi > 0 )) {
                System.out.println("Anda Gagal");
            }else if((tinggi >= 161) && (tinggi <=210)){
                System.out.println("Selamat Anda Lulus");}
            
    }
    }
}
