import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.print("Введи число: ");
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());

        in.close();

        for (int i = 1; i <= 10; i++) {
            if (i < 10)
                System.out.println(a + " x " + i + "  = " + a * i);
            else
                System.out.println(a + " x " + i + " = " + a * i);
        }

    }
}