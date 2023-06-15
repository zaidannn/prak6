import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> que;
    
    BFSTraversal(int v){
        node = v;
        adj = new LinkedList[node];
        for (int i=0; i<v; i++){
            adj[i] =  new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }
    
    void insertEdge (int v, int w){
        adj[v].add(w);
    }
    void BFS (int n){
        boolean nodes [] = new boolean [node];
        int a = 0;
        nodes[n] = true;
        que.add(n);
    
        while (que.size() !=0){
            n = que.poll();
            System.out.println(n+" ");
            for (int i=0; i < adj[n].size(); i++){
                a = adj[n].get(i);
                if (!nodes[a]){
                    nodes [a] = true;
                    que.add(a);
                }
            }
        }
    }
    
    public static void main (String args []){
        BFSTraversal graph = new BFSTraversal(12);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 4);
        graph.insertEdge(2, 1);
        graph.insertEdge(2, 5);
        graph.insertEdge(4, 6);
        graph.insertEdge(5, 2);
        graph.insertEdge(5, 3);
        graph.insertEdge(5, 9);
        graph.insertEdge(5, 7);
        graph.insertEdge(6, 7);
        graph.insertEdge(7, 6);
        graph.insertEdge(7, 11);
        graph.insertEdge(8, 9);
        graph.insertEdge(8, 11);
        graph.insertEdge(9, 8);
        graph.insertEdge(9, 5);
        graph.insertEdge(11, 10);
        graph.insertEdge(11, 7);
        
        System.out.println("Breadth First Traversal for the graph is:");
        graph.BFS(1);
    }
}