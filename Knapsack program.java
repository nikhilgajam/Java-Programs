public class Jp{

    public static void main(String[] args){

        int[] weight = {10, 20, 30};
        int[] value = {100, 50, 150};
        int knapsack_capacity = 50;
        int n_items = 3;

        int x = knapsack(value, weight, n_items, knapsack_capacity);
        
        System.out.println(x);

    }

    public static int knapsack(int[] value, int[] wt, int n, int W){

        if(n == 0 || W == 0)
            return 0;

        if(wt[n-1] > W)
            knapsack(value, wt, n-1, W);

        return Math.max(knapsack(value, wt, n-1, W-wt[n-1])+value[n-1], knapsack(value, wt, n-1, W));

    }

}
