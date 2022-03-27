import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        final int ten = 10;
        final int hundred = 100;


        final int one = (number % ten) * hundred;
        final int two = ((number / ten) % ten) * ten;
        final int three = number / hundred;
        final int result = three + two + one;

        System.out.println(result);
    }
}