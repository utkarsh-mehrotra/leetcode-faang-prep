/**
 * 100. Same Tree
 * Difficulty: Easy
 * Pattern: DFS
 */
class _100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        System.out.println("✅ Same Tree test passed.");
    }
}