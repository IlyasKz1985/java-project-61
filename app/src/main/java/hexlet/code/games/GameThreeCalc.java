package hexlet.code.games;

import hexlet.code.RandomNumbersForGames;

import java.util.Scanner;

import java.util.Random;

public class GameThreeCalc {
    public static void gameThreeCalc() {
        // ask name and greet
        Scanner nameScanner = new Scanner((System.in));
        String userName = nameScanner.next();
        System.out.println("Hello, " + userName + "!");

        // explain the rules of game
        System.out.println("What is the result of the expression?");

        // cycle for questions
        // if there are 3 correct answers, the cycle stops
        for (var i = 1; i < 4; i++) {
            var randomNumber1 = RandomNumbersForGames.randomNumberForGames();
            var randomNumber2 = RandomNumbersForGames.randomNumberForGames();
            Random o = new Random();
            char randomOperator = "+-*".charAt(o.nextInt(3));
            System.out.println("Question: " + randomNumber1 + randomOperator + randomNumber2);

            Scanner answerScanner = new Scanner((System.in));
            String answer = answerScanner.next();
            int result = 0;
            if (randomOperator == '+') {
                result = randomNumber1 + randomNumber2;
            }
            else if (randomOperator == '-') {
                result = randomNumber1 - randomNumber2;
            }
            else if (randomOperator == '*') {
                result = randomNumber1 * randomNumber2;
            }

            String resultToString = String.valueOf(result);

            if (resultToString.equals(answer)) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");

                // congrats and finish the game
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
