package hexlet.code;

import java.util.Scanner;

public class GreetOne {
    public static void greetOne() {
        // Ask user his name and greet him
        Scanner scanner = new Scanner((System.in));

        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
