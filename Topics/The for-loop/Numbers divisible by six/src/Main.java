import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int numbers = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            numbers = scanner.nextInt();
            if (numbers % 6 == 0) {
                sum = sum + numbers;
            }
        }
        System.out.println(sum);
    }
}