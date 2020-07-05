public class Jp {

    public static void main(String[] args){

        Patterns p = new Patterns();
        p.combined_rl_triangle(6);
    }

}

class Patterns {

    public void ra_triangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");   // We can replace j with a *, #, $ etc
            }
            System.out.println();
        }
    }


    public void another_ra_triangle(int num) {
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public void combined_ra_triangle(int num){
        int i, j;
        for(i=1; i<=num; i++){
            for(j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(i=num-1; i>=1; i--){
            for(j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public void rl_triangle(int num){
        int i, j, k = 2 * num - 2;
        for(i=1; i<=num; i++){
            for(j=1; j<=k; j++){
                System.out.print(" ");
            }

            k = k - 2;

            for(j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void another_rl_triangle(int num){
        int i, j, k = 2 * num - 2;
        for(i=num; i>=1; i--){
            for(j=1; j<=k; j++){
                System.out.print(" ");
            }

            k = k + 2;

            for(j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public void combined_rl_triangle(int num){
        int i, j, k = 2 * num - 2;

        for(i=1; i<=num; i++){
            for(j=1; j<=k; j++){
                System.out.print(" ");
            }

            k = k - 2;

            for(j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        k = num - 4;

        for(i=num-1; i>=1; i--){
            for(j=1; j<=k; j++){
                System.out.print(" ");
            }

            k = k + 2;

            for(j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public void eq_triangle(int num){
        int i, j, k = 2 * num - 2;

        for(i=1; i<=num; i++){
            for(j=1; j<=k; j++){
                System.out.print(" ");
            }

            k = k -1;

            for(j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public void another_eq_triangle(int num){
        int i, j, k = 2 * num - 2;
        for(i=num; i>=1; i--){
            for(j=1; j<=k; j++){
                System.out.print(" ");
            }

            k = k + 1;

            for(j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public void combined_eq_triangle(int num) {
        int i, j, k = 2 * num - 2;

        for (i = 1; i <= num; i++) {
            for (j = 1; j <= k; j++) {
                System.out.print(" ");
            }

            k = k - 1;

            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        k = num;

        for(i=num-1; i>=1; i--){
            for(j=1; j<=k; j++){
                System.out.print(" ");
            }

            k = k + 1;

            for(j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }


}
