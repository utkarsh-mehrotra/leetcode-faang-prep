class _547_NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = n;
        int[] parent = new int[n];
        for (int i=0; i<n; i++) parent[i] = i;
        
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (isConnected[i][j] == 1) {
                    int p1 = find(parent, i);
                    int p2 = find(parent, j);
                    if (p1 != p2) {
                        parent[p1] = p2;
                        count--;
                    }
                }
            }
        }
        return count;
    }
    private int find(int[] parent, int i) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent, parent[i]);
    }
    public static void main(String[] args) {
        System.out.println("✅ Number of Provinces implemented.");
    }
}
