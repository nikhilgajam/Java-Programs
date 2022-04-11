public class Jp{


    public static void main(String[] args){

        System.out.println("Get Bit: " + getBit(5, 2));
        System.out.println("Set Bit: " + setBit(5, 1));
        System.out.println("Clear Bit: " + clearBit(5, 2));
        System.out.println("Update Bit: " + updateBit(5, 1, 1));

        System.out.println(numberOfOnesInABinary(10001));

        int[] arr = {1, 2, 3, 4};
        subset(arr, arr.length);

        int[] uniq = {1, 2, 3, 4, 1, 2, 3};
        System.out.println(unique(uniq));

        int[] uniq2 = {1, 2, 3, 1, 2, 3, 10, 11};
        twoUnique(uniq2);

        int[] uniq3 = {1, 2, 3, 1, 2, 3, 1, 2, 3, 4};
        System.out.println(uniqueWhenAllRepeted3Times(uniq3));

    }


    public static int getBit(int n, int pos){
        if((n & (1 << pos)) != 0)
            return 1;
        else
            return 0;
    }


    public static int setBit(int n, int pos){
        return (n | (1 << pos));
    }


    public static int clearBit(int n, int pos){
        int mask = ~(1 << pos);
        return (n & mask);
    }


    public static int updateBit(int n, int pos, int val){
        int mask = ~(1 << pos);
        n = n & mask;
        return (n | (val << pos));
    }

    public static boolean isPowerOf2(int n){

        if(n == 0)
            return false;   // Base case 0 is not a power of 2

        // if n & n-1 == 0 then it is a power of 2
        return ((n & n-1) == 0);
    }

    public static int numberOfOnesInABinary(int n){

        int count = 0;
        // Until n & n-1 != 0 we have that many ones in a binary number
        while(n != 0){
            n = n & (n-1);
            count++;
        }

        return count;

    }

    public static void subset(int arr[], int n){
        
        // (1 << n) == 2^n
        for(int i=0; i < (1 << n); i++){
            for(int j=0; j < n; j++){

                if((i & (1 << j)) != 0)
                    System.out.print(arr[j] + " ");
                
            }
            System.out.println();
        }

    }

    public static int unique(int[] arr){

        int xorsum = 0;
        // If we do xor with same elements it will be 0, otherwise if only one number is unique then that number
        // If more than one number is unique then xor of those numbers will be returned
        for(int i=0; i < arr.length; i++){
            xorsum = xorsum ^ arr[i];
        }

        return xorsum;

    }

    public static void twoUnique(int[] arr){

        int xorsum = 0;
        for(int i=0; i<arr.length; i++){
            xorsum = xorsum ^ arr[i];
        }

        int tempxor = xorsum;
        int setbit = 0;
        int pos = 0;
        while(setbit != 1){
            setbit = xorsum & 1;
            pos++;
            xorsum = xorsum >> 1;
        }

        int newxor = 0;
        for(int i=0; i<arr.length; i++){
            if(getBit(arr[i], pos-1) == 1)
                newxor = newxor ^ arr[i];

        }

        System.out.println(newxor);
        System.out.println(tempxor ^ newxor);

    }

    public static int uniqueWhenAllRepeted3Times(int[] arr){

        int ans = 0;

        for(int i=0; i < 64; i++){
            int sum = 0;
            for(int j=0; j < arr.length; j++){

                if(getBit(arr[j], i) == 1)
                    sum++;
                
            }

            if(sum%3 != 0)
                ans = setBit(ans, i);

        }

        return ans;

    }

}
