package loopsfor;

/**
 *
 * @author JV
 */
public class AsteriskDrawingLibrary {

    public static void main(String[] args) {
        // testing
        drawLine(10);
        System.out.println("");
        drawRectangle(5, 6);
        System.out.println("");
        drawRightTriangle(5);
    }
    
    public static void drawLine(int n){
        for (int i = 1; i <= n ; i++) { //i = 0; i < n
            System.out.print("* ");
        }
        System.out.println("");
    }
    
    public static void drawRectangle(int n, int m){
        for (int i = 1; i <= n; i++) { //i radek
            /*
            for (int j = 1; j <= m ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            */
            drawLine(m);
        }
    }
    
    public static void drawRightTriangle(int n){
        for (int i = 1; i <= n; i++) { //i radek
            drawLine(i);
        }
    }
}
