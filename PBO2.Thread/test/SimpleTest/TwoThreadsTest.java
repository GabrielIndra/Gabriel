/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleTest;

import Thread.SimpleThread;

/**
 *
 * @author 8.1 Enterprise
 */
public class TwoThreadsTest {
    public static void main(String[] args) {
        new SimpleThread("Bali").start();
        new SimpleThread("Jogja").start();
        new SimpleThread("Surabaya").start();
    }
}
