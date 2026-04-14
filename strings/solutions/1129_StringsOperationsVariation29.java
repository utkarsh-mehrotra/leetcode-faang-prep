class _1129_StringsOperationsVariation29 {
    public String solve(String s) {
        // Detect Capital Use
        if (s.length() < 2) return "";
        boolean firstCap = Character.isUpperCase(s.charAt(0));
        boolean secondCap = Character.isUpperCase(s.charAt(1));
        if (!firstCap && secondCap) return "False";
        return "True";
    }
    public static void main(String[] args) {}
}
