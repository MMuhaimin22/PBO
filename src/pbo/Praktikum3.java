/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author imin
 */
public class Praktikum3 {
    public static void main(String[]args){
        int nilai1,nilai2,nilai3;
        nilai1 = 10;
        nilai2 = 10;
        nilai3 = 10;
        System.out.println("nilai 1 = "+nilai1);
        System.out.println("nilai 2 = "+nilai2);
        System.out.println("nilai 3 = "+nilai3);
        System.out.println("Kesimpulan : ");
        if((nilai2 < nilai1 ) && (nilai3 < nilai1))  {
            System.out.println("nilai 1 adalah yang terbesar");
        }
        else{
            if((nilai1 < nilai2) && (nilai3 < nilai2)){
                System.out.println("nilai 2 adalah yang terbesar");
            }
        }
        if((nilai3 > nilai2) && (nilai3 > nilai1))  {
            System.out.println("nilai 3 adalah nilai terbesar");
        }
        else
            if((nilai1 == nilai2) && (nilai2 == nilai3) && (nilai3 == nilai1)){
                System.out.println("semua nilai adalah sama");
            }
        
    }
}
