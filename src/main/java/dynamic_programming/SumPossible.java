package dynamic_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SumPossible {
    public static void main(String[] args) {
        System.out.println(solution(new ArrayList<>(List.of(1, 2, 3)), 4));
        System.out.println(solution(new ArrayList<>(List.of(4, 6, 10)), 15));
    }

    public static boolean solution(ArrayList<Integer> items, int target) {
        return solution(items, target, 0, new HashMap<>());
    }

    public static boolean solution(ArrayList<Integer> items, int target, int total, HashMap<Integer, Boolean> memo) {
        if (total == target) {
            return true;
        }

        if (total > target) {
            return false;
        }

        for (Integer item : items) {
            int key = item + total;

            if (!memo.containsKey(key)) {
                Boolean result = solution(items, target, item + total, memo);
                memo.put(key, result);
            }

            if (memo.get(key)) {
                return true;
            }
        }

        return false;
    }
}
