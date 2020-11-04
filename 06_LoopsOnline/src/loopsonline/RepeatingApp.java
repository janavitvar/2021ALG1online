package loopsonline;

import java.util.Scanner;

/**
 *
 * @author JV
 */
public class RepeatingApp {

    public static void main(String[] args) {
        //outsite the loop, should be done only once
        Scanner sc = new Scanner(System.in);
        int number;
        boolean isEven;
        
        /*
        //Opakovani aplikace na zaklade znaku 'a' nebo 'A'
        char choice = 'a';
        while (choice == 'a'){ //choice == 'a' || choice == 'A'
            System.out.println("Zadej cislo:");
            number = sc.nextInt();
        
            isEven = (number % 2 == 0);
        
            System.out.println("Cislo " + number + " je " + (isEven?"sude":"liche") + ".");
            
            System.out.println("Pokud chces pokracovat, stlac a nebo A");
            choice = sc.next().toLowerCase().charAt(0); //choice = sc.next().charAt(0);
        }
        */
        
        ///*
        //Opakovani aplikace na zaklade znaku 'a' nebo 'A', program se provede alespon jednou 
        char choice;
        do {
            System.out.println("Zadej cislo:");
            number = sc.nextInt();
        
            isEven = (number % 2 == 0);
        
            System.out.println("Cislo " + number + " je " + ((isEven)?"sude":"liche") + ".");
            System.out.println("Pokud chces pokracovat, stlac a nebo A");
            choice = sc.next().toLowerCase().charAt(0);
        }while (choice == 'a'); //while(sc.next().charAt(0) == 'a')
        //*/
        
        /*
        //Opakovani aplikace na zaklade znaku 'a' nebo 'A' s vyuzitim promenne boolean,
        //program se provede alespon jednou 
        boolean next;
        do {
            System.out.println("Zadej cislo:");
            number = sc.nextInt();
        
            isEven = (number % 2 == 0);
        
            System.out.println("Cislo " + number + " je " + ((isEven)?"sude":"liche") + ".");
            
            System.out.println("Pokud chces pokracovat, stlac a nebo A");
            next = sc.next().toLowerCase().charAt(0) == 'a';
        }while (next);
        */
    }
}
