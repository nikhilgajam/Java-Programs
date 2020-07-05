import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;


public class Jp {

    public static void main(String[] args) throws Exception{

        System.out.println("Object Serialization\n");

        Hello h = new Hello();
        h.world = 100;


        File path = new File("obj_ser.txt");

        FileOutputStream w = new FileOutputStream(path);
        ObjectOutputStream obj_w = new ObjectOutputStream(w);
        obj_w.writeObject(h);


        FileInputStream r = new FileInputStream(path);
        ObjectInputStream obj_r = new ObjectInputStream(r);
        Hello hc = (Hello) obj_r.readObject();   // New object with h values

        System.out.println("Retrieved value: " + hc.world);


    }

}

class Hello implements Serializable {

    // In order to write or do anything with the object it needs to implement Serializable Interface due to java is a secure language
    int world;

}
