public class Jp {

    public static void main(String[] args){

        World w = new World();
        w.sayHello();    // As World extends Hello it has access to all the parent public classes
        w.sayWorld();


    }

}

class Hello{
    public void sayHello(){
        System.out.println("Hello");
    }
}

// In java to inherit we use extends keyword
class World extends Hello{
    public void sayWorld(){
        System.out.println("World");
    }
}