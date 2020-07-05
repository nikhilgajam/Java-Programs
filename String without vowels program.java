import java.util.Scanner;

public class Jp {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("String Without Vowels\n");


        System.out.print("Enter a string: ");
        String get = in.nextLine();

        no_vowels(get);

    }

    public static void no_vowels(String str){

        char[] carr = str.toLowerCase().toCharArray();
        

        for(char x: carr){

            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){

                continue;

            }else{

                System.out.print(x);

            }

        }

    }

}
