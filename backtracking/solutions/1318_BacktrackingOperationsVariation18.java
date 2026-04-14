import java.util.*;
class _1318_BacktrackingOperationsVariation18 {
    public List<String> solve(String S) {
        // Letter Case Permutation
        List<String> res = new ArrayList<>();
        backtrack(res, S.toCharArray(), 0);
        return res;
    }
    private void backtrack(List<String> res, char[] chars, int idx) {
        if (idx == chars.length) { res.add(new String(chars)); return; }
        if (Character.isLetter(chars[idx])) {
            chars[idx] = Character.toUpperCase(chars[idx]);
            backtrack(res, chars, idx+1);
            chars[idx] = Character.toLowerCase(chars[idx]);
            backtrack(res, chars, idx+1);
        } else backtrack(res, chars, idx+1);
    }
    public static void main(String[] args) {}
}
