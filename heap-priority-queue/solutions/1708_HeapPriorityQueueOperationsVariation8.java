import java.util.*;
class _1708_HeapPriorityQueueOperationsVariation8 {
    public String solve(String s) {
        // Sort Characters By Frequency
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            for (int i=0; i<map.get(c); i++) sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {}
}
