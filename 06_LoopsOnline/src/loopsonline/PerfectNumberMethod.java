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
        int number = sc.nextInt();
        boolean perfect;
       
        perfect = isPerfect(number);
        
        System.out.println("Cislo " + ((perfect)?"je":"neni") + " dokonaly.");
    }
    
    public static boolean isPerfect(int number){
        int possibleDivisor = 2;
        int sum = 1;
        while(possibleDivisor <= number/2){
            if(number % possibleDivisor == 0){
                sum = sum + possibleDivisor;
            }
            possibleDivisor++;
        }
        //boolean perfect = number == sum;
        //return perfect;
        return number == sum;
    }
}
