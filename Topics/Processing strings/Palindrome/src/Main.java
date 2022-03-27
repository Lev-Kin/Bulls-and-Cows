import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        if (str.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(str.replaceAll("\\W", ""))
                        .reverse().toString())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}