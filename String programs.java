public class Jp{

    public static void main(String[] args){

        subsequence("aab", "");
        System.out.println();
        subsequenceWithASCII("aab", "");
        System.out.println();
        permutations("aab", "");
        System.out.println('a');
        combinations("aab", "");
        System.out.println();
        substringsIteration("aab");
        System.out.println();
        phoneKeypadCombinations("56", "");

    }

    public static void substringsIteration(String s){

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){

                System.out.print(s.substring(i, j) + " ");

            }
        }

    }

    public static void subsequence(String s, String ans){

        if(s.isEmpty()){
            System.out.print(ans + " ");
            return;
        }

        subsequence(s.substring(1), ans + s.charAt(0));  // Including
        subsequence(s.substring(1), ans);                // Not including

    }

    public static void subsequenceWithASCII(String s, String ans){

        if(s.isEmpty()){
            System.out.print(ans + " ");
            return;
        }

        char ch = s.charAt(0);
        int code = ch;
        String ros = s.substring(1);

        subsequenceWithASCII(ros, ans);         // Not including
        subsequenceWithASCII(ros, ans + ch);    // Including
        subsequenceWithASCII(ros, ans + code);  // Include ASCII

    }

    public static void permutations(String s, String ans){

        if(s.isEmpty()){
            System.out.print(ans + " ");
            return;
        }

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);
            String ros = s.substring(0, i) + s.substring(i + 1);
            permutations(ros, ans + ch);

        }

    }

    public static void combinations(String s, String ans){

        // Only small letters should be given as input
        if(s.isEmpty()){
            System.out.print(ans + " ");
            return;
        }

        boolean[] alpha = new boolean[26];

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);
            String ros = s.substring(0, i) + s.substring(i + 1);

            if(alpha[ch - 'a'] == false)
                combinations(ros, ans + ch);
            
            alpha[ch - 'a'] = true;

        }

    }

    static String[] keypadArr = {"", ".,", "abc", "def", "ghi", "ghi", "mno", "pqrs", "tuv", "wxyz"};

    public static void phoneKeypadCombinations(String numstring, String ans){

        if(numstring.isEmpty()){
            System.out.print(ans + " ");
            return;
        }

        char ch = numstring.charAt(0);
        String code = keypadArr[ch - '0'];
        String ros = numstring.substring(1);

        for(int i=0; i<code.length(); i++){
            phoneKeypadCombinations(ros, ans + code.charAt(i));
        }

    }

}
