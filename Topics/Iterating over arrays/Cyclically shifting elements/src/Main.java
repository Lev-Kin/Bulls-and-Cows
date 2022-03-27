import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();

        int[] arrayStart = new int[n];
        int[] arrayFinish = new int[n];

        for (int i = 0; i < arrayStart.length; i++) {
            arrayStart[i] = scanner.nextInt();
        }

        System.arraycopy(arrayStart, 0, arrayFinish, 1, arrayFinish.length - 1);

        arrayFinish[0] = arrayStart[arrayStart.length - 1];
        for (int var : arrayFinish) {
            System.out.print(var + " ");
        }
    }
}