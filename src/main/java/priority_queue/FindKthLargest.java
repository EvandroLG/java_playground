package priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargest {
  public static void main(String[] args) {
    final var arr = new int[] {3, 2, 1, 5, 6, 4};
    System.out.println(solution(arr, 2));
  }

  private static int solution(int[] arr, int k) {
    final var pq = new PriorityQueue<Integer>(Collections.reverseOrder());

    for (var item : arr) {
      pq.add(item);
    }

    int result = -1;

    while (k >= 1) {
      result = pq.poll();
      k--;
    }

    return result;
  }
}
