public class Jp {

    public static void main(String[] args) {

        System.out.println("Wrapper Classes");
        int x = 100;

        // The alternative objects of Primitive Data Types are called as Wrapper Classes

        Integer y = new Integer(x); // Wrapping or Boxing
        Integer z = x;              // Auto Wrapping or Auto Boxing

        int k = y.intValue();       // Unwrapping or Unboxing
        int l = z;                  // Auto Unwrapping or Auto Unboxing

        // Ex: int & Integer, double & Double, byte & Byte etc

    }

}
