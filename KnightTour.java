public class KnightTour {

    public static void tour(int chess[][],int row, int col,int move) 
    {

        if(row< 0 || col < 0|| row >= chess.length || col >= chess.length ||chess[row][col] > 0){
        
        return; 
    }
    else if(move==chess.length*chess.length)

    { 
        chess [row][col] = move;

    displayBoard (chess); 
    chess [row][col] = 0;
     return;
 }

    chess[row][col]=move;

          tour(chess, row-2, col+1, move+1);
          tour(chess, row-1, col+2, move+1);
          tour(chess, row+1, col+2, move+1);
          tour(chess, row+2, col+1, move+1);
          tour(chess, row+2, col-1, move+1);
          tour(chess, row+1, col-2, move+1);
          tour(chess, row-1, col-2, move+1);
          tour(chess, row-2, col-1, move+1);
          chess[row][col]=0;


    }

    public static void displayBoard (int[][] chess) 
    {
         for (int i = 0; i < chess.length; i++)
        {
             for (int j = 0; j < chess [0].length; j++){
             System.out.print(chess[i][j] + " ");
     }
     System.out.println(); }

    }
    public static void main(String args[]){
        int chess [][] = new int [8][8];

        tour(chess,1,0,1);
        displayBoard (chess); 
        
    }

}
