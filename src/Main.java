import java.util.Scanner;

public class Main {
    public static String player1;
    public static String player2;
    public static Scanner position = new Scanner(System.in);
    public static char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

    //test
    public static void main(String[] args) {
        setPlayerNames();
        for (int turn = 0; turn < 6; turn++) {
            doTurn(turn);
        }
        //boardet i form af et 2D array.
        printBoard();

    }
    // allows the user to place a Move on the board
    private static void placeMove(String position, char symbol) {
        switch (position) {
            case "1":
                if (board[0][0] == '_') {
                    board[0][0] = symbol;
                }else {
                    placeMove(Main.position.next(), symbol);
                }
                break;
            case "2":
                if (board[0][1] == '_') {
                    board[0][1] = symbol;
                }else {
                    placeMove(Main.position.next(), symbol);
                }
                break;
            case "3":
                if (board[0][2] == '_') {
                    board[0][2] = symbol;
                }else {
                    placeMove(Main.position.next(), symbol);
                }
                break;
            case "4":
                if (board[1][0] == '_') {
                    board[1][0] = symbol;
                }else {
                    placeMove(Main.position.next(), symbol);
                }
                break;
            case "5":
                if (board[1][1] == '_') {
                    board[1][1] = symbol;
                }else {
                    placeMove(Main.position.next(), symbol);
                }
                break;
            case "6":
                if (board[1][2] == '_') {
                    board[1][2] = symbol;
                }else {
                    placeMove(Main.position.next(), symbol);
                }
                break;
            case "7":
                if (board[2][0] == '_') {
                    board[2][0] = symbol;
                }else {
                    placeMove(Main.position.next(), symbol);
                }
                break;
            case "8":
                if (board[2][1] == '_') {
                    board[2][1] = symbol;
                }else {
                    placeMove(Main.position.next(), symbol);
                }
                break;
            case "9":
                if (board[2][2] == '_') {
                    board[2][2] = symbol;
                }else {
                    placeMove(Main.position.next(), symbol);
                }
                break;
            default:
                System.out.println("Numbers 0-9 only.");
                break;
        }
    }

    // the board
    private static void printBoard() {
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
    //advances the game by one turn!
    public static void doTurn(int turn) {
        if (turn % 2 == 0) {
            System.out.printf("%s's turn!%n",player1);
            printBoard();
            System.out.print("Choose position on the board: ");
            placeMove(position.next(),'X');
        }else {
            System.out.printf("%s's turn!%n",player2);
            printBoard();
            System.out.print("Choose position on the board: ");
            placeMove(position.next(),'O');
        }
    }
}