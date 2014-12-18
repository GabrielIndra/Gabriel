/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author 8.1 Enterprise
 */
public class CobaJam {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss");
        System.out.println(sdt.format(cal.getTime()));
    }
}
