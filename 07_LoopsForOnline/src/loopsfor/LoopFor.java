package loopsfor;

/**
 *
 * @author JV
 */
public class LoopFor {

    public static void main(String[] args) {
        /*
        //simple for
        for(int i = 1; i <= 5; i++){
           //System.out.println("Ahoj");
           System.out.println(i);
        }
        */
        //nested for
        for(int i = 1; i <= 5; i++){
           System.out.println("Ahoj");
           for(int j = 1; j <= 4; j++){
               System.out.print("Cau ");
           }
           System.out.println("");
       }
    }
}
