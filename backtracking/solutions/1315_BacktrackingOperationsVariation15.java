import java.util.*;
class _1315_BacktrackingOperationsVariation15 {
    public List<String> solve(String s) {
        // Restore IP Addresses
        List<String> res = new ArrayList<>();
        backtrack(res, s, 0, new ArrayList<>());
        return res;
    }
    private void backtrack(List<String> res, String s, int index, List<String> temp) {
        if (temp.size() == 4) {
            if (index == s.length()) res.add(String.join(".", temp));
            return;
        }
        for (int i=index; i<Math.min(index+3, s.length()); i++) {
            String sub = s.substring(index, i+1);
            if (sub.length() > 1 && sub.startsWith("0")) continue;
            if (Integer.parseInt(sub) > 255) continue;
            temp.add(sub);
            backtrack(res, s, i+1, temp);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {}
}
