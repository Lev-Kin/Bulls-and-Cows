import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double x = scanner.nextDouble();

        System.out.println(x * x * x + x * x + x + 1);
    }
}