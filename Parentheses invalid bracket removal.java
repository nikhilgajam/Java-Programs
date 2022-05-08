import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.HashMap;

public class Jp{

    public static void main(String[] args){

        BracketInvalidRemovalAndPossiblities bracket = new BracketInvalidRemovalAndPossiblities();
        String s = "()())()";
        LinkedList<String> list = bracket.getCombinations(s);
        System.out.println(list);

    }

}

class BracketInvalidRemovalAndPossiblities{

    LinkedList<String> list;
    HashMap<String, Integer> map;

    public BracketInvalidRemovalAndPossiblities(){
        list = new LinkedList<>();
        map = new HashMap<>();
    }

    public LinkedList<String> getCombinations(String s){

        allPossibleCombinations(s, noOfInvalidBrackets(s));
        return list;
        
    }

    public void allPossibleCombinations(String s, int min_in_valid){

        if(map.get(s) != null)
            return;
        else
            map.put(s, 1);

        if(min_in_valid < 0)
            return;           // base case

        if(min_in_valid == 0){
            if(noOfInvalidBrackets(s) == 0){
                list.add(s);
            }
            return;
        }

        for(int i=0; i<s.length(); i++){

            // Here left will have 0 to i substring and right will have i+1 to end substring so one character will be removed
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            allPossibleCombinations(left + right, min_in_valid-1);

        }

    }

    public int noOfInvalidBrackets(String s){

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
