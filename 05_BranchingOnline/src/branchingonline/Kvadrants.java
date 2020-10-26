package branchingonline;

import java.util.Scanner;

/**
 *
 * @author JV
 */
public class Kvadrants {

    public static void main(String[] args) {

        int x, y;
        int kvadrant = 0;
        boolean onAxis = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej souradnice bodu: ");

        x = sc.nextInt();
        y = sc.nextInt();

        if (x == 0 || y == 0) {
            onAxis = true;
        } else { //bod nelezi na osi ani ve stredu
            if (y > 0) {
                if (x > 0) {
                    kvadrant = 1;
                } else {
                    kvadrant = 2;
                }
            } else {
                if (x < 0) {
                    kvadrant = 3;
                } else {
                    kvadrant = 4;
                }
            }
        }
        if(onAxis){
            System.out.println("Bod lezi na osi.");
        } else {
            System.out.println("Zadany bod se nachazi v " + kvadrant + ". kvadrantu.");
        } 
    }
}
