import java.util.*;
class _1321_BacktrackingOperationsVariation21 {
    public int solve(int[] nums) {
        // Beautiful Arrangement
        int[] count = new int[1];
        backtrack(count, 1, new boolean[nums.length + 1], nums.length);
        return count[0];
    }
    private void backtrack(int[] count, int pos, boolean[] visited, int n) {
        if (pos > n) { count[0]++; return; }
        for (int i=1; i<=n; i++) {
            if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true;
                backtrack(count, pos+1, visited, n);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) {}
}
