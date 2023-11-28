package hexlet.code.games;

import hexlet.code.RandomNumbersForGames;

import java.util.Scanner;

public class GameTwoEven {
    public static void gameTwoEven() {
        // ask name and greet
        Scanner nameScanner = new Scanner((System.in));
        String userName = nameScanner.next();
        System.out.println("Hello, " + userName + "!");

        // explain the rules of game
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        // cycle for questions
        // if there are 3 correct answers, the cycle stops
        for (var i = 1; i < 4; i++) {
            var randomNumber = RandomNumbersForGames.randomNumberForGames();
            System.out.println("Question: " + randomNumber);
            Scanner answerScanner = new Scanner((System.in));
            String answer = answerScanner.next();
            String evenOdd = (randomNumber % 2 == 0) ? "yes" : "no";
            if (evenOdd.equals("yes") && answer.equals("yes")) {
                System.out.println("Your answer: yes");
                System.out.println("Correct!");

                // congrats and finish the game
                if (i == 3){
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else if (evenOdd.equals("no") && answer.equals("no")) {
                System.out.println("Your answer: no");
                System.out.println("Correct!");

                // congrats and finish the game for three correct answers in a row
                if (i == 3){
                    System.out.println("Congratulations, " + userName + "!");
                }

                // wrong answer
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + evenOdd + "'");
                System.out.println("Let's try again, " + userName);
                break;
            }
        }
    }
}
