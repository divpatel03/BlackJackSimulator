import java.util.Scanner;

public class GamePrint {
    //Method for asking user if they are ready to start the game
    public static int startGame(int firstInput) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Would you like to begin?");
        System.out.println("--------------------------------------");
        System.out.println("Enter 1 for Yes || Enter 0 for No");
        System.out.println("--------------------------------------");
        System.out.println();
        firstInput = scanner.nextInt();  

        if(firstInput == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }

    //Starting message displayed to the user
    public static void startMessage() {
        System.out.println("--------------------------------------");
        System.out.println("Welcome to Java BlackJack Version 1.0");
        System.out.println("--------------------------------------");
        System.out.println();
    }

    //Asking and display the rules based on user input
    public static void ruleExplanation() {
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
    }

    //Initial Deal Message after user passes the rule stage
    public static void initialDealMessage() {
        System.out.println("--------------------------------------");
        System.out.println("We will now deal the cards.");
        System.out.println("--------------------------------------");
        System.out.println();
    }
}