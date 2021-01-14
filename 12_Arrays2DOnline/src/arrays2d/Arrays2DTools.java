package arrays2d;

/**
 *
 * @author JV
 */
public class Arrays2DTools {

    public static void main(String[] args) {
        System.out.println("Print ********************");
        double[][] testingArray2D = { {1, 2, 3},
                                      {4, 5, 6},
                                      {4, 7, 6},
                                      {0, 8, 9}};
        print(testingArray2D);
        System.out.println("Sum **********************");
        double[][] testingArray2D2 = { {0, 2, 3},
                                       {4, 1, 6},
                                       {4, 7, 6},
                                       {0, 8, 9}};
        double[][] sum = sum(testingArray2D, testingArray2D2);
        print(sum);
        System.out.println("Norm *********************");
        double[][] testingArray2D3 = { {0,  2,  3},
                                       {4, -1,  6},
                                       {4,  7,  6},
                                       {0,  8, -9}};
        System.out.println(findMaxAbs(testingArray2D3));
        norm(testingArray2D3);
        System.out.println("");
        print(testingArray2D3);
        System.out.println("Symetrie *********************");
        int[][] a = { {6, 2, 3, 1},
                      {2, 6, 2, 3},
                      {2, 1, 6, 2},
                      {1, 2, 2, 6}};
        //System.out.println(isSymetricByMainDiagonal(a));
        //System.out.println(isSymetricByHorizontal(a));
        //System.out.println(areDiagonalsConstant(a));
    }
    
    public static double[][] sum(double[][] a, double[][] b){
        double[][] sum = new double[a.length][a[0].length];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
    
    public static void print(double[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.format("%8.2f ", a[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void norm(double[][] a){
        double maxAbs = findMaxAbs(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j] / maxAbs;
            }
        }
    }
    
    public static double findMaxAbs(double[][] a){
        double maxAbs = -Double.MAX_VALUE; //0 
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(Math.abs(a[i][j]) > maxAbs){
                    maxAbs = Math.abs(a[i][j]);
                }
            }
        }
        return maxAbs;
    }
    
    public static boolean isSymetricByMainDiagonal(int[][] a){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j < a[i].length; j++) {
                if(a[i][j] != a[j][i]){
                    return false;
                } 
            }
        }
        return true;
    }
    
    public static boolean isSymetricByHorizontal(int[][] a){
        for (int i = 0; i < a.length/2; i++) {
            for (int j = 0; j < a[i].length; j++){
                if(a[i][j] != a[a.length-1-i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean areDiagonalsConstant(int[][] a){
        for (int i = 0; i < a.length-1; i++) {
             if (a[i][i] != a[i+1][i+1]){
                 return false;
             }
             if (a[i][a[i].length-1-i] != a[i+1][a[i].length-1-i-1]){
                 return false;
             }
        }
        return true;
    }
}
