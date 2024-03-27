import java.util.Scanner;

public class GamePrint {
    //Method for asking user if they are ready to start the game
    public int startGame(int firstInput) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Would you like to begin?");
        System.out.println("--------------------------------------");
        System.out.println("Enter 1 for Yes || Enter 0 for No");
        System.out.println("--------------------------------------");
        System.out.println();
        firstInput = scanner.nextInt();  

        if(firstInput == 0) {
            scanner.close();
            return 0;
        }
        else {
            scanner.close();
            return 1;
        }
    }

    //Starting message displayed to the user
    public void startMessage() {
        System.out.println("--------------------------------------");
        System.out.println("Welcome to Java BlackJack Version 1.0");
        System.out.println("--------------------------------------");
        System.out.println();
    }

    //Asking and display the rules based on user input
    public void ruleExplanation() {
        int ruleInput = 0;
        Scanner ruleScanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Would you like to see the rules of blackjack?");
        System.out.println("--------------------------------------");
        System.out.println("Enter 1 for Yes || Enter 0 for No");
        System.out.println("--------------------------------------");
        ruleInput = ruleScanner.nextInt();  
        System.out.println();

        if(ruleInput == 0) {
            ruleScanner.close();
            return;
        }
        System.out.println("--------------------------------------");
        System.out.println("Object of the Game\r\n" + //
                        "Each participant attempts to beat the dealer by getting a count as close to 21 as possible, without going over 21.\r\n" + //
                        "\r\n" + //
                        "Card Values/scoring\r\n" + //
                        "It is up to each individual player if an ace is worth 1 or 11. Face cards are 10 and any other card is its pip value.");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Game Starting...");
        System.out.println("--------------------------------------");
        System.out.println();
        ruleScanner.close();
    }

    //Initial Deal Message after user passes the rule stage
    public void initialDealMessage() {
        System.out.println("--------------------------------------");
        System.out.println("The cards will now be dealt.");
        System.out.println("--------------------------------------");
        System.out.println();
    }

    public int hitOrStand() {
        int selection;
        Scanner hitOrStand = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Hit Or Stand?");
        System.out.println("--------------------------------------");
        System.out.println("Enter 1 for Hit || Enter 0 for Stand");
        System.out.println("--------------------------------------");
        selection = hitOrStand.nextInt();  
        System.out.println();
        hitOrStand.close();
        return selection;
    }
}
