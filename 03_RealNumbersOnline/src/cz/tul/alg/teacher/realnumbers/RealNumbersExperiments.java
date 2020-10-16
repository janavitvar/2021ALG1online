package cz.tul.alg.teacher.realnumbers;

/**
 * 
 * @author JV
 */
public class RealNumbersExperiments {
    
    public static void main(String[] args){
        System.out.println("Deleni");
        int a = 5;
        int b = 2;
        
        double division1 = a/b; //celociselne deleni, prirazene do double
        System.out.println(division1); //2.0
        double division2 = (double)a/b; //realne deleni (alespon jeden operand je realny)
        System.out.println(division2); //2.5
        
        System.out.println("Konverze");
        double aa = a; //rozsirujici konverze - neni treba pretypovavat, automaticka
        System.out.println(aa); //5.0
        int c = (int)aa; //zuzujici konverze - musime explicitne pretypovat
        System.out.println(c); //5     
        
        System.out.println("Nepresnost");
        //Imprecission in floating point numbers
        //http://stackoverflow.com/questions/322749/retain-precision-with-double-in-java
        double number1 = 5.6;
        double number2 = 5.8;
        System.out.println(number1+number2); //11.399999999999999
        System.out.format("%.2f%n",number1+number2); 
        
        System.out.println("MAX a MIN double");
        System.out.println(Double.MAX_VALUE); //maximalni double
        System.out.println(Double.MIN_VALUE); //nejmensi kladny double
        System.out.println(-Double.MIN_VALUE); //nejvetsi zaporny double
        System.out.println(-Double.MAX_VALUE); //minimalni double
    }
}