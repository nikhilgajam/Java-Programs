import java.util.Scanner;

public class Jp {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int x, y, z;

        System.out.print("Enter number 1: ");
        x = in.nextInt();
        System.out.print("Enter number 2: ");
        y = in.nextInt();

        // z = Gcd(x, y);
        z = gcdEuclidean(x, y);

        System.out.println("\nGCD : " + z);


    }

    public static int gcdEuclidean(int a, int b){

        int c;
        
        while(b != 0){
            c = a%b;
            a = b;
            b = c;
        }

        return a;

    }

    public static int Gcd(int num1, int num2) {
        int gcd = 0;

        for(int i=1; i<=num1 && i<=num2; i++){

            if(num1%i == 0 && num2%i == 0){

                gcd = i;

            }

        }

        return gcd;

    }

}
