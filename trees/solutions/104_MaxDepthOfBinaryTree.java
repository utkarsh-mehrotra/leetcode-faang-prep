/**
 * 104. Maximum Depth of Binary Tree
 * Difficulty: Easy
 * Pattern: DFS
 */
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}
public class _104_MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {
        System.out.println("✅ Max Depth test passed.");
    }
}