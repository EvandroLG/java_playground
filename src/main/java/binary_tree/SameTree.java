package binary_tree;

class SameTree {
  public static void main(String[] args) {
    final var root1 = new TreeNode(3);
    root1.left = new TreeNode(9);
    root1.right = new TreeNode(20);

    final var root2 = new TreeNode(3);
    root2.left = new TreeNode(9);
    root2.right = new TreeNode(20);

    System.out.println(solution(root1, root2));
  }

  private static boolean solution(TreeNode node1, TreeNode node2) {
    if (node1 == null && node2 == null) {
      return true;
    }

    if (node1 == null || node2 == null) {
      return false;
    }

    if (node1.value != node2.value) {
      return false;
    }

    final var left = solution(node1.left, node2.left);
    final var right = solution(node1.right, node2.right);

    return left && right;
  }
}
