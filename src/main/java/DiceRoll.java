import java.util.Random;

public class DiceRoll {
    public static int rollDie(String type) {
        return switch (type) {
            case "d4" -> randInt(1, 4);
            case "d6" -> randInt(1, 6);
            case "d8" -> randInt(1, 8);
            case "d10" -> randInt(1, 10);
            case "d12" -> randInt(1, 12);
            case "d20" -> randInt(1, 20);
            case "d100" -> randInt(1, 100);
            default -> 0;
        };
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

}
