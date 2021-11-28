
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Введи вес: ");
        Scanner in = new Scanner(System.in);
 
        int m = Integer.parseInt(in.nextLine());
        in.close();

        if (m >= 60) {
            if (m >= 75) {
                if (m >= 91)
                    System.out.println("Супертяжелый вес");
                else
                    System.out.println("Тяжелый вес");
            } else
                System.out.println("Средний вес");
        } else
            System.out.println("Легкий вес");

    }
}