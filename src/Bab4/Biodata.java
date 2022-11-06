/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4;

/**
 *
 * @author imin
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Biodata {
    public static void main(String[]args){
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Nama Lengkap      : ");
            String nama = br1.readLine();
            System.out.print("Nama Panggilan    : ");
            String nick = br1.readLine();
            System.out.print("TTL               : ");
            String ttl = br1.readLine();
            System.out.print("Umur              : ");
            int umur = Integer.parseInt(br1.readLine());
            System.out.println("Terima Kasih "+nama+" Telah Mengisi Biodata di Atas");
        } catch (IOException ex) {
            System.out.println("Error pada saat input data");
        }
    }
}
