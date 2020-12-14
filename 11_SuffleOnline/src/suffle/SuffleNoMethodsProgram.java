package suffle;

import java.util.Scanner;
/**
 * Program s komunikaci s uzivatelem bez metod 
 * @author JV
 */
public class SuffleNoMethodsProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej n");
        int n = sc.nextInt();
        
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        
        for(int i = array.length - 1; i > 0; i--){
            int randomIndex = (int)(Math.random()*i);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        System.out.print("Nahodna permutace ");
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
        System.out.print("]");
    }
}
