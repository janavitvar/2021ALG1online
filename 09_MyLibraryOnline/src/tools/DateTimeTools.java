package tools;

/**
 *
 * @author JV
 */
public class DateTimeTools {

    public static void main(String[] args) {
        //testing
        System.out.println(timeToSeconds(1, 1, 1)); //3661
    }
    
    public static long timeToSeconds(int hours, int minutes, int seconds){
        return hours * 3600 + minutes * 60 + seconds;
    }
}
