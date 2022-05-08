import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class Jp{

    public static void main(String[] args){

        String s = "{[()]}";
        System.out.println("Is Balanced: " + bracketsValid(s));
        System.out.println("No of invalid brackets: " + noOfInvalidBrackets(s));

    }

    public static boolean bracketsValid(String s){

        Stack<Character> stack = new Stack<>();
        char temp;

        for(int i=0; i < s.length(); i++){
            temp = s.charAt(i);
            if(temp == '(' || temp == '[' || temp == '{'){

                stack.push(temp);

            }else if(temp == ')' || temp == ']' || temp == '}'){

                if(stack.size() > 0 && temp == ')' && stack.peek() == '('){
                    stack.pop();
                }else if(stack.size() > 0 && temp == ']' && stack.peek() == '['){
                    stack.pop();
                }else if(stack.size() > 0 && temp == '}' && stack.peek() == '{'){
                    stack.pop();
                }else{   // If we have closing brackets we will push and calculate no of invalid brackets
                    stack.push(temp);
                }

            }
        }

        if(stack.size() == 0)
            return true;
        else
            return false;

    }

    public static int noOfInvalidBrackets(String s){

        Stack<Character> stack = new Stack<>();
        char temp;

        for(int i=0; i < s.length(); i++){
            temp = s.charAt(i);
            if(temp == '(' || temp == '[' || temp == '{'){

                stack.push(temp);

            }else if(temp == ')' || temp == ']' || temp == '}'){

                if(stack.size() > 0 && temp == ')' && stack.peek() == '('){
                    stack.pop();
                }else if(stack.size() > 0 && temp == ']' && stack.peek() == '['){
                    stack.pop();
                }else if(stack.size() > 0 && temp == '}' && stack.peek() == '{'){
                    stack.pop();
                }else{   // If we have closing brackets we will push and calculate no of invalid brackets
                    stack.push(temp);
                }

            }
        }

        return stack.size();

    }

}
