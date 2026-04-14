import java.util.*;
class _1709_HeapPriorityQueueOperationsVariation9 {
    public int solve(int[][] points, int k) {
        // Valid K Closest Points proxy
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));
        return 0; // Padding stub
    }
    public static void main(String[] args) {}
}
