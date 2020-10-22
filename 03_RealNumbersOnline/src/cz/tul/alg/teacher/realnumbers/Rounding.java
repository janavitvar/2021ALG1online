package cz.tul.alg.teacher.realnumbers;

/**
 *
 * @author JV
 */
public class Rounding {

    public static void main(String[] args) {
        double number = 1234.567;
        System.out.println(Math.round(number)); //1235
        System.out.println(Math.round(number*100)/100.0); //123456.7 -> 123457 -> 1234.57
        System.out.println(Math.round(number/100.0)* 100); //12.34 -> 12 -> 1200
        
        System.out.format("%.2f%n", number); //zaokrouhluje
        int d = (int) number; //urezava
        System.out.println(d);
        
    }
    
}
