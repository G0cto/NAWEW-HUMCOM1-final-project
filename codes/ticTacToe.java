import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        char input;
        int row ;
        int column;

        int moves = 1;
// create the board as an array
        char[][] board = {
                {'-','-','-'},
                {'-','-','-'},
                {'-','-','-'}
        };
            while (true){
// Print the board
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            try {
// Entering Xs or 0s
                System.out.print("Enter input: ");
                input = sc.next().charAt(0);

                if (input == 'x' || input == 'X') {
                    input = 'X';
                } else if (input == '0' || input == 'o' || input == 'O') {
                    input = '0';
                }
// Entering the rows and columns
                System.out.print("Enter Row: ");
                row = sc.nextInt();
                System.out.print("Enter Column:");
                column = sc.nextInt();
// checking the validity of the coordinates
                if (row < 0 || row >= 3 || column < 0 || column >= 3) {
                    System.out.println("Row and column ou of bounds. Enter ranges 0 1 2");
                    continue;
                }
// updating array[row][column] current value ---> input(Xs and 0s)
// move tracker is also added
                if(board[row][column] == '-') {
                    board[row][column] = input;
                    System.out.println("Current move: " + moves);
                    moves++;
                } else {
                    System.out.print("That position is already taken\n");
                }
// setting moves limit
                if (moves == 9) {
                    System.out.print("Game over. Max moves reached");
                    break;
                }


            } catch (Exception e) {
                System.out.println("Incorrect Input");
            }
            }
        sc.close();
    }
}
