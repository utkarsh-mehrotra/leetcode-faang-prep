import java.util.*;

class _210_CourseScheduleIi {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for (int i=0; i<numCourses; i++) adj.add(new ArrayList<>());
        for (int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<numCourses; i++) {
            if (indegree[i] == 0) q.offer(i);
        }
        int[] order = new int[numCourses];
        int idx = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();
            order[idx++] = curr;
            for (int neighbor : adj.get(curr)) {
                if (--indegree[neighbor] == 0) q.offer(neighbor);
            }
        }
        return idx == numCourses ? order : new int[0];
    }
    public static void main(String[] args) {
        System.out.println("✅ Course Schedule II implemented.");
    }
}
