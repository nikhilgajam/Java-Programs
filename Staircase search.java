import java.util.Scanner;

public class Jp{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int k = 0;
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int target_num = scan.nextInt();

        staircaseSearch(r, c, arr, target_num);

    }

    public static void staircaseSearch(int r, int c, int[][] arr, int target){

        int k = 0;
        int i = 0;
        int j = c-1;
        while(k < (r+c)){
            if(arr[i][j] == target){
                System.out.println("It is there");
                return;
            }else if(arr[i][j] > target){
                j--;
                if(j < 0)
                    break;
            }else{
                i++;
                if(i >= r)
                    break;
            }
            k++;
        }

        System.out.println("It is not there");

    }

}
