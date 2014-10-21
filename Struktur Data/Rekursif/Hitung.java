package Rekursif;
/**
 *
 * @author 8.1 Enterprise
 */
public class Hitung {
    public static void main(String[] args) {    
        System.out.println(count2(10));
    }
    public static void count (int index){
        if (index<10)
        {
            count(index+1);
        }
        System.out.println(index);
    }
    public static int count2(int index2){
        if(index2==0){
            return 0;
        }
            
        if (index2==1){
           return 1;
        }
        else {
            return (index2+(count2(index2-1)));
        }
    }
}