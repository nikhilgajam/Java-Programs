import java.util.Arrays;

public class Jp{

    public static void main(String[] args){

        int[] arr = {2, 4, 7, 11, 14, 16, 20, 21};
        int k = 31;

        System.out.println(pairSum(arr, k));
        System.out.println(pairSumBetter(arr, k));


    }

    public static boolean pairSumBetter(int[] arr, int target){

        // This should be used for sorted array
        Arrays.sort(arr);   // Array must be sorted
        int low=0, high=arr.length-1;

        while(low<high){

            if(arr[low]+arr[high] == target){
                System.out.println(low + " " + high);
                return true;
            }else if(arr[low]+arr[high] > target){
                high--;
            }else{
                low++;
            }

        }

        return true;
    }

    public static boolean pairSum(int[] arr, int target){

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i] + arr[j]) == target){
                    System.out.println(i + " " + j);
                    return true;
                }
            }
        }

        return false;

    }

}
