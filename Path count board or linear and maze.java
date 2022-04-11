public class Jp{

    public static void main(String[] args){

        int x = countPathLinear(0, 10);
        System.out.println("Linear Path Count: " + x);
        x = countPathMaze(4, 0, 0);
        System.out.println("Maze Path Count: " + x);
        x = countPathMazeNXM(4, 3, 0, 0);
        System.out.println("Maze Path With N Rows & M Columns Count: " + x);

    }

    public static int countPathLinear(int start, int end){

        if(start == end)
            return 1;

        if(start > end)
            return 0;

        int count = 0;

        for(int i=1; i<=6; i++){
            count += countPathLinear(start + i, end);
        }

        return count;

    }

    public static int countPathMaze(int n, int i, int j){

        // It can only move in right and bottom directions

        if(i == n-1 && j == n-1)
            return 1;

        if(i >= n || j >= n)
            return 0;

        return countPathMaze(n, i+1, j) + countPathMaze(n, i, j+1);
        

    }

    public static int countPathMazeNXM(int n, int m, int i, int j){

        // It can only move in right and bottom directions

        if(i == n-1 && j == m-1)
            return 1;

        if(i >= n || j >= m)
            return 0;

        return countPathMazeNXM(n, m, i+1, j) + countPathMazeNXM(n, m, i, j+1);

    }

}
