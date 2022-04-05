import java.util.Scanner;

public class Jp {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = in.nextInt();

        System.out.println("");
        fibonacci(x);

    }

    public static void fibonacci(int num){

        long a=0, b=1, c;

        for(int i=0; i<=num; i++){

            System.out.println(a);
            c = a+b;
            a = b;
            b = c;

        }

    }
    
    
    
    
    
    
    
    
    
    

}
