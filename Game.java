import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int firstInput = 0;
        startGame(firstInput);
        if(firstInput == 0) {
            System.out.println("Game Over");
            System.exit(0);
        }

        //Change this later so it can reprompt the user
        else if(firstInput != 1 || firstInput != 0) {
            System.out.println("Error, Invalid Input!");
            System.exit(0);
        }
        else {
            startMessage();
        }

    }

    public static int startGame(int firstInput) {
        System.out.println("--------------------------------------");
        System.out.println("Would you like to begin?");
        System.out.println("--------------------------------------");
        System.out.println("Enter 1 for Yes");
        System.out.println("Enter 0 for No");
        Scanner scanner = new Scanner(System.in);
        firstInput = scanner.nextInt();

        return firstInput;
    }

    public static void startMessage() {
        System.out.println("--------------------------------------");
        System.out.println("Welcome to Java BlackJack Version 1.0");
        System.out.println("--------------------------------------");
    }
}
