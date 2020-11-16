package loopsfor;

import java.util.Scanner;

/**
 *
 * @author JV
 */
public class SimpleForMethod {

    public static void main(String[] args) {
        //volani metody pro testovaci ucely
        //printAhojMoreTimes(5);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej pocet");
        int count = sc.nextInt();
        
        printAhojMoreTimes(count);
    }
    
    //deklarace, implementace metody
    public static void printAhojMoreTimes(int n){
        for(int i = 1; i <= n; i++){
           System.out.println("Ahoj");
       }
    }
}
