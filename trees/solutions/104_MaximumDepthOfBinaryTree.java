class _104_MaximumDepthOfBinaryTree {
    static class TreeNode { int val; TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
    public int solve(TreeNode root) {
        // Maximum Depth of Binary Tree
        if (root == null) return 0;
        return 1 + Math.max(solve(root.left), solve(root.right));
    }
    public static void main(String[] args) {}
}
