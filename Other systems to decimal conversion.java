public class Jp{

    public static void main(String[] args){
        
        OtherToDecimal o = new OtherToDecimal();
        
        System.out.println(o.anyToDecimal("101", 3));

    }

}


class OtherToDecimal{

    public long binaryToDecimal(String num){

        long ans = 0;
        long len = num.length();

        for(int i=0; i<len; i++){
            ans += Math.pow(2, len-i-1) * (num.charAt(i) - '0');   // To get the actual integer val. Ex: '8'-'0' = 8
        }

        return ans;

    }

    public long octalToDecimal(String num){

        long ans = 0;
        long len = num.length();
        
        for(int i=0; i<len; i++){
            ans += Math.pow(8, len-i-1) * (num.charAt(i) - '0');
        }

        return ans;

    }

    public long hexadecimalToDecimal(String num){

        long ans = 0;
        long len = num.length();
        char temp;
        
        for(int i=0; i<len; i++){

            temp = num.charAt(i);

            if(temp == 'a')
                ans += Math.pow(16, len-i-1) * 10;
            else if(temp == 'b')
                ans += Math.pow(16, len-i-1) * 11;
            else if(temp == 'c')
                ans += Math.pow(16, len-i-1) * 12;
            else if(temp == 'd')
                ans += Math.pow(16, len-i-1) * 13;
            else if(temp == 'e')
                ans += Math.pow(16, len-i-1) * 14;
            else if(temp == 'f')
                ans += Math.pow(16, len-i-1) * 15;
            else
                ans += Math.pow(16, len-i-1) * (num.charAt(i) - '0');

        }

        return ans;

    }

    public long anyToDecimal(String num, long radix){

        if(radix == 16){

            return hexadecimalToDecimal(num);

        }else{

            long ans = 0;
            long len = num.length();

            for(int i=0; i<len; i++){
                ans += Math.pow(radix, len-i-1) * (num.charAt(i) - '0');
            }

            return ans;

        }

    }

}
