public class Jp {

    public static void main(String[] args){

        Abs a = new Abs();
        a.print();
        a.ok();

    }

}

abstract class A{
    public abstract void print(); // Abstract methods cannot have implementation

    public void ok(){
        System.out.println("OK");
    }

}

class Abs extends A{
    // Abstract class cannot be instantiated (object of abstract class cannot be created)
    // The class which extends abstract classes should have implementation of prototypes in abstract class
    public void print(){
        System.out.println("Now it is working!");
    }
}