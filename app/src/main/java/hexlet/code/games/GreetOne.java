package hexlet.code.games;

import java.util.Scanner;

public class GreetOne {
    public static void greetOne() {
        // Ask user his name and greet him
        Scanner scanner = new Scanner((System.in));
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
