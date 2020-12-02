package sequence;

import java.util.Scanner;
//import static tools.NumberTools.isPrime;
import tools.NumberTools; //lepsi, v kodu je videt, ze ktere tridy je dana metoda


/**
 * Spracovava sekvencne zadany pocet cisel
 * zadani sekvence - zadany pocet, pak zadany dany pocet cisel
 * @author JV
 */
public class SequenceFor {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej pocet");
        int n = sc.nextInt();
        System.out.println("Zadej " + n + " cisel"); //vsechny cela cisla
        int number;
        int sum = 0;
        int max = Integer.MIN_VALUE; //0, -1, -Double.MAX_VALUE
        int nMax = 0;
        int positionMax = 1;
        int nEven = 0;
        int nPrime = 0;
        for (int i = 1; i <= n; i++) {
            number = sc.nextInt();
            //sum
            sum = sum + number;
            
            //max
            if(number > max){
                max = number;
                nMax = 1;
                positionMax = i; //prvy vyskyt
            } else if(number == max){
                nMax++;
            }
            
            //3 min
            
            //pocet sudych
            if(number % 2 == 0){
                nEven++;
            }
            
            //pocet prvocisel
            if(NumberTools.isPrime(number)){ //vola metodu z jineho projektu
                nPrime++;
            }
        }
        
        double average = (double)sum / n;
        
        System.out.format("Prumer je %.2f%n", average);
        System.out.println("Max hodnota je " + max);
        System.out.println("Pocet maxim je " + nMax);
        System.out.println("Prvni vyskyt maxima je " + positionMax);
        System.out.println("Pocet sudych clenu je " + nEven);
        System.out.println("Pocet prvocisel je " + nPrime);
    }
}
