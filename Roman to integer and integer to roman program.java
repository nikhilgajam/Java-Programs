import java.util.*;

public class Jp{

    public static String intToRoman(int num){

        LinkedHashMap<Integer, String> maps = new LinkedHashMap<>();  // We use LinkedHashMap to preserve puts sequence
        maps.put(1000, "M");
        maps.put(900, "CM");
        maps.put(500, "D");
        maps.put(400, "CD");
        maps.put(100, "C");
        maps.put(90, "XC");
        maps.put(50, "L");
        maps.put(40, "XL");
        maps.put(10, "X");
        maps.put(9, "IX");
        maps.put(5, "V");
        maps.put(4, "IV");
        maps.put(1, "I");
        StringBuilder ans = new StringBuilder();
        for(Map.Entry<Integer, String> x: maps.entrySet()){
            while(num >= x.getKey()){
                ans.append(x.getValue());
                num -= x.getKey();
            }
        }
        return ans.toString();

    }

    public static int romanToInt(String s){

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int i=0;
        int slen = s.length();
        int ans = 0;
        while(i < slen){
            if(i+1 < slen && hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))){
                ans += hm.get(s.charAt(i+1)) - hm.get(s.charAt(i));
                i += 2;
            }else{
                ans += hm.get(s.charAt(i));
                i += 1;
            }
        }
        
        return ans;
        
    }

    public static void main(String[] args){

        int num = 9999;
        String x = intToRoman(num);
        System.out.println(x);
        System.out.println(romanToInt(x));

    }

}
