class _733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }
    private void dfs(int[][] img, int r, int c, int oldCol, int newCol) {
        if (r < 0 || c < 0 || r >= img.length || c >= img[0].length || img[r][c] != oldCol) return;
        img[r][c] = newCol;
        dfs(img, r+1, c, oldCol, newCol);
        dfs(img, r-1, c, oldCol, newCol);
        dfs(img, r, c+1, oldCol, newCol);
        dfs(img, r, c-1, oldCol, newCol);
    }
    public static void main(String[] args) {
        System.out.println("✅ Flood Fill implemented.");
    }
}
