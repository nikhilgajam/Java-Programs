public class Jp {

    public static void main(String[] args){
        // We can replace a world by using replace method

        String str = "Hello World";
        str = str.replace("World", "Here");
        System.out.println(str);


        // We can replace all words in a string by replaceAll method


        str = "Hello world world world World";
        str = str.replaceAll("world", "Here");
        System.out.println(str);

    }

}
