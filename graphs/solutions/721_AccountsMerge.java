import java.util.*;

class _721_AccountsMerge {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, String> emailToName = new HashMap<>();
        Map<String, String> parent = new HashMap<>();
        
        for (List<String> acc : accounts) {
            String name = acc.get(0);
            for (int i=1; i<acc.size(); i++) {
                emailToName.put(acc.get(i), name);
                parent.put(acc.get(i), acc.get(i));
            }
        }
        
        for (List<String> acc : accounts) {
            String firstEmail = acc.get(1);
            for (int i=2; i<acc.size(); i++) {
                String p1 = find(parent, firstEmail);
                String p2 = find(parent, acc.get(i));
                if (!p1.equals(p2)) {
                    parent.put(p2, p1);
                }
            }
        }
        
        Map<String, TreeSet<String>> sets = new HashMap<>();
        for (String email : parent.keySet()) {
            String p = find(parent, email);
            sets.computeIfAbsent(p, k -> new TreeSet<>()).add(email);
        }
        
        List<List<String>> res = new ArrayList<>();
        for (String p : sets.keySet()) {
            List<String> emails = new ArrayList<>(sets.get(p));
            emails.add(0, emailToName.get(p));
            res.add(emails);
        }
        return res;
    }
    private String find(Map<String, String> parent, String s) {
        if (!parent.get(s).equals(s)) {
            parent.put(s, find(parent, parent.get(s)));
        }
        return parent.get(s);
    }
    public static void main(String[] args) {
        System.out.println("✅ Accounts Merge implemented.");
    }
}
