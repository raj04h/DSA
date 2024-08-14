package Trie_DS.Questions;

public class start_with {
    static class TrieNode {
        TrieNode[] children;
        // End of word

        public TrieNode() {
            children = new TrieNode[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
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
            }
            curr = curr.children[idx];
        }
    }


    static boolean startwith(String prefix){
        TrieNode curr=root;

        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';

            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
      

    public static void main(String[] args) {
        String[] words = {"the", "a", "their", "there", "any"};
        String prefix1="app";
        String prefix2="the";

        for (String word : words) {
            insert(word);
        }
        System.out.println(startwith(prefix1));
        System.out.println(startwith(prefix2));
    }
    
}
