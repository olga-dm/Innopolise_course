
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        System.out.print("Введи a: ");
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());
        System.out.print("Введи b: ");
        int b = Integer.parseInt(in.nextLine());

        in.close();
        int ma = a;
        int mb = b; 
        if (a < 0)
            ma = -a;
        if (b < 0)
            mb = -b;

        if (ma > mb)
            a = a / 2;

        System.out.println(a);
        System.out.println(b);

    }
}