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

        GameLogic gl1 = new GameLogic();
        GameLogic gl2 = new GameLogic();
        
        gl1.startDeal(dealerHand);
        gl2.startDeal(playerHand);
        
        int returnCard; 


    }
}
