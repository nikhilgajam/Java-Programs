public class Jp {

    public static void main(String[] args){

        Hello h = new Hello(100);
        h.getA();

    }

}

class Hello{
    int a;

    // Constructors will be called immediately after we create a object and it will have same name as class
    Hello(int k){
        a = k;
    }

    public void getA(){
        System.out.println(a);
    }
}