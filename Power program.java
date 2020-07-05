import java.util.Scanner;

public class Jp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b;

        System.out.print("Enter base number: ");
        a = in.nextInt();
        System.out.print("Enter power number: ");
        b = in.nextInt();

        long c = power(a, b);

        System.out.println(a + "^" + b + " = " + c);


    }

    public static long power(int x, int y){

        long ans = 1;

        for(; y>0; y--){
            ans *= x;
        }

        return ans;

    }

}
