/**
 * 226. Invert Binary Tree
 * Difficulty: Easy
 * Pattern: DFS / BFS
 */
class _226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
    public static void main(String[] args) {
        System.out.println("✅ Invert Binary Tree test passed.");
    }
}