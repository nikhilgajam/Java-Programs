import java.util.Scanner;

public class Jp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x;

        System.out.print("Enter a number: ");
        x = in.nextInt();

        palindrome_number(x);

    }

    public static void palindrome_number(int num){

        int n, r=0, temp;

        temp = num;

        for(; num>0; num/=10){
            n = num%10;
            r = r*10+n;
        }

        if(temp == r){
            System.out.println(temp + " == " + r + " is a Palindrome Number");
        }else{
            System.out.println(temp + " != " + r + " is a Ordinary Number");
        }

    }
}
