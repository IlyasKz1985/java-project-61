package hexlet.code.games;

import hexlet.code.RandomNumbersForGames;

import java.util.Random;
import java.util.Scanner;

public class GameFourGCD {
    public static void gameFourGCD() {
        Scanner nameScanner = new Scanner((System.in));
        String userName = nameScanner.next();
        System.out.println("Hello, " + userName + "!");

        // explain the rules of game
        System.out.println("Find the greatest common divisor of given numbers.");

        // cycle for questions
        // if there are 3 correct answers, the cycle stops
        for (var i = 1; i < 4; i++) {
            var randomNumber1 = RandomNumbersForGames.randomNumberForGames();
            var randomNumber2 = RandomNumbersForGames.randomNumberForGames();
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);

            Scanner answerScanner = new Scanner((System.in));
            String answer = answerScanner.next();

            // find GCD - greatest common divisor
            int result = 0;
            for (int d = 1; d <= randomNumber1 && d <= randomNumber2; d++) {
                if (randomNumber1 % d == 0 && randomNumber2 % d ==0) {
                    result = d;
                }
            }

            String resultToString = String.valueOf(result);

            if (resultToString.equals(answer)) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");

                // congrats and finish the game for three correct answers in a row
                if (i == 3){
                    System.out.println("Congratulations, " + userName + "!");
                }

                // wrong answer
            } else {
                System.out.println("Your answer: " + answer);
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'");
                System.out.println("Let's try again, " + userName);
                break;
            }
        }
    }
}