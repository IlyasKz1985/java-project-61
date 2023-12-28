package hexlet.code;

//switch (selectedGame) {
        //case "1":
        //Cli.greet();
        //break;
        //case "2":
        //Even.runGame();
        //break;
        //case "3":
        //Calc.runGame();
        //break;

        //App -> Game -> Engine

import hexlet.code.games.*;

import java.util.Scanner;

// Да, это верная схема. В меню выбирается игра, игра запускается, игра использует движок.
public class App {
    public static void main(String[] args) {
        // the main menu
        System.out.println("""
                    Please enter the game number and press Enter.
                    1 - Greet
                    2 - Even
                    3 - Calc
                    4 - GCD
                    5 - Progression
                    6 - Prime
                    0 - Exit""");

        Scanner chooseGame = new Scanner((System.in));
        String gameNumber = chooseGame.next();
        System.out.println("Your choice: " + gameNumber + "\n");

        int gameNumberToInt = Integer.parseInt(gameNumber);

        // choose the number of the games
        if (gameNumberToInt == 1) {
            OneGreet.oneGreet();
        } else if (gameNumberToInt == 2) {
            TwoEven.twoEven();
        } else if (gameNumberToInt == 3) {
            ThreeCalc.threeCalc();
        } else if (gameNumberToInt == 4) {
            FourGCD.fourGCD();
        } else if (gameNumberToInt == 5) {
            FiveProgression.fiveProgression();
        } else if (gameNumberToInt == 6) {
            SixPrime.sixPrime();
        }
    }
}
