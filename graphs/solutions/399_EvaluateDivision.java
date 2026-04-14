import java.util.*;
class _399_EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> adj = new HashMap<>();
        for (int i=0; i<equations.size(); i++) {
            String u = equations.get(i).get(0), v = equations.get(i).get(1);
            adj.putIfAbsent(u, new HashMap<>());
            adj.putIfAbsent(v, new HashMap<>());
            adj.get(u).put(v, values[i]);
            adj.get(v).put(u, 1.0 / values[i]);
        }
        
        double[] res = new double[queries.size()];
        for (int i=0; i<queries.size(); i++) {
            String start = queries.get(i).get(0), end = queries.get(i).get(1);
            if (!adj.containsKey(start) || !adj.containsKey(end)) res[i] = -1.0;
            else if (start.equals(end)) res[i] = 1.0;
            else res[i] = dfs(start, end, adj, new HashSet<>(), 1.0);
        }
        return res;
    }
    private double dfs(String src, String dst, Map<String, Map<String, Double>> adj, Set<String> visited, double val) {
        visited.add(src);
        if (src.equals(dst)) return val;
        for (String next : adj.get(src).keySet()) {
            if (!visited.contains(next)) {
                double res = dfs(next, dst, adj, visited, val * adj.get(src).get(next));
                if (res != -1.0) return res;
            }
        }
        return -1.0;
    }
    public static void main(String[] args) {}
}
