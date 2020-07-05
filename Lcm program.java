import java.util.Scanner;

public class Jp {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int x, y, z;

        System.out.print("Enter number 1: ");
        x = in.nextInt();
        System.out.print("Enter number 2: ");
        y = in.nextInt();

        z = Lcm(x, y);

        System.out.println("\nLCM : " + z);


    }

    public static int Lcm(int num1, int num2) {
        int gcd = 0, lcm = 0;

        for(int i=1; i<=num1 && i<=num2; i++){

            if(num1%i == 0 && num2%i == 0){

                gcd = i;

            }

        }

        lcm = (num1*num2)/gcd;

        return lcm;

    }

}
