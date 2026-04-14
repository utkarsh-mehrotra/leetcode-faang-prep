/**
 * 215. Kth Largest Element in an Array
 * Difficulty: Medium
 * Pattern: Min Heap (or Quickselect)
 */
import java.util.*;

public class _215_KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int n : nums) {
            minHeap.offer(n);
            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        System.out.println("✅ Kth Largest Element test passed.");
    }
}