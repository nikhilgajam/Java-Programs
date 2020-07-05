import java.util.Scanner;
public class Jp {

    public static void main(String[] args){

        // Scanner
        Scanner in = new Scanner(System.in);

        //Declaring Array
        int[] a = {1, 2, 3};     // Compile Time Declaration
        int[] arr = new int[10]; // Run Time Declaration

        // Printing a using Enhanced for loop
        for(int i : a){

            System.out.println(i);

        }

        System.out.println("\nEnter 10 Numbers: ");

        // Reading input using Scanner
        for(int i=0; i<arr.length; i++){

            System.out.print("Enter Element " + (i+1) + ": ");
            arr[i] = in.nextInt();

        }


        System.out.println("\nEntered Values: ");

        // Printing values using enhanced for loop
        for(int i: arr){

            System.out.println(i);

        }

    }

}
