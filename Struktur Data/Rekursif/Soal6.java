/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;

/**
 *
 * @author 8.1 Enterprise
 */
public class Soal6 {

    public static void main(String[] args) {
        upAndDown(1);
        System.out.println();
    }
    public static void upAndDown (int n) 
	{
		System.out.print ("\nLevel: " +  n);
		if (n < 4)
			upAndDown (n+1);
		System.out.print ("\nLEVEL: " + n);
	}

}
