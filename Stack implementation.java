import java.util.Scanner;

public class Jp{

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        Stack s = new Stack();
        int x;

        while(true){
            System.out.print("\n1.Push 2.Pop 3.Peek 4.isEmpty 0.Quit\n: ");
            x = scan.nextInt();

            if(x == 1){
                System.out.print("Enter value to push (-1 == Stack Overflow): ");
                System.out.println(s.push(scan.nextInt()));
            }else if(x == 2){
                System.out.print("Popped value (-1 == Stack Underflow): ");
                System.out.println(s.pop());
            }else if(x == 3){
                System.out.print("Peek: ");
                System.out.println(s.peek());
            }else if(x == 4){
                System.out.print("isEmpty: ");
                System.out.println(s.isEmpty());
            }else if(x == 0){
                break;
            }

        }


    }

}

class Stack{

    int top, n = 5;
    int[] stack;

    public Stack(){
        top = -1;
        stack = new int[n];
    }

    public int push(int data){
        if(top == n-1){
            return -1;
        }else{
            stack[++top] = data;
            return data;
        }
    }

    public int pop(){
        if(top == -1)
            return -1;
        else
            return stack[top--];
    }

    public int peek(){
        if(top == -1)
            return -1;
        else
            return stack[top];
    }

    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }

}
