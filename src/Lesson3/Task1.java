import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.print("Введи стороны первого прямоугольника: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        Triangle tr1 = new Triangle(a, b, c);
        tr1.printIsTriangle();
        if (!tr1.isTriangle()) {
            in.close();
            return;
        }
        System.out.print("Введи стороны второго прямоугольника: ");
        double a2 = in.nextDouble();
        double b2 = in.nextDouble();
        double c2 = in.nextDouble();
        Triangle tr2 = new Triangle(a2, b2, c2);
        tr2.printIsTriangle();
        if (!tr2.isTriangle()) {
            in.close();
            return;
        }
        in.close();

        System.out.println("P1 = " + tr1.perimetr());
        System.out.println("P2 = " + tr2.perimetr());
        System.out.println("S1 = " + tr1.ploshad());
        System.out.println("S2 = " + tr2.ploshad());

        System.out.println("Сумма периметров = " + (tr1.perimetr() + tr2.perimetr()));
        System.out.println("Сумма площадей = " + (tr1.ploshad() + tr2.ploshad()));
    }
}