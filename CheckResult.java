public class CheckResult {

    /** 
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *  1. Initializes array for results
     *  2. Fills array with results by invoking functions
     *  3. Loops through result array and checks if there is a winner
     *  4. Returns int 3 if 'X' wins and -3 if 'O' wins, returns 0 if there are no winner.   
     */

    public static int checkWin(char[][] board) {
        int[] result = new int[4];
      
        result[0] = checkRows(board);
        result[1] = checkColumns(board);
        result[2] = checkToRight(board);
        result[3] = checkToLeft(board);
        
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 3) {
                return 3;
            } else if (result[i] == -3) {
                return -3;
            }
        }
        return 0;
      }
  
      public static int checkRows(char[][] board) {
        int count = 0;
  
        for (int i = 0; i < board.length; i++) {
          count = 0;
  
          for (int j = 0; j < board[i].length; j++) {
            if (board[i][j] == 'X') {
              count++;
            } else if (board[i][j] == 'O') {
              count--;
            }  
          }
  
          if (count == 3 || count == -3) {
            break;
          }
        }
  
        if (count != 3 && count != -3) {
          count = 0;
        }
  
        return count;
      }
  
      public static int checkColumns(char[][] board) {
        int count = 0;
  
        for (int i = 0; i < board.length; i++) {
          count = 0;
  
          for (int j = 0; j < board[i].length; j++) {
            if (board[j][i] == 'X') {
              count++;
            } else if(board[j][i] == 'O') {
              count--;
            }
          }
  
          if (count == 3 || count == -3) {
            break;
          }
        }
  
        if (count != 3 && count != -3) {
          count = 0;
        }
  
        return count;
      }
  
      public static int checkToRight(char[][] board) {
        int count = 0;
  
        for (int i = 0; i < board.length; i++) {
          if (board[i][i] == 'X') {
            count++;
          } else if (board[i][i] == 'O') {
            count--;
          }
        }
  
        if (count != 3 && count != -3) {
          count = 0;
        }
        
        return count;
      }
  
      public static int checkToLeft(char[][] board) {
        int count = 0;
        int col = board.length - 1;

        for (int row = 0; row < board.length; row++) {
          if (board[row][col] == 'X') {
            count++;
          } else if (board[row][col] == 'O') {
            count--;
          }
          col--;
        }
  
        if (count != 3 && count != -3) {
          count = 0;
        }
        
        return count;
      }
}