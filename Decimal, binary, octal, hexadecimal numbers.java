import java.util.Scanner;

public class Jp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = 100;    // Decimal
        System.out.println(x);
        x = 0b1000_000; // Binary
        System.out.println(x);
        x = 00_100_000_000; // Octal
        System.out.println(x);
        x = 0x1000_000; // Hexadecimal
        System.out.println(x);

        // Underscores are optional they will be used for readability

    }
}
