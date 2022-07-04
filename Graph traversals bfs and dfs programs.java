import java.util.*;

public class Jp{
    public static void main(String[] args){

        Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("BFS: ");
        g.BFS(2);

        System.out.println("\nDFS: ");
        g.DFS(2);

        System.out.println("\nDisconnected Graph DFS: ");
        g.disconnectedGraphDFS();

    }
}

class Graph{

    private int V;   // No. of vertices
    private LinkedList<LinkedList<Integer>> adj;   // Adjacency Lists

    Graph(int v){

        V = v;
        adj = new LinkedList<>();
        for(int i=0; i<v; i++){
            adj.add(new LinkedList<Integer>());
        }

    }

    public void addEdge(int v, int w){
        adj.get(v).add(w);
    }

    public void BFS(int s){

        // O(V+E), where V: Vertices & E: Edges

        boolean[] visited = new boolean[V];   // Default is false so no explicit false initialization

        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while(queue.size() != 0){

            s = queue.poll();   // poll() removes and returns head of the list
            System.out.print(s + " ");

            for(int i: adj.get(s)){
                if(visited[i] == false){
                    queue.add(i);
                    visited[i] = true;
                }
            }

        }

    }

    public void DFSUtil(int v, boolean[] visited){

        visited[v] = true;
        System.out.print(v + " ");

        for(int i: adj.get(v)){
            if(visited[i] == false){
                DFSUtil(i, visited);
            }
        }

    }

    public void DFS(int v){

        // O(V+E), where V: Vertices & E: Edges

        boolean[] visited = new boolean[V];
        DFSUtil(v, visited);

    }

    public void disconnectedGraphDFS(){

        // O(V+E), where V: Vertices & E: Edges

        boolean[] visited = new boolean[V];
        for(int i=0; i<V; i++){
            if(visited[i] == false){
                DFSUtil(i, visited);
            }
        }

    }


}
