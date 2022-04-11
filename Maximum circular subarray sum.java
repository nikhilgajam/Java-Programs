public class Jp{

    public static void main(String[] args){

        int[] arr = {4, -4, 6, -6, 10, -11, 12};

        int wrapsum = kadane(arr);
        int totalsum = 0;

        // Inverting the - symbol
        for(int i=0; i<arr.length; i++){
            totalsum += arr[i];
            arr[i] = -arr[i];
        }

        int nonwrapsum = totalsum + kadane(arr);

        System.out.println(Math.max(wrapsum, nonwrapsum));

    }

    public static int kadane(int arr[]){

        int sum=0, max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum > max)
                max = sum;
            if(sum < 0)
                sum = 0;
        }

        return max;

    }

}
