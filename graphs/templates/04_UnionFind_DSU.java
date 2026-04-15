class _04_UnionFind_DSU {
    
    // Disjoint Set Union (Union-Find)
    // Optimizations: Path Compression via fast collapsing, Union by Rank/Size
    // Structure Complexity: Amortized O(α(N)) roughly O(1) operations.
    
    class DSU {
        int[] parent;
        int[] size;
        int components;

        public DSU(int n) {
            parent = new int[n];
            size = new int[n];
            components = n;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int i) {
            if (parent[i] == i) return i;
            // Path compression
            return parent[i] = find(parent[i]); 
        }

        public boolean union(int i, int j) {
            int rootI = find(i);
            int rootJ = find(j);
            if (rootI == rootJ) return false;

            // Union by size
            if (size[rootI] < size[rootJ]) {
                parent[rootI] = rootJ;
                size[rootJ] += size[rootI];
            } else {
                parent[rootJ] = rootI;
                size[rootI] += size[rootJ];
            }
            components--;
            return true;
        }
        
        public int getComponents() {
            return components;
        }
    }
}
