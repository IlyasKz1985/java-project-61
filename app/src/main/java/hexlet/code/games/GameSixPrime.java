package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GameSixPrime {
    public static void gameSixPrime() {
        // ask name and greet
        var userName = Engine.askNameAndGreet();

        // explain the rules of game
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        // questions
        for (var i = 1; i < 4; i++) {
            var randomNumber = Engine.randomNumberForGames();
            System.out.println("Question: " + randomNumber);

            //check whether the number is prime or not
            String primeNumber;
            int count = 0;
            for (int z = 1; z <= randomNumber / 2; z++) {
                if (randomNumber % z == 0) {
                    count++;
                }
            }
            if (count > 1) {
                primeNumber = "no";
            } else {
                primeNumber = "yes";
            }
            if (randomNumber <= 1) {
                primeNumber = "no";
            }

            // answers, if there are 3 correct answers, the cycle stops
            Scanner answerScanner = new Scanner((System.in));
            String answer = answerScanner.next();
            if (primeNumber.equals("yes") && answer.equals("yes")) {
                System.out.println("Your answer: yes");
                System.out.println("Correct!");

                // congrats and finish the game
                if (i == 3) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else if (primeNumber.equals("no") && answer.equals("no")) {
                System.out.println("Your answer: no");
                System.out.println("Correct!");

                // congrats and finish the game
                if (i == 3) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else { // wrong answer
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + primeNumber + "'");
                System.out.println("Let's try again, " + userName);
                break;
            }
        }
    }
}
