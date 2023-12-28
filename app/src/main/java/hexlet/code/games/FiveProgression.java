package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class FiveProgression {
    public static void fiveProgression() {
        // ask name and greet
        var userName = Engine.askNameAndGreet();

        // explain the rules of game
        System.out.println("What number is missing in the progression?");

        int minimalLenghOfProgression = 4;

        for (var i = 1; i < minimalLenghOfProgression; i++) {
        // create progression
            int length = minimalLenghOfProgression + Engine.randomNumberForGames(); // lengthOfProgression
            int startingNumber = Engine.randomNumberForGames(); // startingNumberOfProgression
            int diff = Engine.randomNumberForGames(); // differenceNumberOfProgression

            int[] progression = new int[length];
            progression[0] = startingNumber;

            for (int p = 1; p < length; p++) {
                progression[p] = progression[p - 1] + diff;
            }

            //hide one number of the progression
            int hiddenHumber = 0;
            Random x = new Random();
            int xNumber = x.nextInt(length);
            for (int y = 0; y < length; y++) {
                if (xNumber == 0) {
                    hiddenHumber = startingNumber;
                } else if (y == xNumber) {
                    hiddenHumber = progression[y];
                }
            }

        // String version of progression
            String[] progressionToString = new String[length];
            for (int z = 0; z < length; z++) {
                String temporary = String.valueOf(progression[z]);
                progressionToString[z] = temporary;

                // substitute the hidden number to ".." //
                if (progressionToString[z].equals(String.valueOf(hiddenHumber))) {
                    progressionToString[z] = "..";
                }
            }

            // questions
            System.out.println("Question: " + Arrays.toString(progressionToString).replace(",", "").replace("[", "").replace("]", ""));

            // answers, if there are 3 correct answers, the cycle stops
            Scanner answerScanner = new Scanner((System.in));
            String answer = answerScanner.next();
            String result = String.valueOf(hiddenHumber);

            if (result.equals(answer)) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");

                // congrats and finish the game for three correct answers in a row
                var numberOfCorrectAnswers = 3;
                if (i == numberOfCorrectAnswers) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else { // wrong answer
                System.out.println("Your answer: " + answer);
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + hiddenHumber + "'");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
    }
}
