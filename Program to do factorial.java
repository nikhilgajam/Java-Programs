import java.util.Scanner;

public class Jp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x;

        System.out.print("Enter a number: ");
        x = in.nextInt();

        factorial(x);

    }

    public static void factorial(int num){

        long fact = 1, temp = num;

        for(; num>0; num--){
            fact *= num;
        }

        System.out.println("!" + temp + " = " + fact);

    }
}
