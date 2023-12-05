import java.util.Scanner;

public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isPlaying = true;
        int xWinsCount = 0;
        int oWinsCount = 0;

        System.out.println("\nLet's play tic tac toe!");

        while (isPlaying) {
            char[][] board = BoardFunctions.createBoard();
            int turnCount = 0;

            BoardFunctions.printBoard(board);

            for (int i = 0; i < 9; i++) {
                char current = i % 2 == 0 ? 'X' : 'O';
            
                int[] nextMove = GetMove.askUser(scanner, board);
                turnCount++;
                
                board[nextMove[0]][nextMove[1]] = current;
                
                BoardFunctions.printBoard(board);
                
                if (turnCount >= 5) {
                    int result = CheckResult.checkWin(board);
                    
                    if (result == 3 || result == -3 || turnCount == 9) {
                        if (result == 3) {
                            xWinsCount++;
                            System.out.print("\nX wins! ");
                        } else if (result == -3) {
                            oWinsCount++;
                            System.out.print("\nO wins! ");
                        } else if (result != 3 && result != -3) {
                            System.out.print("\nIt's a tie! ");
                        }
                        System.out.print("Current score:\n\n\tX = " + xWinsCount + "\n\tO = " + oWinsCount + "\n");
                        scanner.nextLine();
                        break;
                    } 
                }
            }
            
            System.out.print("\nWan't to play a new game? (yes/no) ");
            
            while (isPlaying) {
                String isNewGame = scanner.nextLine().toLowerCase();

                if (isNewGame.equals("no")) {
                    isPlaying = false;
                    System.out.println("\nGoodbye!\n");
                } else if (isNewGame.equals("yes")) {
                    break;
                } else {
                    System.out.print("\nPlease enter 'yes' or 'no': " );
                }
            }
        }
      
      scanner.close();
    }
 
}