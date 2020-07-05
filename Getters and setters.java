import java.util.Scanner;

public class Jp {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Getters And Setters In Java\n");

        GetSet g = new GetSet();

        System.out.print("Enter a number: ");
        String x = in.nextLine();
        g.setName(x);


        x = g.getName();
        System.out.print("You entered: " + x);


    }

}

class GetSet{

    private String name;
    // private variables and methods cannot be accessed
    // by other classes then we can implement Getters and Setters
    // to access them

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
