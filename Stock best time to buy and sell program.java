public class Jp{

    public static void main(String[] args){
        
        int[] arr = {7, 1, 5, 3, 6, 4};
        int x = bestTimeToBuyAndSellStock(arr);
        System.out.println("Max profit: " + x);

    }

    public static int bestTimeToBuyAndSellStock(int[] arr){

        int max = 0, sum = 0;

        for(int i=0; i<arr.length-1; i++){

            sum += arr[i+1] - arr[i];
            if(sum > max)
                max = sum;

            if(sum < 0)
                sum = 0;

        }

        return max;

    }

}
