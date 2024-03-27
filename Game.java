//Owner: Divya Patel, Github: divpatel03
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
        
        while (playerHand < 21) {
            //If player decides to hit
            if (hitOrStandValue == 1) {
                playerHand += gl1.hit(playerHandValue);
                System.out.println("Player Hand Total: " + playerHand);
                //If the player wins after the first hit, display the win message
                if (playerHand == 21) {
                    System.out.println("21! You Won!");
                    break; // Exit the loop since the player won
                }
                //If the player loses after the first hit, display the lost message
                else if (playerHand > 21) {
                    System.out.println("Bust! You Lost!");
                    break; // Exit the loop since the player lost
                }
                //If they didn't win or lose, prompt them again to hit or stand
                else {
                    hitOrStandValue = gp1.hitOrStand(); // Prompt for hit or stand
                }
            }
            //If they stand
            else if (hitOrStandValue == 0) {
                gl1.stand();
                break; // Exit the loop as the player chose to stand
            }
        }

        // If stand is chosen, then deal cards to the dealer
        if (hitOrStandValue == 0) {
            // Deal cards to the dealer until their hand value is 17 or higher
            while (dealerHand < 17) {
                dealerHand += gl1.hit(dealerCardValue);
            }

            // Display the final hand totals
            System.out.println("Player Hand Total: " + playerHand);
            System.out.println("Dealer Hand Total: " + dealerHand);

            // Determine the outcome of the game
            if (dealerHand > 21 || dealerHand < playerHand) {
                System.out.println("You Won!");
            } else if (dealerHand > playerHand) {
                System.out.println("You Lost!");
            } else {
                System.out.println("It's a tie!");
            }
        }


    }
}
