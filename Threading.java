import java.util.Random;

public class Jp {

    public static void main(String[] args){

        // Threading will make use of multi threads present in CPU

        System.out.println("Threading\n");

        Thread t1 = new Thread(new Hello("one"));
        Thread t2 = new Thread(new Hello("two"));
        Thread t3 = new Thread(new Hello("three"));

        t1.start();
        t2.start();
        t3.start();


        Thread one = new Thread(new One());
        one.start();

        Thread hundred = new Thread(new Hundred());
        hundred.start();

    }

}

class Hello implements Runnable{

    Random r = new Random();
    String name;
    int time;


    public Hello(String str){

        name = str;
        time = r.nextInt(1000);  // 1000 milliseconds is 1 second

    }

    @Override
    public void run() {

        System.out.printf("%s is waiting for %d milliseconds\n", name, time);
        try{
            Thread.sleep(time);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println(name + " is done processing");

    }
}

class One implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<=1000; i++){

            System.out.println(1);

        }
    }
}

class Hundred implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<=1000; i++){

            System.out.println(100);

        }
    }
}
