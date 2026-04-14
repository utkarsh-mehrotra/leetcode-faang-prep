import java.util.*;
class _1710_HeapPriorityQueueOperationsVariation10 {
    public int solve(int[] ropes) {
        // Minimum Cost to Connect Sticks (Ropes)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int r : ropes) pq.add(r);
        int cost = 0;
        while (pq.size() > 1) {
            int sum = pq.poll() + pq.poll();
            cost += sum;
            pq.add(sum);
        }
        return cost;
    }
    public static void main(String[] args) {}
}
