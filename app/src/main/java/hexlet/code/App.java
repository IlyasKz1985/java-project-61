package hexlet.code;

import hexlet.code.games.GameThreeCalc;
import hexlet.code.games.GameTwoEven;
import hexlet.code.games.GreetOne;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            Scanner chooseGame = new Scanner((System.in));
            // the main menu
            System.out.println("""
                    Please enter the game number and press Enter.
                    1 - Greet
                    2 - Even
                    3 - Calc
                    0 - Exit""");
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
    }
}
