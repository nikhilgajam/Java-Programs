import java.util.Random;
import java.util.Scanner;

public class Jp {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Rock Paper Scissors Game\n");
        int choice=0;

        RockPaperScissors r = new RockPaperScissors();

        while (true){
            try{
                System.out.print("\nEnter 1(Rock), 2 (Paper), 3(Scissor), 0(Reset): ");
                choice = in.nextInt();
            }catch (Exception ex){
                System.out.println("\nEnter Only Numbers");
            }

            switch (choice){
                case 1:
                    r.rock();
                    break;
                case 2:
                    r.paper();
                    break;
                case 3:
                    r.scissors();
                    break;
                case 0:
                    r.done();
                    return;
                default:
                    System.out.println("Please enter 1(Rock), 2 (Paper), 3(Scissor), 0(Reset) Only");
            }

        }

    }

}

class RockPaperScissors{

    long user = 0, comp = 0, count=1;


    public void rock(){

        game(1);
    }

    public void paper(){

        game(2);
    }

    public void scissors(){

        game(3);
    }

    public void done(){

        System.out.println("\nYou got: " + user + " point(s)");
        System.out.println("Computer got: " + comp + " point(s)");
        System.out.println("Total Iterations: " + count);

        if(user == comp){
            System.out.println("\nTie");
        }else if(user > comp){
            System.out.println("\nYou won the game");
        }else {
            System.out.println("\nComputer won the game");
        }

        user = comp = 0;
    }

    public void game(int entered){

        count++;

        Random r = new Random();
        int rand = r.nextInt(3) + 1;

        if(entered == rand){
            System.out.println("\n>>> Tie");
        }else if(rand == 1 && entered == 2){
            System.out.println("\n>>> You Got A Point: Paper Covered The Rock");
            user++;
        }else if(rand == 2 && entered == 1){
            System.out.println("\n>>> Computer Got A Point: Paper Covered The Rock");
            comp++;
        }else if(rand == 3 && entered == 1){
            System.out.println("\n>>> You Got A Point: Rock Smashed The Scissors");
            user++;
        }else if(rand == 1 && entered == 3){
            System.out.println("\n>>> Computer Got A Point: Rock Smashed The Scissors");
            comp++;
        }else if(rand == 2 && entered == 3){
            System.out.println("\n>>> You Got A Point: Scissors Cuts The Paper");
            user++;
        }else if(rand == 3 && entered == 2){
            System.out.println("\n>>> Computer Got A Point: Scissors Cuts The Paper");
            comp++;
        }

    }

}
