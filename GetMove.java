import java.util.InputMismatchException;
import java.util.Scanner;

public class GetMove {
    /** 
      * Function name – askUser
      * @param board (char[][] board)
      * @return spot (int[])
      * 
      * Inside the function
      *   1. Asks the user: - pick a row and column number:
      *   2. Validates that input matches requirements.
      *   3. Check if the spot is taken. If so, let the user choose again.
      *   4. Return the row and column in an int[] array.
      */

    public static int[] askUser(Scanner scanner, char[][] board) {
      int[] rowAndCol = new int[2];
      boolean validMove = false;

      int row = 0;
      int col = 0;

      System.out.print("\n - Pick a row and column number: ");

      while (!validMove) {
        int rowInput = 99;
        int colInput = 99;
        
        try {
            rowInput = scanner.nextInt();
            colInput = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
        }

        if (rowInput >= 0 && rowInput <= 2 && colInput >= 0 && colInput <= 2) {
            if (board[rowInput][colInput] == '_') {
                validMove = true;
                row = rowInput;
                col = colInput;
            } else {
                System.out.print("\nCell already occupied, enter row and column number: ");
            } 
        } else {
            System.out.print("\nInvalid move, enter row and column number: ");
        }

      }

      rowAndCol[0] = row;
      rowAndCol[1] = col;

      return rowAndCol;
    }
    
}