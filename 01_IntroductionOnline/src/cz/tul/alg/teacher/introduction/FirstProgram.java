package cz.tul.alg.teacher.introduction;

/**
 *
 * @author JV
 */
public class FirstProgram {

    public static void main(String[] args) {
        //Vypis na konzoli s odradkovanim
        System.out.println("Hello Alice!");
        //Vypis na konzoli bez odradkovani
        System.out.print("Hello Alice!");
        int number1; //deklarace promenne cele cislo
        number1 = 8; //inicializace, prirazeni
        System.out.println(); //novy radek
        System.out.println(number1); //vypis promenne
        number1 = number1 + 10;
        System.out.println(number1);
        int number2 = 5;
        number1 = number1 + number2;
        System.out.println(number1);
        //deklarace a inicializace promenne textovy retezec
        String name = "Bob";
        System.out.println(name);
        //spojovani retezcu - konkatenace
        System.out.println("Hello " + name + "!");
        //pretizeni (overloading) operatora + 
        //pokud je jeden z operandu textovy retezec, + se chova jako konkatenace
        //pokud jsou oba operandy cisla, + se chova jako scitani
        System.out.println("Soucet " + number1 + " + " + number2 + " = " + (number1 + number2));
    }
}
