//Owner: Divya Patel, Github: divpatel03
public class Game extends GameLogic{
    public static void main(String[] args) {
        int methodInput = 1;

        //Prompts the user and asks if they want to begin the game.
        if(startGame(methodInput) == 0) {
            System.out.println("Game Over");
            System.exit(0);
        }
        else {
            //Calling the startMessage method.
            startMessage();
        }

        //Calling the ruleExplanation method and asks user if they want to view the rules or not.
        ruleExplanation();

        //Calling initialDealMessage method to print a statement about the game starting.
        initialDealMessage();

        //Can use this gameLogic object to call methods from the gameLogic class to play the game.
        //OR just use the methods directly since it is a subclass of GameLogic.
        //GameLogic gameLogic = new GameLogic();
        //gameLogic.hit();
    }
}
