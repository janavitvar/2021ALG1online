package ui;

import java.util.Scanner;
import tools.ArrayTools;

/**
 *
 * @author JV
 */
public class ArrayUI {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //nacitani
        int[] myNumbers = load();
        
        //vypocet
        int result = ArrayTools.sum(myNumbers);
        
        //vypis
        System.out.print("Soucet prvku v poli ");
        print(myNumbers);
        System.out.println(" je " + result + ".");
    }
    
    public static int[] load(){ 
        System.out.println("Zadej pocet cisel");
        int n = sc.nextInt();
        System.out.println("Zadej " + n + " cisel");
        int[] numbers = load(n);
        return numbers;
    }
    
    public static int[] load(int n){
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    //alternativni metoda
    public static void load(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
    
    public static void print(int[] a){
        System.out.print("[");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1]);
        System.out.print("]");
    }
}
