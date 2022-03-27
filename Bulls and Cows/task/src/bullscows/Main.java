package bullscows;

import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.exit;

public class Main {

    static int turnCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretLine = 0;
        try {
            System.out.println("Input the length of the secret code:");
            secretLine = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int possibleLine = 0;
        try {
            System.out.println("Input the number of possible symbols in the code:");
            possibleLine = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String ls = "";
        boolean bool = false;
        if (secretLine <= 36 && possibleLine <= 36) {

            if (secretLine > possibleLine) {
                System.out.printf("Error: it's not possible to generate a code with a length of %d with %d unique symbols.", secretLine, possibleLine);
                exit(0);
            } else if (secretLine == 0) {
                System.out.printf("Error: it's not possible to generate a code with a length of %d with %d unique symbols.", secretLine, possibleLine);
                exit(0);
            }

            while (!bool) {
                String s = generatePseudoRandomSecret(possibleLine);
                ls = randomNumberLength(s, secretLine);
                bool = checkUniqueness(ls);
            }

        } else {

            System.out.printf("Error: can't generate a secret number with a length of %d " +
                    "because there aren't enough unique digits.", secretLine);
            exit(0);
        }

        String str = "0123456789abcdefghijklmnopqrstuvwxyz";
        if (possibleLine <= 10) {

            System.out.print("The secret is prepared: ");
            for (int i = 0; i < possibleLine; i++) {
                System.out.print("*");
            }
            System.out.printf(" (0-%d).\n", possibleLine - 1);

        } else {

            System.out.print("The secret is prepared: ");
            for (int i = 0; i < possibleLine; i++) {
                System.out.print("*");
            }
            System.out.printf(" (0-9, a-%s)\n", str.charAt(possibleLine - 1));
        }

        boolean isGame = true;
        System.out.println("Okay, let's start a game!");
        while (isGame) {

            turnCount++;
            System.out.printf("Turn %d:\n", turnCount);
            String guess = scanner.next();

            if (guess.equals(ls)) {
                isGame = false;
                System.out.println(grader(ls, guess));
                System.out.println("Congratulations! You guessed the secret code.");
            } else {
                System.out.println(grader(ls, guess));
            }
        }
    }

    private static String grader(String base, String guess) {

        List<String> secret = Arrays.stream(base.split("")).collect(Collectors.toList());
        List<String> input = Arrays.stream(guess.split("")).collect(Collectors.toList());

        int cows = 0;
        int bulls = 0;

        for (int i = 0; i < input.size(); i++) {
            if (Objects.equals(secret.get(i), input.get(i))) {
                bulls++;
            }
            if (secret.contains(input.get(i))) {
                cows++;
            }
        }

        if (cows != 0 && bulls != 0) {
            cows -= bulls;
        }

        String grade = "Grade: ";
        if (cows == 0 && bulls == 0) {
            return "None.\n";
        } else if (cows != 0 && bulls != 0) {
            grade += bulls + " bull(s) and " + cows + " cow(s)";
        } else if (cows == 0) {
            grade += bulls + " bull(s)";
        } else {
            grade += cows + " cow(s)";
        }

        return grade;
    }

    public static String generatePseudoRandomSecret(int possibleLine) {

        String str = "0123456789abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        if (possibleLine < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder(possibleLine);
        for (int i = 0; i < possibleLine; i++) {

            int rndCharAt = random.nextInt(possibleLine);
            char rndChar = str.charAt(rndCharAt);

            sb.append(rndChar);

        }

        return sb.toString();
    }


    public static String randomNumberLength(String pseudo, int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(pseudo);
        sb.reverse();

        sb = new StringBuilder(sb.substring(0, num));
        sb.setCharAt(0, '0');
//        if (sb.charAt(0) == '0') {
//            sb.setCharAt(0, '1');
//        }

        return sb.toString();
    }

    public static boolean checkUniqueness(String str) {
        boolean bool = true;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    bool = false;
                    break;
                }
            }
        }
        return bool;
    }
}