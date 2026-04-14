import java.util.*;
class _1207_TreesOperationsVariation7 {
    static class TreeNode { int val; TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
    public boolean solve(TreeNode root) {
        // Validate Binary Search Tree
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean isValidBST(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
    public static void main(String[] args) {}
}
