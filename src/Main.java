import java.util.Scanner;

public class Main {
    public static String player1;
    public static String player2;

    public static void main(String[] args) {
        setPlayerNames();
        //boardet i form af et 2D array.


    }
    public static void setPlayerNames() {
        Scanner input = new Scanner(System.in);
        System.out.println("Name of player 1: ");
        player1= input.next();
        System.out.println("name of player 2: ");
        player2 = input.next();

    }
}
