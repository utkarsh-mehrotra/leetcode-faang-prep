import java.util.*;
class _1310_BacktrackingOperationsVariation10 {
    public List<String> solve(int n) {
        // Generate Parentheses
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }
    private void backtrack(List<String> res, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            res.add(current);
            return;
        }
        if (open < max) backtrack(res, current + "(", open+1, close, max);
        if (close < open) backtrack(res, current + ")", open, close+1, max);
    }
    public static void main(String[] args) {}
}
