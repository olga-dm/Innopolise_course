
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        int number = 421;
        int hundreds = number / 100;
        int tens = (number-hundreds*100) / 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones ; 
        int mult = hundreds * tens * ones ;
        System.out.println("Количество сотен:" + hundreds);
        System.out.println("Количество десятков:" + tens);
        System.out.println("Количество единиц:" + ones);
        System.out.println("Сумма его цифр:" + sum);
        System.out.println("Произведение его цифр:" + mult);
    }
}