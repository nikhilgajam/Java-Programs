import java.util.Scanner;

public class Jp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String x;

        System.out.print("Enter a string: ");
        x = in.nextLine();

        palindrome_string_builder(x);

    }

    public static void palindrome_string_byte(String str){

        byte[] arr = str.getBytes();
        byte[] rev = new byte[arr.length];
        // We can also use str.toCharArray() to use char[array]

        for(int i=0; i<arr.length; i++){
            rev[i] = arr[arr.length-i-1];
        }

        String revs = new String(rev);

        System.out.println(revs);

        if(str.equals(revs)){
            System.out.println(str + " == " + revs + " is a Palindrome String");
        }else{
            System.out.println(str + " != " + revs + " is a Ordinary String");
        }

    }

    public static void palindrome_string_builder(String str){

        StringBuilder rev = new StringBuilder(str);

        rev.reverse();

        String revs = rev.toString();

        System.out.println(rev);

        if(str.equals(revs)){
            System.out.println(str + " == " + revs + " is a Palindrome String");
        }else{
            System.out.println(str + " != " + revs + " is a Ordinary String");
        }

    }
}
