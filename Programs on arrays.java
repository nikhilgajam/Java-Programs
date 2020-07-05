public class Jp {

    public static void main(String[] args) {

        ArrayManipulations a = new ArrayManipulations();

        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        a.matrix_multiplication(arr1, arr2);

    }

}

class ArrayManipulations{

    public void matrix_addition(int[][] arr1, int[][] arr2){

        int[][] ans = new int[arr1.length][arr2.length];

        for(int i=0; i<arr1.length; i++){

            for(int j=0; j<arr2.length; j++){

                ans[i][j] = arr1[i][j] + arr2[i][j];

            }

        }

        System.out.println("Resultant Matrix: ");
        for(int i=0; i<arr1.length; i++){

            for(int j=0; j<arr2.length; j++){

                System.out.print(ans[i][j] + "\t");

            }

            System.out.println();

        }

    }

    public void matrix_subtraction(int[][] arr1, int[][] arr2){

        int[][] ans = new int[arr1.length][arr2.length];

        for(int i=0; i<arr1.length; i++){

            for(int j=0; j<arr2.length; j++){

                ans[i][j] = arr1[i][j] - arr2[i][j];

            }

        }

        System.out.println("Resultant Matrix: ");
        for(int i=0; i<arr1.length; i++){

            for(int j=0; j<arr2.length; j++){

                System.out.print(ans[i][j] + "\t");

            }

            System.out.println();

        }

    }

    public void matrix_multiplication(int[][] arr1, int[][] arr2){

        int[][] ans = new int[arr1.length][arr2.length];

        for(int i=0; i<arr1.length; i++){

            for(int j=0; j<arr2.length; j++){

                for(int k=0; k<arr1.length; k++) {

                    ans[i][j] += arr1[i][k] * arr2[k][j];

                }

            }

        }

        System.out.println("Resultant Matrix: ");
        for(int i=0; i<arr1.length; i++){

            for(int j=0; j<arr2.length; j++){

                System.out.print(ans[i][j] + "\t");

            }

            System.out.println();

        }

    }

    public void matrix_transpose(int[][] arr1){

        int[][] transpose = new int[arr1.length][arr1.length];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                transpose[i][j] = arr1[j][i];
            }
        }

        System.out.println("Resultant Matrix: ");
        for(int i=0; i<arr1.length; i++){

            for(int j=0; j<arr1.length; j++){

                System.out.print(transpose[i][j] + "\t");

            }

            System.out.println();

        }

    }

    public void matrix_determinant(int[][] arr1){

        int det = 0;

        if(arr1.length == 3){

            det = arr1[0][0] * ((arr1[1][1] * arr1[2][2]) -  (arr1[2][1] * arr1[1][2])) - arr1[0][1] * ((arr1[1][0] * arr1[2][2]) - (arr1[2][0] * arr1[1][2])) + arr1[0][2] * ((arr1[1][0] * arr1[2][1]) - (arr1[2][0] * arr1[1][1]));
            System.out.printf("\n3X3 Determinant: %d\n", det);

        }else{

            det = det = arr1[0][0] * (arr1[1][1]) - arr1[0][1] * (arr1[1][0]);
            System.out.printf("\n2X2 Determinant: %d\n", det);

        }

    }

    public void matrix_diagonal_sum(int[][] arr1){

        int sum = 0;

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(i == j){
                    sum += arr1[i][j];
                }
            }
        }

        System.out.println("Diagonal Sum: " + sum);

    }

}