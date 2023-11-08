package dynamic_programming;

import java.util.HashMap;

public class Tribonacci {
    public static void main(String[] args) {
        int result = solution(4);
        System.out.println("trib 4: " + result);
    }

    public static int solution(int n) {
        return solution(n, new HashMap<>());
    }

    public static int solution(int n, HashMap<Integer, Integer> memo) {
        if (n == 0) {
            return 0;
        }

        if (n <= 2) {
            return 1;
        }

        if (!memo.containsKey(n)) {
            int result = solution(n - 1, memo) + solution(n - 2, memo) + solution(n - 3, memo);
            memo.put(n, result);
        }

        return memo.get(n);
    }
}
