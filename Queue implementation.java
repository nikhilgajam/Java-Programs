import java.util.Scanner;

public class Jp{

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        Queue q = new Queue();
        int x;

        while(true){
            
            System.out.print("\n1.Enqueue 2.Dequeue 3.Peek 4.isEmpty 0.Quit\n: ");
            x = scan.nextInt();

            if(x == 1){
                System.out.print("Enter value to enqueue (-1 == Queue Overflow): ");
                System.out.println(q.enqueue(scan.nextInt()));
            }else if(x == 2){
                System.out.print("Dequeued value (-1 == Queue Underflow): ");
                System.out.println(q.dequeue());
            }else if(x == 3){
                System.out.print("Peek: ");
                System.out.println(q.peek());
            }else if(x == 4){
                System.out.print("isEmpty: ");
                System.out.println(q.isEmpty());
            }else if(x == 0){
                break;
            }

        }

    }

}

class Queue{

    int front, back, n = 5;
    int[] queue;

    public Queue(){
        front = back = -1;
        queue = new int[n];
    }

    public int enqueue(int data){
        if(back == n-1){
            return -1;
        }else{
            queue[++back] = data;
            if(front == -1)
                front++;

            return data;
        }
    }

    public int dequeue(){
        if(front == -1 || front > back)
            return -1;
        else
            return queue[front++];
    }

    public int peek(){
        if(front == -1 || front > back)
            return -1;
        else
            return queue[front];
    }

    public boolean isEmpty(){
        if(front == -1 || front > back)
            return true;
        else
            return false;
    }

}
