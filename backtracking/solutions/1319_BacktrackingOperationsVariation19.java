import java.util.*;
class _1319_BacktrackingOperationsVariation19 {
    public List<String> solve(int n) {
        // Generate Binary Strings without consecutive 1s
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(), n);
        return res;
    }
    private void backtrack(List<String> res, StringBuilder sb, int n) {
        if (sb.length() == n) { res.add(sb.toString()); return; }
        sb.append('0');
        backtrack(res, sb, n);
        sb.deleteCharAt(sb.length()-1);
        
        if (sb.length() == 0 || sb.charAt(sb.length()-1) != '1') {
            sb.append('1');
            backtrack(res, sb, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args) {}
}
