import java.util.Scanner;

public class Main {
    public static String player1;
    public static String player2;

    public static char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

    public static void main(String[] args) {
        setPlayerNames();
        //boardet i form af et 2D array.
        printBoard(board);

    }
    public static void updateBoard() {
        int indexX;
        int indexY;
        Scanner input = new Scanner(System.in);
        indexY = input.nextInt();
        indexX = input.nextInt();
    }

    public static void setPlayerNames() {
        Scanner input = new Scanner(System.in);
        System.out.println("Name of player 1: ");
        player1 = input.next();
        System.out.println("name of player 2: ");
        player2 = input.next();
    }
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
