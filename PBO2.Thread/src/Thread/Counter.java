/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;


import javax.swing.JLabel;

/**
 *
 * @author 8.1 Enterprise
 */
public class Counter implements Runnable{
    JLabel outputLabel;
    private int value;
    Thread thread;
    private boolean start = true;
    public Counter(){
        setValue(0);
    }
    public Counter (JLabel output){
        outputLabel = output;
        setValue(0);
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (isStart()){
            outputLabel.setText("Counter: "+getValue());
            try{
                thread.sleep(500);
                setValue(getValue() + 1);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    public boolean isStart(){
        return start;
    }
    public void setStart(boolean start ){
        this.start = start;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
    
}
