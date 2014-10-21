/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;

/**
 *
 * @author 8.1 Enterprise
 */
public class Soal5 {

    public static void main(String[] args) {
        System.out.println(paijo(4));

    }

    public static int paijo(int x) {
        if (x == 0) {
            return 1;
        }
        return (x * paijo(x - 1) + 2 * x);
        //(paijo(x - 1) + 2 * x); //(2 * paijo(x - 1) + x * x);
    }
}
