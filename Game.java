import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int firstInput = 1;

        if(startGame(firstInput) == 0) {
            System.out.println("Game Over");
            System.exit(0);
        }
        else {
            startMessage();
        }

    }

    public static int startGame(int firstInput) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Would you like to begin?");
        System.out.println("--------------------------------------");
        System.out.println("Enter 1 for Yes || Enter 0 for No");
        System.out.println("--------------------------------------");
        firstInput = scanner.nextInt();  

        if(firstInput == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public static void startMessage() {
        System.out.println("--------------------------------------");
        System.out.println("Welcome to Java BlackJack Version 1.0");
        System.out.println("--------------------------------------");
    }
}
