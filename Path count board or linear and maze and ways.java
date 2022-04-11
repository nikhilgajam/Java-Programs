public class Jp{

    public static void main(String[] args){

        int x = countPathLinear(0, 10);
        System.out.println("Linear Path Count: " + x);
        x = countPathMaze(4, 0, 0);
        System.out.println("Maze Path Count: " + x);
        x = countPathMazeNXM(4, 3, 0, 0);
        System.out.println("Maze Path With N Rows & M Columns Count: " + x);
        x = friendsPairing(4);
        System.out.println("Pairing friends ways: " + x);
        x = tilingWays(4);
        System.out.println("Tiling Ways Count: " + x);

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

    public static int friendsPairing(int n){

        // If we want to pair a person with another we will have n-2 but how many ways i.e., n-1 ways
        if(n == 0 || n == 1 || n == 2)
            return n;

        return friendsPairing(n-1) + friendsPairing(n-2)*(n-1);

    }

    public static int tilingWays(int n){

        // If we place a tile vertically then n-1 or horizontally then n-2 ways (So it is fibonacci program)
        if(n == 0 || n == 1)
            return n;

        return tilingWays(n-1) + tilingWays(n-2);

    }

}
