import java.util.*;
class _1810_StackQueueOperationsVariation10 {
    public int[] solve(int[] nums, int k) {
        // Sliding Window Maximum (Monotonic Queue)
        if (nums == null || k <= 0) return new int[0];
        int n = nums.length;
        int[] r = new int[n-k+1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i=0; i<n; i++) {
            while (!q.isEmpty() && q.peek() < i - k + 1) q.poll();
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) q.pollLast();
            q.offer(i);
            if (i >= k - 1) r[ri++] = nums[q.peek()];
        }
        return r;
    }
    public static void main(String[] args) {}
}
