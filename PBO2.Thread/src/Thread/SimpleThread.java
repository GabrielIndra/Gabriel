/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author 8.1 Enterprise
 */
public class SimpleThread extends Thread {

    public SimpleThread(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                //sleep((long) (Math.random() * 1000));
                sleep (1000);
            }catch (InterruptedException e){
                
            }
        }
        System.out.println("Done "+ getName());
    }
   
}
