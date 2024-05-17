package binary_tree;

class MaxDepth {
  public static void main(String[] args) {
    final var root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    System.out.println(solution(root));
  }

  private static int solution(TreeNode root) {
    if (root == null) {
      return 0;
    }

    return traverse(root, 0);
  }

  private static int traverse(TreeNode node, int depth) {
    if (node == null) {
      return depth;
    }

    final var left = traverse(node.left, depth + 1);
    final var right = traverse(node.right, depth + 1);

    return Math.max(left, right);
  }
}
