class _1030_ArraysOperationsVariation30 {
    public int solve(int[][] matrix) {
        // Spiral Matrix Template
        if (matrix.length == 0) return 0;
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        int res = 0;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) res += matrix[top][i];
            top++;
            for (int i = top; i <= bottom; i++) res += matrix[i][right];
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) res += matrix[bottom][i];
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) res += matrix[i][left];
                left++;
            }
        }
        return res;
    }
    public static void main(String[] args) {}
}
