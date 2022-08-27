class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Graph g1 = new Graph(8);
    g1.addEdgeUnoriented(6, 3, 1);
    g1.addEdgeUnoriented(6, 7, 1);
    g1.addEdgeUnoriented(6, 1, 1);
    g1.addEdgeUnoriented(3, 4, 1);
    g1.addEdgeUnoriented(7, 0, 1);
    g1.addEdgeUnoriented(1, 2, 1);
    g1.addEdgeUnoriented(0, 5, 1);
    int s = 2;
    System.out.println(g1.buscaProfundidade(s));
  }
}