import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int div = 4;
        int max = 0;
        int n = scanner.nextInt();
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            if (n % div == 0 && n > max) {
                max = n;
            }
        }
        System.out.println(max);
    }

}