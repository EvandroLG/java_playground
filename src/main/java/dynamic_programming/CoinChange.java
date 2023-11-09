package dynamic_programming;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CoinChange {
    public static void main(String[] args) {
        int result = solution(new int[]{ 1, 2, 5 }, 11);
        System.out.println(result);
    }

    public static int solution(int[] coins, int amount) {
        return solution(coins, amount, 0, new HashSet<>());
    }

    public static int solution(int[] coins, int amount, int totalCoins, HashSet<Integer> memo) {
        if (amount < 0) {
            return -1;
        }

        if (amount == 0) {
            return totalCoins;
        }

        for (Integer coin : coins) {
            int result = solution(coins, amount - coin, totalCoins + 1, memo);
            memo.add(result);
        }

        memo.remove(-1);

        try {
            return Collections.min(memo);
        } catch (Exception e) {
            return -1;
        }
    }
}
