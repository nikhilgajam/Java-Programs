import java.util.Scanner;
import java.util.ArrayList;

public class Jp{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arr = new int[r][c];

        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                arr[i][j] = scan.nextInt();

        ArrayList<Integer> ans = spiralOrderMatrixTraversal(r, c, arr);
        System.out.println(ans);

    }

    public static ArrayList<Integer> spiralOrderMatrixTraversal(int r, int c, int[][] arr){

        int row_start=0, row_end=r-1, col_start=0, col_end=c-1, i;
        ArrayList<Integer> list = new ArrayList<>();

        while(row_start <= row_end && col_start <= col_end){

            for(i=col_start; i<=col_end; i++)
                list.add(arr[row_start][i]);  // System.out.print(arr[row_start][i] + " ");
            
            row_start++;

            for(i=row_start; i<=row_end; i++)
                list.add(arr[i][col_end]);  // System.out.print(arr[i][col_end] + " ");
            
            col_end--;

            if(row_start <= row_end){

                for(i=col_end; i>=col_start; i--)
                    list.add(arr[row_end][i]);  // System.out.print(arr[row_end][i] + " ");
                
                row_end--;

            }

            if(col_start <= col_end){

                for(i=row_end; i>=row_start; i--)
                    list.add(arr[i][col_start]);  // System.out.print(arr[i][col_start] + " ");
                    
                col_start++;

            }

        }

        return list;

    }

}
