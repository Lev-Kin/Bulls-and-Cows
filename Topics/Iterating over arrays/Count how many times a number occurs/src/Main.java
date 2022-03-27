import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int len = scanner.nextInt();

        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int result = 0;
        final int n = scanner.nextInt();
        for (int var : array) {

            if (n == var) {
                result++;
            }

        }

        System.out.println(result);

    }
}
