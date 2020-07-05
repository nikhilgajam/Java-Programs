import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Jp {

    public static void main(String[] args){

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        String[] arr = {"Hello", "World", "OK", "Done"};
        String[] arr1 = {"OK", "Done"};

        for(String x: arr){
            list1.add(x);
        }

        // These are valid things to copy to ArrayList

        Collections.addAll(list2, arr1);

        for(String x: list1){
            System.out.println(x);
        }

        edit_list(list1, list2);

        System.out.println();

        for(String x: list1){
            System.out.println(x);
        }


    }


    public static void edit_list(Collection<String> l1, Collection<String> l2){
        // We can also keep ArrayList instead of Collections

        Iterator<String> it = l1.iterator();

        while (it.hasNext()){
            if(l2.contains(it.next())){
                it.remove();
            }
        }


        // l1.removeIf(l2::contains); We can write like this also


    }


}
