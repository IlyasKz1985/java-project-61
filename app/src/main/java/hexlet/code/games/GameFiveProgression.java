package hexlet.code.games;

import hexlet.code.RandomNumbersForGames;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GameFiveProgression {
    public static void gameFiveProgression() {
        Scanner nameScanner = new Scanner((System.in));
        String userName = nameScanner.next();
        System.out.println("Hello, " + userName + "!");

        // explain the rules of game
        System.out.println("What number is missing in the progression?");

        for (var i = 1; i < 4; i++) {
        // create progression
        int length = 4 + RandomNumbersForGames.randomNumberForGames(); // lengthOfProgression
        int starting = RandomNumbersForGames.randomNumberForGames(); // startingNumberOfProgression
        int diff = RandomNumbersForGames.randomNumberForGames(); // differenceNumberOfProgression

        int[] progression = new int[length];
        progression[0] = starting;

        for (int p = 1; p < length; p++) {
            progression[p] = progression[p - 1] + diff;
        }

        //hide one number of the progression
        int hiddenHumber = 0;
        Random x = new Random();
        int xNumber = x.nextInt(length);
        for (int pr = 0; pr < length; pr++) {
            if (xNumber == 0) {
                hiddenHumber = starting;
            }
            else if (pr == xNumber) {
                hiddenHumber = progression[pr];
            }
        }

        // String version of progression
        String[] prgString = new String[length];
        for (int y = 0; y < length; y++) {
            String temporary = String.valueOf(progression[y]);
            prgString[y] = temporary;
            if (prgString[y].equals(String.valueOf(hiddenHumber))) {
                prgString[y] = "..";
            }
        }

            // questions
            System.out.println("Question: " + Arrays.toString(prgString).replace(",", "").replace("[", "").replace("]", ""));

            // answers, if there are 3 correct answers, the cycle stops
            Scanner answerScanner = new Scanner((System.in));
            String answer = answerScanner.next();
            String result = String.valueOf(hiddenHumber);

            if (result.equals(answer)) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");

                // congrats and finish the game for three correct answers in a row
                if (i == 3){
                    System.out.println("Congratulations, " + userName + "!");
                }

                // wrong answer
            } else {
                System.out.println("Your answer: " + answer);
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + hiddenHumber + "'");
                System.out.println("Let's try again, " + userName);
                break;
            }
        }
    }
}
