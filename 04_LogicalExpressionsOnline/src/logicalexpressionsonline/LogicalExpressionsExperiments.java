package logicalexpressionsonline;

/**
 *
 * @author JV
 */
public class LogicalExpressionsExperiments {

    public static void main(String[] args) {
        System.out.println("&& vs. &");
        int a = 0;
        int b = 5;
        int c = 2;
        //if (c == b/a){            //will throw exception
        if ((a != 0)&&(c == b/a)){  
            System.out.println("Je to podil");
        } else{
            System.out.println("Neni to podil");
        }
    }
    
}
