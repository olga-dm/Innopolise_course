
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        int number = 42;

        int tens = number / 10;

        int ones = number - tens * 10;
        int sum = tens + ones ; 
        int mult = tens * ones ;

        System.out.println("Количество десятков:" + tens);
        System.out.println("Количество единиц:" + ones);
        System.out.println("Сумма его цифр:" + sum);
        System.out.println("Произведение его цифр:" + mult);
    }
}