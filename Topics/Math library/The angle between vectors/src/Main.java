import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextInt();
        double x2 = scanner.nextInt();
        double y1 = scanner.nextInt();
        double y2 = scanner.nextInt();

        double angle = Math.atan2(x2, x1) - Math.atan2(y2, y1);

        System.out.println(Math.toDegrees(Math.abs(angle)));
    }
}