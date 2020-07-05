public class Jp {

    public static void main(String[] args) {

        String s = "Hello, World";

        String[] arr = s.split(",");  // CSV(Comma Separated Values)


        for(String x: arr){

            System.out.println(x.trim());

        }


    }

}
