public class Task6 {
    public static void number(int a, int b, int z) {
        for (int j = 0; j < z; j++) {

            for (int i = 0; i < b; i++) {
                System.out.print(a+" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int z = 2;
        number(a, b, z);

    }
}