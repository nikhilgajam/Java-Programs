import java.util.*;

public class Jp{

    public static void main(String[] args){
        
        int[] arr = {76, 84, 43, 37, 41, 31, 4, 2, 3, 1};
        List<Integer> x = leadersInArray(arr);
        System.out.println(x);
        Collections.reverse(x);  // Reversing the list
        System.out.println(x);

    }
    

    public static LinkedList<Integer> leadersInArray(int[] arr){

        // If left number is greater than all other right elements then it is called as leader (last element in array is always leader)

        LinkedList<Integer> list = new LinkedList<>();

        int j = 0;
        list.add(arr[arr.length-1]);  // Adding last element because it is a leader every time

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] > list.get(j)){
                list.add(arr[i]);
                j++;
            }
        }

        return list;

    }





}
