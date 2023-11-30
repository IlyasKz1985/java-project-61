package hexlet.code;
public class RandomNumbersForGames {
    public static int randomNumberForGames() {
        // create list of numbers
        // choose one number from the list randomly
        int min = 1;
        int max = 21;
        return (int) ((Math.random() * (max - min + 1)) + min);
    }
}