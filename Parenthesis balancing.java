import java.util.*;

public class Jp{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();

        balance(inp);

    }

    public static void balance(String str){

        System.out.println(str);

        Stack<String> s = new Stack<>();
        Stack<String> ans = new Stack<>();
        String tmp = "";

        for(int i=0; i<str.length(); i++){
            tmp = "";
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                s.push(Character.toString(str.charAt(i)));
            }else if(str.charAt(i) == ')'){
                if(s.size() > 0 && s.peek().equals("("))
                    tmp = s.pop();
            }else if(str.charAt(i) == ']'){
                if(s.size() > 0 && s.peek().equals("["))
                    tmp = s.pop();
            }else if(str.charAt(i) == '}'){
                if(s.size() > 0 && s.peek().equals("{"))
                    tmp = s.pop();
            }

            if(!tmp.equals("")){
                if(tmp.equals("(")){
                    ans.push(tmp + ")");
                }else if(tmp.equals("[")){
                    ans.push(tmp + "]");
                }else if(tmp.equals("{")){
                    ans.push(tmp + "}");
                }
            }

        }

        System.out.println("Stack s: " + s);
        System.out.println("Stack ans: " + ans + "\n\nOutput:");

        if(s.size() == 0){
            System.out.println("Already balanced: " + str);
        }else{
            if(ans.size() == 0){
                System.out.println("Cannot be balanced");
            }else{
                for(String x: ans){
                    System.out.print(x);
                }
            }
        }

    }

}
