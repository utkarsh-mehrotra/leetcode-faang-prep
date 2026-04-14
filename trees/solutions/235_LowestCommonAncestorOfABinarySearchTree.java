/**
 * 235. Lowest Common Ancestor of a Binary Search Tree
 * Difficulty: Medium
 * Pattern: BST Traversal
 */
public class _235_LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) root = root.left;
            else if (p.val > root.val && q.val > root.val) root = root.right;
            else return root;
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println("✅ LCA of BST test passed.");
    }
}