public class Graph {

  private int countNodes;
  private int countEdges;
  private int[][] adjMatrix;

  public Graph(int numNodes) {
    this.countNodes = numNodes;
    this.countEdges = 0;
    this.adjMatrix = new int[numNodes][numNodes];
  }

  public void addEdge(int source, int sink, int weight) {
    if (source < 0 || source > this.adjMatrix.length - 1 ||
        (sink < 0 || sink > this.adjMatrix.length - 1) || weight <= 0) {
      System.err.println("Invalid edge: " + source + sink + weight);
      return;
    }
    this.countEdges++;
    this.adjMatrix[source][sink] = weight;
  }

  public int degree(int node) {
    int degree = 0;
    for (int j = 0; j < this.adjMatrix[node].length; ++j) {
      if (adjMatrix[node][j] != 0) {
        ++degree;
      }
    }
    return degree;
  }

  public int highestDegree() {
    int highest = 0;
    for (int i = 0; i < this.adjMatrix.length; ++i) {
      int degreeI = degree(i);
      if (degreeI > highest) {
        highest = degreeI;
      }
    }
    return highest;
  }

  public int lowestDegree() {
    int lowest = 0;
    for (int i = 0; i < this.adjMatrix.length; ++i) {
      int degreeI = degree(i);
      if (degreeI > lowest) {
        lowest = degreeI;
      }
    }
    return lowest;
  }

  public Graph complement() {
    Graph aux = new Graph(this.adjMatrix.length);
    for (int i = 0; i < this.adjMatrix.length; ++i) {
      for (int j = 0; j < this.adjMatrix[i].length; ++j) {
        if (this.adjMatrix[i][j] == 0 && i != j) {
          aux.addEdge(i, j, 1);
        }
      }
    }
    return aux;
  }

  public boolean subgraph(Graph g2) {

    if (g2.countEdges > this.countEdges || g2.countEdges > this.countNodes) {
      return false;
    }
    for (int i = 0; i < g2.adjMatrix.length; ++i) {
      for (int j = 0; j < g2.adjMatrix.length; ++j) {
        if (g2.adjMatrix[i][j] != 0 && this.adjMatrix[i][j] == 0) {
          return false;
        }
      }
    }
    return true;

  }

  public String toString() {
    String str = "";
    for (int i = 0; i < this.adjMatrix.length; ++i) {
      for (int j = 0; j < this.adjMatrix.length; ++j) {
        str += this.adjMatrix[i][j] + "\t";
      }
      str += "\n";
    }
    return str;
  }

}