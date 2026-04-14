import java.util.*;
class _1024_ArraysOperationsVariation24 {
    public int[][] solve(int[][] intervals) {
        // Merge Intervals
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        int[] curr = intervals[0];
        res.add(curr);
        for (int[] interval : intervals) {
            if (interval[0] <= curr[1]) curr[1] = Math.max(curr[1], interval[1]);
            else {
                curr = interval;
                res.add(curr);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {}
}
