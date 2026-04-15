import java.util.*;

class _03_TopologicalSort {

    // ----------------------------------------------------
    // KAHN'S ALGORITHM (BFS - Indegree Tracking)
    // ----------------------------------------------------
    public List<Integer> kahnsBFS(List<List<Integer>> graph, int N) {
        int[] inDegree = new int[N];
        for (int u = 0; u < N; u++) {
            for (int v : graph.get(u)) {
                inDegree[v]++;
            }
        }

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if (inDegree[i] == 0) q.offer(i);
        }

        List<Integer> topoOrder = new ArrayList<>();
        while (!q.isEmpty()) {
            int u = q.poll();
            topoOrder.add(u);
            for (int v : graph.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) q.offer(v);
            }
        }

        // If returned list size != N, graph contains a cycle.
        return topoOrder.size() == N ? topoOrder : new ArrayList<>();
    }

    // ----------------------------------------------------
    // DFS POST-ORDER STACK
    // ----------------------------------------------------
    public List<Integer> dfsTopoSort(List<List<Integer>> graph, int N) {
        boolean[] visited = new boolean[N];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited, stack);
            }
        }
        
        List<Integer> topoOrder = new ArrayList<>();
        while (!stack.isEmpty()) topoOrder.add(stack.pop());
        return topoOrder;
    }

    private void dfs(List<List<Integer>> graph, int u, boolean[] visited, Stack<Integer> stack) {
        visited[u] = true;
        for (int v : graph.get(u)) {
            if (!visited[v]) dfs(graph, v, visited, stack);
        }
        stack.push(u);
    }
}
