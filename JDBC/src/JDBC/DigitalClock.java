package JDBC;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class DigitalClock extends java.awt.Label{
    private DateFormat dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Thread t = new Thread(){
        @Override
        public void run(){
            while (true){
                setText(dt.format(new Date()));
            }
        }
    };
    public DigitalClock(){
        t.start();
    }
    
    public void setPattern(String Pattern){
        dt = new SimpleDateFormat(Pattern);
    }
}
