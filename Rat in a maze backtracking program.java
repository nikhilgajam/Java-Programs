import java.util.*;

public class Jp{

    public static void main(String[] args){

        int[][] a = {{1, 0, 1, 0, 1}, {1, 1, 1, 1, 1}, {0, 1, 0, 1, 0}, {1, 0, 0, 1, 1}, {1, 1, 1, 0, 1}};
        int[][] solArr = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        ratInMaze(a, 0, 0, a.length, solArr);

        for(int i=0; i<solArr.length; i++){
            for(int j=0; j<solArr[i].length; j++){
                System.out.print(solArr[i][j] + " ");
            }
            System.out.println();
        }

    }

        public static boolean ratInMaze(int[][] arr, int i, int j, int n, int[][] solArr){

        if(i == n-1 && j == n-1){
            solArr[i][j] = 1;
            return true;
        }
        
        if(isSafe(arr, i, j, n)){
            solArr[i][j] = 1;
            if(ratInMaze(arr, i+1, j, n, solArr))
                return true;

            if(ratInMaze(arr, i, j+1, n, solArr))
                return true;

            solArr[i][j] = 0;
        }

        return false;

    }

    public static boolean isSafe(int[][] arr, int i, int j, int n){
        if(i < n && j < n && arr[i][j] == 1)
            return true;

        return false;
    }

}
