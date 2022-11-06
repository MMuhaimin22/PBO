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

public class Discount {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan harga belanjaan anda : ");
        int harga = inp.nextInt();
        System.out.print("Masukkan jumlah barang anda : ");
        int barang = inp.nextInt();
        int total = harga*barang;
        int discount;
        //if else
        if((total >=100000) && (total < 500000)) {
            discount = total*10/100;
            total = total-discount;
            System.out.println("Selamat anda mendapatkan diskon 10%");
            System.out.println("Jadi total harga belanjaan anda adalah "+total);
        }else if((total >= 500000) && (total < 1000000)) {
            discount = total*20/100;
            total = total-discount;
            System.out.println("Selamat anda mendapatkan diskon 20%");
            System.out.println("Jadi total harga belanjaan anda adalah "+total);
        }else if(total >= 1000000) {
            discount = total*30/100;
            total = total-discount;
            System.out.println("Selamat anda mendapatkan diskon 30%");
            System.out.println("Jadi total harga belanjaan anda adalah "+total);
        }
    }
}
