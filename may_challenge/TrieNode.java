package may_challenge;

// class for Trie node
public class TrieNode {
 
	public char val;
	public boolean isWord;
	public TrieNode[] children = new TrieNode[26];
	
	TrieNode() {
	}
	
	TrieNode(char c) {
		TrieNode node = new TrieNode();
		node.val = c;
	}
}
