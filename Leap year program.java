import java.util.Scanner;

public class Jp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x;

        System.out.print("Enter a year: ");
        x = in.nextInt();

        leap(x);

    }

    public static void leap(int year){

        if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)){
            System.out.println(year + " is a Leap Year");
        }else{
            System.out.println(year + " is a Regular Year");
        }

    }
}
