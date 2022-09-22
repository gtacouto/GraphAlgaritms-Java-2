class Main {
  public static void main(String[] args) {
    Graph g1 = new Graph(5);
    g1.addEdge(0, 2, 2);
    g1.addEdge(0, 1, 6);
    g1.addEdge(1, 2, 3);
    g1.addEdge(2, 1, 2);
    g1.addEdge(1, 3, 1);
    g1.addEdge(2, 3, 5);
    g1.addEdge(1, 4, 3);
    g1.addEdge(3, 4, 3);

    g1.dijkstra(1);
  }
}