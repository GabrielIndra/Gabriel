/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;

/**
 *
 * @author 8.1 Enterprise
 */
public class Recursion1V1 {
    public static void main(String[] args) {
        count (1);
        System.out.println();
    }
    public static void count(int index){
        System.out.print(index);
        if(index<2)
            count(index+1);
    }
}
