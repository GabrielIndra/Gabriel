/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author admin
 */
public class Sel {

    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String proses() {
        String resultString = null;
        if (text.startsWith("=")) {
            int panjang = text.length();
            String cellString = text.substring(1, panjang);
            if (cellString.contains("*")) {
                String temp[] = cellString.split("\\*");
                String firstCharacter = temp[0];
                String secondCharacter = temp[1];
                double firstDouble = Double.valueOf(firstCharacter);
                double secondDouble = Double.valueOf(secondCharacter);
                double resultDouble = firstDouble * secondDouble;
                resultString = String.valueOf(resultDouble);
            }

            if (cellString.contains("+")) {
                String temp[] = cellString.split("\\+");
                String firstCharacter = temp[0];
                String secondCharacter = temp[1];
                double firstDouble = Double.valueOf(firstCharacter);
                double secondDouble = Double.valueOf(secondCharacter);
                double resultDouble = firstDouble + secondDouble;
                resultString = String.valueOf(resultDouble);
            }

            if (cellString.contains("-")) {
                String temp[] = cellString.split("\\-");
                String firstCharacter = temp[0];
                String secondCharacter = temp[1];
                double firstDouble = Double.valueOf(firstCharacter);
                double secondDouble = Double.valueOf(secondCharacter);
                double resultDouble = firstDouble - secondDouble;
                resultString = String.valueOf(resultDouble);
            }

            if (cellString.contains("/")) {
                String temp[] = cellString.split("\\/");
                String firstCharacter = temp[0];
                String secondCharacter = temp[1];
                double firstDouble = Double.valueOf(firstCharacter);
                double secondDouble = Double.valueOf(secondCharacter);
                double resultDouble = firstDouble / secondDouble;
                resultString = String.valueOf(resultDouble);
            }
            
        }
        
        return resultString;
        
    }
}
