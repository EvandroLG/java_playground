package binary_tree;

class InvertTree {
  public static void main(String[] args) {
    final var root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);

    System.out.println(solution(root));
  }

  private static TreeNode solution(TreeNode root) {
    invertTree(root);
    return root;
  }

  private static void invertTree(TreeNode node) {
    if (node == null) {
      return;
    }

    final var left = node.left;
    node.left = node.right;
    node.right = left;

    invertTree(node.left);
    invertTree(node.right);
  }
}
