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
        
        //If player decides to hit (First)
        if(hitOrStandValue == 1) {
            playerHand += gl1.hit(playerHandValue);
            //If the player wins after the first hit, display the win message
            if(playerHand == 21) {
                System.out.println("21! You Won!");
            }
            //If the player loses after the first hit, display the lost message
            if(playerHand > 21) {
                System.out.println("Bust! You Lost!");
            }
            //If they didn't win or lose, prompt them again to hit or stand
            else {
                //Reset value back to 0
                hitOrStandValue = 0;
                hitOrStandValue = gp1.hitOrStand();

                //If they stand (Second)
                if(hitOrStandValue == 0) {
                    gl1.stand();
                }
                //If they hit (Second)
                else {
                    //Add the new card draw to the total hand
                    playerHand += gl1.hit(playerHandValue);
                    //Display the total hand
                    System.out.println("Player Hand Total: " +playerHand);
                    //If it is over 21, display lost message
                    if(playerHand > 21) {
                        System.out.println("Bust! You Lost!");
                    }
                    //If the player wins after the second hit
                    if(playerHand == 21) {
                        System.out.println("21! You Won!");
                    }
                }
            }
        }
        //If player decides to stand
        else {
            gl1.stand();
        }

    }
}
