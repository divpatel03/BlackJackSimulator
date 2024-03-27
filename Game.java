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
        
        //Declaring variables for the dealer and player's cards
        int dealerHand = 0, playerHand = 0;
        int dealerCardValue = 0;
        int playerHandValue = 0;
        int hitOrStandValue = 0;

        //New instance of GameLogic.java class to access the methods within that class
        GameLogic gl1 = new GameLogic();

        //Starting the game and assigning the first 2 cards to the dealer and player
        dealerHand = gl1.dealerStartDeal(dealerHand, dealerCardValue);
        playerHand = gl1.playerStartDeal(playerHand, playerHandValue);
        //Display total hand
        System.out.println("Player Hand Total: " +playerHand);

        //Running hit or stand method and asking the user wheter they want to hit/stand
        hitOrStandValue = gp1.hitOrStand();
        
        //If player decides to hit
        if(hitOrStandValue == 1) {
            playerHand += gl1.hit(playerHandValue);
        }
        //If player decides to stand
        else {
            gl1.stand();
        }

    }
}
