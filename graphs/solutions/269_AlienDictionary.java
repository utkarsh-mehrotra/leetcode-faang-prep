import java.util.*;

class _269_AlienDictionary {
    public String alienOrder(String[] words) {
        Map<Character, List<Character>> adj = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();
        
        for (String w : words) {
            for (char c : w.toCharArray()) {
                indegree.put(c, 0);
                adj.put(c, new ArrayList<>());
            }
        }
        
        for (int i=0; i<words.length-1; i++) {
            String w1 = words[i], w2 = words[i+1];
            if (w1.length() > w2.length() && w1.startsWith(w2)) return "";
            
            for (int j=0; j<Math.min(w1.length(), w2.length()); j++) {
                if (w1.charAt(j) != w2.charAt(j)) {
                    adj.get(w1.charAt(j)).add(w2.charAt(j));
                    indegree.put(w2.charAt(j), indegree.get(w2.charAt(j)) + 1);
                    break;
                }
            }
        }
        
        Queue<Character> q = new LinkedList<>();
        for (char c : indegree.keySet()) {
            if (indegree.get(c) == 0) q.offer(c);
        }
        
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            char curr = q.poll();
            sb.append(curr);
            for (char next : adj.get(curr)) {
                indegree.put(next, indegree.get(next) - 1);
                if (indegree.get(next) == 0) q.offer(next);
            }
        }
        
        return sb.length() == indegree.size() ? sb.toString() : "";
    }
    public static void main(String[] args) {
        System.out.println("✅ Alien Dictionary implemented.");
    }
}
