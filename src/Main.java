import java.util.Scanner;

public class Main {
    public static String player1;
    public static String player2;

    public static char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

    //test
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



    // allows the user to place a Move on the board
    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1" -> board[0][0] = symbol;
            case "2" -> board[0][1] = symbol;
            case "3" -> board[0][2] = symbol;
            case "4" -> board[1][0] = symbol;
            case "5" -> board[1][1] = symbol;
            case "6" -> board[1][2] = symbol;
            case "7" -> board[2][0] = symbol;
            case "8" -> board[2][1] = symbol;
            case "9" -> board[2][2] = symbol;
            default -> System.out.println("Numbers 0-9 only.");
        }
    }

    // the board
    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + " " +  board[0][1] + " " +  board[0][2] );
        System.out.println(board[1][0] + " " +  board[1][1] + " " +  board[1][2] );
        System.out.println(board[2][0] + " " +  board[2][1] + " " +  board[2][2] );
    }
    public static void setPlayerNames() {
        Scanner input = new Scanner(System.in);
        System.out.println("Name of player 1: ");
        player1 = input.next();
        System.out.println("name of player 2: ");
        player2 = input.next();
    }
}