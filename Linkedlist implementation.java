public class Jp{

    public static void main(String[] args){

        LinkedList l = new LinkedList();
        l.insert_e(1);
        l.insert_e(10);
        l.insert_e(100);
        l.insert_e(10001);
        l.insert_i(5, 99);
        l.remove_i(0);
        l.display();

    }

}


class Node{
    int data;
    Node next = null;
    public Node(int data){
        this.data = data;
    }
}

class LinkedList{

    Node head = null;

    public void insert_s(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void insert_e(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }else{
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newnode;
        }
    }

    public void insert_i(int index, int data){
        Node newnode = new Node(data);
        if(index == 0 || head == null){
            newnode.next = head;
            head = newnode;
        }else{
            Node temp = head;
            int i=1;
            while(temp.next != null && index != i){
                temp = temp.next;
                i++;
            }

            newnode.next = temp.next;
            temp.next = newnode;
            
        }

    }

    public void remove_s(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head.next;
        head = null;
        head = temp;
    }

    public void remove_e(){
        if(head.next == null){  // To avoid null pointer exception when removing the only index which is present
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    public void remove_i(int index){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(index == 0){
            head = head.next;
            return;
        }

        Node temp = head;
        int i=1;
        while(temp.next != null && index != i){
            temp = temp.next;
            i++;
        }

        if(temp != null && temp.next != null)   // To avoid null pointer exception when removing last element which is not there
            temp.next = temp.next.next;
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
