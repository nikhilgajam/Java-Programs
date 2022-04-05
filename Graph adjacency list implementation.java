import java.util.ArrayList;

public class Jp{

    public static void main(String[] args){

        // Using Arrays Static Implementation
        GraphAdjacencyList g = new GraphAdjacencyList(4);
        g.undirectedAddNode(1, 2);
        g.undirectedAddNode(1, 3);
        g.undirectedAddNode(2, 3);
        g.directedAddNode(1, 0);
        g.directedAddNode(0, 1);
        g.display();
        g.isEdgePresent(0, 1);
        g.undirectedDeleteNode(1, 2);
        g.isEdgePresent(0, 1);
        g.display();


    }

}

class GraphAdjacencyList{

    int V;
    ArrayList<ArrayList<Integer>> graph;

    public GraphAdjacencyList(int V){
        this.V = V;
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<V; i++){
            graph.add(new ArrayList<Integer>());
        }

    }

    public void undirectedAddNode(int i, int j){
        graph.get(i).add(j);
        graph.get(j).add(i);
    }

    public void directedAddNode(int i, int j){
        graph.get(i).add(j);
    }

    public void undirectedDeleteNode(int i, int j){
        for(int x=0; x<graph.get(i).size(); x++){
            if(graph.get(i).get(x) == j){
                graph.get(i).remove(x);
                break;
            }
        }
        for(int x=0; x<graph.get(j).size(); x++){
            if(graph.get(j).get(x) == i){
                graph.get(j).remove(x);
                break;
            }
        }
    }

    public void directedDeleteNode(int i, int j){
        for(int x=0; x<graph.get(i).size(); x++){
            if(graph.get(i).get(x) == j){
                graph.get(i).remove(x);
                break;
            }
        }
    }

    public boolean isEdgePresent(int i, int j){
        if(graph.get(i).contains(j)){
            System.out.println("There is an edge between " + i + " and " + j);
            return true;
        }else{
            System.out.println("There is no edge between " + i + " and " + j);
            return false;
        }
    }

    public void display(){

        for(int i=0; i<V; i++){
            System.out.print(i + " -> ");
            for(int j=0; j<graph.get(i).size(); j++){
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

}
