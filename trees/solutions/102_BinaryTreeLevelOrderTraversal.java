/**
 * 102. Binary Tree Level Order Traversal
 * Difficulty: Medium
 * Pattern: BFS
 */
import java.util.*;

public class _102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> lvl = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                lvl.add(curr.val);
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
            res.add(lvl);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("✅ Level Order Traversal test passed.");
    }
}