package arrays;

public class SmallestSubarray {
  public static void main(String[] args) {
    System.out.println(findMinSubarray(new int[] {2, 3, 1, 2, 4, 3}, 7));
    System.out.println(findMinSubarray(new int[] {1, 4, 4}, 4));
    System.out.println(findMinSubarray(new int[] {1, 1, 1, 1, 1, 1, 1, 1}, 11));
  }

  public static int findMinSubarray(int[] arr, int target) {
    int min = Integer.MAX_VALUE;
    int currentSum = 0;
    int p1 = 0;
    int p2 = 0;

    while (p2 < arr.length) {
      currentSum += arr[p2];

      while (currentSum >= target) {
        min = Math.min(min, p2 - p1 + 1);
        currentSum -= arr[p1];
        p1++;
      }

      p2++;
    }

    if (min == Integer.MAX_VALUE) {
      return 0;
    }

    return min;
  }
}
