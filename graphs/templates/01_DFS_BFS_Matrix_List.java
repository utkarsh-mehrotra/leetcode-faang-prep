import java.util.*;

class _01_DFS_BFS_Matrix_List {
    
    // ----------------------------------------------------
    // MATRIX TRAVERSAL (Grid constraints)
    // ----------------------------------------------------
    int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    
    public void matrixDFS(int[][] grid, int r, int c, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || visited[r][c] || grid[r][c] == 0) return;
        visited[r][c] = true;
        for (int[] d : dirs) {
            matrixDFS(grid, r + d[0], c + d[1], visited);
        }
    }

    public void matrixBFS(int[][] grid, int sr, int sc) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sr, sc});
        visited[sr][sc] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0], c = curr[1];
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nc >= 0 && nr < m && nc < n && !visited[nr][nc] && grid[nr][nc] != 0) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }

    // ----------------------------------------------------
    // ADJACENCY LIST TRAVERSAL
    // ----------------------------------------------------
    public void listDFS(List<List<Integer>> graph, int u, boolean[] visited) {
        visited[u] = true;
        for (int v : graph.get(u)) {
            if (!visited[v]) {
                listDFS(graph, v, visited);
            }
        }
    }

    public void listBFS(List<List<Integer>> graph, int start, int N) {
        boolean[] visited = new boolean[N];
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : graph.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }
}
