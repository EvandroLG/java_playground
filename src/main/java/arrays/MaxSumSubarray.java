package arrays;

public class MaxSumSubarray {
  public static void main(String[] args) {
    System.out.println(findMaxSumSubarray(new int[] {2, 1, 5, 1, 3, 2}, 3));
    System.out.println(findMaxSumSubarray(new int[] {2, 3, 4, 1, 5}, 2));
  }

  public static int findMaxSumSubarray(int[] arr, int k) {
    int max = Integer.MIN_VALUE;
    int tmp = 0;

    for (int i = 0; i < arr.length; i++) {
      tmp += arr[i];

      if (i >= k - 1) {
        max = Math.max(max, tmp);
        tmp -= arr[i - (k - 1)];
      }
    }

    return max;
  }
}
