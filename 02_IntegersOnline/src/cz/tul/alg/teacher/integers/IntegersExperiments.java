package cz.tul.alg.teacher.integers;

/**
 *
 * @author JV
 */
public class IntegersExperiments {

    public static void main(String[] args) {
        System.out.println("Experiments with Integer limits");
        int intMax = Integer.MAX_VALUE; 
        System.out.println(intMax); //2147483647
        int intMin = Integer.MIN_VALUE; 
        System.out.println(intMin); //-2147483648
        System.out.println(intMax + 1); //preteceni
        long c = intMax; //ulozeni int (32bit) do long (64bit)
        System.out.println(c + 1);
        
        System.out.println("\nInteger division / and modulo %");
        int num1 = 11; 
        int num2 = 4;
        
        System.out.println(num1/num2);//celociselne deleni
        System.out.println(num1%num2);//zbytek po deleni
        //System.out.println(num1/0); //celociselne deleni vyhodi chybu ArithmeticException
        
        System.out.println("\nDivision to get first digits and modulo to get last digits");
        int num3 = 6547829;
        System.out.println(num3/1000); //6547
        System.out.println(num3%1000); //829
    }
}
