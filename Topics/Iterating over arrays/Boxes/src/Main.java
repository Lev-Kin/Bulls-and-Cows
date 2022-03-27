import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int len = 3;

        int[] box1 = new int[len];
        int[] box2 = new int[len];

        for (int i = 0; i < box1.length; i++) {
            box1[i] = scanner.nextInt();
        }

        for (int i = 0; i < box2.length; i++) {
            box2[i] = scanner.nextInt();
        }

        Arrays.sort(box1);
        Arrays.sort(box2);

        int box1K = 0;
        int box2K = 0;
        boolean sideB1equalB2 = false;
        for (int i = 0; i < len; i++) {

            if (box1[i] > box2[i]) {
                box1K++;
            }

            if (box2[i] > box1[i]) {
                box2K++;
            }

            if (box1[i] == box2[i]) {
                sideB1equalB2 = true;
            }
        }

        if (box1K < box2K && !sideB1equalB2) {
            System.out.println("Box 1 < Box 2");
        }

        if (box1K > box2K && !sideB1equalB2) {
            System.out.println("Box 1 > Box 2");
        }

        if (sideB1equalB2) {
            System.out.println("Incompatible");
        }

    }
}