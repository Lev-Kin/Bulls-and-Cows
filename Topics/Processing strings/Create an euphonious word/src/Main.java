import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] charsWord = str.toCharArray();
        char[] vowelsLetters = {'a', 'e', 'i', 'o', 'u', 'y'};

        int vowelsCount = 0;
        int consonantsCount = 0;
        int counter = 0;

        for (int i = 0; i < charsWord.length; i++) {
            for (char vowelsLetter : vowelsLetters) {
                if (charsWord[i] == vowelsLetter) {
                    charsWord[i] = 'V';
                    break;
                }
            }
        }

        for (int i = 0; i < charsWord.length; i++) {
            if (charsWord[i] != 'V') {
                charsWord[i] = 'C';
            }
        }

        for (int i = 0; i < charsWord.length; i++) {

            if (charsWord[i] == 'V') {

                consonantsCount = 0;
                vowelsCount++;

                if (vowelsCount == 3) {
                    counter++;
                    vowelsCount = 0;
                    i--;
                }
            }

            if (charsWord[i] == 'C') {

                vowelsCount = 0;
                consonantsCount++;

                if (consonantsCount == 3) {
                    counter++;
                    consonantsCount = 0;
                    i--;
                }
            }

        }

        System.out.println(counter);
    }

}
