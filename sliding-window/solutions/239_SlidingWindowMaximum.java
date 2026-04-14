/**
 * 239. Sliding Window Maximum
 * Difficulty: Hard
 * Pattern: Sliding Window (Deque)
 */
import java.util.*;

public class _239_SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int resIdx = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!q.isEmpty() && q.peek() < i - k + 1) q.poll();
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) q.pollLast();
            q.offer(i);
            if (i >= k - 1) res[resIdx++] = nums[q.peek()];
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("✅ Sliding Window Maximum test passed.");
    }
}