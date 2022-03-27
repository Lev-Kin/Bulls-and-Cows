import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {

            String s = String.valueOf(str.charAt(i));

            System.out.print(s + s);
        }
    }
}