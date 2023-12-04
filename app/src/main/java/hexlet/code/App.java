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
        Engine.engine();
    }
}
