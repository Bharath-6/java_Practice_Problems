//WOrd Break Problem
// Given an input string and a dictionary of words, find out if the input string can be
// broken into a space-separated sequence of dictionary words

// words[]={i,like,sam,samsung,mobile,ice}
// key="ilikesamsung"
// output:true
public class WordBreak {
    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26]; // a to z
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    // if the node doesnot exist then try to create new node
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) { // 0(L); L=key length
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                // add new node
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }
    public static boolean search(String key) {
        Node current = root;
        for (int i = 0; i < key.length(); i++) { // 0(L)
            int idx = key.charAt(i) - 'a';
            Node node = current.children[idx];
            if (node == null) {
                // add new node
                return false;
            }
            if (i == key.length() - 1 && node.eow == false) {
                return false;
            }
            current = current.children[idx];
        }
        return true;
    }
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String firstpart = key.substring(0,i); //where if i is one then only 0 will be included not 1 if it is two then from o and 1 will be included
            String secpart = key.substring(i);
            if(search(firstpart) && wordBreak(secpart)){
                return true;
            }
        }
        return false;
    }
    

    public static void main(String[] args) {
        String words[] = { "i","like","sam","samsung","mobile" };
        String key = "ilikesamsung";
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(wordBreak(key));
    }
}
