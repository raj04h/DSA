package Trie_DS.Questions;

public class word_break {
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

    static boolean wordbreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String firstpart=key.substring(0,i);
            String secpart=key.substring(i);

            if(search(firstpart)&& wordbreak(secpart)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "samsung", "mobile"};

        String key="ilikesamsung";

        for(String  word:words) {
            insert(word);
        }
        System.out.println(wordbreak(key));
    }
   
}
