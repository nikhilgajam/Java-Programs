import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;

public class Jp {

    public static void main(String[] args) {

        copy();

    }

    public static void copy(){

        Scanner in = new Scanner(System.in);
        String src, dst;

        System.out.print("Enter source file: ");
        src = in.nextLine();
        System.out.print("Enter destination file: ");
        dst = in.nextLine();

        File s_name = new File(src);
        File d_name = new File(dst);

        if(!s_name.exists()){
            System.out.println("\nEnter correct source file and should exist in same directory");
            return;
        }

        try{
            FileReader r = new FileReader(s_name);
            FileWriter w = new FileWriter(d_name, true);

            int i = r.read();
            while (i != -1){
                w.write((char)i);
                i = r.read();
            }

            r.close();
            w.close();

            System.out.println("\nSuccessfully Copied");

        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
