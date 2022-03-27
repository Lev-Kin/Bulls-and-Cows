import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int one = scanner.nextInt();
        final int two = scanner.nextInt();
        final int three = scanner.nextInt();

        final int spaceTable = 2;
        final int tableNeedOne = one % spaceTable + one / spaceTable;
        final int tableNeedTwo = two % spaceTable + two / spaceTable;
        final int tableNeedThree = three % spaceTable + three / spaceTable;

        final int tableNeedAll = tableNeedOne + tableNeedTwo + tableNeedThree;

        System.out.println(tableNeedAll);

    }
}