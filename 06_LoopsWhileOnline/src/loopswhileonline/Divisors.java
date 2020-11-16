package loopswhileonline;

import java.util.Scanner;

/**
 *
 * @author JV
 */
public class Divisors {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo:");
        int number = sc.nextInt();
        
        int possibleDivisor = 2; 
        int count = 0;
        
        System.out.print("Delitele: ");
        while(possibleDivisor <= number/2){ //possibleDivisor going from 2 till number/2
            //System.out.println(possibleDivisor); // testing print all possible divisors
            if(number % possibleDivisor == 0){
                System.out.print(possibleDivisor + " ");
                count++;
            }
            possibleDivisor++; //possibleDivisor = possibleDivisor + 1;
        }
        System.out.println(); //prazdny radek
        System.out.println("Pocet delitelu je " + count + ".");
    }
}
