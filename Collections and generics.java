import java.util.*;

public class Jp {

    public static void main(String[] args){

        // Collections are Dynamic Arrays inbuilt in Java

        // Collection is an interface ArrayList, LinkedList, PriorityQueue, Vector, HashSet etc implements collection

        Collection arr = new ArrayList();
        arr.add(100);
        arr.add("Hello World");

        // It has methods like hasNext

        for(Object obj: arr){
            System.out.println(obj);
        }

        // We can also access Collection items by iterator also

        Iterator it = arr.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


        ArrayList al = new ArrayList();
        // We can also declare like this

        LinkedList l = new LinkedList();
        // This type of list is implemented by Double Linked List

        HashSet h = new HashSet();
        // This will sort the items in HashSet and it will store the values only once even if you repeat the same value many times

        HashMap<String, String> map = new HashMap<>();
        map.put("Key", "Value");
        System.out.println(map.get("Key"));
        // This will have a key and value pair

        PriorityQueue<String> q = new PriorityQueue<>();
        // It will sorted in ascending order automatically will not allow "null" value

        Vector v = new Vector();
        // It increases its capacity by 100 percent when we reach every 11 element (0-11, 100-111, etc)
        System.out.println("Vector capacity = " + v.capacity());

        v.add(100);
        v.add("Hello World");

        for(Object obj: v){
            System.out.println(obj);
        }



        // Generics is <> in which we can specify which data type values we can have in that Collection

        ArrayList<Integer> a = new ArrayList<>();
        // This will only accept Integers    And we may or may not again specify <Integer>


        // Collections and Generics are used together

    }
}
