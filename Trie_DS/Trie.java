package Trie_DS;

public class Trie {

    static class TrieNode {
        TrieNode[] children;
        boolean eow; // End of word

        public TrieNode() {
            children = new TrieNode[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static TrieNode root = new TrieNode();

    static void insert(String word) {
        TrieNode curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    static boolean search(String key) { //O(L)
        TrieNode curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            TrieNode node = curr.children[idx];

            if (node == null) {
                return false;
            }
            if (i == key.length() - 1 && node.eow==false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "their", "there", "any"};

        for (String word : words) {
            insert(word);
        }

        System.out.println(search("any ")); // Should print true
        System.out.println(search("thor")); // Should print false
    }
}
