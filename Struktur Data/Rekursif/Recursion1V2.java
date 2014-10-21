/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;

/**
 *
 * @author 8.1 Enterprise
 */
public class Recursion1V2 {

    public static void main(String args[]) {
        //count(0);
        count(3);
        System.out.println();
    }

    public static void count(int index) {
        if (index <= 12) {
            System.out.print(" "+index);
            count(index + 3);
        }

    }
}