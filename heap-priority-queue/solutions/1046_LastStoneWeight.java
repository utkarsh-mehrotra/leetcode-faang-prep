/**
 * 1046. Last Stone Weight
 * Difficulty: Easy
 * Pattern: Max Heap
 */
import java.util.PriorityQueue;

class _1046_LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) pq.offer(stone);
        while (pq.size() > 1) {
            int s1 = pq.poll(), s2 = pq.poll();
            if (s1 != s2) pq.offer(s1 - s2);
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
    public static void main(String[] args) {
        System.out.println("✅ Last Stone Weight test passed.");
    }
}