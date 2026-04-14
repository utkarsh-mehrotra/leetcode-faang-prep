import java.util.*;
class _1210_TreesOperationsVariation10 {
    static class TreeNode { int val; TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
    public List<Integer> solve(TreeNode root) {
        // Binary Tree Right Side View
        List<Integer> res = new ArrayList<>();
        rightView(root, res, 0);
        return res;
    }
    private void rightView(TreeNode curr, List<Integer> res, int depth) {
        if (curr == null) return;
        if (depth == res.size()) res.add(curr.val);
        rightView(curr.right, res, depth + 1);
        rightView(curr.left, res, depth + 1);
    }
    public static void main(String[] args) {}
}
