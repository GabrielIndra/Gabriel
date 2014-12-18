/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleTest;

import Thread.AnotherSimpleThread;

/**
 *
 * @author 8.1 Enterprise
 */
public class AnotherSimpleThreadTest {
    public static void main(String[] args) {
        new AnotherSimpleThread("Bali");
        new AnotherSimpleThread("Jogja");
        new AnotherSimpleThread("Surabaya");
    }
}
