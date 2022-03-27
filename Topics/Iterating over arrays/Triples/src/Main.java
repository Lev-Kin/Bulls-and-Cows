import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] - array[i - 1] == 1 && array[i + 1] - array[i] == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}