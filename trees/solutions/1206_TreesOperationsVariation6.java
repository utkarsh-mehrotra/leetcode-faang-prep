import java.util.*;
class _1206_TreesOperationsVariation6 {
    static class TreeNode { int val; TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
    public List<Integer> solve(TreeNode root) {
        // Binary Tree Inorder Traversal (Morris Traversal O(1) space)
        List<Integer> res = new ArrayList<>();
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left == null) {
                res.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode pre = curr.left;
                while (pre.right != null && pre.right != curr) pre = pre.right;
                if (pre.right == null) {
                    pre.right = curr;
                    curr = curr.left;
                } else {
                    pre.right = null;
                    res.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {}
}
