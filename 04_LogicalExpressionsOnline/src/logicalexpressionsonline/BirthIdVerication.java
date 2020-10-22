package logicalexpressionsonline;

import java.util.Scanner;

/**
 * Testing birthId: 780123/3540,  840501/1330
 * @author JV
 */
public class BirthIdVerication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej rodne cislo, nejdriv cast pred a pak za lomitkem:");
        int part1 = sc.nextInt(); //780123
        int part2 = sc.nextInt(); //3540
        
        long birthId = (long)part1 * 10000 + part2; //780123*10000 + 3540 = 7801233540
        long first9Digits = birthId/10; //780123354
        long lastDigit = birthId%10;    //0
       
        long remainder = first9Digits%11;
        
        // je-li zbytek 10, posledni cislice musi byt 0
        // nebo jinak musi byt posledni cislice rovna zbytku.
        boolean valid = (remainder == 10 && lastDigit == 0) || (remainder == lastDigit); //remainder != 10 neni potreba testovat, protoze lastDigit nemuze byt 10
        
        //pouziti ternarniho operatora
        System.out.println("Tohle cislo " + ((valid)?"je":"neni") + " platne rodne cislo.");
    }
}
