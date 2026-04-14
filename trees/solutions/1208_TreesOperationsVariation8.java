class _1208_TreesOperationsVariation8 {
    static class TreeNode { int val; TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
    // Implement Trie (Prefix Tree) Dummy class representation
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;
    }
    private TrieNode root = new TrieNode();
    public void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (curr.children[index] == null) curr.children[index] = new TrieNode();
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEndOfWord;
    }
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }
    private TrieNode searchPrefix(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (curr.children[index] == null) return null;
            curr = curr.children[index];
        }
        return curr;
    }
    public static void main(String[] args) {}
}
