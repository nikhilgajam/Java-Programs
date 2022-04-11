import java.util.Scanner;

public class Jp{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int[][] a = new int[n1][n2];

        for(int i=0; i<n1; i++)
            for(int j=0; j<n2; j++)
                a[i][j] = scan.nextInt();

        n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int[][] b = new int[n2][n3];

        for(int i=0; i<n2; i++)
            for(int j=0; j<n3; j++)
                b[i][j] = scan.nextInt();

        // a x b and c x d multiplication size is a x d

        matrixMultiplication(n1, n2, n3, a, b);

    }

    public static void matrixMultiplication(int n1, int n2, int n3, int[][] a, int b[][]){

        int[][] c = new int[n1][n3];
        int temp;

        for(int i=0; i<n1; i++)
            for(int j=0; j<n3; j++)
                c[i][j] = 0;

        for(int i=0; i<n1; i++){
            for(int j=0; j<n3; j++){
                for(int k=0; k<n2; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println();

        // Print
        for(int i=0; i<n1; i++){
            for(int j=0; j<n3; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }

}
