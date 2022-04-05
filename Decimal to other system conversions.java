public class Jp{

    public static void main(String[] args){
        
        DecimalConversion c = new DecimalConversion();
        int x = 10;
        System.out.println(c.decimalToAny(x, 3));

    }

}


class DecimalConversion{

    public String decimalToBinary(long num){

        StringBuilder ans = new StringBuilder();
        long n;

        while(num > 0){
            n = num % 2;
            ans.append(n);
            num /= 2;
        }

        return ans.reverse().toString();

    }

    public String decimalToOctal(long num){

        StringBuilder ans = new StringBuilder();
        long n;

        while(num > 0){
            n = num % 8;
            ans.append(n);
            num /= 8;
        }

        return ans.reverse().toString();

    }

    public String decimalToHexadecimal(long num){

        StringBuilder ans = new StringBuilder();
        long n;

        while(num > 0){
            n = num % 16;

            if(n == 10)
                ans.append('a');
            else if(n == 11)
                ans.append('b');
            else if(n == 12)
                ans.append('c');
            else if(n == 13)
                ans.append('d');
            else if(n == 14)
                ans.append('e');
            else if(n == 15)
                ans.append('f');
            else
                ans.append(n);

            num /= 16;
        }

        return ans.reverse().toString();

    }

    public String decimalToAny(long num, long radix){

        if(radix == 16){

            return decimalToHexadecimal(num);

        }else{

            StringBuilder ans = new StringBuilder();
            long n;

            while(num > 0){
                n = num%radix;
                ans.append(n);
                num /= radix;
            }

            return ans.reverse().toString();

        }

    }

}
