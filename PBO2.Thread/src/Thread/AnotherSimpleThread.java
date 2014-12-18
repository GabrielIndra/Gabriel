/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author 8.1 Enterprise
 */
public class AnotherSimpleThread implements Runnable {

    Thread thread;

    public AnotherSimpleThread() {
    }

    public AnotherSimpleThread(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + thread.getName());
            try {
                //thread.sleep((long) (Math.random() * 1000));
                thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
        System.out.println("Done" + thread.getName());
    }
}
