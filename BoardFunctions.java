public class BoardFunctions {
    public static char[][] createBoard() {
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
              board[i][j] = '_';
            }
          }

        return board;  
    }

    /** 
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *  1. Prints the board      
     */
    
     public static void printBoard(char[][] board) {
      
        for (int i = 0; i < board.length; i++) {
            System.out.print("\n\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
        }
        System.out.println();
      }
}