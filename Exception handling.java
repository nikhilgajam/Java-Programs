public class Jp {

    public static void main(String[] args) throws Exception {

        // throws Exception will work as try to a method

        try{
            System.out.println("Try");
        }
        catch (Exception ex){
            // Exception ex means an object of exception class which includes all kinds of exceptions
            // This block will run when an error is encountered
            ex.printStackTrace();
            // ex.printStackTrace() will print the error but will not cause the program to stop
        }
        finally {
            System.out.println("This will execute irrespective of error");
        }
    }
}
