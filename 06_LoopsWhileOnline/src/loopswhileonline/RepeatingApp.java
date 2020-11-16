package loopswhileonline;

import java.util.Scanner;

/**
 *
 * @author JV
 */
public class RepeatingApp {

    public static void main(String[] args) {
        //deklarace promennych mimo cyklus
        Scanner sc = new Scanner(System.in);
        int number;
        boolean isEven;
        
        /*
        //Opakovani aplikace na zaklade cisla 1
        int choice = 1;
        while(choice == 1){
            System.out.println("Zadej cislo");
            number = sc.nextInt();

            even = number % 2 == 0;

            System.out.println("Cislo " +  number + ((even)? " je ": " neni ") + "sude.");
            System.out.println("Kdyz chce pokracovat, stiskni 1");
            choice = sc.nextInt();
        }
        */
        
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
        do {
            System.out.println("Zadej cislo:");
            number = sc.nextInt();
        
            isEven = (number % 2 == 0);
        
            System.out.println("Cislo " + number + " je " + ((isEven)?"sude":"liche") + ".");
            System.out.println("Pokud chces pokracovat, stlac a nebo A");
        } while ((sc.next().toLowerCase().charAt(0)) == 'a'); //nacteni a zaroven porovnani
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
