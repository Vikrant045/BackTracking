public class NQueensTotalWays {
    static int count = 0;  // for calculating count 

    public static void nQueens(char board[][], int row) {

        if (row == board.length) {

            printBoard(board);  // TO PRINT CHESS BOARD
            count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'X';
          }
        }

    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // vertical left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // vertical Right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                System.out.print(board[i][j]);

            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                board[i][j] = 'X';

            }
        }

        nQueens(board, 0);
        System.out.println();
        System.out.println(" count of possile ChessBoards for n = "+n+" is "+count);

    }
}
