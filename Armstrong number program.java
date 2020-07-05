import java.util.Scanner;

public class Jp {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Armstrong Number Program In Java\n");

        int num=0, n=0, r=0, temp;
        System.out.print("Enter a number: ");
        num = in.nextInt();

        temp = num;

        for(; num>0; num/=10){
            n = num % 10;
            r = r+(n*n*n);
        }

        if(temp == r){
            System.out.println(temp + " is a Armstrong Number");
        }else{
            System.out.println(temp + " is a Ordinary Number");
        }

    }

}
