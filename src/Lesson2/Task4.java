import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество чисел Фибоначчи: ");
        int a = Integer.parseInt(in.nextLine());
        in.close();
        int f = 0;
        long fib1 = 1;
        long fib2 = 1;

        if (a >= 3) {
            System.out.print(fib1 + " " + fib2);
            for (int i = 1; i <= a-2; i++) {
                long sum = fib1 + fib2;
                System.out.print(" " + sum);
                fib1 = fib2;
                fib2 = sum;

            }
        } else
            System.out.println("Количество чисел Фибоначчи не должно быть меньше 3");
    }
}