package tools;

import ui.ArrayUI;

/**
 *
 * @author JV
 */
public class ArrayTools {

    public static void main(String[] args) {
        /*
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 7;
        //System.out.println(numbers); //nema smysl
        System.out.println("Hodnota na indexe 1: " + numbers[1]);
        System.out.println("Delka pole: " + numbers.length);
        System.out.println("Posledni index: " + (numbers.length - 1));
        System.out.println("Hodnota na poslednim indexe: " + numbers[numbers.length - 1]);
        */
        //testing
        int[] testingArray = {1, 2, 5, 3, 5, 5}; //staticky inicializator
        ArrayUI.print(testingArray);
        System.out.println("");
        System.out.println("Suma: " + sum(testingArray));
        System.out.println("Setridenost: " + isSortedAsc(testingArray));
        System.out.println("Textovy retezec: " + toString(testingArray));
        //reverse(testingArray);
        //System.out.print("Pretocene pole: ");
        //ArrayUI.print(testingArray);
        //System.out.println("");
        int[] b = reverse1(testingArray);
        System.out.print("Puvodni pole: ");
        ArrayUI.print(testingArray);
        System.out.println("");
        System.out.print("Pretocene pole: ");
        ArrayUI.print(b);
        System.out.println("");
        int[] oI = occurenceIndexes(testingArray, 5);
        System.out.println("Index prvniho vyskytu: " + oI[0]);
        System.out.println("Index posledniho vyskytu: " + oI[1]);
    }
    
    public static int sum(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
    
    public static int sumWithForEach(int[] a){
        int sum = 0;
        for (int number: a) {
            sum = sum + number;
        }
        return sum;
    }
    
    public static boolean isSortedAsc(int[] a){
        for (int i = 1; i < a.length; i++) {
            if(a[i] < a[i-1]){
                return false;
            }
        }
        return true;
    }
    /**
     * Returns array as a String
     * @param a
     * @return 
     */
    public static String toString(int[] a) {
        String s = "[";
        for (int i = 0; i < a.length-1; i++) {
            s = s + a[i] + ", ";
        }
        s = s + a[a.length - 1]+ "]";
        return s;
    }
    
    //protoci primo pole a
    public static void reverse(int[] a){
        for(int i = 0; i < a.length/2; i++){
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;       
        }
    }
    
    //pole a zustane stejne, pole b bude obsahovat pretocene hodnoty
    public static int[] reverse1(int[] a){ 
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[a.length - 1- i];
        }
        return b;
    }
    
    //pokud chci vratit vic hodnot, mohu vratit pole, zde ale doporucuju radsi vracet 2 hodnoty ve 2 metodach
    /**
     * Returns the indexes within this array of the first and last occurrence of the specified number.
     * @param a array
     * @param number the number to search for
     * @return array where the first occurence index is at index 0 and last occurence index is at index 1
     */
    public static int[] occurenceIndexes(int[] a, int number){
        int[] occurenceIndexes = new int[2];
        fill(occurenceIndexes, -1); //pokud cislo nenajdu, vratim index -1, inicializace hodnot v poli na -1
        for (int i = 0; i < a.length; i++) {
            if(a[i] == number){ //narazili jsme na vyskyt
                if(occurenceIndexes[0] == -1){ //narazili jsme na prvni vyskyt
                    occurenceIndexes[0] = i;
                }else{ //narazili jsme na dalsi vyskyt
                   occurenceIndexes[1] = i; 
                }
            }
        }
        return occurenceIndexes;
    }
    
    public static void fill(int[] a, int number){
        for (int i = 0; i < a.length; i++) {
            a[i] = number;
        }
    }

}
