package tools;

import ui.ArrayUI;

/**
 *
 * @author JV
 */
public class ArrayTools {

    public static void main(String[] args) {
        /*
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 7;
        //System.out.println(numbers); //nema smysl
        System.out.println("Hodnota na indexe 1: " + numbers[1]);
        System.out.println("Delka pole: " + numbers.length);
        System.out.println("Posledni index: " + (numbers.length - 1));
        System.out.println("Hodnota na poslednim indexe: " + numbers[numbers.length - 1]);
        */
        int[] testingArray = {1, 2, 5, 3}; //staticky inicializator
        System.out.println(sum(testingArray));
        System.out.println(isSortedAsc(testingArray));
        System.out.println(toString(testingArray));
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
    /**
     * Returns array as a String
     * @param a
     * @return 
     */
    public static String toString(int[] a) {
        String s = "[";
        for (int i = 0; i < a.length-1; i++) {
            s = s + a[i] + ", ";
        }
        s = s + a[a.length - 1]+ "]";
        return s;
    }
}
