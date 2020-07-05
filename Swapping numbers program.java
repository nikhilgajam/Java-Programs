import java.util.Scanner;

public class Jp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x, y;

        System.out.print("Enter a number: ");
        x = in.nextInt();
        System.out.print("Enter another number: ");
        y = in.nextInt();

        swap_with_var(x, y);

    }

    public static void swap_with_var(int a, int b){

        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("\nA = " + a + ", B = " + b);
    }

    public static void swap_without_var(int a, int b){

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("\nA = " + a + ", B = " + b);
    }

    public static void swap_new(int a, int b){

        b = a+b - (a=b);

        System.out.println("\nA = " + a + ", B = " + b);
    }

}
