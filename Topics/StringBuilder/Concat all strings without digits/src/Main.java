import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();

        String str = "";
        for (String string : strings) {
            str += string;
        }

        char[] ch = str.toCharArray();
        for (char c : ch) {

            if (!Character.isDigit(c)) {
                stringBuilder.append(c);
            }

        }

        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}