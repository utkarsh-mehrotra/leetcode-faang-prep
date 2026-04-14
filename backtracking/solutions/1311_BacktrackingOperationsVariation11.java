import java.util.*;
class _1311_BacktrackingOperationsVariation11 {
    public List<String> solve(String s) {
        // Palindrome Partitioning
        List<List<String>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), s, 0);
        List<String> out = new ArrayList<>();
        for (List<String> lst : res) out.add(lst.toString());
        return out;
    }
    private void backtrack(List<List<String>> res, List<String> temp, String s, int start) {
        if (start == s.length()) { res.add(new ArrayList<>(temp)); return; }
        for (int i=start; i<s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                temp.add(s.substring(start, i+1));
                backtrack(res, temp, s, i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s, int L, int R) {
        while (L < R) { if (s.charAt(L++) != s.charAt(R--)) return false; }
        return true;
    }
    public static void main(String[] args) {}
}
