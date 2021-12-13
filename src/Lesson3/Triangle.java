public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle() {
        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0))
            return true;
        else
            return false;
    }

    public void printIsTriangle() {
        if (!isTriangle()) {
            System.out.println("Треугольника не существует");
        }
    }
    public double perimetr() {
        return a + b + c;
    }

    public double ploshad() {
        double p = perimetr() / 2;
        double S = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        return S;
    }

}
