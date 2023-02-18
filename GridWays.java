public class GridWays {

    public static int countWays(int arr[][], int row, int col) {

        if(row==arr.length-1 || col == arr.length-1 ){
return 1;
        }
        else if(row==arr.length || col == arr.length){
            return 0;
        }

        int  right = countWays(arr, row, col+1);
        int down = countWays(arr, row+1, col);

        return right+down;
        
    }

    public static void main(String args[]){

        int n =3;
        int m=3;

      // (n-1 + m-1)!/(n-1)!+(m-1)!;

        int arr[][] = new int [n][m];

       System.out.println(countWays(arr,0,0));
    }
    
}
