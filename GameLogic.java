import java.util.Random;

public class GameLogic{
    public static void main() {
        
    }

    public static void startDeal(){ 

    }

    public static int hit(int hitCard) {
        Random random = new Random();
        return random.nextInt(11) + 1;
    }

    public static int stand() {
        return 0;
    }
}