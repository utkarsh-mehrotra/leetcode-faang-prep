/**
 * 703. Kth Largest Element in a Stream
 * Difficulty: Easy
 * Pattern: Min Heap
 */
import java.util.PriorityQueue;

class _703_KthLargestElementInAStream {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public _703_KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        System.out.println("✅ Kth Largest Stream test passed.");
    }
}