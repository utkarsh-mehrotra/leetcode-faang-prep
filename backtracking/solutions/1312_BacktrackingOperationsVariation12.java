import java.util.*;
class _1312_BacktrackingOperationsVariation12 {
    public List<String> solve(String digits) {
        // Letter Combinations of a Phone Number
        if (digits.length() == 0) return new ArrayList<>();
        String[] map = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(), digits, map, 0);
        return res;
    }
    private void backtrack(List<String> res, StringBuilder sb, String digits, String[] map, int index) {
        if (index == digits.length()) { res.add(sb.toString()); return; }
        String letters = map[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(res, sb, digits, map, index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args) {}
}
