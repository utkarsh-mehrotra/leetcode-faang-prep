class _1112_StringsOperationsVariation12 {
    public boolean solve(String mapTo, String mapFrom) {
        // Isomorphic Strings mapping
        if (mapTo.length() != mapFrom.length()) return false;
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        for (int i = 0; i < mapTo.length(); i++) {
            if (m1[mapTo.charAt(i)] != m2[mapFrom.charAt(i)]) return false;
            m1[mapTo.charAt(i)] = i + 1;
            m2[mapFrom.charAt(i)] = i + 1;
        }
        return true;
    }
    public static void main(String[] args) {}
}
