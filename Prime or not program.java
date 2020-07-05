import java.util.Scanner;

public class Jp {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = in.nextInt();

        prime_or_not(x);

    }

    public static void prime_or_not(int num){

        int count = 0;

        for(int i=1; i<=num; i++){

            if(num%i == 0){
                count++;
            }

        }

        if(count == 2){
            System.out.println(num + " is a Prime Number");
        }else{
            System.out.println(num + " is a Ordinary Number");
        }

    }

}
