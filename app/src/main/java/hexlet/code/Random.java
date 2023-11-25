package hexlet.code;
public class Random {
    public static int randomNumberForGames() {
        // create list of numbers
        // choose one number from the list randomly
        int min = 1;
        int max = 20;
        return (int) ((Math.random() * (max - min)) + min);
    }
}
