package suffle;

import java.util.Arrays;
/**
 * Strukturovani ulohy do metod a testovani metod
 * @author JV
 */
public class SuffleMethod {

    public static void main(String[] args) {
        //test metody generate
        //int[] b = generate(10);
        //System.out.println(Arrays.toString(b));
        
        //test metody suffle
        //int[] c = {2, 5, 6, 8};
        //suffle(c);
        //System.out.println(Arrays.toString(c));
        
        //test metody suffle1N
        int[] myArray = suffle1N(10);
        System.out.println(Arrays.toString(myArray));
    }
    
    /**
     * Vygeneruje a zamicha pole o zadane velikosti
     */
    public static int[] suffle1N(int n){
        int[] array = generate(n);
        suffle(array);
        return array;
    }
    
    /**
     * Vygeneruje pole o zadane velikosti n a naplni ho hodnotami 1 az n
     */
    public static int[] generate(int n){
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }
        return a;
    }
    /**
     * Zamicha zadane pole (udela nahodnou permutaci) pomoci Fisher-Yates algoritmu 
     */
    public static void suffle(int[] a){
        for(int i = a.length - 1; i > 0; i--){
            int randomIndex = (int)(Math.random()*i); //random Index se nebude rovnat i
            int temp = a[i];
            a[i] = a[randomIndex];
            a[randomIndex] = temp;
        }
    }
}
