import java.util.Scanner;

public class Jp {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = in.nextInt();

        System.out.println("");
        primes(x);

    }

    public static void primes(int num){

        int count;

        for(int i=1; i<=num; i++){

            count = 0;

            for(int j=1; j<=num; j++){
                if(i%j == 0){

                    count++;

                }
            }

            if(count == 2){
                System.out.println(i);
            }

        }

    }

}
