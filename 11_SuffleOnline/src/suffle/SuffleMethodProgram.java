package suffle;

import java.util.Scanner;
/**
 * Strukturovani ulohy do metod a jejich vyuziti v programu s komunikaci s uzivatelem  
 * @author JV
 */
public class SuffleMethodProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej n");
        int n = sc.nextInt();
        int[] myArray = suffle1N(n);
        System.out.print("Nahodna permutace ");
        print(myArray); 
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
    
    public static void print(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
        System.out.print("]");
    }
    
}
