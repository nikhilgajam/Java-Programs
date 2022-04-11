import java.util.*;

public class Jp{

    public static void main(String[] args){

        String s = "Hello World";

        int max = 0, c = 0, si=0, ei=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                c = 0;
            }else{
                c++;
                if(c > max){

                    max = c;

                    // Max string start and end indices
                    ei = i;
                    si = ei - max;

                }
            }
        }

        System.out.println("Max String Length: " + max);
        System.out.println("Max String: " + s.substring(si+1, ei+1));

    }










}
