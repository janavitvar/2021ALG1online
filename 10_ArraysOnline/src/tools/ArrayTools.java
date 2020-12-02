package tools;

import ui.ArrayUI;

/**
 *
 * @author JV
 */
public class ArrayTools {

    public static void main(String[] args) {
        int[] testingArray = {1, 2, 5, 3}; //staticky inicializator
        ArrayUI.print(testingArray);
        System.out.println("");
        System.out.println(sum(testingArray));
        System.out.println(isSortedAsc(testingArray));
    }
    
    public static int sum(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
    
    public static boolean isSortedAsc(int[] a){
        for (int i = 1; i < a.length; i++) {
            if(a[i] < a[i-1]){
                return false;
            }
        }
        return true;
    }
}
