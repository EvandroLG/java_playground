package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
  private final Map<Integer, List<Integer>> graph = new HashMap<>();

  public void addVertex(int vertex) {
    if (!graph.containsKey(vertex)) {
      graph.put(vertex, new ArrayList<>()); // Use ArrayList instead of List.of()
    }
  }

  public void addEdge(int source, int destination) {
    addVertex(source);
    addVertex(destination);

    graph.get(source).add(destination);
    graph.get(destination).add(source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (var v : graph.keySet()) {
      sb.append(v.toString() + ": ");

      for (var n : graph.get(v)) {
        sb.append(n.toString() + " ");
      }

      sb.append("\n");
    }

    return sb.toString();
  }
}
