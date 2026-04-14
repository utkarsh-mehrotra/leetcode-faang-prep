import java.util.*;
class _1320_BacktrackingOperationsVariation20 {
    public List<Integer> solve(int n, int k) {
        // Numbers With Same Consecutive Differences
        List<Integer> res = new ArrayList<>();
        if (n == 1) res.add(0);
        for (int i=1; i<=9; i++) backtrack(res, i, n-1, k);
        return res;
    }
    private void backtrack(List<Integer> res, int num, int n, int k) {
        if (n == 0) { res.add(num); return; }
        int tail = num % 10;
        if (tail + k <= 9) backtrack(res, num * 10 + tail + k, n - 1, k);
        if (k > 0 && tail - k >= 0) backtrack(res, num * 10 + tail - k, n - 1, k);
    }
    public static void main(String[] args) {}
}
