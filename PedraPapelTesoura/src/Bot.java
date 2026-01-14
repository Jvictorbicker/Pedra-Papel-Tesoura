import java.util.Random;

public class BotChose {
    public static int Chose() {
        Random random = new Random();

        return random.nextInt(3) + 1;
    }
}