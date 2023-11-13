package dynamic_programming;

import java.util.HashMap;
import java.util.List;

public class CountPaths {
    public static void main(String[] args) {
        List<List<String>> grid = List.of(
                List.of("O", "O", "X"),
                List.of("O", "O", "O"),
                List.of("O", "O", "O")
        );

        System.out.println(solution(grid));
    }

    public static int solution(List<List<String>> grid) {
        if (grid.isEmpty()) {
            return 0;
        }

        return solution(grid, 0, 0, new HashMap<>());
    }

    public static int solution(List<List<String>> grid, int row, int col, HashMap<String, Integer> memo) {
        if (row == grid.size()  || col == grid.get(0).size()) {
            return 0;
        }

        if (grid.get(row).get(col).equals("X")) {
            return 0;
        }

        if (row == grid.size() - 1 && col == grid.get(0).size() - 1) {
            return 1;
        }

        String key = row + "-" + col;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int goRight = solution(grid, row, col + 1, memo);
        int goDown = solution(grid, row + 1, col, memo);

        return goRight + goDown;
    }
}
