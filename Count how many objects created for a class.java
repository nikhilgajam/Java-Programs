public class Jp {

    public static void main(String[] args){

        Counts a = new Counts();
        a.getCount();
        Counts b = new Counts();
        b.getCount();
        Counts c = new Counts();
        c.getCount(); // We can use a or b or c as count is a static class variable

    }

}


class Counts{
    static int count;  // By default class variables will have value zero but can be assigned afterwards

    // Constructors will be called immediately after we create a object and it will have same name as class
    Counts(){
        this.count++;
    }

    public void getCount(){
        System.out.println(count);
    }
    
}