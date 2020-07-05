import java.util.Scanner;

public class Jp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x;

        System.out.print("Enter a number: ");
        x = in.nextInt();

        perfect_number(x);

    }

    public static void perfect_number(int num){

        System.out.print(num + " Divides By: ");

        int sum=0;

        for(int i=1; i<num; i++){
            if(num%i == 0){
                sum += i;
                System.out.print(i + "+");
            }
        }

        System.out.println();

        if(num == sum){
            System.out.println(num + " is a Perfect Number");
        }else{
            System.out.println(num + " is a Ordinary Number");
        }

    }

}
