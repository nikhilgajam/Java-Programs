import java.util.Scanner;

public class Jp {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = in.nextInt();

        System.out.println("");
        primes(x);

        System.out.println("");
        primesRange(50, 100);

    }

    public static void primes(int num){

        int flag = 0;   // 0 means true

        for(int i=2; i<=num; i++){

            flag = 0;

            for(int j=2; j<=Math.sqrt(i); j++){

                if(i%j == 0){
                    flag = 1;
                    break;
                }

            }

            if(flag == 0){
                System.out.println(i);
            }

        }

    }

    public static boolean isPrime(int num){

        if(num == 1)
            return false;

        for(int i=2; i<=Math.sqrt(num); i++){

            if(num%i == 0){
                return false;
            }

        }

        return true;

    }

    public static void primesRange(int start, int end){

        for(int i=start; i<=end; i++){

            if(isPrime(i))
                System.out.println(i);

        }

    }

}
