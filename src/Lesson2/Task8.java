public class Task8 {

    public static void main(String[] args) {

        for (int j = 1; j < 10; j++) {

            for (int i = 1; i < 10; i++) {
                int a = i + j;
                System.out.print(j + "+" + i + "=");
                if (a > 9) {
                    System.out.print( a + " ");
                } else {
                    System.out.print(a + "  ");
                }
            }
            System.out.println();

        }
    }
}