import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = 0;
        int product = 0;
        for (int i = 0; i < array.length; i++) {

            if (i != array.length - 1) {

                product = array[i] * array[i + 1];

                if (product > max) {
                    max = product;
                }
            }
        }
        System.out.println(max);
    }
}