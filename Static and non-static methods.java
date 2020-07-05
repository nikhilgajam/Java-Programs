public class Jp {

    public static void main(String[] args){

        // Static methods are used to avoid creating object to access particular method

        // If print() is not static method then we need to declare jp obj = new jp();
        print();

        // Static methods in other classes can be accessed using (class_name.method_name)
        Prints.printing();

        // Example Non-static method
        Prints p = new Prints();
        p.hello();

    }

    static void print(){
        System.out.println("Static Method In Java");
    }

}


class Prints{
    public void hello(){
        System.out.println("Hello World");
    }

    static void printing(){
        System.out.println("Printing...");
    }
}
