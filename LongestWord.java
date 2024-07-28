package Trie_DS.Questions;

public class LongestWord {
    static class TrieNode {
        TrieNode[] children;
        boolean eow; // End of word

        public TrieNode() {
            children = new TrieNode[26];
            eow = false;
        }
    }

    static class Trie {
        TrieNode root;
        String ans;

        public Trie() {
            root = new TrieNode();
            ans = "";
        }

        void insert(String word) {
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

        void longestWord(TrieNode root, StringBuilder temp) {
            for (int i = 0; i < 26; i++) {
                if (root.children[i] != null && root.children[i].eow) {
                    temp.append((char) (i + 'a'));

                    if (temp.length() > ans.length()) {
                        ans = temp.toString();
                    }
                    longestWord(root.children[i], temp);
                    temp.deleteCharAt(temp.length() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "ap", "apply", "apple"};
        Trie trie = new Trie();

        for (String word : words) {
            trie.insert(word);
        }
        trie.longestWord(trie.root, new StringBuilder(""));
        System.out.println("Longest word: " + trie.ans);
    }
}
