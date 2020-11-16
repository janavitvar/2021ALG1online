package loopsfor;

/**
 *
 * @author JV
 */
public class NestedForMethod {

    public static void main(String[] args) {
        //testing
        print(5, 4, "Hello", "Welcome");
    }
    
    public static void print(int n, int m, String first, String second){
        for(int i = 1; i <= n; i++){
           System.out.println(first);
           for(int j = 1; j <= m; j++){
               System.out.print(second + " ");
           }
           System.out.println("");
       }
    }
}
