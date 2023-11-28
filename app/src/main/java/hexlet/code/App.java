package hexlet.code;

public class App {
    public static void main(String[] args) {
            // the main menu
            System.out.println("""
                    Please enter the game number and press Enter.
                    1 - Greet
                    2 - Even
                    3 - Calc
                    4 - GCD
                    0 - Exit""");
            Engine.engine();
    }
}
