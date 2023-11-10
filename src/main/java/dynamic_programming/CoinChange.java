package dynamic_programming;

import java.sql.Array;
import java.util.*;

public class CoinChange {
    public static void main(String[] args) {
        int result = solution(new int[]{ 1, 2, 5 }, 11);
        System.out.println(result);
    }

    public static int solution(int[] coins, int amount) {
        return solution(coins, amount, new HashMap<>());
    }

    public static int solution(int[] coins, int amount, HashMap<Integer, Integer> memo) {
        if (amount < 0) {
            return -1;
        }

        if (amount == 0) {
            return 0;
        }

        int min = -1;
        for (Integer coin : coins) {
            int result = solution(coins, amount - coin, memo);

            if (result != -1) {
                int total = result + 1;

                if (total < min || min == -1) {
                    min = total;
                }
            }
        }

        return min;
    }
}
