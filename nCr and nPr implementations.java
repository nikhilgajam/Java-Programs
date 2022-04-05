public class Jp {
    
    public static void main(String[] args){

        int n = 5, r = 2;
        long x = nCr(n, r);
        System.out.println(x);

    }

    public static long fact(long num){

        long ans = 1;
        for(int i=1; i<=num; i++){
            ans *= i;
        }

        return ans;

    }

    public static long nCr(long n, long r){

        // nCr formula = (n!) / ((n-r)! * r!)

        long nf = fact(n);
        long nmrf = fact(n-r);
        long rf = fact(r);

        long ncr = (nf)/(nmrf*rf);
        return ncr;

    }

    public static long nPr(long n, long r){

        // nCr formula = (n!) / ((n-r)!)

        long nf = fact(n);
        long nmrf = fact(n-r);

        long npr = (nf)/(nmrf);
        return npr;

    }
    
}
