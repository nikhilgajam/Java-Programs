import java.util.Date;

public class Jp {

    public static void main(String[] args){

        Date d = new Date();

        System.out.println(d.toString());
        // Proper Date And Time

        System.out.println(d.getTime());
        // This will give number of milliseconds that have elapsed in January 1, 1970

        String dt = d.toString();

        String[] arr = dt.split(" ");

        for(String s: arr){
            System.out.println(s);
        }

    }
}
