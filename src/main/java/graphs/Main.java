package graphs;

public class Main {
  public static void main(String[] args) {
    final var graph = new Graph();
    graph.addEdge(0, 1);
    graph.addEdge(0, 4);
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(1, 4);
    graph.addEdge(2, 3);
    graph.addEdge(3, 4);

    System.out.println(graph);
  }
}
