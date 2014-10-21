/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;

/**
 *
 * @author 8.1 Enterprise
 */
public class FindFactorialRecursive {
    public static void main(String[] args) {
        System.out.println(FindFactorial(3));
    }
    public static int FindFactorial(int number){
        if((number==1)||(number==0))
            return 1;
        else
            return (number*FindFactorial(number-1));
    }
}
