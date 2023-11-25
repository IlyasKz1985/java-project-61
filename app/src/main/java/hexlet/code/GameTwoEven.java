package hexlet.code;

import java.util.Scanner;

public class GameTwoEven {
    public static void gameTwoEven() {
        // ask name and greet
        Scanner nameScanner = new Scanner((System.in));

        System.out.println("May I have your name?");
        String userName = nameScanner.next();
        System.out.println("Hello, " + userName + "!");

        // explain the rules of game
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        // cycle for questions
        // if there are 3 correct answers, the cycle stops
        for (var i = 1; i < 4; i++) {
            var randomNumber = Random.randomNumberForGames();
            System.out.println("Question: " + randomNumber);
            Scanner answerScanner = new Scanner((System.in));
            String answer = answerScanner.next();
            String evenOdd = (randomNumber % 2 == 0) ? "yes" : "no";
            if (evenOdd.equals("yes") && answer.equals("yes")) {
                System.out.println("Your answer: yes");
                System.out.println("Correct!");
            } else if (evenOdd.equals("no") && answer.equals("no")) {
                System.out.println("Your answer: no");
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + evenOdd + "'");
                System.out.println("Let's try again, " + userName);
                i = 0;
            }
        }

        // congrats and finish the game
        System.out.println("Congratulations, " + userName + "!");
    }
}
