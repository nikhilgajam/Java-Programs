import java.util.Scanner;

public class Jp{

    public static void main(String[] args){

        transposeWithSameArray();

        System.out.println();

        transposeWithExtraArray();

    }

    public static void transposeWithSameArray(){

        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arr = new int[r][c];
        int temp;

        // Scan
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                arr[i][j] = scan.nextInt();

        // Transpose
        for(int i=0; i<r; i++){
                    // See here (j = i)
            for(int j=i; j<c; j++){
                // Swapping the elements without using new array
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println();

        // Print
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void transposeWithExtraArray(){

        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arr = new int[r][c];
        int[][] ans = new int[r][c];
        
        // Scan
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                arr[i][j] = scan.nextInt();

        // Transpose with extra array
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                // Storing in a new array
                ans[j][i] = arr[i][j];
            }
        }

        System.out.println();

        // Print
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }

}
