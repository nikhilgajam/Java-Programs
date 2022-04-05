import java.util.Scanner;

public class Jp {
    

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = in.nextInt();

        prime_or_not(x);

    }

    public static void prime_or_not(int num){

        int flag = 0;   // 0 means true

        if(num == 1)
            flag = 1;

        for(int i=2; i<=Math.sqrt(num); i++){

            if(num%i == 0){
                flag = 1;
                break;
            }

        }

        if(flag == 0){
            System.out.println(num + " is a Prime Number");
        }else{
            System.out.println(num + " is an Ordinary Number");
        }

    }

}
