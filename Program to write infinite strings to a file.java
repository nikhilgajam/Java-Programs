import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

public class Jp {

    public static void main(String[] args) {

        write();

    }

    public static void write(){

        Scanner in = new Scanner(System.in);

        String name;
        String str;
        System.out.print("Enter the name of the file: ");
        name = in.nextLine();

        System.out.println("\nPress (Enter) and ~ to exit\nStart typing: ");

        try{
            FileWriter w = new FileWriter(name);

            str = in.nextLine();
            while (str.indexOf('~') == -1){
                w.write(str +"\n");
                str = in.nextLine();
            }

            w.close();

            System.out.println("\nSuccessfully Written");

        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
