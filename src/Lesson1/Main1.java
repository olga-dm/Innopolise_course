
import java.util.Scanner;
public class Main1 {

    public static void main(String[] args) {
        int days = 234;

        int weeks = days / 7 ;
        double month = days / 29.3 ; 
        int roundMonth = (int)month;

        System.out.println(weeks);
        System.out.println(roundMonth);
    }
}