package strings;

public class DetectCapital {

	/*
	 Given a word, you need to judge whether the usage of capitals in it is right or not.

	 We define the usage of capitals in a word to be right when one of the following cases holds:

	 All letters in this word are capitals, like "USA".
	 All letters in this word are not capitals, like "leetcode".
	 Only the first letter in this word is capital, like "Google".
	 Otherwise, we define that this word doesn't use capitals in a right way.
	 */
	
	public boolean detectCapitalUse(String word) {
        int countUpper = 0;
        
        for(char c : word.toCharArray()) {
        	if(Character.isUpperCase(c)) countUpper++;
        }
        
        if(countUpper == 1) return Character.isUpperCase(word.charAt(0));
        return countUpper == 0 || countUpper == word.length();
    }
}
