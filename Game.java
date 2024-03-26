//Owner: Divya Patel, Github: divpatel03
import java.util.ArrayList;

public class Game{
    public static void main(String[] args) {
        int methodInput = 1;

        GamePrint gp1 = new GamePrint();

        //Prompts the user and asks if they want to begin the game.
        if(gp1.startGame(methodInput) == 0) {
            System.out.println("Game Over");
            System.exit(0);
        }
        else {
            //Calling the startMessage method.
            gp1.startMessage();
        }

        //Calling the ruleExplanation method and asks user if they want to view the rules or not.
        gp1.ruleExplanation();

        //Calling initialDealMessage method to print a statement about the game starting.
        gp1.initialDealMessage();
        
        int dealerHand = 0, playerHand = 0;
        int dealerCardValue = 0;
        int playerHandValue = 0;
        int hitOrStandValue = 0;

        GameLogic gl1 = new GameLogic();

        dealerHand = gl1.dealerStartDeal(dealerHand, dealerCardValue);
        playerHand = gl1.playerStartDeal(playerHand, playerHandValue);

        hitOrStandValue = gp1.hitOrStand();
        if(hitOrStandValue == 1) {
            playerHand += gl1.hit(playerHandValue);
            System.out.println("Player Hand Total: " +playerHand);
        }
        else {
            gl1.stand();
        }

    }
}
