package tools;

//import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Library of methods dealing with numbers
 * @author JV
 */
public class NumberTools {

    public static void main(String[] args) {
        //testing
        System.out.println(isPrime(22));
        System.out.println(isEven(15));
        System.out.println(generateRandom(10, 20));
    }
    
    /**
     * Check if the number is prime
     * @param number to be checked
     * @return true if the number is prime, otherwise false
     */
    public static boolean isPrime(int number){
        int upperBound = (int) Math.round(Math.sqrt(number)); //we only need to check possible divisors
        //up this number 
        
        boolean prime = true;
        if (number <= 1) {
            prime = false;
        } else {
            int possibleDivisor = 2;
            
            while (prime && possibleDivisor <= upperBound) {// prime <=> prime == true; !prime <=> prime != true <=> prime == false
                if (number % possibleDivisor == 0) {
                    prime = false;
                    //break; //rather use prime in the while condition or direct return
                }
                possibleDivisor++;
            }
        }
        return prime;
    }
    
    public static boolean isEven(int number){
        //boolean even = number%2 == 0;
        //return even;
        return number%2 == 0;
    }
    /**
     * Returns a random int value between min (inclusive) and max (inclusive).
     * @param min - the lower bound
     * @param max - the upper bound
     * @return a random int value between min (inclusive) and max (inclusive).
     */
    public static int generateRandom(int min, int max){
        //1. varianta
        //return (int)(Math.random() * (max - min + 1)) + min;
        //2. varianta
        //Random rd = new Random();
        //return rd.nextInt(max-min+1) + min;
        //3. varianta
        ThreadLocalRandom tlrd = ThreadLocalRandom.current();
        return tlrd.nextInt(min, max+1);
    }
}
