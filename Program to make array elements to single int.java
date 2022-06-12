public class Jp{

    public static int arrToInt(int arr[]){

        int num = 0;
        for(int i=0; i<arr.length; i++){
            num = num*10 + arr[i];
        }

        return num;

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int x = arrToInt(arr);
        System.out.println(x);

    }

}
