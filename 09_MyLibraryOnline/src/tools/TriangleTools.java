package tools;

/**
 * Library of methods dealing with triangles
 * @author JV
 */
public class TriangleTools {

    public static void main(String[] args) {
        //testing
        System.out.println(calculateArea(3, 4, 5));       
    }
    
    /**
     * Calculates area of a triangle
     * @param a side of a triangle
     * @param b side of a triangle
     * @param c side of a triangle
     * @return area of a triangle
     */
    public static double calculateArea(double a, double b, double c){
        double s = (a + b + c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
