import java.util.Scanner;
import java.util.ArrayList;

public class Jp{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter grid size: ");
        int n = scan.nextInt();

        int[][] board = new int[n][n];   // Initialised with 0
        System.out.println("1 Denotes Queen\n");

        if(nQueens(board, 0, n)){

            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0; i < n; i++){
                for(int j=0; j < n; j++){
                    System.out.print(board[i][j] + " ");
                    if(board[i][j] == 1)
                        list.add(j+1);
                }
                System.out.println();
            }

            System.out.println("\nColumn Positions: " + list);

        }else{

            System.out.println("Not Possible");

        }

    }

    public static boolean isSafe(int[][] arr, int x, int y, int n){

        // Checking all top rows with same columns
        for(int row = 0; row < n; row++){
            if(arr[row][y] == 1)
                return false;
        }

        // Checking all left diagonals
        int row = x;
        int col = y;
        while(row >= 0 && col >= 0){
            if(arr[row][col] == 1)
                return false;

            row--;
            col--;
        }

        // Checking all right diagonals
        row = x;
        col = y;
        while(row >=0  && col < n){
            if(arr[row][col] == 1)
                return false;
            row--;
            col++;
        }

        return true;

    }

    public static boolean nQueens(int[][] arr, int x, int n){

        if(x >= n)
            return true;

        for(int col=0; col < n; col++){

            if(isSafe(arr, x, col, n)){

                arr[x][col] = 1;

                if(nQueens(arr, x+1, n)){
                    return true;
                }
                
                arr[x][col] = 0;    // Backtracking

            }

        }

        return false;

    }

}
