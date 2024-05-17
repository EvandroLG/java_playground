package binary_tree;

class Symmetric {
  public static void main(String[] args) {
    final var root = new TreeNode(3);
    root.left = new TreeNode(20);
    root.right = new TreeNode(20);

    System.out.println(solution(root));
  }

  private static boolean solution(TreeNode node) {
    if (node == null) {
      return true;
    }

    return isSymmetric(node.left, node.right);
  }

  private static boolean isSymmetric(TreeNode node1, TreeNode node2) {
    if (node1 == null && node2 == null) {
      return true;
    }

    if (node1 == null || node2 == null) {
      return false;
    }

    if (node1.value != node2.value) {
      return false;
    }

    return (isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left));
  }
}
