/*
 * Viceradkovy komentar
 *
 */
package cz.tul.alg.teacher.integers;

import java.util.Scanner;

/**
 * Javadoc komentar
 * @author JV
 */
public class InputProcessingOutput {

    public static void main(String[] args) {
        //jednoradkovy komentar
        final int TENTO_ROK = 2020; //konstanta, nelze ji v kode prepisovat
        
        //nacitani vstupu
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej rok narozeni a jmeno:");
        int rokNarozeni = sc.nextInt();
        String jmeno = sc.next();
        
        //zpracovani (vypocty)
        int vek = TENTO_ROK - rokNarozeni;
        
        //vypis vystupu
        System.out.println(jmeno + " ma " + vek + " let.");
        System.out.format("%s ma %3d let.%n", jmeno, vek); //formatovany vypis
    }
}
