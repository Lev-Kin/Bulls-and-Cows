import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        int n = scanner.nextInt();

        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        Collections.sort(numbers);

        ArrayList<Integer> distance = new ArrayList<>();
        for (Integer i : numbers) {
            distance.add(Math.abs(n - i));
        }

        int minDistance = Collections.min(distance);
        for (int i = 0; i < distance.size(); i++) {
            if (distance.get(i) == minDistance) {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}