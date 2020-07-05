import java.util.Scanner;
import java.util.Formatter;
import java.io.File;

public class Jp {

    public static void main(String[] args){

        System.out.println("Writing And Reading Easy Way\n");

        EasyWrite w = new EasyWrite();
        w.write();

        EasyRead r = new EasyRead();
        r.read();

    }

}

class EasyWrite{

    Formatter w;

    public void write(){

        try{

            // This searches for a file and if doesn't exist then it makes a new file
            w = new Formatter("hello.txt");

        }
        catch(Exception ex){

            System.out.println("Error");
            return;

        }


        w.format("Hello World");   // This like printf so it can be formatted ("%s", "Hello World")

        w.close();

        System.out.println("Written Successfully");

    }

}


class EasyRead{

    Scanner in;

    public void read(){

        try{
            in = new Scanner(new File("hello.txt"));
        }
        catch (Exception ex){
            System.out.println("Error");
            return;
        }

        String s;

        while(in.hasNext()){

            // s = in.next(); can be used to get single word
            s = in.nextLine();
            System.out.println(s);

        }

        in.close();

        System.out.println("\nSuccessfully Read");

    }

}
