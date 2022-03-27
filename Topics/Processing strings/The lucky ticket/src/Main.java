import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        char[] ch = str.toCharArray();

        int sumLeft = 0;
        int sumRight = 0;

        int middle = ch.length / 2;
        for (int i = 0; i < ch.length; i++) {
            if (i < middle) {
                sumLeft += Character.getNumericValue(ch[i]);
            } else {
                sumRight += Character.getNumericValue(ch[i]);
            }
        }

        if (sumLeft == sumRight) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}