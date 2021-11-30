import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Введи число повторений: ");
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());

        in.close();

        for (int i = 1; i <= a; i++) {
            System.out.print("20 ");
        }

    }
}