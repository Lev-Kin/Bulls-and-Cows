import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int min = 0;
        int minSeed = Math.min(a, b);
        int count = 0;
        for (int j = Math.min(a, b); j <= Math.max(a, b); j++, count++) {
            Random r = new Random(j);

            int max = r.nextInt(k);
            for (int i = 1; i < n; i++) {
                max = Math.max(max, r.nextInt(k));
            }

            if (count == 0 || min > max) {
                min = max;
                minSeed = j;
            }

        }

        System.out.println(minSeed);
        System.out.println(min);

    }
}