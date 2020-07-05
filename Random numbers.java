import java.util.Random;

public class Jp {

    public static void main(String[] args){

        Random r = new Random();

        System.out.println(r.nextInt(100)); // This will create a new Random number in range 0 - 100
        System.out.println(r.nextDouble()); // Random doubles in java


        System.out.println(Math.random()); // This will create a double random number by math module
        System.out.println(Math.random() + 1);

        // These are the ways in java to create random numbers

    }

}
