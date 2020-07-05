public class Jp {

    enum enums_only{

        // Enums are constants which can be used in programs

        Hello,
        World,
        OK;

    }

    enum enum_with_values{

        // We can have as many values as we need but that many arguments should be there in that constructor

        Windows(1, 2),
        Mac(3, 4),
        Linux(5, 6),
        Android(100, 1000);


        int num1, num2;

        enum_with_values(int a, int b){
            num1 = a;
            num2 = b;
        }

        public int getValue(){
            return num1;
        }

        public int getValue1(){
            return num2;
        }

    }

    public static void main(String[] args){

        System.out.print(enums_only.Hello);
        System.out.println(" " + enums_only.World);


        for(enum_with_values value: enum_with_values.values()){

            System.out.printf("%s : %d, %d\n", value, value.getValue(), value.getValue1());

        }


    }

}
