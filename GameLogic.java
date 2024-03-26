import java.util.Random;

public class GameLogic{
    public int dealerStartDeal(int startHand, int cardValue){ 
        Random randomStart = new Random();
        cardValue = randomStart.nextInt(11) + 1;
        System.out.println("Dealer's First Card: Hidden");
        startHand = cardValue;
        cardValue = randomStart.nextInt(11) + 1;
        System.out.println("Dealer's Second Card: "+cardValue);
        System.out.println();
        startHand += cardValue;

        if(startHand == 21) {
            System.out.println("The Dealer got 21, you lose.");
            System.exit(0);
        }

        return startHand;
    }

    public int playerStartDeal(int startHand, int cardValue){ 
        Random randomStart = new Random();
        cardValue = randomStart.nextInt(11) + 1;
        System.out.println("Player's First Card: "+cardValue);
        startHand = cardValue;
        cardValue = randomStart.nextInt(11) + 1;
        System.out.println("Player's Second Card: "+cardValue);
        startHand += cardValue;

        if(startHand == 21) {
            System.out.println("21! You Won!");
            System.exit(0);
        }
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