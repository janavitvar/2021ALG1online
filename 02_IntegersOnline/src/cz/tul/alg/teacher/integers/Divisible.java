package cz.tul.alg.teacher.integers;

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
        
        System.out.println(divisible);
        //pouziti ternarniho operatora ve vypisu
        System.out.println(a + ((divisible)? " je ":" neni ") + "delitelne " + b);
    }
    
}
