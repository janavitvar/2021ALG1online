package loopsfor;

import java.util.Scanner;

/**
 *
 * @author JV
 */
public class GuessingNumber {
    //globalni premenna
    private static Scanner sc = new Scanner(System.in);
    private static int min = 1;
    private static int max = 100;
    
    public static void main(String[] args) {
        /*
        boolean end = false; //lokalni premenna
        int choice;
        do{
            displayMenu();
            choice = readChoice();
            switch(choice){
                case 0:
                    end = true;
                    break;
                case 1:
                    computerGuesses();
                    break;
                case 2:
                    userGuesses();
                    break;
                default: System.out.println("Neplatna volba");
            }
        }while(!end); //end == false
        */
        
        //testing
        computerGuesses();
    }

    private static void displayMenu() {
        System.out.println("*************************");
        System.out.println("*     0. Konec          *");
        System.out.println("*     1. Pocitac hada   *");
        System.out.println("*     2. Uzivatel hada  *");
        System.out.println("*************************");
    }

    private static int readChoice() {
        System.out.println("Zadej volbu");
        return sc.nextInt();
    }

    private static void computerGuesses() {
        System.out.println("Uzivateli, mysli si cislo od " + min + " do " + max);
        int boundMin = min;
        int boundMax = max;
        boolean end = false;
        int answer;
        do {
            int number = (boundMin + boundMax)/2;
            System.out.println("Uzivateli, myslis si cislo " + number + "?");
            System.out.println("0. ano");
            System.out.println("1. myslene cislo je mensi");
            System.out.println("2. myslene cislo je vetsi");
            answer = sc.nextInt();
            switch(answer){
                case 0:
                    end = true;
                    System.out.println("Pocitac uhodl.");
                    break;
                case 1:
                    boundMax = number - 1;
                    break;
                case 2:
                    boundMin = number + 1;
                    break;
            }
        } while(!end); // && boundMin <= boundMax, kontrola pokud uzivatel si mysli cislo mimo rozsah
        
    }

    private static void userGuesses() {
        System.out.println("user guesses");
        //TODO
    }
}
