package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    public static void engine() {
    }

    public static int randomNumberForGames() {
        // create list of numbers
        // choose one number from the list randomly
        int min = 1;
        int max = 15;
        return (int) ((Math.random() * (max - min + 1)) + min);
    }

    public static String askNameAndGreet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner nameScanner = new Scanner((System.in));
        String username = nameScanner.next();
        System.out.println("Hello, " + username + "!");
        return username;
    }
}
