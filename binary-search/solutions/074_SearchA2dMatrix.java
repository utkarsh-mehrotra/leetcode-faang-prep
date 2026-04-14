class _074_SearchA2dMatrix {
    public boolean solve(int[][] matrix, int target) {
        // Search a 2D Matrix (Treat as 1D array)
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int L = 0, R = m * n - 1;
        while (L <= R) {
            int mid = L + (R - L) / 2;
            int midVal = matrix[mid / n][mid % n];
            if (midVal == target) return true;
            else if (midVal < target) L = mid + 1;
            else R = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {}
}
