package dynamic_programming;

import java.util.HashMap;

public class Fibonacci {

    public static void main(String[] args) {
        int result = solution(800);
        System.out.println("fib 800" + result);
    }

    public static int solution(int i) {
        return solution(i, new HashMap<Integer, Integer>());
    }

    public static int solution(int n, HashMap<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (!memo.containsKey(n)) {
            int result = solution(n - 1, memo) + solution(n - 2, memo);
            memo.put(n, result);
        }

        return memo.get(n);
    }
}
