import java.util.Random;

public class GameLogic{
    public int startDeal(int startHand){ 
        
        return startHand;
    }

    public int hit(int hitCard) {
        Random random = new Random();
        return random.nextInt(11) + 1;
    }

    public static int stand() {
        return 0;
    }
}