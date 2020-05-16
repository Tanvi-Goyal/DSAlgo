package may_challenge;

public class Trie {

	private TrieNode root;
	
	public Trie() {
		root = new TrieNode();
		root.val = ' ';
	}
	
	public void insert(String word) {
		TrieNode node = root;
		
		for(int i=0;i< word.length();i++) {
			char c = word.charAt(i);
			if(node.children[c - 'a'] == null) {
				node.children[c - 'a'] = new TrieNode(c);
			}
			node = node.children[c - 'a'];
		}
		
		node.isWord = true;
	}
	
	public boolean search(String word) {
		TrieNode node = root;
		
		for(int i=0; i<word.length();i++) {
			char c = word.charAt(i);
			if(node.children[c - 'a'] == null) return false;
			node = node.children[c - 'a'];
		}
		return node.isWord;
	}
	
	public boolean startsWith(String prefix) {
		TrieNode node = root;
		
		for(int i=0; i<prefix.length();i++) {
			char c = prefix.charAt(i);
			if(node.children[c - 'a'] == null) return false;
			node = node.children[c - 'a'];
		}
		return true;
	}
}