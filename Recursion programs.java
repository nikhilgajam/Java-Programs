public class Jp {

    public static void main(String[] args){

        System.out.println("Recursion Programs In Java\n");

        Recursion r = new Recursion();

        r.even_odd_count(1000);

    }

}

class Recursion{

    int r;  // class variables

    // Use only one method from same instantiation sum, rev, armstrong to get correct value because they uses same int r
    // And Java will not support default method parameters and static variables in methods
    // We can create new classes to write sum, rev, armstrong

    public int sum_rec(int num){

        int n;
        if(num > 0){
            n = num%10;
            r = r+n;

            return sum_rec(num/10);
        }else {
            return r;
        }

    }


    public int rev_rec(int num){

        int n;
        if(num > 0){
            n = num%10;
            r = r*10+n;
            return rev_rec(num/10);
        }else{
            return r;
        }

    }


    public int armstrong_rec(int num){

        int n;
        if(num > 0){
            n = num%10;
            r = r+(n*n*n);
            return armstrong_rec(num/10);
        }else{
            return r;
        }

    }


    public long factorial_rec(int num){

        if(num == 0){
            return 1;
        }else{
            return num * factorial_rec(num-1);
        }

    }


    long a=0, b=1, c;

    public long fibonacci_rec(int num){

        if(num > 0){
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
            return fibonacci_rec(num-1);
        }else{
            return a;
        }

    }


    public long print_n_times(int num){

        if(num > 0){
            System.out.println(num);
            return print_n_times(num-1);
        }else{
            return num;
        }
    }


    int ec=0, oc=0, t_sum=0;

    public long even_odd_count(int num){

        if(num > 0){
            t_sum += num;
            if(num%2 == 0){
                ec += 1;
            }else{
                oc += 1;
            }
            return even_odd_count(num-1);
        }else{
            System.out.println("Even Count = " + ec);
            System.out.println("Odd Count = " + oc);
            System.out.println("Total Sum = " + t_sum);

            return t_sum;
        }

    }


    public long gcd_rec(int num1, int num2){

        if(num2 != 0){
            return gcd_rec(num1, num1 % num2);
        }else{
            return num1;
        }

    }

    public long lcm_rec(int num1, int num2){

        long gcd = gcd_rec(num1, num2);
        return (num1*num1)/gcd;

    }

    public long power_rec(int base, int power){

        if(power != 0){
            return (base*power_rec(base, power-1));
        }else{
            return 1;
        }

    }


}