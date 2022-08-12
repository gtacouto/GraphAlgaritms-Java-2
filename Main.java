class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Graph g1 = new Graph (4);
    g1.addEdge(0, 1, 3);
    g1.addEdge(1, 0, 3);
    g1.addEdge(0, 3, 4);
    g1.addEdge(0, 4, 1);
    
    System.out.println(g1.degree(0)); //Graph@
  }
}