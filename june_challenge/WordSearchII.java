package june_challenge;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {

	/*
	 Given a 2D board and a list of words from the dictionary, find all words in the board.

	 Each word must be constructed from letters of sequentially adjacent cell, where "adjacent" 
	 cells are those horizontally or vertically neighboring. The same letter cell may not be used 
	 more than once in a word.
	 */
	
	public List<String> findWords(char[][] board, String[] words) {
		List<String> list = new ArrayList<>();
        TrieNode root = buildTrie(words);
        
        for(int i = 0 ; i < board.length; i++) {
            for(int j = 0 ; j < board[0].length; j++) {
                dfs(board, i, j, root, list);
            }
        }
        return list;
	}
	
	private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        
        for(String word : words) {
            TrieNode node = root;
            
            for(char c : word.toCharArray()) {
                int i = c - 'a';
                if(node.next[i] == null) node.next[i] = new TrieNode();
                node = node.next[i];
            }
            node.word = word;
        }
        
        return root;
    }
	
	private void dfs(char[][] board, int i, int j, TrieNode root, List<String> res) {
        
        char ch = board[i][j];
        
        if(ch == '#' || root.next[ch - 'a'] == null) return;
        root = root.next[ch - 'a'];
        
        if(root.word != null) {
            res.add(root.word);
            root.word = null;
        }
        
        board[i][j] = '#';
        if (i > 0) dfs(board, i - 1, j ,root, res); 
        if (j > 0) dfs(board, i, j - 1, root, res);
        if (i < board.length - 1) dfs(board, i + 1, j, root, res); 
        if (j < board[0].length - 1) dfs(board, i, j + 1, root, res); 
        
        board[i][j] = ch;
    }
}
