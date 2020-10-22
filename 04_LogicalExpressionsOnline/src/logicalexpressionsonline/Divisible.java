package logicalexpressionsonline;

import java.util.Scanner;

/**
 *
 * @author JV
 */
public class Divisible {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej dve cisla");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        //VYPOCET alternativy
        boolean divisible = a % b == 0;
        
        //alternativa, redundantni
        if(a % b == 0){
            divisible = true;
        }else{
            divisible = false;
        }
        
        //alternativa, redundantni
        //pouziti ternarniho operatora
        divisible = (a % b == 0)? true: false;
        
        //VYPIS alternativy
        //1. possibility
        System.out.format("Je %d delitelne %d: %s%n", a, b, divisible);
        
        //2. possibility
        if (divisible){
            System.out.println(a + " je delitelne " + b);
        } else {
           System.out.println(a + " neni delitelne " + b); 
        }
        
        //3. possibility - pouziti ternarniho operatora ve vypisu
        System.out.println(a + ((divisible)? " je ":" neni ") + "delitelne " + b);
    }
}
