public class Jp{

    public static void main(String[] args){

        tower(3, "Source", "Helper", "Destination");

    }

    public static void tower(int n, String s, String h, String d){

        // Output is 2^n - 1 steps
        if(n == 0)
            return;

        tower(n-1, s, d, h);
        System.out.println("Move disk " + n + " from " + s + " to " + d);
        tower(n-1, h, s, d);

    }

}
