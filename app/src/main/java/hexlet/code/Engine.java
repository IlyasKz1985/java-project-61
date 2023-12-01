package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    public static void engine() {
        Scanner chooseGame = new Scanner((System.in));
        String gameNumber = chooseGame.next();
        System.out.println("Your choice: " + gameNumber + "\n");

        int gameNumberToInt = Integer.parseInt(gameNumber);

        // choose the number of the games
        if (gameNumberToInt == 1) {
            GreetOne.greetOne();
        } else if (gameNumberToInt == 2) {
            GameTwoEven.gameTwoEven();
        } else if (gameNumberToInt == 3) {
            GameThreeCalc.gameThreeCalc();
        } else if (gameNumberToInt == 4) {
            GameFourGCD.gameFourGCD();
        } else if (gameNumberToInt == 5) {
            GameFiveProgression.gameFiveProgression();
        } else if (gameNumberToInt == 6) {
            GameSixPrime.gameSixPrime();
        }
    }
    public static String askNameAndGreet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner nameScanner = new Scanner((System.in));
        String username = nameScanner.next();
        System.out.println("Hello, " + username + "!");
        return username;
    }
    public static int randomNumberForGames() {
        // create list of numbers
        // choose one number from the list randomly
        int min = 1;
        int max = 15;
        return (int) ((Math.random() * (max - min + 1)) + min);
    }
}
