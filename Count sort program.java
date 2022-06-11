import java.util.*;

public class Jp{

    public static int[] countSort(int[] arr){
        
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        // Calculating range
        int range = max - min + 1;

        int[] output = new int[arr.length];
        int[] count = new int[range];

        // counts of each element
        for(int i=0; i<arr.length; i++){
            count[arr[i] - min]++;
        }

        // adding previous element with current element
        for(int i=1; i<count.length; i++){
            count[i] += count[i-1];
        }

        // rearranging the array to output ascending ordered elements
        for(int i=arr.length-1; i>=0; i--){
            output[--count[arr[i]-min]] = arr[i];
        }

        return output;

    }

    public static void main(String[] args){

        int[] a = { -5, -10, 0, -3, 8, 5, -1, 10 };

        // Storing returned array
        int[] o = countSort(a);

        System.out.println(Arrays.toString(o));

    }

}
