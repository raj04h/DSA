package Trie_DS.Questions;

public class unique_substring {
    static class TrieNode {
        TrieNode[] children;

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


    static int countNode(TrieNode root){
        if(root==null){
            return 0;
        }
        int count=0;

        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNode(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str="apple";

        for(int i=0; i<str.length();i++){
            String suffix=str.substring(i);
            System.out.println(suffix);

            insert(suffix);
        }
        System.out.println(countNode(root));

       
    }
}
