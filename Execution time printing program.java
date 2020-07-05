import java.util.ArrayList;

public class Jp {

    public static void main(String[] args){

        long start = System.currentTimeMillis();

        ArrayList<Long> arr = new ArrayList<>();

        for(long i=0; i<=1000; i++){
            arr.add(i);
        }

        long stop = System.currentTimeMillis();

        long time_taken = stop-start;

        System.out.println("\n(Execution time: " + time_taken + " millisecond(s))");

    }
}
