package hexlet.code;

import hexlet.code.games.GameFourGCD;
import hexlet.code.games.GameThreeCalc;
import hexlet.code.games.GameTwoEven;
import hexlet.code.games.GreetOne;

import java.util.Scanner;

public class Engine {
    public static void engine() {
        Scanner chooseGame = new Scanner((System.in));
        String gameNumber = chooseGame.next();
        System.out.println("Your choice: " + gameNumber + "\n");
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        int gameNumberToInt = Integer.parseInt(gameNumber);
        // choose 1 to Greet
        if (gameNumberToInt == 1) {
            GreetOne.greetOne();
        }
        // choose 2 to start game 2 - Even
        else if (gameNumberToInt == 2) {
            GameTwoEven.gameTwoEven();
        }
        // choose 3 to start game 3 - Calc
        else if (gameNumberToInt == 3) {
            GameThreeCalc.gameThreeCalc();
        }
        else if (gameNumberToInt == 4) {
            GameFourGCD.gameFourGCD();
        }
    }
}
