import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().toLowerCase();

        char[] gc = str.toCharArray();

        int count = 0;
        for (char ch : gc) {
            if (ch == 'g' || ch == 'c') {
                count++;
            }
        }

        double result = (double) count / gc.length * 100;

        System.out.println(result);
    }
}