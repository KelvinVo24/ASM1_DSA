import java.util.LinkedList;

class Graph_BinhVVT_BD00283 {
    private int vertices;
    private LinkedList<Integer> adjacencyList[];

    Graph_BinhVVT_BD00283(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i) {
            adjacencyList[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adjacencyList[v].add(w); // O(1)
    }

    void BFS(int startVertex) {
        boolean visited[] = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (queue.size() != 0) {
            startVertex = queue.poll(); // O(1)
            System.out.print(startVertex + " ");

            for (Integer neighbor : adjacencyList[startVertex]) { // O(V + E)
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String args[]) {
        Graph_BinhVVT_BD00283 g = new Graph_BinhVVT_BD00283(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Breadth First Traversal starting from vertex 2 are:");
        g.BFS(2); // O(V + E)
    }
}
