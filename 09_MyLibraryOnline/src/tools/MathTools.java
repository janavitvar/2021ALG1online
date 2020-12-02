package tools;

/**
 *
 * @author JV
 */
public class MathTools {

    public static void main(String[] args) {
        // testing
        System.out.println(cos(3.1, 0.00000001)); //-0.9991351529781004
        System.out.println(Math.cos(3.1));        //-0.9991351502732795
    }
    
    public static double cos(double x, double eps){
        double part = -x*x/2;
        double cos = 1;
        int i = 3;
        while(Math.abs(part) > eps){
            cos = cos + part;
            part = - part * x * x/(i * (i+1)); //+x^4/(2!*3*4), -x^6/(4!*5*6)
            i = i + 2; //5 7
        }
        return cos;
    }
}
