package sequence;

import java.util.Scanner;

/**
 * Spracovava sekvencne zadany pocet cisel
 * zadani sekvence - zadavani kladnych cisel ukoncenych 0 nebo zapornym
 * @author JV
 */
public class SequenceWhile {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) { 
        int number;
        boolean sortedAsc = true;
        int previous = 0; //Interger.MIN_VALUE, -Double.MAX_VALUE
        System.out.println("Zadej cisla, ukonci 0 nebo zapornym cislem");
        while((number = sc.nextInt()) > 0){
            //setridena
            if(number < previous){
                sortedAsc = false;
                //break;
            }
            previous = number;
            
            //aritmeticka
        }
        
        System.out.println("Posloupnost " + ((sortedAsc)?"je":"neni") + " setridena vzestupne.");
    }
    
}
