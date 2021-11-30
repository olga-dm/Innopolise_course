import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи число a: ");
        int a = Integer.parseInt(in.nextLine());
        System.out.print("Введи число b: ");
        int b = Integer.parseInt(in.nextLine());
        in.close();
        int sum = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum = sum + i;

            }
            System.out.println("Сумма чисел от " + a + " до " + b + " равняется " + sum);
        } else
            System.out.println("a должна быть меньше b");
    }
}