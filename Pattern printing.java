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
                System.out.print(j + " ");   // We can replace j with (char)j alphabets, a *, #, $ etc
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

    public void hollow_ra_triangle(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if(i == 1 || i == num || j == 1 || i == j){
                    System.out.print(j + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public void hollow_another_ra_triangle(int num) {

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if(i == 1 || i == num || j == 1 || i == j){
                    System.out.print(j + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public void hollow_combined_ra_triangle(int num){

        int i, j;
        for(i=1; i<=num; i++){
            for(j=1; j<=i; j++){
                if(i == 1 ||  j == 1 || i == j){
                    System.out.print(j + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(i=num-1; i>=1; i--){
            for(j=1; j<=i; j++){
                if(i == 1 || i == num || j == 1 || i == j){
                    System.out.print(j + " ");
                }else{
                    System.out.print("  ");
                }
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

    public void square_pattern(int num){

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void alphabet_square_pattern(int num){

        for(int i=65; i<=65+num; i++){
            for(int j=65; j<65+num; j++){
                System.out.print((char)j + " ");
            }
            System.out.println();
        }

    }

    public void hollow_square_pattern(int num){

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                if(i == 1 || i == num || j == 1 || j == num){   // If i and j starts with 0 then i == 0 || j == 0 ||
                    System.out.print("* ");                      // i == num-1 || j == num -1
                }else{
                    System.out.print("  ");  // Two spaces
                }
            }
            System.out.println();
        }

    }

    public void square_pattern_with_different_number(int num){

        // try num = 4
        int c = 1;
        for(int i=1; i<=num+1; i++){
            for(int j=1; j<=num; j++){
                if(j==num-1 && i>=2){
                    System.out.print(c + " ");
                    c += 1;
                }else{
                    System.out.print(4 + " ");
                }
            }
            System.out.println();
        }

    }

    public void combination_of_numbers_and_stars(int num){

        int i, j, k, count = 0;
        for(i=1; i<=num; i++){
            k = 1;
            for(j=1; j<=i;j++){
                System.out.print(i);
                if(k < i){
                    System.out.print("*");
                    k += 1;
                }
            }
            System.out.println();
        }
        for(i=num; i>=1; i--){
            k = 1;
            for(j=1; j<=i;j++){
                System.out.print(i);
                if(k < i){
                    System.out.print("*");
                    k += 1;
                }
            }
            System.out.println();
        }

    }
    
    
    
    
    
    
    
    
    
    
    

}
