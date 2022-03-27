import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private final String shortCode;

    Direction(String code) {
        this.shortCode = code;
    }

    public String getShortCode() {
        return this.shortCode;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("1"+Direction.NORTH.toString());
//        System.out.println("2"+Direction.NORTH.name());
//        System.out.println("3"+Direction.valueOf("NORTH"));
//        System.out.println("4"+Direction.NORTH.getShortCode());
//        System.out.println("5"+Direction.valueOf("N"));

        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int k = scanner.nextInt();

        int[][] array = new int[n][m];

        boolean isSegmentK = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sumN = i * m;
                int sumM = j * n;
                if (sumN == k || sumM == k) {
                    isSegmentK = true;
                    break;
                }
            }
        }

        if (isSegmentK) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}