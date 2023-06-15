import java.util.Iterator;
import java.util.LinkedList;

public class DFSTraversal {
    private LinkedList<Integer> Adjency[];
    private boolean visited[];

    DFSTraversal(int n) {
        Adjency = new LinkedList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            Adjency[i] = new LinkedList<Integer>();
        }
    }

    void insertEdge(int src, int dest) {
        Adjency[src].add(dest);
    }

    void DFS(int V) {
        visited[V] = true;
        System.out.print(V + " ");

        Iterator<Integer> it = Adjency[V].listIterator();
        while (it.hasNext()) {
            int nodeV = it.next();
            if (!visited[nodeV]) {
                DFS(nodeV);
            }
        }

    }

    public static void main(String args[]) {
        DFSTraversal graph = new DFSTraversal(12);
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

        System.out.println("Depth First Traversal for the graph is:");
        graph.DFS(1);
    }
}