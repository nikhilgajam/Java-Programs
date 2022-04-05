public class Jp {
    
    public static void main(String[] args){

        pythogorianTriplet(28, 45, 53);   // 3, 4, 5 or 5, 4, 3

    }

    public static void pythogorianTriplet(int x, int y, int z){

        // a^2 + b^2 = c^2

        int a = Math.max(x, Math.max(y, z)), b=0, c=0;

        if(a == x){
            b = y; c = z;
        }else if(a == y){
            b = x; c = z;
        }else if(a == z){
            b = x; c = y;
        }

        if(a*a == b*b+c*c){
            System.out.println("It is a Pythagorean Triplet");
        }else{
            System.out.println("It is not a Pythagorian Triplet");
        }

    }

}








