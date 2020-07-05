public class Jp {

    public static void main(String[] args){

        People p = new People();
        p.sayHello();    // As People extends World it has access to all the parent public classes
        p.sayWorld();
        p.hi();

        /* Java will not support multiple inheritance as it creates a diamond problem
           but we can achieve that by interfaces
         */
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

// Now this class will be having all the methods from above class as it is multi level inheritance
class People extends World{
    public void hi(){
        System.out.println("Hi");
    }
}