package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GameFourGCD {
    public static void gameFourGCD() {
        // ask name and greet
        var userName = Engine.askNameAndGreet();

        // explain the rules of game
        System.out.println("Find the greatest common divisor of given numbers.");

        // questions
        for (var i = 1; i < 4; i++) {
            var randomNumber1 = Engine.randomNumberForGames();
            var randomNumber2 = Engine.randomNumberForGames();
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);

            // find GCD - greatest common divisor
            int result = 0;
            for (int d = 1; d <= randomNumber1 && d <= randomNumber2; d++) {
                if (randomNumber1 % d == 0 && randomNumber2 % d == 0) {
                    result = d;
                }
            }

            // answers, if there are 3 correct answers, the cycle stops
            Scanner answerScanner = new Scanner((System.in));
            String answer = answerScanner.next();
            String resultToString = String.valueOf(result);

            if (resultToString.equals(answer)) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");

                // congrats and finish the game for three correct answers in a row
                if (i == 3) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else { // wrong answer
                System.out.println("Your answer: " + answer);
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'");
                System.out.println("Let's try again, " + userName);
                break;
            }
        }
    }
}
