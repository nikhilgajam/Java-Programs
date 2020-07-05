import java.util.Scanner;

public class Jp {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Summation Program In Java\n");

        int num=0, n=0, r=0, temp;
        System.out.print("Enter a number: ");
        num = in.nextInt();

        temp = num;

        for(; num>0; num/=10){
            n = num %10;
            r = r+n;
        }

        System.out.println("Summation of " + temp + " is: " + r);

    }

}
