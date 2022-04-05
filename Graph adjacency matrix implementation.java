import java.util.ArrayList;

public class Jp{

    public static void main(String[] args){

        // Using Arrays Static Implementation
        GraphAdjacencyMatrix g = new GraphAdjacencyMatrix(4, 4);
        g.undirectedAddNode(1, 2);
        g.undirectedAddNode(1, 3);
        g.undirectedAddNode(2, 3);
        g.directedAddNode(0, 1);
        g.display();
        g.isEdgePresent(0, 1);
        g.directedDeleteNode(0, 1);
        g.isEdgePresent(0, 1);
        g.display();

        System.out.println();

        // Using ArrayList Dynamic Implementation
        GraphAdjacencyMatrixArrayList gl = new GraphAdjacencyMatrixArrayList(4, 4);
        gl.undirectedAddNode(1, 2);
        gl.undirectedAddNode(1, 3);
        gl.undirectedAddNode(2, 3);
        gl.directedAddNode(0, 1);
        gl.display();
        gl.isEdgePresent(0, 1);
        gl.directedDeleteNode(0, 1);
        gl.isEdgePresent(0, 1);
        gl.display();


    }

}


class GraphAdjacencyMatrix{

    int rows, cols;
    int[][] graph;
    
    public GraphAdjacencyMatrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        graph = new int[rows][cols];
    }

    public void undirectedAddNode(int i, int j){
        graph[i][j] = 1;
        graph[j][i] = 1;
    }

    public void directedAddNode(int i, int j){
        graph[i][j] = 1;
    }

    public void undirectedDeleteNode(int i, int j){
        graph[i][j] = 0;
        graph[j][i] = 0;
    }

    public void directedDeleteNode(int i, int j){
        graph[i][j] = 0;
    }

    public boolean isEdgePresent(int i, int j){
        if(graph[i][j] == 1){
            System.out.println("There is an edge between " + i + " and " + j);
            return true;
        }else{
            System.out.println("There is no edge between " + i + " and " + j);
            return false;
        }
    }

    public void display(){

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

    }

}


class GraphAdjacencyMatrixArrayList{

    int rows, cols;
    ArrayList<ArrayList<Integer>> graph;

    public GraphAdjacencyMatrixArrayList(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<rows; i++){
            graph.add(new ArrayList<Integer>());
            for(int j=0; j<cols; j++){
                graph.get(i).add(j, 0);
            }
        }

    }

    public void undirectedAddNode(int i, int j){
        graph.get(i).add(j, 1);
        graph.get(j).add(i, 1);
    }

    public void directedAddNode(int i, int j){
        graph.get(i).add(j, 1);
    }

    public void undirectedDeleteNode(int i, int j){
        graph.get(i).add(j, 0);
        graph.get(j).add(i, 0);
    }

    public void directedDeleteNode(int i, int j){
        graph.get(i).add(j, 0);
    }

    public boolean isEdgePresent(int i, int j){
        if(graph.get(i).get(j) == 1){
            System.out.println("There is an edge between " + i + " and " + j);
            return true;
        }else{
            System.out.println("There is no edge between " + i + " and " + j);
            return false;
        }
    }

    public void display(){

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

}
