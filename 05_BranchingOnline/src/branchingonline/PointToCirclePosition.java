package branchingonline;

import java.util.Scanner;

/**
 * Napište program, který načte souřadnice bodu a parametry kružnice (souřadnice středu a poloměr) a určí
 * vzájemnou pozici bodu a kružnice. 
 * @author JV
 */
public class PointToCirclePosition {

    public static void main(String[] args) {
        final int OUTSIDE = -1;
        final int ON = 0;
        final int INSIDE = 1;
        final float PRECISION = 1e-3f; //0.001
        Scanner sc = new Scanner(System.in);
        float sX, sY; //souradnice stredu kruznice
        float r;
        float pX, pY; //souradnice bodu
        
        System.out.println("Zadej souradnice stredu kruznice a jeji polomer");
        sX = sc.nextFloat();
        sY = sc.nextFloat();
        r = sc.nextFloat();
        System.out.println("Zadej souradnice bodu");
        pX = sc.nextFloat();
        pY = sc.nextFloat();
        
        int position;
        //vzdalenost bodu od stredu kruznice
        float distance = (float)Math.sqrt(Math.pow(sX - pX, 2) + Math.pow(sY - pY, 2));
        //System.out.println(distance); //kontrolni vypis pri testovani
        
        if(Math.abs(distance - r) < PRECISION){ //distance == r
            position = ON;
        }else{
            if(distance > r){
                position = OUTSIDE;
            } else {
                position = INSIDE;
            }
        }
        //System.out.println(position); //kontrolni vypis pri testovani
        
        /*
        //skraceny zapis
        if (Math.abs(distance - r) < PRECISION) { 
            position = ON;
        } else if (distance > r) {
                position = OUTSIDE;
        } else {
                position = INSIDE;
        }
        */
        
        switch (position){
            case ON:
                System.out.println("Bod lezi na kruznici.");
                break;
            case OUTSIDE:
                System.out.println("Bod lezi mimo kruznice.");
                break;
            case INSIDE:
                System.out.println("Bod lezi uvnitr kruznice");
                break;
            default:
                System.out.println("Sem by jsem se nikdy nemel dostat.");
        }
    }
}
