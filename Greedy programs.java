import java.util.*;

public class Jp{

    public static void main(String[] args){

        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        // int[] start = {10, 12, 20};
        // int[] end = {20, 15, 30};
        int n = start.length;
        activitySelection(n, start, end);
        
        System.out.println();
        int[] arr = {6, 8, 4, 5, 2, 3};
        System.out.println("Minimum sum of array: " + minSum(arr));

        int[] arr1 = {4, 1, 8, 7};
        int[] arr2 = {2, 3, 6, 5};
        System.out.println("\nMinimum sum of absolute differences of pairs: " + minSumOfAbsolutePairs(arr1, arr2, arr1.length));

        int[] boxes = {10, 20, 30, 50, 60, 70};
        System.out.println("\nMaximum pyramid height from given array: " + maxHeightPyramid(boxes));

        int[] wt = {10, 40, 20, 30};
        int[] val = {60, 40, 100, 120};
        int capacity = 50;

        double maxValue = fractionalKnapsack(wt, val, capacity);
        System.out.println("\nMaximum value we can obtain through knapsack: " + maxValue);

        int[] oarr = {2, 4, 5, 7};
        System.out.println("\nOptimal pattern merge: " + optimalPatternMerge(oarr));

        System.out.println("\nHighest pattern merge: " + highestPatternMerge(oarr));

    }

    public static void coinExchangeCount(int num){

        // Should be in descending order
        int[] currency = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();

        int ans = 0;
        for(int i=0; i<currency.length; i++){

            ans += num/currency[i];
            num -= num/currency[i] * currency[i];

        }

        System.out.println(ans);

    }

    public static void coinExchangeValues(int num){

        // Should be in descending order
        int[] currency = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();

        int i=0;
        while(num != 0){

            if(currency[i] <= num){
                list.add(currency[i]);
                num -= currency[i];
            }else{
                i++;
            }

        }

        System.out.println(list);

    }

    static class Pair{
        int first, second;
        Pair(int s, int e){
            first = s;
            second = e;
        }
    }

    public static void activitySelection(int n, int[] start_time, int[] end_time){

        PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> p1.first-p2.first);
        ArrayList<Pair> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            // Key is end_time and value is start time
            p.add(new Pair(end_time[i], start_time[i]));
        }

        Pair t = p.poll();
        int start = t.second;
        int end = t.first;
        int ans_no = 1; // As we are selecting the first activity
        ans.add(new Pair(start, end));

        for(Pair x: p){
            if(x.second >= end){
                start = x.second;
                end = x.first;
                ans.add(new Pair(start, end));
                ans_no++;
            }
        }

        System.out.println("Total no of activities: " + ans_no);
        for(Pair x: ans){
            System.out.println("Activity starts at: " + x.first + " and ends at: " + x.second);
        }

    }

    public static long minSum(int arr[]){

        Arrays.sort(arr);
        long num1 = 0, num2 = 0;

        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                num1 = num1 * 10 + arr[i];
            }else{
                num2 = num2 * 10 + arr[i];
            }
        }

        long ans = num1 + num2;
        return ans;

    }

    public static long minSumOfAbsolutePairs(int[] arr1, int[] arr2, int n){

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        long sum = 0;
        for(int i=0; i<n; i++){
            sum += Math.abs(arr1[i] - arr2[i]);
        }

        return sum;

    }

    public static int maxHeightPyramid(int[] boxes){

        Arrays.sort(boxes);
        int prev_width = boxes[0];
        int prev_count = 1;  // Initialize with 1

        int current_width = 0;
        int current_count = 0;

        int ans = 1;  // Initialize with 1

        for(int i=0; i<boxes.length; i++){
            current_width += boxes[i];
            current_count++;

            if(current_width > prev_width && current_count > prev_count){
                prev_width = current_width;
                prev_count = current_count;

                current_width = 0;
                current_count = 0;

                ans++;
            }

        }

        return ans;

    }

    static class ItemValue{
        double wt, val, ind;
        Double cost;
        public ItemValue(int wt, int val, int ind){
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost = new Double(val/wt);
        }
    }

    public static double fractionalKnapsack(int[] wt, int[] val, int capacity){

        ItemValue[] iVal = new ItemValue[wt.length];

        for(int i=0; i<wt.length; i++){
            iVal[i] = new ItemValue(wt[i], val[i], i);
        }

        Arrays.sort(iVal, new Comparator<ItemValue>(){
            public int compare(ItemValue o1, ItemValue o2){
                return o2.cost.compareTo(o1.cost);
            }
        });

        double totalValue = 0;

        for(ItemValue i: iVal){
            if(capacity >= i.wt){
                capacity -= i.wt;
                totalValue += i.val;
            }else{
                totalValue += i.val * (capacity/i.wt);
                break;
            }
        }

        return totalValue;

    }

    public static int optimalPatternMerge(int[] arr){

        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        
        for(int i: arr){
            minheap.add(i);
        }

        int osum = 0;

        while(minheap.size() > 1){
            int x = minheap.poll();
            int y = minheap.poll();
            int sum = x+y;
            osum += sum;
            minheap.add(sum);
        }

        return osum;

    }

    public static int highestPatternMerge(int[] arr){

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i: arr){
            maxheap.add(i);
        }

        int sum = 0;

        while(maxheap.size() > 1){
            int x = maxheap.poll();
            int y = maxheap.poll();
            int s = x+y;
            sum += s;
            maxheap.add(s);
        }

        return sum;

    }

}
