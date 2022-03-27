import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] strings = date.split("-");
        System.out.println(strings[1] + "/" + strings[2] + "/" + strings[0]);
    }
}