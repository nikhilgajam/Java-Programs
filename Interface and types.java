public class Jp {

    public static void main(String[] args){

        A a = new A();
        a.say();

    }

}

// Interfaces also cannot be instantiated like abstract classes
interface Marker{
    // Interface without methods is called as Marker Interface
}

interface SAM{
    // SAM or Single Abstraction Method Interface. It is also called as functional interface
    void print();  // This already consists public abstract by default
}

interface Normal{
    default void say(){   // In order to have a method with implementation we should use default keyword
        System.out.println("Hello World");
    }
}

class A implements Normal{

}