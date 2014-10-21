/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;

import java.util.Scanner;

/**
 *
 * @author 8.1 Enterprise
 */
public class HitungNonRekursif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=0;
        
        System.out.println("Masukkan jumlah bilangan= ");
        int n= sc.nextInt();
       
        for (int i = 1; i <=n; i++) {
            total=total+i;
        }
        System.out.println(" ");
        System.out.println("jumlah= "+total);
    }
    
}
