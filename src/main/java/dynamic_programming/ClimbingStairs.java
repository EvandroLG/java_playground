package dynamic_programming;

import java.util.HashMap;

public class ClimbingStairs {
  public static void main(String[] args) {
    int result = solution(3);
    System.out.println(result);
  }

  public static int solution(int n) {
    return solution(n, new HashMap<>());
  }

  public static int solution(int n, HashMap<Integer, Integer> memo) {
    if (n < 0) {
      return 0;
    }

    if (n == 0) {
      return 1;
    }

    if (memo.containsKey(n)) {
      return memo.get(n);
    }

    int result = solution(n - 1, memo) + solution(n - 2, memo);
    memo.put(n, result);

    return result;
  }
}
