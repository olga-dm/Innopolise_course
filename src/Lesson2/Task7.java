public class Task7 {
    public static void number(int a, int z) {
        for (int j = 0; j < z; j++) {

            for (int i = 0; i < j+1; i++) {
                System.out.print(a+" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int a = 3;
        int z = 6;
        number(a, z);

    }
}