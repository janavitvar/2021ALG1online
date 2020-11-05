package loopsonline;

import java.util.Scanner;

/**
 * 
 * @author JV
 */
public class PerfectNumberMethod {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo:");
        long number = sc.nextLong();
        boolean perfect;
       
        perfect = isPerfect(number);
        
        System.out.println("Cislo " + ((perfect)?"je":"neni") + " dokonaly.");
    }
    
    public static boolean isPerfect(long number){
        boolean perfect;
        if(number == 0 || number == 1){
            perfect = false;
        } else {
            long possibleDivisor = 2;
            long sum = 1;
            while(possibleDivisor <= number/2){
                if(number % possibleDivisor == 0){
                    sum = sum + possibleDivisor;
                }
                possibleDivisor++;
            }
            perfect = number == sum;
        }
        return perfect;
    }
    
    /* short form
    public static boolean isPerfect(long number){
        if(number == 0 || number == 1){
            return false;
        }
        long possibleDivisor = 2;
        long sum = 1;
        while(possibleDivisor <= number/2){
            if(number % possibleDivisor == 0){
                sum = sum + possibleDivisor;
            }
            possibleDivisor++;
        }
        return number == sum;
    }
    */
}
