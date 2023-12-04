package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GameTwoEven {
    public static void gameTwoEven() {
        // ask name and greet
        var userName = Engine.askNameAndGreet();

        // explain the rules of game
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        // questions
        for (var i = 1; i < 4; i++) {
            var randomNumber = Engine.randomNumberForGames();
            System.out.println("Question: " + randomNumber);

            // answers, if there are 3 correct answers, the cycle stops
            Scanner answerScanner = new Scanner((System.in));
            String answer = answerScanner.next();
            String evenOdd = (randomNumber % 2 == 0) ? "yes" : "no";

            if (evenOdd.equals("yes") && answer.equals("yes")) {
                System.out.println("Your answer: yes");
                System.out.println("Correct!");

                // congrats and finish the game for three correct answers in a row
                if (i == 3) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else if (evenOdd.equals("no") && answer.equals("no")) {
                System.out.println("Your answer: no");
                System.out.println("Correct!");

                // congrats and finish the game for three correct answers in a row
                if (i == 3) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else { // wrong answer
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + evenOdd + "'");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
    }
}
